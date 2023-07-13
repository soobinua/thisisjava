package thisisjava.ch04.example;

public class Sum3From1To100 {

	public static void main(String[] args) {
		// 1부터 100까지의 정수 중 3의 배수의 총합 출력
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합 : " + sum);
	}

}
