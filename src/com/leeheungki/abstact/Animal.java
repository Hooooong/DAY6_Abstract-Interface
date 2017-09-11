package com.leeheungki.abstact;
/**
 * �߻�Ŭ���� �׽�Ʈ
 * 
 * @author Android Hong
 *
 */
public abstract class Animal {
	/*
	 *
	 * �߻�Ŭ������ abstact �� 
	 * 
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
	public abstract void create();
	public abstract void read();
	public abstract void update();
	public abstract void delete();
}

abstract class Memo extends Base{
	
	public void deleteList() {
		update();
		delete();
	}
	@Override
	public void create() {
		System.out.println("called Create");
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
}

/**
 * ����ü
 * 
 * @author Android Hong
 *
 */
class MemoImpl extends Memo{


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
