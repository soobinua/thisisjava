package thisisjava.ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// 증감 연산자
		// ++, -- 는 변수의 값을 1 증가시키거나 1 감소시키는 연산자
		// ++피연산자; 피연산자의 값을 1 증가
		// --피연산자; 피연산자의 값을 1 감소
		// 피연산자++; 다른 연산 수행 후 피연산자의 값 1 증가
		// 피연산자--; 다른 연산 수행 후 피연산자의 값 1 감소
		// 변수 단독 증감 연산자 사용되는 경우 변수의 앞뒤 어디에 붙어도 결과 동일
		// 하지만 여러개 연산자 포함되어 있는 연산식에서는 증감 연산자 위치에 따라 결과 달라진다.
		// 증감 연산자가 변수 앞에 있으면 우선 변수를 1 증가 또는 감소 후 다른 연산 수행
		// 증감 연산자가 변수 뒤에 있으면 모든 연산을 끝낸 후 변수를 1 증가 또는 감소 후 다른 연산 수행

		int x = 10;
		int y = 10;
		int z;

		x++;
		++x;
		System.out.println("x = " + x);
		System.out.println("-----------------------");

		y--;
		--y;
		System.out.println("y = " + y);
		System.out.println("-----------------------");

		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("-----------------------");

		z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("-----------------------");

		z = ++x + y++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}