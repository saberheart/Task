//package com.jnshu.Util;
//
//import com.jnshu.model.user;
//
//import net.rubyeye.xmemcached.MemcachedClient;
//import net.rubyeye.xmemcached.exception.MemcachedException;
//import org.apache.log4j.Logger;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.TimeoutException;
//
///**
// * Created by 56929 on 2017/5/9.
// */
//@Component
//@Aspect
//public class UserServiceInterceptor {
//    public static final Logger log = Logger.getLogger(UserServiceInterceptor.class);
////    将缓存客户端工具类memcachedCache引入
//    @Autowired
//    private MemcachedClient memcachedClient;
////    定义point
////    @Pointcut("executop")
//    /**
//     * 环绕装备 用于拦截查询 如果缓存中有数据，直接从缓存中读取；否则从数据库读取并将结果放入缓存
//     *
//     * @param call
//     * @param name
//     * @return
//     */
//    @Around("aPointcut()&&args(id)")
//    public user doFindUserByNameAround(ProceedingJoinPoint call,long id){
//        user use = null;
//        try {
//            if (memcachedClient.get("findUserByName_"+id)!=null) {
//                use = (user) memcachedClient.get("findUserByName_"+id);
//                log.debug("从缓存中读取!findUserByName_"+id);
//            }else {
//                try {
//                    use = (user)call.proceed();
//                    if (use !=null){
//                        memcachedClient.set("findUserByName_"+id,0,use);
//                        log.debug("缓存装备被执行!");
//                    }
//                }catch (Throwable e){
//                    e.printStackTrace();
//                }
//            }
//        }catch (TimeoutException e) {
//            e.printStackTrace();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }catch (MemcachedException e){
//            e.printStackTrace();
//        } return  use;
//    }
//
//}
