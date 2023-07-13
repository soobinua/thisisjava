package thisisjava.ch04.example;

public class WhileDice {

	public static void main(String[] args) {
		// while문과 Math.random() 메소드 이용해 두 개의 주사위를 던졌을 때 나오는 눈 (눈1, 눈2) 형태로 출력
		// 눈의 합 5가 아니면 계속 주사위 던지고 눈의 합 5면 실행 종료
		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			if ((num1 + num2) == 5) {
				break;
			}
		}
	}
}
