package com.llf_server.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4720533281317400654L;

	@Override
	public String execute() throws Exception {
		System.out.println("HelloAction");
		return SUCCESS;
	}
}
