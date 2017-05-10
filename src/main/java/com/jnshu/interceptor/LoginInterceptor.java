package com.jnshu.interceptor;

import com.jnshu.Util.DesUtil;
import com.jnshu.Util.TypeUtil;
import com.jnshu.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 56929 on 2017/5/6.
 */
//public class LoginInterceptor implements HandlerInterceptor {
//    private Logger log = Logger.getLogger(StudentController.class);
//
//    @Autowired
//    private StudentServiceImpl studentService;
//    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
//        Cookie[] cookie=httpServletRequest.getCookies();
//        log.info("打印cookie日志:"+cookie);
//        if (cookie!=null){
//            for (int i =0;i<cookie.length;i++){
//                if (cookie[i].getName().equals("token")){
//                    log.info("测试:"+cookie[i].getName());
//                    String token = cookie[i].getValue();
//                    byte[] tk = TypeUtil.hexStringToByte(token);
//                    byte[] tk1 = DesUtil.decrypt(tk, "12345678");
//                    String tk2 = new String(tk1);
//                    String id = "";
//                    String time = "";
//                    for (int j = 0;j<tk2.length();j++){
//                        char c=tk2.charAt(j);
//                        if (c=='='){
//                            for (int k=j+1;k<tk2.length();k++)
//                                time=time+tk2.charAt(k);
//                            break;
//                        }
//                        id=id+c;
//                    }
//                    if (studentService.select(Long.parseLong(id))!=null){
//                        return true;
//                    }
//                }
//            }
//        }
//     httpServletRequest.getSession();
//     String contextpath = httpServletRequest.getScheme() +"://" + httpServletRequest.getServerName()  + ":" +httpServletRequest.getServerPort() +httpServletRequest.getContextPath();
//     String uri=contextpath+"/student/login";
//     httpServletResponse.sendRedirect(uri);
//     return true;
// }
//
//
//    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
//
//    }
//
//    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
//
//    }
//}
public class LoginInterceptor implements HandlerInterceptor {
    private Logger log = Logger.getLogger(LoginInterceptor.class);
    @Autowired
    private UserService userService;

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        Cookie[] cookie=httpServletRequest.getCookies();
        if (cookie!=null){
            for (int i=0;i<cookie.length;i++){
                    log.info(1);
                if (cookie[i].getName().equals("token")){
                    log.info(2);
                    System.out.println("进入判断");
                    log.info(3);
                    String token=cookie[i].getValue();
                    log.info(4);
                    byte[] tk= TypeUtil.hexStringToByte(token);
                    byte[] tk1= DesUtil.decrypt(tk,"12345678");
                    log.info(5);
                    String tk2=new String(tk1);
                    String id="";
                    String time="";
                    log.info(6);
                    for (int j=0;j<tk2.length();j++){
                        log.info(7);
                        char c=tk2.charAt(j);
                        if (c=='='){
                            for (int k=j+1;k<tk2.length();k++)
                                time=time+tk2.charAt(k);
                            log.info(8);
                            break;
                        }
                        id=id+c;
                    }
                    if (userService.select(Long.parseLong(id))!=null){

                        return true;
                    }
                }
            }
        }
        httpServletRequest.getSession();
        String contextpath = httpServletRequest.getScheme() +"://" + httpServletRequest.getServerName()  + ":" +httpServletRequest.getServerPort() +httpServletRequest.getContextPath();
        String uri=contextpath+"/student/login";
        httpServletResponse.sendRedirect(uri);
        return true;
}

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
