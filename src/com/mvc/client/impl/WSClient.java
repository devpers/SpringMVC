package com.mvc.client.impl;


import java.net.MalformedURLException;

import org.codehaus.xfire.XFireFactory;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;

import com.mvc.client.Hello;

public class WSClient {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException, Exception {
		// TODO Auto-generated method stub
		Service serviceModel = new ObjectServiceFactory().create(Hello.class);
		//Client client = new Client(new URL("http://localhost:8080/SpringMVC/HelloWorldService.ws?wsdl"));
		XFireProxyFactory xfire = new XFireProxyFactory(XFireFactory.newInstance().getXFire());
		Hello hello = (Hello) xfire.create(serviceModel, "http://localhost:8080/SpringMVC/HelloWorldService.ws");
		String res = hello.getName("webservice 测试");
		//xfire.create(client);
		//Object[] res = client.invoke("getName", new Object[]{"zcc"});
		
		System.out.print(res);
	}

}