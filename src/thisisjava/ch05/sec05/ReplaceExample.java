package thisisjava.ch05.sec05;

public class ReplaceExample {
	public static void main(String[] args) {
		// 문자열 대체 - replace() 기존 문자열은 그대로 두고 대체한 새로운 문자열 리턴
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		// String 객체의 문자열은 변경이 불가한 특성을 갖기 때문에
		// replace() 메소드가 리턴하는 문자열은 원래 문자열의 수정본이 아니라 완전히 새로운 문자열이다.

		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
