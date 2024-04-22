package 常见API练习;

public class Test {
	public static void main(String []args) {
		for(int i=0;i<10;i++) {
			System.out.println(Math.floor(Math.random()*100)+1);
			//Math.random( )   [0.0  1.0)
			//*100    [0.0  100.0)
			//floor    去掉了后面的小数
			//+1       [1  100.0)
		}
	}
}	
	//什么是API：就是Java帮我们写好的各种功能的java类，统称API，每个类里面有很多方法
	//不要去背，用的时候去查，记一下类名和类的作用，养成查阅API帮助文档的习惯
	
	//                  Math类是一个帮助我们用于进行数学计算的工具类
	//                  私有化构造方法,所有的方法都是静态的,常见方法如下:
	//                  pubic static int abs(int a)---获取参数绝对值
	//                  public static doube ceil(double a)---向上取整
	//                  public static double floor(double a)---向下取整
	//                  public static int round(float a)---四舍五入
	//                  public static int max(int a,int b)---获取两个int值中的较大值
	//                  public static double pow(double a,double b)---返回a的b次幂的值
	//                  public static double random()---返回为double的随机值,范围[0.0,1.0)  (不包括1.0)

