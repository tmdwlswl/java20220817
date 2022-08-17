package ch02.lecture;

public class C04Integer {
	public static void main(String[] args) {
//		정수: byte(1),short(2),int(4), long(8)
		
//		1byte == 8bit (0000 0000)
//		0~255(1111 1111)
//		-128 ~ 127
		
		
		byte a = 0;
		byte b = 127;
		byte c = -128;
//		byte d = 128;
//		byte e = -129;
		
		//short (2bytes)
		// -32,768 ~ 32,767
		short f = -32768;
		short g = 32767;
//		short h = 32768;
//		short i = -32769;
		
		//int (4bytes)
		// -2,147,483,648 ~ 2,147,483,647
		int j = -214748648;
		
//	정수 literal 작성시 주의 할 점
//		정수 literal 은 int 로 취급
//		범위를 넘어갈 땐 long 타입으로 표시 (대문자L)
//		작성하는 수가 클 떈 _ 와 조합 가능
		
//	연산시overflow 주의
		int s = 2147483647;
	}
}
