package lang;
/*
 * @Stroy trim����
 */
public class Trim {
	public static void main(String[] args) {
		String str = "   hello     Java   world   ";
		System.out.println(str.trim());
       //trim()�� ���ͷ� ���� �յ� ������ ���ִ� ����� �Ѵ�.
       /*
        * �޼ҵ� ü������� : ���� �ϴ� ���� String �̶��
        * String �� �޼ҵ� ���� �����ؼ� ����Ҽ� �ִ� �� 
        * �̰��� �޼ҵ� ü���� ��� �Ѵ�
        */
		System.out.println(str.trim().replace("Java","JSP"));
 	
	
	}

}
