package com.mvc.webService.impl;

import com.mvc.webService.Hello;

public class HelloImpl implements Hello{
	@Override
	public String getName(String arg) {
		// TODO Auto-generated method stub
		return arg+"成功调用自己搭建的webservice服务。";
	}
	
}
