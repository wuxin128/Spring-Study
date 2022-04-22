import com.config.WangConfig2;
import com.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(WangConfig2.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}
