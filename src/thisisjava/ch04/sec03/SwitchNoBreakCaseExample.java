package thisisjava.ch04.sec03;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// swtich 문
		int time = (int) (Math.random() * 4) + 8; // 8 <= ... <=11 사이의 정수 뽑기
		System.out.println("[현재시간 : " + time + " 시]");

		switch (time) {
		case 8:
			System.out.println("출근합니다.");
			// break; 없다면 case 값과는 상관없이 다음 case 연달아 실행
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
	}
}