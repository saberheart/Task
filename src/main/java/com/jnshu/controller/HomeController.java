package com.jnshu.controller;

import com.jnshu.dao.ProfessionDao;
import com.jnshu.dao.StudentDao;
import com.jnshu.model.Profession;
import com.jnshu.model.Student;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/25.
 */
@Controller
public class HomeController {

    Logger log = Logger.getLogger(HomeController.class);

    @Resource
    private StudentDao dao;
    @Resource
    private ProfessionDao professionDao;

    @RequestMapping(value="home",method= RequestMethod.GET)
    public String getHomeinfo(ModelMap modelMap){
        List<Student> list=dao.selectAllStudent();
        modelMap.put("studentList",list);
        return "home";
    }
    @RequestMapping(value = "/u/no",method = RequestMethod.GET)
    public String fuck(){
        return "no";
    }

    @RequestMapping(value="/u/courselist",method= RequestMethod.GET)
    public String getCourse(ModelMap modelMap){

        List<Profession> list1 = professionDao.getProfessionWithDirection("前端开发");
        List<Profession> list2 = professionDao.getProfessionWithDirection("后端开发");
        List<Profession> list3 = professionDao.getProfessionWithDirection("iOS开发");
        List<Profession> list4 = professionDao.getProfessionWithDirection("Android开发");
        List<Profession> list5 = professionDao.getProfessionWithDirection("整站开发");
//        List<Profession> list6 = professionDao.getProfessionWithDirection("运行维护");

        List list = new ArrayList();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);
//        list.add(list6);
//      List<Profession> list = professionDao.getProfessionWithDirection("direction");
        log.info("--------->" +list);
        modelMap.put("lists",list);
        log.info("cao");
        return "courselist";


    }

    @RequestMapping("/test")
    public String testView(){
        return "myVoew";//这里的没有myView为layout.xml中的配置视图名称，根据返回值，去匹配对应的jsp
    }

}
