package net.jdevel.springripperpart1;

import net.jdevel.springripperpart1.quoters.Quoter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Run {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Run.class, args);

        System.out.println("sytQuote() from @PostConstruct with profiling because apply ProfilingHandlerBeanPostProcessor as proxy");
        context.getBean(Quoter.class).sayQuote();


//        context.getBeanDefinitionNames() show all bean names

//        while (true) {
//            context.getBean(Quoter.class).sayQuote();
//            Thread.sleep(1000);
//        }

    }

}
