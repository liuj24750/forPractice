package 异常练习;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		// 需求:姓名的长度在3-10之间 年龄的范围在18-10岁
		// 超出这个范围是异常数据不能赋值,需要重新录入,直到正确为止
		Scanner sc = new Scanner(System.in);
		GirlFriend gf = new GirlFriend();
		while (true) {
			try {
				System.out.println("请输入你女朋友的名字:");
				String name = sc.nextLine();
				// 把判断写在set方法里面,对传递过来的数据进行校验,满足要求才会赋值
				gf.setName(name);
				System.out.println("请输入你女朋友的年龄:");
				String ageStr = sc.nextLine();
				int age = Integer.parseInt(ageStr);
				gf.setAge(age);
				// 如果所有的数据都是正确的,那么跳出循环
				break;
			} catch (NumberFormatException e) {
				System.out.println("年龄的格式有误,请输入数字");
				// continue;
			} catch (RuntimeException e) {
				System.out.println("姓名的长度或者年龄范围有误");
				// continue;
			}
		}
		System.out.println(gf);
	}
}
