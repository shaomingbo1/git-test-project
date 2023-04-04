import com.atguigu.spring5.Orders;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrdersTest {
    @Test
    public void testOrders(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Orders orders = context.getBean("orders", Orders.class);
        orders.testPrint();
    }
}
