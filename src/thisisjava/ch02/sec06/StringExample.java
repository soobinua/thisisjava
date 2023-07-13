package thisisjava.ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		// 문자열 타입
		// ""로 감싼 문자들을 문자열이라고 한다.
		// String 타입은 자바 기본 타입에 속하지 않는 참조 타입이다.

		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);

		// 문자열 내부 \붙은 문자 사용할 수 있다.
		// 이스케이프 문자
		// 이스케이프 문자 사용하면 특정 문자를 포함할 수 있고 출력에 영향을 미치기도 한다.
		String str = "나는 \"자바\"를 배웁니다."; // 문자열에 큰따옴표 넣기위해 \" 사용
		System.out.println(str);

		str = "번호\t이름\t직업 "; // 탭만큼 띄워 출력하기 위해 \t 사용
		System.out.println(str);

		System.out.print("나는\n"); // 다음 행으로 이동하기 위해 \n 사용
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
	}
}