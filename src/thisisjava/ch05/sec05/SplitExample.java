package thisisjava.ch05.sec05;

public class SplitExample {
	public static void main(String[] args) {
		// 문자열이 구분자를 사용해 여러 개의 문자열로 구성되어 있을 경우 분리 - split()
		String board = "1,자바학습,참조 타입 String을 학습합니다.,홍길동";

		// 문자열 분리
		String[] tokens = board.split(","); // 분리된 문자열로 구성된 배열 얻을 수 있다.

		// 인덱스별로 읽기
		System.out.println("번호 : " + tokens[0]);
		System.out.println("제목 : " + tokens[1]);
		System.out.println("내용 : " + tokens[2]);
		System.out.println("성명 : " + tokens[3]);

		// for문을 이용한 읽기
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}
}
