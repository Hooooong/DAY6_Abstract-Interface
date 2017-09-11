package com.leeheungki.abstractExam;

/*
 * �߻�Ŭ���� �׽�Ʈ
 * 
 */
public abstract class Animal {
	/*
	 * �߻�Ŭ������ abstact �� 
	 * 
	 * �߻�޼ҵ�� abstact �� �ܾ ���̸� ��ü�� ���� �޼ҵ��̰�,
	 * abstact �� ������ ������ ��ü�� �ִ� �߻�޼ҵ��̴�.
	 * 
	 * ����������  + abstract + type + �޼ҵ��();
	 */
	public  abstract String tpye();

	/*
	 * ���� �⺻ �޼ҵ嵵 �ۼ��� �����ϴ�.
	 */
	public String sound() {
		
		return new String("��������");
	}
}

abstract class Base{
	abstract void create();
	abstract void read();
	abstract void update();
	abstract void delete();
}

abstract class Memo extends Base{
	
	public void deleteList() {
		update();
		delete();
	}
}

/**
 * ����ü
 * 
 * @author Android Hong
 *
 */
class MemoImpl extends Memo{

	@Override
	void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void read() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void delete() {
		// TODO Auto-generated method stub
		
	}
}


/**
 * �������̽� �׽�Ʈ
 * 
 * @author Android Hong
 *
 */
interface Animal2{
	
}

interface Animal3{
	
}
