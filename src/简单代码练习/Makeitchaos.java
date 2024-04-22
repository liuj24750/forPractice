package 简单代码练习;
import java.util.Random;
public class Makeitchaos {
	public static void main(String []args) {
		int []a= {3,8,9,2,0};
		Random r=new Random();
		//循环遍历数组，从0索引开始打乱数据的顺序
		for(int i=0;i<a.length;i++) {
			//生成一个随机索引，拿着随机索引指向的元素，跟i指向的元素进行交换
			//这里如果这样写就会出现错误，因为会有重复数据出现
			//依旧还是需要一个第三方变量存储数据
			
		//a[i]=a[r.nextInt(a.length)];
			int randomIndex=r.nextInt(a.length);
			int temp=a[i];
			a[i]=a[randomIndex];
			a[randomIndex]=temp;
		    }
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
