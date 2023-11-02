import com.example.spring.Company;
import com.example.spring.Human;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Human human = context.getBean("human", Human.class);
        Company company = context.getBean("company", Company.class);
        System.out.println(human);
        System.out.println(company);
    }
}
