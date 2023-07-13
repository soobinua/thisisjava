package thisisjava.ch04.sec02;

public class IfDiceExample {

	public static void main(String[] args) {
		// 주사위를 굴려서 나올 수 있는 1, 2, 3, 4, 5, 6 중 하나의 수 뽑아서 출력
		int num = (int) (Math.random() * 6) + 1; // 주사위 번호 하나 뽑기

		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}

		// Math.random() 메소드
		// 0.0 <= Math.random() < 1.0 사이의 double 타입 난수 리턴
		// (0.0 * 6) <= Math.random() < (1.0 * 6) 				// 0.0 <= ~ < 6.0
		// (int) 0.0 <=(Math.random() * 6) < (int) 6.0 			// 0 <= 0, 1, 2, 3, 4, 5 < 6
		// 0 + 1 <= ((int) (Math.random() * 6) + 1) < (6 + 1) 	// 1 <= 1, 2, 3, 4, 5, 6 < 7

		// start부터 시작하는 n개의 정수 중 하나의 정수 구하기
		// int num = (int) (Math.random() * n) + start;
		// 로또 번호 (1, ..., 45) 중 하나 뽑기
		// int num = (int) (Math.random() * 45) + 1;

	}
}
