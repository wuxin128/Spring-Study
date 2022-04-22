import com.wang.dao.MySqlImp;
import com.wang.service.UserServiceImp;

public class Test1 {
    public static void main(String[] args) {
        UserServiceImp userServiceImp = new UserServiceImp();
        userServiceImp.setUser(new MySqlImp());
        userServiceImp.getUser();
    }
}
