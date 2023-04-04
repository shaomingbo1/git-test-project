import com.atguigu.bean.Emp;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    @Test
    public void testBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp2 = context.getBean("emp2", Emp.class);
        System.out.println(emp2);
    }
}
