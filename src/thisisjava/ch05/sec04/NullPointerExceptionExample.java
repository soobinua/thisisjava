package thisisjava.ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// null과 NullPointerException

		int[] intArray = null;
//		intArray[0] = 10; // NullPointerException
		// intArray에 null 대입했으므로 intArray가 참조하는 배열 객체가 없어 NullPointerException

		String str = null;
//		System.out.println("총 문자 수 :" + str.length()); // NullPointerException
		// str에 null 대입했으므로 str가 참조하는 String 객체가 없어 NullPointerException

		// NullPointerException 발생하는 경우 예외가 발생된 곳에서 null인 상태의 참조 변수가 사용되고 있음을 알아야한다.
		// 해결하려면 참조 변수가 객체를 정확히 참조하도록 번지를 대입해야 한다.
		// 경우에 따라서는 참조 타입 변수에 일부러 null을 대입하기도 한다.
	}
}
