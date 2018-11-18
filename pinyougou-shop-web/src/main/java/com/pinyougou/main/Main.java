package com.pinyougou.main;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Main {
	private final static int port = 9102;

	public static void main(String[] args) throws Exception {
		jetty();
	}
	public static void jetty() throws Exception{
		 int port = 9102;
	        Server server = new Server(port);
	        WebAppContext webAppContext = new WebAppContext();  
	        String ProPath= System.getProperty("user.dir");
	        webAppContext.setDescriptor(ProPath+"/src/main/webapp/WEB-INF/web.xml");  
	        webAppContext.setResourceBase(ProPath+"/src/main/webapp");
	        webAppContext.setDisplayName("web");  
	        webAppContext.setClassLoader(Thread.currentThread().getContextClassLoader()); 
	        webAppContext.setConfigurationDiscovered(true);  
	        webAppContext.setParentLoaderPriority(true); 
	       
	        server.setHandler(webAppContext);
	        server.start();  
	        System.out.println(webAppContext.getContextPath());  
	        System.out.println(webAppContext.getDescriptor());  
	        System.out.println(webAppContext.getResourceBase());  
	        System.out.println(webAppContext.getBaseResource()); 
	        System.out.println("server is  start, port is "+port+"............");  
	        System.out.println("jetty protal success");
	        server.join();  
	    }
	
	
}
