package thisisjava.ch05.sec12;

//열거 타입
public enum Week {
	//열거 상수 목록(한정된 값 목록)
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}

//열거 상수는 열거 타입으로 사용할 수 있는 한정된 값
//관례적으로 알파벳으로 정의하며 모두 대문자로 작성. 여러 단어로 구성되는 경우 단어_단어 사이 언더바로 연결
//열거 타입도 하나의 데이터 타입으로 변수를 선언하고 사용
//열거 타입 변수에는 열거 상수 대입 가능
//열거타입.열거상수 형태로 작성하며 null도 대입할 수 있다.