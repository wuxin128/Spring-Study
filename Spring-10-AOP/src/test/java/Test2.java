import com.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");

        //动态代理代理的是接口；所以要转成接口
        UserService userService = (UserService) context.getBean("userServiceImp");
        userService.update();
    }
}
