package thisisjava.ch04.sec07;

public class BreakExample {

	public static void main(String[] args) throws Exception {
		// break문
		// 반복문인 for문, while문, do-while문을 실행 중지하거나
		// 조건문인 switch문을 종료할 때 사용

		// 주사위 번호 중 하나를 반복적으로 뽑는데 6이 나오면 while문 종료
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}