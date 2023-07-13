package thisisjava.ch02.sec02;

public class IntegerLiteralExample { // 코드에서 프로그래머가 직접 입력한 값을 리터럴이라 한다.

	public static void main(String[] args) {
		// 정수 타입 int 4byte

		// 변수에 대입할 정수 리터럴은 진수에 따라 작성 방법이 다르다.
		int var1 = 0b1011; // 2진수
		int var2 = 0206; // 8진수
		int var3 = 365; // 10진수
		int var4 = 0xB3; // 16진수

		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
	}
}
