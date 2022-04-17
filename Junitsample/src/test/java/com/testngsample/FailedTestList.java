package com.testngsample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class FailedTestList implements IAnnotationTransformer {

	public void transform(ITestAnnotation ann, Class testClass, 
			Constructor testConstructor, Method testMethod) {
		
		ann.setRetryAnalyzer(FailedTestCaseReRun.class);
		
	}

}
