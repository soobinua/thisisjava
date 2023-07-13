package thisisjava.ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		// 문자열을 기본 타입으로 변환
		int value1 = Integer.parseInt("10"); // String -> int
		double value2 = Double.parseDouble("3.14"); // String -> double
		boolean value3 = Boolean.parseBoolean("true"); // String -> boolean

		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);

		// 기본 타입의 값을 문자열로 변경
		String str1 = String.valueOf(10); // int -> String
		String str2 = String.valueOf(3.14); // double -> String
		String str3 = String.valueOf(true); // boolean -> String

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
	}
}