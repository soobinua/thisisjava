package thisisjava.ch02.sec01;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3; // 변수 초기화
		int minute = 5; // 변수 선언과 동시에 값 대입
		System.out.println(hour + "시간 " + minute + "분");

		int totalMinute = (hour * 60) + minute;
		System.out.println("총 " + totalMinute + "분");

	}

}
