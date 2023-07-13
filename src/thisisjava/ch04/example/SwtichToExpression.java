package thisisjava.ch04.example;

public class SwtichToExpression {

	public static void main(String[] args) {
		// Switch Expression
		String grade = "B";

		int score = switch (grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		};
		System.out.println("expression : " + score);

		// Switch문
		String grade1 = "B";

		int score1 = 0;
		switch (grade1) {
		case "A":
			score1 = 100;
			break;
		case "B":
			int result = 100 - 20;
			score1 = result;
			break;
		default:
			score1 = 60;
		}
		System.out.println("switch : " + score1);
	}

}
