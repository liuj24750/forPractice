package 简单代码练习;

public class GetMax {
	public static void main(String []args) {
		//求最大值，并打印
//		int max=0;
//		int []a= {33,5,22,44,55};
//		for(int j=0;j<5;j++) {
//			if(a[j]>max) {
//				max=a[j];
//			}
//		}
//		System.out.println("本数组中最大值是："+max);
		
		//上面这样写代码其实也是有风险的，将max定义为0的话，
		//如果数组里面全是负数，那么最大值就会是0，
		//要把代码优化一下，max的初始化值一定要是数组里的值
		//求最小值也是同理
		int []a= {33,5,22,44,55};
		int max=a[0];
		for(int i=1;i<5;i++) {
			if(a[i]>max) {
				max=a[i];			
				}
		}
		System.out.println("此数组最大的值是："+max);
	}
}
