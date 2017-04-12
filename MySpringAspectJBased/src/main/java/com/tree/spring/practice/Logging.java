package com.tree.spring.practice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
	/**
	 * This is the method which I would like to execute before a selected method
	 * execution.
	 */
	@Pointcut("execution(* com.tree.spring.practice.*.*(..))")
	private void sellectAll(){}
	
	
	@Before("sellectAll()")
	public void beforeAdvice() {
		System.out.println("Going to setup student profile.");
	}

	/**
	 * This is the method which I would like to execute after a selected method
	 * execution.
	 */
	@After("sellectAll()")
	public void afterAdvice() {
		System.out.println("Student profile has been setup.");
	}

	/**
	 * This is the method which I would like to execute when any method returns.
	 */
	@AfterReturning(pointcut="sellectAll()", returning="retVal")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Returning:" + retVal.toString());
	}

	/**
	 * This is the method which I would like to execute if there is an exception
	 * raised.
	 */
	@AfterThrowing(pointcut="sellectAll()", throwing="ex")
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception: " + ex.toString());
	}
}
