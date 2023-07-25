package thisisjava.ch05.sec05;

public class SubStringExample {
	public static void main(String[] args) {
		// 문자열 잘라내기 - substring()
		String ssn = "880815-1234567";

		String firstNum = ssn.substring(0, 6); // beginIndex에서 endIndex 앞까지 잘라내기
		System.out.println(firstNum);

		String secondNum = ssn.substring(7); // beginIndex에서 끝까지 잘라내기
		System.out.println(secondNum);
	}
}
