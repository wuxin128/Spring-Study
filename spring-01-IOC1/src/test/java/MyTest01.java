import com.sun.org.apache.xpath.internal.operations.Or;
import com.wang.dao.MySqlImp;
import com.wang.dao.OracleImp;
import com.wang.dao.UserDaoImp;
import com.wang.service.UserService;
import com.wang.service.UserServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImp userServiceImp = (UserServiceImp) context.getBean("UserServiceImp");
        userServiceImp.getUser();
    }
}
