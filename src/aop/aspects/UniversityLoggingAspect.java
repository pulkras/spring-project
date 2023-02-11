package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsGetLoggingAdvice() {
        System.out.println("beforeGetStudentsGetLoggingAdvice: logging getting the list of students before method getStudents");
    }


//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsGetLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String nameAndSurname = firstStudent.getNameAndSurname();
//        nameAndSurname = "Mr. " + nameAndSurname;
//        firstStudent.setNameAndSurname(nameAndSurname); // change and return new name
//
//        double averageGrade = firstStudent.getAverageGrade();
//        averageGrade = averageGrade + 1;
//        firstStudent.setAverageGrade(averageGrade); // change and return new average grade
//
//        System.out.println("afterReturningGetStudentsGetLoggingAdvice: logging getting the list of students after method getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Exception exception) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: logging a throw " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: logging an ok method's behavior or catching an exception");
    }
}
