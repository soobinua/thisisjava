package thisisjava.ch04.example;

public class PrintHalfTree {

	public static void main(String[] args) {
		// for문 이용해 아래 출력
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				if (j == i) {
					System.out.println();
				}
			}
		}
	}
}
