package com.leeheungki.interfaceExam;

public class InterfaceModule {
	/**
	 * 4. InterfaceC c = this; 가
	 * 	  InterfaceC c = new A() 와 같은 것이다.
	 * 	 
	 * @param c
	 */
	public void processing(InterfaceC c) {
		// 예는 처리시간이 얼마나 걸릴 지 모르는 애다.
		
		c.callBack();
	}
}
