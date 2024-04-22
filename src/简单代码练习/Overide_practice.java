package 简单代码练习;

public class Overide_practice {
	public static void main(String []args) {
		//compare((byte)10,(byte)5);
		int []arr= {11,22,33,44,55};
		printArr(arr);
	}
	/*
	 * 方法的重载：在同一个类中，
	 * 定义了多个同名的方法 这些同名的方法具有同种的功能，
	 * 每个方法具有不同的参数类型 或者参数个数，
	 * 这些同名的方法就构成了重载关系
	 */
	//同类同名不同参就是重载
	/*
	 * 需求：使用方法重载思想，设计比较两个整数是否相同的方法 要求：兼容全整数类型(byte,short,int,long)
	 */
	public static void compare(byte b1,byte b2) {
		System.out.println(b1==b2);
	}
	public static void compare(short s1,short s2) {
		System.out.println(s1==s2);
	}
	public static void compare(int i1,int i2) {
		System.out.println(i1==i2);
	}
	public static void compare(long L1,long L2) {
		System.out.println(L1==L2);
	}
	
	//设计一个方法用于数组遍历，要求遍历的结果是在一行上的
	public static void printArr(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
		if(i == arr.length - 1){
			System.out.print(arr[i]);			
		}else {
			System.out.print(arr[i]+",");
		}
		}
		System.out.print("]");
	}
}
