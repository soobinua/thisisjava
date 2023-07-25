package thisisjava.ch05.sec05;

public class CharAtExample {
	public static void main(String[] args) {
		// 문자 추출 - charAt()
		// 주민등록번호에서 성별에 해당하는 7번째 문자를 읽고 남자 또는 여자인지 출력
		String ssn = "9506241230123";
		char sex = ssn.charAt(6); // 매개값으로 주어진 인덱스의 문자 리턴
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
	}
}
