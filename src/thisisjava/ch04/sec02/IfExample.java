package thisisjava.ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		// if문. 조건식의 결과에 따라 블록 실행 여부 결정
		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}

		if (score < 90) // 실행문 하나인 경우 중괄호 생략 가능하나 가독성이 좋지 않고 버그 발생 원인이 될 수 있으니 중괄호 작성 권장
			System.out.println("점수가 90보다 작습니다.");
		System.out.println("등급은 B입니다."); // if문과는 상관없는 실행문
	}
}
