import com.wang.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        /*Student{
            name='老王',
            address=Address{address='西安'},
            books=[红楼梦, 西游记, 三国演义, 水浒传],
            hobbys=[听歌, 爬山, 看电影],
            card={身份证=340223, 银行卡=90225, 学生证=602315},
            games=[王者, 荒野迷踪, 第七使徒],
            info={password=111111, 学号=20114522, 性别=男},
            wife='null'}*/
    }
}
