package aop;

import aop.config.ConfigForAOP;
import aop.model.Library;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigForAOP.class)) {

            Library library = context.getBean("library", Library.class);
            Library.getBooksOfUsers(library);
        }
    }
}
