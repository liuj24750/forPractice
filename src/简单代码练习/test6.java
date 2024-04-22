package 简单代码练习;
import java.util.Scanner;
//分支语句第二种switch
public class test6 {
	public static void main(String [ ] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入今天是星期几：");
		//接受第一个数据
		int weekday = sc.nextInt();
		switch(weekday) {
		case 1:
			System.out.println("跑步");
			break;
		case 2:
			System.out.println("游泳");
			break;
		case 3:
			System.out.println("慢走");
			break;
		case 4:
			System.out.println("跑步");
			break;
		case 5:
			System.out.println("单车");
			break;
		case 6:
			System.out.println("爬山");
			break;
		case 7:
			System.out.println("跑步");
			break;
			default:
				System.out.println("还能有其他的天数？");
		}
	}
}
