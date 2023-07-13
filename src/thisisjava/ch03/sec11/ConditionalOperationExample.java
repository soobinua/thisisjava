package thisisjava.ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// 삼항(조건) 연산자
		// (조건식 ? 값 또는 연산식 : 값 또는 연산식) 총 3개의 피연산자
		// 조건이 true이면 : 앞의 피연산자2, false이면 : 뒤의 피연산자3 선택
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}
}
