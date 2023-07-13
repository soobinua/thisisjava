package thisisjava.ch03.sec09;

public class BitShiftExample2 {

	public static void main(String[] args) {
		// 32비트 전체를 오른쪽으로 3비트 이동할 때 맨 오른쪽 3비트는 밀려서 버려지고
		// 맨 위쪽에 새로 생기는 3비트는 무조건 0으로 채워진다.
		// [11111111] [11111111] [11111111] [11111000] 8
		int result = -8 >>> 3;
		// [00011111] [11111111] [11111111] [11111111] >>>3
		System.out.println(result); // 2진수 10진수로 변환하면 536870911
		System.out.println("-------------------------------");

		// int 타입 값 772를 구성하는 4개의 byte를 별도로 읽고 부호없는 정수(0~255)로 출력 예제
		int value = 772; // [00000000] [00000000] [00000011] [00000100]

		// 우측으로 3byte(24bit) 이동하고 끝 1바이트만 읽음: [00000000]
		byte byte1 = (byte) (value >>> 24);
		int int1 = byte1 & 255;
		System.out.println("첫 번째 바이트 부호 없는 값 : " + int1);

		// 우측으로 2byte(16bit) 이동하고 끝 1바이트만 읽음: [00000000]
		byte byte2 = (byte) (value >>> 16);
		int int2 = Byte.toUnsignedInt(byte2);
		System.out.println("두 번째 바이트 부호 없는 값 : " + int2);

		// 우측으로 1byte(8bit) 이동하고 끝 1바이트만 읽음: [00000011]
		byte byte3 = (byte) (value >>> 8);
		int int3 = byte3 & 255;
		System.out.println("세 번째 바이트 부호 없는 값 : " + int3);

		// 끝 1바이트만 읽음: [00000100]
		byte byte4 = (byte) value;
		int int4 = Byte.toUnsignedInt(byte4);
		System.out.println("네 번째 바이트 부호 없는 값 : " + int4);
	}
}