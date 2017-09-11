package com.leeheungki.abstractExam;
/**
 * 추상클래스 테스트
 * 
 * @author Android Hong
 *
 */
public abstract class Animal {
	/*
	 * 추상클레스는 abstact 란 
	 * 
	 * 추상메소드는 abstact 란 단어를 붙이면 몸체가 없는 메소드이고,
	 * abstact 를 붙이지 않으면 몸체가 있는 추상메소드이다.
	 * 
	 * 접근제한자  + abstract + type + 메소드명();
	 */
	public  abstract String tpye();

	/*
	 * 물론 기본 메소드도 작성이 가능하다.
	 */
	public String sound() {
		
		return new String("울어버리기");
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
 * 구현체
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
 * 인터페이스 테스트
 * 
 * @author Android Hong
 *
 */
interface Animal2{
	
}

interface Animal3{
	
}
