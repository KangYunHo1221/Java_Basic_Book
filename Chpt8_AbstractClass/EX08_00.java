package Chpt8_AbstractClass;

//1. 실체클래스의 공통적인 부분(변수,메서드)를 추출해서 선언한 클래스

//2. 추상클래스는 객체를 생성할 수 없다. 구체적이지 않기 때문에

//3. 추상클래스와 실체클래스는 상속관계.

public abstract class EX08_00 {
	public static void main(String[] args) {
		EX08_00 ex = new EX08_00();
	}
}
//객체 선언 안됨