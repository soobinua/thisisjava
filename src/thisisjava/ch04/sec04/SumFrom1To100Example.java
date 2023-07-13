package thisisjava.ch04.sec04;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		// for문 벗어나서도 변수 사용하고 싶다면 for문 이전에 변수 선언

		// for문 이전에 변수 선언
		int sum = 0; // 합계 변수
		int i; // 카운터 변수

		for (i = 1; i <= 100; i++) {
			sum += i;
		}

		// for문 벗어나서 변수 사용
		System.out.println("1 ~ " + (i - 1) + " 합 : " + sum);
	}
}