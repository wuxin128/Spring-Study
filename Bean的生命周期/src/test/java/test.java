import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Object beanCycleLife = context.getBean("beanCycleLife");
        System.out.println("bean实例对象已获取！");
        context.close();
    }
}
