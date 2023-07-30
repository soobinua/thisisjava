package thisisjava.ch05.sec11;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		// main() 메소드의 String[] 매개변수 용도

		if (args.length != 2) { // 입력된 데이터 개수가 두 개가 아닐 경우
			System.out.println("프로그램 입력값이 부족");
			System.exit(0); // 프로그램 강제 종료
		}

		String strNum1 = args[0]; // 첫번째 데이터 얻기
		String strNum2 = args[1]; // 두번째 데이터 얻기

		int num1 = Integer.parseInt(strNum1); // 문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2); // 문자열을 정수로 변환

		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);

		// 이클립스에서 바로 실행하면 실행 시 입력값을 주지 않았기 때문에 "프로그램 입력값이 부족"이라고 출력된다.
		// Run As > Run Configurations > Project 'thisisjava', Main.class 'thisisjava.ch05.sec11.MainStringArrayArgument' 확인
		// [Arguments] 탭 클릭 후 Program arguments 입력란에 입력 값 두개 (ex 10 20 ) 입력
	}
}
