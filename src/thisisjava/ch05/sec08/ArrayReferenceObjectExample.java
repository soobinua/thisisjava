package thisisjava.ch05.sec08;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		// 객체를 참조하는 배열
		// 기본 타입(byte, char, short, int, long, float, double, boolean) 배열은 각 항목에 값을 직접
		// 저장하지만
		// 참조 타입(클래스, 인터페이스) 배열은 각 항목에 객체의 번지를 저장

		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		// ==, != 연산자 사용하면 배열 항목이 참조하는 객체가 같은 객체인지 다른 객체인지 확인 가능
		// 문자열만 비교할 때는 equals() 메소드 사용
		System.out.println(strArray[0] == strArray[1]); // true: 같은 객체 참조
		System.out.println(strArray[0] == strArray[2]); // false: 다른 객체를 참조
		System.out.println(strArray[0].equals(strArray[2])); // true: 문자열이 동일
	}
}
