package thisisjava.ch05.sec05;

public class IndexOfContainsExample {
	public static void main(String[] args) {
		// 문자열 찾기 - indexOf() 주어진 문자열이 시작되는 인덱스 리턴. 주어진 문자열이 포함되어 있지 않다면 -1 리턴
		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String subString = subject.substring(location);
		System.out.println(subString);

		location = subject.indexOf("자바");
		if (location != -1) { // indexOf() 메소드는 주어진 문자열이 포함되어 있지 않다면 -1 리턴
			System.out.println("자바와 관련된 책");
		} else {
			System.out.println("자바와 관련없는 책");
		}

		// 주어진 문자열이 단순히 포함되어 있지만 조사 - contains() 원하는 문자열 포함되어 있다면 true, 아니면 false 리턴
		boolean result = subject.contains("자바");
		if (result) {
			System.out.println("자바와 관련된 책");
		} else {
			System.out.println("자바와 관련 없는 책");
		}
	}
}
