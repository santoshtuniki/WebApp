package com.greatlearning.dispatcher;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.greatlearning.config.SpringConfig;

public class MyServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[0];
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { SpringConfig.class }; // {className.class} --> class name of Servlet Configuration
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
