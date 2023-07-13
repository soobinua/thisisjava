package thisisjava.ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) throws Exception {
		// continue문
		// 반복문인 for문, while문, do-while문에서만 사용
		// 블록 내부에서 continue문 실행되면 for문의 증감식 또는 while문, do-while문의 조건식으로 바로 이동

		// 1 ~ 10 사이의 수 중 짝수만 출력하고 홀수인 경우 다음 반복으로 넘어감
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { // 2로 나눈 나머지가 0이 아닌 경우. 즉 홀수
				continue;
			}
			System.out.print(i + " "); // 홀수는 실행되지 않는다.
		}
	}
}