package com.domaciZadatak2.aop;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ZivotinjaLoggingAspect {

	private Log log =  LogFactory.getLog(this.getClass());
	
	@Before("execution(* com.domaciZadatak2.inter.Zivotinja.*())")
	public void LogBefor() {
		log.info("The method is begins"  );
	}
	
	@After("execution(* com.domaciZadatak2.inter.Zivotinja.*())")
	public void LogAfter(JoinPoint joinPoint) {
		log.info("The method is ends " + joinPoint.getSignature().getName() );
	}
	
	@AfterReturning(
			pointcut = "execution(* com.domaciZadatak2.inter.Zivotinja.*())",
			returning = "result")
	public void logAfterReturning(JoinPoint joinPoint,Object result) {
		log.info("The method is ends " + joinPoint.getSignature().getName() + " " + result);
	}
	
	@Around("execution(* com.domaciZadatak2.inter.Zivotinja.*())")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		log.info("The method is ends " + joinPoint.getSignature().getName() + "() begins with " + Arrays.toString(joinPoint.getArgs()));
		try {
			Object result = joinPoint.proceed();
			log.info("The method is ends " + joinPoint.getSignature().getName() + "ends with " + result);
			return result;
		}catch(IllegalArgumentException e) {
			log.error("IllegalArgumentException" 
					+ Arrays.toString(joinPoint.getArgs()) + "in" 
					+joinPoint.getSignature().getName() + "()");
			throw e;
		}
	}
	
}
 