package thisisjava.ch04.sec04;

public class PrintFrom1To10Example {

	public static void main(String[] args) {
		// for문
		// for(초기화식; 조건식; 증감식)
		for (int i = 1; i <= 10; i++) {
			// 초기화식에서 선언된 변수는 for 문 블록 안에서만 사용되는 로컬 변수
			System.out.print(i + " ");
		}
	}
}