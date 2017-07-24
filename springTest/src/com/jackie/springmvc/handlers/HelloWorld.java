package com.jackie.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	/**
	 * 1.ʹ��RequestMappingע����ӳ�������URL
	 * 2.����ֵ��ͨ����ͼ����������Ϊʵ�ʵ�������ͼ������InternalResourceViewResolver��ͼ����ͼ���������½���
	 * ͨ��prefix+returnVal+suffix�����ķ�ʽ�õ�ʵ�ʵ�������ͼ��Ȼ���ת������
	 * "/WEB-INF/views/success.jsp"
	 * @return
	 * */
	@RequestMapping("/helloworld")
	public String hello(){
		System.out.println("hello world");
		return "success";
	}
	/*1.����Ҫ�����ǰ�����"Controller"ע�⣬��ʾ��spring�Ŀ������������дһ������hello()
	 *2.hello�����Ϸ���һ��@RequestMapping��������ƥ�������·������������ƥ���·������
	 *"http://localhost:8080/springTest/springmvc/helloworld����tomcat�����������������
	 *�������urlʱ��������������ϵ��ˣ��ͻ�����÷���"
	 *3.���return�Ľ��������д�ģ�������ص��ַ���������springmvc.xml�����ļ��е�line15-18������ϵģ�springmvc.xml��
	 *������prefix��suffix��������������֮��ľ������ﷵ�ص��ַ���������ִ����������������ǿ��Եõ�������������Դ·��
	 *"/WEB-INF/views/success.jsp"�����success.jsp����Ҫ�����½���*/

}
