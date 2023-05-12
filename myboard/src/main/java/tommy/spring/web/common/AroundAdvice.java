package tommy.spring.web.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object aroundLog(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("[BEFORE] : 비즈니스 메서드 수행 전에 처리할 내용 ...");
		Object returnObj = joinPoint.proceed();
		System.out.println("[AFTER] 비즈니스 메서드 수행 후에 처리할 내용 ...");
		return returnObj;
	}
}
