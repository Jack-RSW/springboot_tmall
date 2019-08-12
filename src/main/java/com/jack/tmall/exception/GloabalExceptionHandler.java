package com.jack.tmall.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestController
@RestControllerAdvice
public class GloabalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(HttpServletRequest req,Exception e) throws ClassNotFoundException {
        e.printStackTrace();
        Class constraintViolationException = Class.forName("org.hibernate.exception.ConstraintViolationException");
        if (null==e.getCause() && constraintViolationException==e.getCause().getClass()){
            return "违反了约束，多半是外键约束";
        }
        return e.getMessage();
    }

}
