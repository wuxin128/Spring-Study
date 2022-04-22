import com.wang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");
        User user1 = (User) context.getBean("user1");
        User user2 = (User) context.getBean("user2");
        System.out.println(user1==user2);

    }
}
