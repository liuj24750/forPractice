package 面向对象练习;

public class ArrayUtilTestDemo {
	public static void main(String []args) {
		//测试工具类的的方法
		int [ ]arr1= {1,2,3,4,5};
		String str = ArrayUtil.printArr(arr1);
		System.out.println(str);	
		
		double[ ] arr2= {1.5,3.7,4.9,5.8,6.6};
		double avg=ArrayUtil.getAverage(arr2);
		System.out.println(avg);
	}
}
