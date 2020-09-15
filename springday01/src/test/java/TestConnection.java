import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class TestConnection {
    @Test
    public void testConn(){
        ApplicationContext c= new ClassPathXmlApplicationContext("application.xml");
        Connection conn = c.getBean("conn", Connection.class);
        Connection conn2 = c.getBean("conn", Connection.class);
        System.out.println(conn);
        System.out.println(conn2);
    }
}
