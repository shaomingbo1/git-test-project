import com.atguigu.spring5.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StuTest {
    @Test
    public void testStu(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);

    }
}
