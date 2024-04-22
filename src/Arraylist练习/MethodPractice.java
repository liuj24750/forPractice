package Arraylist练习;
import java.util.Scanner;
public class MethodPractice {
		public static void main(String []args) {
			//需求：机票价格按照淡季旺季，头等舱和经济舱收费，
			//输入机票原价，月份和头等舱或经济舱
			//旺季（5-10）头等舱9折，经济舱8.5折
			//淡季（11月到来年4月）头等舱7折经济舱6.5折
			
			//1.键盘录入机票原价，月份和舱位
			//2.判断月份是旺季还是淡季，继续判断是经济舱还是头等舱
			//3.根据实际情况计算出对应的价格
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入机票的原价:");
			int ticket = sc.nextInt();
			System.out.println("请输入当前的月份:");
			int month=sc.nextInt();
			System.out.println("请输入当前购买的舱位 0 头等舱 1 经济舱");
			int level=sc.nextInt();
			if(month<=10&&month>=5) {	
//			旺季
//				if(level==0) {
//			头等舱
//					ticket = (int)(ticket*0.9);
//				}else if(level==1) {
//			经济舱		
//					ticket = (int)(ticket*0.8);
//				}else {
//					System.out.println("没有这个舱位");
//				}
				
				ticket=getPrice(ticket,level,0.9,0.85);
				
			}else if((month<=4&&month>=1)||(month>=11&&month<=12) ){	
//	        淡季
//				if(level==0) {
//	              头等舱
//							ticket = (int)(ticket*0.7);
//						}else if(level==1) {
//					经济舱		
//							ticket = (int)(ticket*0.65);
//						}else {
//							System.out.println("没有这个舱位");
//						}
				
				ticket=getPrice(ticket,level,0.7,0.65);
				
			}else {
				System.out.println("键盘录入的月份是一个非法数据");
			}
			System.out.println(ticket);
		}
			
			//实际上中间有很多类似的代码，可以抽取出来写成方法
			/*
			 * 1.我要干嘛？根据舱位和折扣计算最终票价
			 * 2.我干这件事，需要什么才能完成？
			 * 原价，舱位，头等舱的折扣经济舱的折扣 
			 * 3.方法的调用处是否需要继续使用这个结果？需要
			 */
			
			public static int getPrice(int ticket,int level,double v0,double v1) {
				if(level==0) {
					//头等舱
							ticket = (int)(ticket*v0);
						}else if(level==1) {
					//经济舱		
							ticket = (int)(ticket*v1);
						}else {
							System.out.println("没有这个舱位");
						}
				return ticket;
		}
}
