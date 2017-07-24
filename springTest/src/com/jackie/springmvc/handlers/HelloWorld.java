package com.jackie.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	/**
	 * 1.使用RequestMapping注解来映射请求的URL
	 * 2.返回值会通过视图解析器解析为实际的物理视图，对于InternalResourceViewResolver视图解析图，会做如下解析
	 * 通过prefix+returnVal+suffix这样的方式得到实际的物理视图，然后会转发操作
	 * "/WEB-INF/views/success.jsp"
	 * @return
	 * */
	@RequestMapping("/helloworld")
	public String hello(){
		System.out.println("hello world");
		return "success";
	}
	/*1.首先要在类的前面添加"Controller"注解，表示是spring的控制器，这里会写一个方法hello()
	 *2.hello方法上方有一个@RequestMapping，是用于匹配请求的路径，比如这里匹配的路径就是
	 *"http://localhost:8080/springTest/springmvc/helloworld，当tomcat服务启动后，在浏览器
	 *输入这个url时，如果这个方法打断点了，就回跳入该方法"
	 *3.这个return的结果不是乱写的，这个返回的字符串就是与springmvc.xml配置文件中的line15-18进行配合的，springmvc.xml中
	 *声明了prefix和suffix，而夹在这两者之间的就是这里返回的字符串，所以执行完这个方法后，我们可以得到这样的请求资源路径
	 *"/WEB-INF/views/success.jsp"，这个success.jsp是需要我们新建的*/

}
