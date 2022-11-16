package com.myspring.step1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

class TVUser {

	public static void main(String[] args) {
		// 스프링 컨테이너 시작
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 삼성 티비 호출, new 필요 X
		TV tv = (TV) factory.getBean("ltv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

	}

}
