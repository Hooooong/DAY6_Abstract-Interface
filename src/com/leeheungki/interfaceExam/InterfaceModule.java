package com.leeheungki.interfaceExam;

public class InterfaceModule {
	/**
	 * 4. InterfaceC c = this; ��
	 * 	  InterfaceC c = new A() �� ���� ���̴�.
	 * 	 
	 * @param c
	 */
	public void processing(InterfaceC c) {
		// ���� ó���ð��� �󸶳� �ɸ� �� �𸣴� �ִ�.
		
		c.callBack();
	}
}
