package thisisjava.ch04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) throws Exception {
		// break문
		// 반복문 중첩되어 있을 경우 break문은 가장 가까운 반복문만 종료하고 바깥쪽 반복문은 종료시키지 않는다.
		// 중첩 반복문에서 바깥쪽 반복문까지 종료시키려면 바깥쪽 반복문에 이름(레이블)을 붙이고 break 이름; 으로 사용한다.

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					// break; // 안쪽 for문만 종료 후 바깥쪽 for문은 종료 X. 결과 : A-Z, a-g
					break Outter; // 바깥쪽 for문 Outter까지 종료. 결과 : A a-g
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}