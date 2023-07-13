package thisisjava.ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		// 중첩 for문
		// 구구단 출력 예제
		for (int m = 2; m <= 9; m++) { // 바깥 for문이 한 번 실행할 때마다
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) { // 중첩된 for문은 지정 횟수만큼 반복하고 다시 바깥 for문으로 들어간다.
				System.out.println(m + " x " + n + " = " + (m * n));
			}
		}
	}
}