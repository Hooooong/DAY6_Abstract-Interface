package com.leeheungki.interfaceExam;

/*
 * 1. �������̽��� ��ӹް��־�� �ϰ�.
 * 
 */
public class InterfaceMain implements InterfaceC{
	
	public void process() {
		InterfaceModule module = new InterfaceModule();
		/**
		 * 3. �ڱ� �ڽ��� �Ѱ��ش�.(A)
		 * 
		 * A�� ��ӹް� �ִ� ���� InterfaceC �̱� ������
		 * A�� �Ѱ��ְ� �Ǹ� process ���� ��ǻ� A�� �Ѿ�� �ȴ�.
		 * 
		 */
		module.processing(this);
	}
	
	public void afterProcess() {
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}

	/**
	 * 2.callBack�� �������Ѵ�. 
	 */
	@Override
	public void callBack() {
		// TODO Auto-generated method stub
		afterProcess();
	}

}
