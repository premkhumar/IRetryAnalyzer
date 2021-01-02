package org.rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class ReRun implements IAnnotationTransformer{

	public void transform(ITestAnnotation ann, Class arg1, Constructor arg2, Method arg3) {

		IRetryAnalyzer retryAnalyzer = ann.getRetryAnalyzer();
		if (retryAnalyzer==null) {
			ann.setRetryAnalyzer(FailedClass.class);
		}
	}
	
	

}
