import com.jnshu.Util.MemcachedUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by 56929 on 2017/5/9.
 */
public class test{
@Before
public void Before() {
         new ClassPathXmlApplicationContext(new String[] {"spring-memcached.xml"});

        }//进行加载

@Test
public void test7(){
        boolean flag = MemcachedUtils.set("name", "曹玉伟", new Date(1000 * 20));//1000*20代表20秒
        System.out.println(flag);
        Object obj = MemcachedUtils.get("name");
        System.out.println(obj.toString());
        }
}