package com.jnshu.controller;

import com.jnshu.Util.DesUtil;
import com.jnshu.Util.MD5Util;
import com.jnshu.Util.TypeUtil;
import com.jnshu.model.Student;
import com.jnshu.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;


/**
 * Created by Administrator on 2017/4/14.
 */

@Controller
@RequestMapping("/student")
public class StudentController {

    private Logger log = Logger.getLogger(StudentController.class);
    @Resource
    private StudentService studentService;


    //注册页面：输入学生名字和密码，点击注册，成功跳转到登陆页面
    @RequestMapping(value = "/regist", method = RequestMethod.GET)
    public String Regist() {
        log.info("------>正在登录");
        return "regist";
    }

    @RequestMapping(value = "/registfrom", method = RequestMethod.POST)
    public String Regist(@ModelAttribute("stu")Student stu){
        log.info("----->"+stu);
        long createTime = System.currentTimeMillis();
        stu.setCreate_at(createTime);
        studentService.addStudent(stu);
        return "login";
    }
    public String Regist(@RequestParam("stu_name") String stu_name, @RequestParam("stu_pwd") String stu_pwd) {
        String md5 = MD5Util.stringToMD5(stu_pwd);
//        String smd5 = MD5Util.gengerate(md5);
        log.info("用户名:"+stu_name+"注册成功:"+md5);
        studentService.insert(stu_name, md5);
        return "list";
    }

    //登陆页面：账户密码输入错误会刷新登陆页面重新输入，成功会进入列表
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String Login() {
        log.info("输入登陆用户名和密码");
        return "login";
    }
    //    public String Login(@ModelAttribute("stu")Student stu){
//        log.info("输入成功"+stu.toString());
//        if(studentService.Login(stu.getStu_name(),stu.getStu_pwd())!=null){
//            return "redirect:/student/list";
//        }else{
//            return "login";
//        }
//    }
    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
    public void Login(@RequestParam("stu_name") String stu_name, @RequestParam("stu_pwd") String stu_pwd,
                      HttpServletResponse httpServletResponse) {

        String md5 = MD5Util.stringToMD5(stu_pwd);
//        String smd5 = MD5Util.gengerate(md5);
        log.info("用户名:"+stu_name+"输入成功:"+md5);
        if (studentService.verification(stu_name,md5)) {
            //待加密内容
            long id = studentService.Login(stu_name).getId();
            long creatDate = new Date().getTime();
            String str = id + "=" + creatDate;

            //加密操作
            byte[] result = DesUtil.desCrypto(str, "12345678");
            //把加密的字节转换为16进制
            String resules = TypeUtil.bytesToHexString(result);
            Cookie cookie = new Cookie("token", resules);
            cookie.setMaxAge(60 * 60 * 24 * 7);
            httpServletResponse.addCookie(cookie);

            log.info("输出cookie:"+cookie);

            try {
                httpServletResponse.sendRedirect("/u/courselist");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                httpServletResponse.sendRedirect("no");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

//    //显示所有学生列表
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public String showStudent(Model model) {
//        log.info("查询所有用户信息");
//        List<Student> studentList = studentService.getAllStudent();
//        model.addAttribute("studentList", studentList);
//        return "list";
//    }
//
//    //添加学生
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String addStudent() {
//        log.info("添加用户信息");
//        //返回add.jsp页面
//        return "add";
//    }
//
//    @RequestMapping(value = "/addStu", method = RequestMethod.POST)
//    public String addStudentPost(@ModelAttribute("stu") Student stu) {
//        System.out.println("------>" + stu.getStu_name());
//        log.info("显示用户信息" + stu);
//        long createTime = System.currentTimeMillis();
//        stu.setCreate_at(createTime);
//        studentService.addStudent(stu);
//        return "redirect:/student/list";
//    }
//
//    //删除学生
//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
//    public String deleteStudentById(@PathVariable("id") int id) {
//        log.info("删除用户");
//        try {
//            studentService.deleteStudentById(id);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "redirect:/student/list";
//    }
//
//    //修改学生
//    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
//    public String updateStudentById(@PathVariable("id") int id, Model model) {
//        System.out.println("-------" + id);
////      Student student=studentService.selectStudentById(id);
//        log.info("修改学员信息");
//        model.addAttribute(id);
//        return "update";
//    }
//
//    @RequestMapping(value = "/updateStu", method = RequestMethod.POST)
//    public String updateStndentByIdPost(@ModelAttribute("stu") Student stu) {
//        long updateTime = System.currentTimeMillis();
//        stu.setUpdate_at(updateTime);
//        studentService.updateStudentById(stu);
//        System.out.println("----->" + stu);
//        log.info("修改成功");
//        return "redirect:/student/list";
//    }
}
