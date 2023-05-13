package tommy.spring.web.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//@Service //컴포넌트 스캔이 인식하라는 어노테이션
//@Aspect //Pointcut + Advice
public class LogAdvice {
	@Pointcut("execution(* tommy.spring.web..*Impl.*(..))")
	public void allPointcut() {
	}

	@Pointcut("execution(* tommy.spring.web..*Impl.get*(..))")
	public void getPointcut() {
	}

	@Before("allPointcut()")
	public void printLog() {
		System.out.println("[로그] : 비즈니스 로직 수행 전 동작");
	}
	
}
