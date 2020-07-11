package org.cap.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*SpringBootServletInitializer is an interface to run SpringApplication from a traditional WAR deployment. 
 * It binds Servlet, Filter and ServletContextInitializer beans from the application context to the server*/
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FidiCustomerOrderApplication.class);
	}

}
