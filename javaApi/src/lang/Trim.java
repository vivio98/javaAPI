package lang;
/*
 * @Stroy trim문법
 */
public class Trim {
	public static void main(String[] args) {
		String str = "   hello     Java   world   ";
		System.out.println(str.trim());
       //trim()은 리터럴 값의 앞뒤 공백을 없애는 기능을 한다.
       /*
        * 메소드 체인지기법 : 리턴 하는 값이 String 이라면
        * String 의 메소드 들을 연결해서 사용할수 있는 데 
        * 이것을 메소드 체인지 라고 한다
        */
		System.out.println(str.trim().replace("Java","JSP"));
 	
	
	}

}
