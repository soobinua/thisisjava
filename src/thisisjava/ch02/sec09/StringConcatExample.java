package thisisjava.ch02.sec09;

public class StringConcatExample {

	public static void main(String[] args) {
		// 자바 + 연산자 두 가지 기능
		// 피연산자가 모두 숫자인 경우 덧셈 연산
		// 피연산자 중 하나가 문자열인 경우 나머지 피연산자도 문자열로 자동 변환되어 문자열 결합 연산

		// 숫자 연산
		int result1 = 10 + 2 + 8;
		System.out.println("result1 : " + result1);

		// 결합 연산
		// 연산식에서 + 연산자가 연이어 나오면 앞에서부터 순차적으로 + 연산 수행
		// 먼저 수행된 연산이 덧셈 연산이라면 덧셈 결과를 가지고 그 다음 + 연산 수행
		String result2 = 10 + 2 + "8";
		System.out.println("result2 : " + result2);

		// 먼저 수행된 연산이 결합 연산이라면 이후 + 연산은 모두 결합 연산
		String result3 = 10 + "2" + 8;
		System.out.println("result3 : " + result3);

		String result4 = "10" + 2 + 8;
		System.out.println("result4 : " + result4);

		// 순차적으로 + 연산을 수행하지 않고 특정 부분을 우선 연산하고 싶다면 해당 부분 ()로 감싸면 된다.
		// 괄호()는 항상 최우선으로 연산 수행
		String result5 = "10" + (2 + 8);
		System.out.println("result5 : " + result5);
	}
}