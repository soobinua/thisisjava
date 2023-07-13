package thisisjava.ch03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
		// 비트 논리 연산자
		// bit 단위로 논리 연산 수행
		// AND 논리곱(&), OR 논리합(|), XOR 배타적 논리합(^), NOT 논리 부정(~)
		// 0과 1이 피연산자가 되므로 2진수 0과 1로 저장되는 정수 타입(byte, short, int, long)만 피연산자가 될 수 있다.
		// 부동 소수점 방식으로 저장되는 실수 타입(float, double) 피연산자가 될 수 없다.
		// (bit1 & bit2) 두 비트 모두 1인 경우에만 연산 결과 1
		// (bit1 | bit2) 두 비트 중 하나만 1이면 연산 결과 1
		// (bit1 ^ bit2) 두 비트 중 하나는 1이고 다른 하나가 0일 경우 연산 결과 1
		// (~bit) 보수
		// 최상위 비트가 1이면 음수
		// 비트 논리 연산자는 byte, short, char 타입 피연산자를 int 타입으로 자동 변환한 후 연산 수행
		// 연산 결과 int 타입이므로 int 변수에 대입

		// 45 2진수 00101101 (101101)
		// 25 2진수 00011001 (11001)
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("-------------------------------");

		// 비트 논리 연산 필요 예시
		// 소형 임베디드 장치 C프로그램에서 외부 서버의 자바 프로그램으로 데이터 전달
		// C언어 unit8_t 타입 : 1byte 0 ~ 255 값의 범위
		// Java : 1byte -128 ~ 127
		// 문제. C프로그램 unit8_t 타입 136을 2진수로 보내면, 자바는 2진수를 -120으로 읽게 된다.
		// 이유. 자바는 최상위 비트가 1이면 음수로 인식
		// -120을 C프로그램이 보낸 136으로 복원하고 싶다면 -120과 255를 비트 논리곱(&) 연산 수행하면 된다.
		byte receiveData = -120;

		// 방법1 : 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1); // 136

		// 방법2 : 자바 API를 이용해서 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2); // 136

		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
	}
}