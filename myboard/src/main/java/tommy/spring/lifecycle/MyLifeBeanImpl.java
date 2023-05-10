package tommy.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyLifeBeanImpl implements MyLifeBean, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

	private String greeting;
	private String beanName;
	private BeanFactory beanFactory;
	//생성자
	public MyLifeBeanImpl() {
		System.out.println("1. 빈의 생성자 실행");
	}
	//setter
	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("2. 빈의 setter 메소드 실행");
	}

	@Override
	public void sayHello() {
		System.out.println(greeting + beanName + "!!!");
	}

	//빈 이름 주입
	@Override
	public void setBeanName(String beanName) {
		System.out.println("3. 빈 이름 설정");
		this.beanName = beanName;
		System.out.println("---> " + this.beanName);
	}
	//빈 팩토리 주입
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4. 빈 팩토리 설정");
		this.beanFactory = beanFactory;
		System.out.println("---> " + this.beanFactory.getClass());
	}
	//5. 별도의 빈을 등록하면
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("6. Property 설정 완료");
	}
	//사용자가 정의한 초기화 메소드
	public void init() {
		System.out.println("7. 초기화 메소드 수행");
	}

	//사용자가 정의한 종료 메소드
	@Override
	public void destroy() throws Exception {
		System.out.println("종료");
	}

}
