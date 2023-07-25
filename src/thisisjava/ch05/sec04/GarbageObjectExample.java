package thisisjava.ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		// 프로그램에서 객체를 사용하려면 해당 객체를 참조하는 변수를 이용해야 한다.
		// 변수에 null을 대입하면 번지를 잃게 되므로 더 이상 객체 사용불가
		// 어떤 변수에서도 객체를 참조하지 않으면 해당 객체는 프로그램에서 사용할 수 없는 객체가 된다.
		// 즉 힙 메모리에는 있지만 위치 정보를 모르기 때문에 사용할 수 없게 된다.
		// 자바는 이러한 객체를 쓰레기로 취급하고, 쓰레기 수집기(Garbage Collector)를 실행시켜 자동으로 제거한다.
		// 자바는 코드를 이용해 객체를 직접 제거하는 방법을 제공하지 않는다.
		// 객체를 제거하는 유일한 방법은 객체의 모든 참조를 없애는 것

		String hobby = "여행";
		hobby = null; // "여행"에 해당하는 String 객체를 쓰레기로 만듦

		String kind1 = "자동차";
		String kind2 = kind1; // kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
		kind1 = null; // "자동차"에 해당하는 String 객체는 쓰레기가 아님
		// 이유. Kind2 변수가 여전히 참조하고 있기 때문
		System.out.println("kind2 : " + kind2);

	}
}
