package thisisjava.ch05.sec09;

public class ArrayCopyExample {
	public static void main(String[] args) {
		// 배열 복사
		// System.arraycopy(원본 배열, 원본배열 복사 시작 인덱스, 새 배열, 새 배열 붙여넣기 시작 인덱스, 복사 항목 수)

		// 길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		// 길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5];
		// 배열 항목 복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// 배열 항목 출력
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", "); // newStrArray 변수가 참조하는 배열의 항목 초기값은 null이므로 복사되지 않은 3번, 4번 인덱스 항목은 null
			// 항목의 값이 String 객체의 번지이므로 번지 복사가 되어 참조하는 String 객체는 변함이 없다.
		}
	}
}
