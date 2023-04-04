import com.atguigu.spring5.collectiontype.Book;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
    @Test
    public void testBook(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book",Book.class);
        System.out.println(book1);
        System.out.println(book2);
    }
}
