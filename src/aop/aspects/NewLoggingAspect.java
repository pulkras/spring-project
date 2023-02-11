package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: we are trying to return a book to a library");
        Object targetMethodResult = null;
//        long begin = System.currentTimeMillis();
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        }
        catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: exception was catched. it is " + e);
            throw e;
        }
//        targetMethodResult = "war";
//        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: we successfully returned a book to a library");
//        System.out.println("aroundReturnBookLoggingAdvice: method return book work for " + (end-begin) + " millis");
        return targetMethodResult;

    }
}
