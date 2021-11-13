package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger log = Logger.getLogger(LoggingAspect.class.getName());

    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {
        log.info("Attempt to get a book");
    }
}
