package com.leeheungki.interfaceExam;

/**
 * 1. 인터페이스를 상속받고있어야 하고.
 * @author Android Hong
 *
 */
public class InterfaceMain implements InterfaceC{
	
	public void process() {
		InterfaceModule module = new InterfaceModule();
		/**
		 * 3. 자기 자신을 넘겨준다.(A)
		 * 
		 * A가 상속받고 있는 것이 InterfaceC 이기 때문에
		 * A를 넘겨주게 되면 process 에선 사실상 A가 넘어가게 된다.
		 * 
		 */
		module.processing(this);
	}
	
	public void afterProcess() {
		System.out.println("실행이 완료되었습니다.");
	}

	/**
	 * 2.callBack을 재정의한다. 
	 */
	@Override
	public void callBack() {
		// TODO Auto-generated method stub
		afterProcess();
	}

}
