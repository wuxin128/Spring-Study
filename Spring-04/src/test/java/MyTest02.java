import com.wang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Userbeans.xml");
        User user = (User) context.getBean("user2");
        User user4 = (User) context.getBean("user2");
        System.out.println(user==user4);
    }
}
