package com.cydeo.aspect;

import com.cydeo.dto.CourseDTO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

//    @Pointcut("execution(* com.cydeo.controller.CourseController.*(..))") // * = any return type
//    public void myPointcut() {}
//
//    @Before("myPointcut()")
//    public void log() {
//        logger.info("Info log.........."); // before executes controller method, it put this "Info log.........." information
//    }

//    @Before("execution(* com.cydeo.controller.CourseController.*(..))")
//    public void log() {
//        logger.info("Info log.........."); // this is a short way of using only one method instead of previous two methods
//        // however, it is better to use the first one since we can apply it with different methods
//    }

//    @Pointcut("execution(* com.cydeo.repository.CourseRepository.findById(*))")
//    public void courseRepositoryFindByIdPC() {}
//
//    @Before("courseRepositoryFindByIdPC()")
//    public void beforeCourseRepositoryFindById(JoinPoint joinPoint) {
//        logger.info("Before -> Method: {}, Arguments: {}, Target: {}"
//                , joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
//    }

//    @Pointcut("within(com.cydeo.controller..*)") // any method, sub-package under controller package
//    public void anyControllerOperation() {}
//
//    @Pointcut("@within(org.springframework.stereotype.Service)") // any join points within types (target object class)
    // import org.springframework.stereotype.Service; take from CourseServiceImpl
//    public void anyServiceOperation() {}
//
//    @Before("anyControllerOperation() || anyServiceOperation()")
//    public void beforeControllerOrServiceAdvice(JoinPoint joinPoint) {
//        logger.info("Before -> Method: {}, Arguments: {}, Target: {}"
//                , joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
//    }
//
//    @Pointcut("@annotation(org.springframework.web.bind.annotation.DeleteMapping)") // join points where the subject(method) of the join point
//    // import org.springframework.web.bind.annotation.*; take from CourseController
//    public void anyDeleteControllerOperation() {}
//
//    @Before("anyDeleteControllerOperation()")
//    public void beforeDeleteMappingAnnotation(JoinPoint joinPoint) {
//        logger.info("Before -> Method: {}, Arguments: {}, Target: {}"
//                , joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
//    }
//
//    @Pointcut("@annotation(com.cydeo.annotation.LoggingAnnotation)")
//    public void loggingAnnotationPC() {}
//
//    @Before("loggingAnnotationPC()") // used our custom annotation
//    public void beforeLoggingAnnotation(JoinPoint joinPoint) {
//        logger.info("Before -> Method: {}, Arguments: {}, Target: {}"
//                , joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
//    }
//
//    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
//    public void afterReturningGetMappingAnnotation() {}
//
//    @AfterReturning(pointcut = "afterReturningGetMappingAnnotation()", returning = "result")
//    public void afterReturningGetMappingOperation(JoinPoint joinPoint, Object result) {
//        logger.info("After Returning -> Method: {}, Result: {}", joinPoint.getSignature(), result.toString());
//    }
//
//    @AfterReturning(pointcut = "afterReturningGetMappingAnnotation()", returning = "results")
//    public void afterReturningGetMappingOperation(JoinPoint joinPoint, List<CourseDTO> results) {
//        logger.info("After Returning -> Method: {}, Result: {}", joinPoint.getSignature(), results.toString());
//    }
//
//     CourseDTO -> Object     --> This is ok
//     List<CourseDTO> -> List<Object>     --> This is not ok. List<Object> could not detect since returning = "results" comes from CourseDTO
//
//    @AfterThrowing(pointcut = "afterReturningGetMappingAnnotation()", throwing = "exception")
//    public void afterThrowingGetMappingOperation(JoinPoint joinPoint, RuntimeException exception) {
//        logger.error("After Throwing -> Method: {}, Exception: {}"
//                , joinPoint.getSignature().toShortString(), exception.getMessage());
//    }

    @Pointcut("@annotation(com.cydeo.annotation.LoggingAnnotation)")
    public void loggingAnnotationPC() {}

    @Around("loggingAnnotationPC()") // @Around contains code which is executed before and after the matched method (JoinPoint)
    public Object anyLoggingAnnotationOperation(ProceedingJoinPoint proceedingJoinPoint) {

        logger.info("Before -> Method: {} - Parameter {}"
                , proceedingJoinPoint.getSignature().toShortString(), proceedingJoinPoint.getArgs());

        Object result = null;

        try {
            result = proceedingJoinPoint.proceed(); // calling proceed() on the ProceedingJoinPoint
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        logger.info("After -> Method: {} - Result: {}"
                , proceedingJoinPoint.getSignature().toShortString(), result.toString());
        return result;

    }

}
