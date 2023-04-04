import com.atguigu.spring5.Book;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {


    @Test
    public void testBook(){
        // 1 加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2 获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        book.testPrint();
    }
}
