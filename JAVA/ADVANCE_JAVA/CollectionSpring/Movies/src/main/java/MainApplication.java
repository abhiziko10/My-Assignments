import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
          Director director=(Director)context.getBean("rohit1");
//          Director director1=(Director)context.getBean("director1");
          director.display();
//          director1.display();
//        System.out.println(director);
    }
}
