package 简单代码练习;
import java.util.Random;
public class Test3184 {
	public static void main(String []args) {
		Random r1 = new Random();
		int i;
		i = r1.nextInt(7);
		switch(i) {
		case 1:
			int a =150;
			System.out.println("申购了野村证券"+"需要准备"+100*a);
			break;
		case 2:
			int b = 100;
			System.out.println("申购了NEC"+"需要准备"+100*b);
			break;
		case 3:
			int c = 200;
			System.out.println("申购了SOFTBANK"+"需要准备"+100*c);
			break;
		case 4:
			int d = 60;
			System.out.println("申购了日产汽车"+"需要准备"+100*d);
			break;
		case 5:
			int e =30;
			System.out.println("申购了富士软件"+"需要准备"+100*e);
			break;
		case 6:
			int f = 3000;
			System.out.println("申购了NTT"+"需要准备"+100*f);
			break;
			//需要写一个default，因为可能返回0
			default:
				System.out.println("不存在这只股票");
		}
	}
}
