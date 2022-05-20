package com.example.hellospringboot1;

import com.example.hellospringboot1.HelloSpringboot1Application;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    //Necesitamos un Logger
    private static final Logger log = LoggerFactory.getLogger(HelloSpringboot1Application.class);

    //Esta notacion lo que hace es decirnos cuales seran los puntos de interrupción
        //Cuando hagamos la regla hay que vigilar de no hacerla tan especfica sino nos puede dar error
    @Pointcut("within(com.example.hellospringboot1..*)")
    //Necesitamos un método con que relacionarlo
    public void pointcut(){


    }

    //Vamos a especificar el comportamiento del pointcut. Le decimos antes del pointcut de arriba
    @Before("pointcut()")
    public void logMethod(JoinPoint joinPoint){

        log.info("Invocando desde el aspecto" + joinPoint.getSignature().getName());
    }
}
