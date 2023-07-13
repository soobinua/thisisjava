package thisisjava.ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// 실수 타입 float 4byte
		// 실수 타입 double 8byte
		// double 타입이 float 타입보다 큰 실수를 저장할 수 있고 정밀도 또한 높다.

		// 정밀도 확인
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789; // double타입이 float타입보다 약 2배의 유효 자릿수를 가지므로 보다 정확한 데이터 저장 가능
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);

		// 10의 거듭제곱 리터럴
		double var3 = 3e6; // 기본적으로 컴파일러는 double로 간주하기 때문에
		float var4 = 3e6F; // 리터럴 뒤에 f 또는 F 붙여 float 타입 값임을 컴파일러에게 알려줘야 한다.
		double var5 = 2e-3;
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
	}
}