package thisisjava.ch04.sec05;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		// while문 벗어나서도 변수 사용하고 싶다면 while문 이전에 변수 선언

		// while문 이전에 변수 선언
		int sum = 0; // 합계 변수
		int i = 1; // 카운터 변수

		while (i <= 100) {
			sum += i;
			i++;
		}

		// while문 벗어나서 변수 사용
		System.out.println("1~" + (i - 1) + " 합 : " + sum);
	}
}