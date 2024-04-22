package 简单代码练习;

import java.util.Scanner;

/*循环的分类：for循环where循环以及do while循环
格式：
for(初始化语句;条件判断语句;条件控制语句) {
	循环体语句
}
循环从1开始到10结束，每次循环变量i都会自增一次，
一共10次循环，
for(int i=1;i<=10;i++){
     System.out.println("HelloWorld");
}
*/

//练习打印1-5
public class test7 {
	public static void main(String [] args) {
		//for(int i=1;i<=5;i++) {
		//	System.out.println(i);
		//}
		
		//for(int i=5;i>0;i--) {
		///	System.out.println(i);
		//}
		
		/*实现1-100范围内的累加，且这里的sum不能定义在for循环内部
		 * 如果把变量定义在循环里面，那么当前变量只在
		 * 本次循环中有效，当本次循环结束，变量就会从
		 * 从内存中消失*/
		
		//int sum=0;
		//for(int i=1;i<=100;i++) {
			//sum = sum+i;
			/*这话输出语句不应该写在for循环内部,
			虽然也能得到结果但是会执行5次
			System.out.println(sum);*/
		//}
		//System.out.println(sum);
		
		//实现1-100范围内的偶数的累加
		/*
		int sum =0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		*/
		
		/*需求：键盘录入两个数字，表示一个范围
		统计这个范围内，能被3整除又能被5整除的数字
		有多少个*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		//接受第一个数据
		int start = sc.nextInt();
		System.out.println("请输入第二个数：");
		//接受第二个数据
		int end = sc.nextInt();
		int sum=0;
		for(int i =start;i<=end;i++) {
			if(i%3==0&&i%5==0 ) {
				//sum=sum+1;这里用++写也是一样的
				sum++;
			}
		}
		System.out.println("在"+start+"到"+end+"范围内"+"有"+sum+"个符合标准的数据");
	}
}
