package thisisjava.ch04.sec03;

public class SwitchExample {

	public static void main(String[] args) {
		// swtich 문
		// 괄호 안의 변수값에 따라 해당 case로 가서 실행문 실행
		// 만약 변수값과 동일한 값을 갖는 case 없으면 default 가서 실행문 실행
		// default 생략 가능

		int num = (int) (Math.random() * 6) + 1; // 주사위 번호 하나 뽑기

		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break; // 다음 case를 실행하지 않고 switch 문을 빠져나가기 위해 필요
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
		}
	}
}
