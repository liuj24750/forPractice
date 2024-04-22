package 字符串练习;

public class Stringbuilder_practice02 {
	public static void main(String []args) {
//		拼接字符串
//		定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回
//		调用该方法并在控制台输出结果
//		例如:数组为int[]arr= {1,2,3}
//		执行方法后的输出结果为:[1,2,3]
		
//      定义数组
	int []arr= {1,2,3};
	
//      调用方法把数组变成字符串
	String str = arrToString(arr);
	
	System.out.println(str);	
	}
	
	
//   抓住一个重点，StringBuilder就是一个帮助我们操作字符串的非常方便的一个工具
//	使用StringBuilder的场景：
//	1.字符串的拼接
//	2.字符串的反转
	
	
	public static String arrToString(int []arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]+",");
			}
		}
		sb.append("]");
//      sb此时只是一个容器，需要调用toSring()将它变回字符串
		return sb.toString();
	}
}
