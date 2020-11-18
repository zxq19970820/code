import com.zxq.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        AccountService accountService = ctx.getBean(AccountService.class);

        accountService.transfor(2,3,500.0);
    }
}
