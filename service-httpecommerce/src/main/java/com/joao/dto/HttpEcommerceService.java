package com.joao.dto;

import com.joao.service.NewOrderServelet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class HttpEcommerceService {
	public static void main(String[] args) throws Exception {
		var server = new Server(8080);
		
		var context = new ServletContextHandler();
		context.setContextPath("/");
		context.addServlet(new ServletHolder(new NewOrderServelet()), "/new");
		
		server.start();
		server.join();
		
	}
}
