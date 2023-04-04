import com.atguigu.spring5.collectiontype.Course;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanTest {
    @Test
    public void testMyBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }
}
