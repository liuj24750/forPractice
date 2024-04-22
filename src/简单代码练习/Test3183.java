package 简单代码练习;
public class Test3183 {
	public static void main(String []args) {
		//用两个for循环，计算出9*9乘法表
		for(int a=1;a<=9;a++) {
			//核心是程序的执行顺序，先是a=1，1小于等于9，进入子循环判断
			for(int b=1;b<=a;b++) {
				System.out.print(a+"*"+b+"="+(a*b)+"\t"+" ");
			}
			//换行，不然全部打在一行了
			System.out.println();
		}
	}
}
