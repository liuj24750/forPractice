package 简单代码练习;
import java.util.Random;

public class Arrtest {
	public static void main(String []args) {
		/*
		 * 需求：生成10个1-100之间的随机数存入数组 
		 * 1.求出所有数据的和 
		 * 2.求出所有数据的平均数 
		 * 3.统计有多少个数据比平均值小
		 */
		int []arr=new int[10];	
		Random r=new Random();
		for(int i=0;i<10;i++) {
			arr[i]=r.nextInt(101);
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		
		//求和
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("数组元素和为:"+sum);
		//求所有数据的平均数
		int avg=sum/arr.length;
		System.out.println("数组的平均数是:"+avg);
		//求有多少个数据比平均数小
		int num=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<avg) {
				num++;
			}
		}
		System.out.println("数组中有"+num+"个数据比平均数小");
	}
}
