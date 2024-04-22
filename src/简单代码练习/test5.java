package 简单代码练习;
import java.util.Scanner;
/*流程控制语句：通过语句控制程序的执行流程
1.顺序结构 2.分支结构 3.循环结构
分支结构：if语句，单条件判断，双条件判断，多条件判断
*/
/*public class test5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入女婿的酒量：");
		int wine =sc.nextInt();
		if(wine>5) {
			System.out.println("小伙子酒量不错");
		}else {
			//else后面也要加上{}括号
			System.out.println("小伙子还需要多练练");
		}
	}
}
*/

/*小练习：影院选座，假设某影院卖了100张票，
票的序号为1~100，如果奇数坐左侧，偶数坐右侧。
键盘录入一个整数表示票号，根据不同情况打印不同提示*/
/*
public class test5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请问您的电影票号是：");
		int number =sc.nextInt();
		//还要对票号做一个判断，不在1~100之间就不是有效的票号
		if(number>0&&number<=100) {
			if(number%2==1) {
				System.out.println("您请坐左边");
			}else {
				//else后面也要加上{}括号
				System.out.println("您请坐");
			}
		}
		}
}
*/
public class test5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("小明的成绩是：");
		int score =sc.nextInt();
		if(score>=0&&score<=100) {
			if(score>=90&&score<=100) {
				System.out.println("奖励一台笔记本电脑");
			}else if(score<90&&score>=80) {
				System.out.println("奖励一个sony耳机");
			}else {
				System.out.println("还敢要奖励，等着挨打");
			}
		}else {
			System.out.println("考的哪门子的试，这什么鬼分数");
		}
     }
}



















