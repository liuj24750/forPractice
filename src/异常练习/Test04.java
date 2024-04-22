package 异常练习;

import java.util.Scanner;

public class Test04 {
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
				e.printStackTrace();
			} catch (NameFormatException e) {
				e.printStackTrace();
			}catch (AgeOutOfBoundException e) {
				e.printStackTrace();
			}
		}
		System.out.println(gf);
	}
}
//如果自己写自定义异常,分为4个步骤
//1.定义异常类(类名见名知意)
//2.写继承关系(运行时期异常那就继承RuntimeException,编译时异常继承Exception)
//3.空参构造
//4.带参构造
//意义:就是为了让控制台的报错信息更加的见名知意
