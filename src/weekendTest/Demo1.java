package weekendTest;

import java.util.Random;

public class Demo1 {
	public static void main(String[] args) {
		Random rand = new Random();
		int i;
		//可能出现0
		i = rand.nextInt(8);
		switch (i) {
		case 1:
			System.out.println("周一:英语");
			break;
		case 2:
			System.out.println("周二:日语");
			break;
		case 3:
			System.out.println("周三:吉他");
			break;
		case 4:
			System.out.println("周四:java技术");
			break;
		case 5:
			System.out.println("周五:salesforce");
			break;
		case 6:
			System.out.println("周六:HTML");
			break;
		case 7:
			System.out.println("周日:Jquery");
			break;
			//少写一个default
		}
	}
}
