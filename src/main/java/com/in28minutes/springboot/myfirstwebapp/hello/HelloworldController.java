package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloworldController {
	
	@RequestMapping("hi")
	@ResponseBody
	public String hello() {
		return "Hello World! What today's update.";
	}
	@RequestMapping("hi-html")
	@ResponseBody
	public String helloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My First HTML page </title>");
		sb.append("</head>");
		sb.append("<body>My First HTML with body </body>");
		sb.append("<html>");
		return sb.toString();
	}
	@RequestMapping("hiworldjsp")
	public String helloworldjsp() {
		return "sayHello";
	}

}
