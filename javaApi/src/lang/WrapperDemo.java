package lang;
/*
 * @ Story Wrapper Class 문법
 */

public class WrapperDemo {
	/*
	 * Wrapper Class
	 * - 원시형 타입 8가지 중 char 와 int 를 제외한
	 * 나머지 타입을 시작문자를 대문자로 빠구어 객체화 시킨 것.
	 * - 즉 , Boolean,Byte, Double,Float,Short,long 이다 
	 * - 그리고 int는 Integer 
	 * -char 는 Character 이다.
	 * - 즉 , primitive 타입도 객체를 처리하는 것이
	 * Wrapper(랩퍼) class 이다
	 */
 public static void main(String[] args) {
	 // 리터럴 값을 기본형으로 캐스팅시 변환방법
	 
	 String str = String.valueOf(50);
	 // 즉 String => int 
	 int num1 = Integer.parseInt("200");
	 int num2 = Integer.parseInt("200");
	 int result = num1 + num2;
	 System.out.println(result);
	 // 기본형을 참조형으로 형변환하는 경우(캐스팅 생략가능)
	 //Integer num3 = (Integer)result;
	 Integer num3 = result;
	 System.out.println("기본형을 참조형으로 형변환한 결과 :" +num3);
	 int num4 = 2 + num3;
	 System.out.println("참조형과 기본형간의 연산결과 :"+ num4);
	 int num5 = Integer.parseInt("Hello");
	 System.out.println(num5);
	 //Exception in thread "main" java.lang.NumberFormatException:
	 //For input string : "hello"
	 //문자값을 숫자형으로 형변환을 시도했는지 여부를 고민하고 디버깅해야 한다
	 		
}
}
