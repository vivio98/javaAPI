package lang;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 
 * @Story : ��¥ǥ��
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		//import ����Ű ctlr shift o
	   Date today = new Date();
	   SimpleDateFormat date01,date02,date03,date04;
	  // MM�� �� , mm�� ��
	   date01 = new SimpleDateFormat("yyyy-MM-dd");
	 System.out.println(date01.format(today));
	date02 = new SimpleDateFormat("yyyy�� MM�� dd�� E����");
	System.out.println(date02.format(today));
	
	date03 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	System.out.println(date03.format(today));
	date04 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
	System.out.println(date04.format(today));
	}

}
