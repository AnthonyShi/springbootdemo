package com.example.demo.springboot;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;

import com.example.demo.springboot.Listener.ListenerTest;
import com.example.demo.springboot.customservlet.ServletTest;
import com.example.demo.springboot.filter.TimeFilter;

@SpringBootApplication
public class DemoSpringbootApplication implements ServletContextInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
        // 配置 Servlet
        servletContext.addServlet("servletTest",new ServletTest())
                      .addMapping("/servletTest");
        // 配置过滤器
        servletContext.addFilter("timeFilter",new TimeFilter())
                      .addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");
        // 配置监听器
        servletContext.addListener(new ListenerTest());
    }
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootApplication.class, args);
	}
	
	
}
