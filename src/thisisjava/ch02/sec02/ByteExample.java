package thisisjava.ch02.sec02;

public class ByteExample {

	public static void main(String[] args) {
		// 정수 타입 byte 1byte
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6 = 128; // byte 타입 변수에 허용 범위를 초과한 값 대입으로 컴파일 에러 (Type mismatch: cannot convert from int to byte)

		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
	}
}
