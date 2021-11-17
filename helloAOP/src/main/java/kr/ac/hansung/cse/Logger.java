package kr.ac.hansung.cse;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger {
	
	@Pointcut("execution( void kr.ac.hansung.cse.*.sound())")
	private void selectSound() {}
	
	@After("selectSound()")
	public void aboutToSound() {
		System.out.println("advice:about to sound");
	}
	
	

}
