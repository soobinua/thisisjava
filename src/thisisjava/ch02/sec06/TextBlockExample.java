package thisisjava.ch02.sec06;

public class TextBlockExample {
	
	public static void main(String[] args) {
		String str1 = "" +
		"{\n" +
		"\t\"id\":\"winter\",\n" +
		"\t\"name\":\"눈송이\"\n" +
		"}";

		// Java 13부터 텍스트 블록 문법 제공
		// """로 감싸면 이스케이프 할 필요 없이 작성된 그대로 문자열 저장
		String str2 = """
		{
			"id":"winter",
			"name":"눈송이"
		}
		""";

		System.out.println(str1);
		System.out.println("------------------------------------");
		System.out.println(str2);
		System.out.println("------------------------------------");
		
		// 텍스트 블록에서 줄바꿈 \n
		// 줄바꿈을 하지 않고 다음줄에 이어 작성하고 싶다면 맨끝에 \ 붙이면 된다.(30라인)
		// 이 기능 Java 14부터 제공
		String str = """
		나는 자바를 \
		학습합니다.
		나는 자바 고수가 될 겁니다.
		""";
		System.out.println(str);
	}
}