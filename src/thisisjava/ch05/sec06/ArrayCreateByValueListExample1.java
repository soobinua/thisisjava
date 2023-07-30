package thisisjava.ch05.sec06;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		// 배열 변수 선언과 배열 생성
		// 배열 변수는 참조 변수다. 배열도 객체이므로 힙 영역에 생성되고 배열 변수는 힙 영역의 배열 주소를 저장한다.
		// 참조할 배열이 없다면 배열 변수도 null로 초기화 할 수 있다.
		// 타입[] 변수 = null; 이 상태에서 변수[인덱스]로 값을 읽거나 저장하게 되면 NullPointerException 발생

		// 값 목록으로 배열 생성
		String[] season = { "Spring", "Summer", "Fall", "Winter" };
		// 중괄호 {}로 감싼 값의 목록을 배열 변수에 대입할 때 주의할 점
		// 배열 변수 미리 선언한 후에는 값 목록을 변수에 대입할 수 없다.
		// 타입[] 변수;
		// 변수 = { 값0, 값1, 값2, ...}; // 컴파일 에러
		// 배열 변수를 선언한 시점과 값 목록이 대입되는 시점이 다르다면 new 타입[]을 중괄호 앞에 붙여주면 된다.
		// 변수 = new 타입[] { 값0, 값1, 값2, ...};

		// 배열의 항목값 읽기
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);

		// 인덱스 1번 항목의 값 변경
		season[1] = "여름";
		System.out.println("season[1] : " + season[1]);
		System.out.println();

		// 배열 변수 선언과 배열 생성
		int[] scores = { 83, 90, 87 };

		// 총합과 평균 구하기
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}
}
