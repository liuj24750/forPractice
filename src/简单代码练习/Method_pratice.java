package 简单代码练习;

public class Method_pratice {
	public static void main(String[] args) {
		// System.out.println(getSum1(98,46,45));
		
		/*
		 * 调取方法获取长方形面积,再进行比较 之所以不把判断的逻辑写在方法里面是因为 这玩意需求发生变动，就无法使用，比如要比较
		 * 三个长方形面积的时候，方法里写两个的比较， 就无法使用
		 */
		double area1=getArea(5.3,1.7);
		double area2=getArea(21.4,2.7);
		if(area1>area2) {
			System.out.println("第一个长方形面积更大");
		}else {
			System.out.println("第二个长方形面积更大");
		}
	}

	// 不要忘记void，因为这个方法没有返回值
	public static void getSum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}

	// 带返回值方法的定义和调用格式
	//return关键字，方法有返回值：必须要写。表示结束方法和返回结果
	public static int getSum1(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		return result;// 返回给方法的调用者
	}
	/*
	 * public static void compare(double len1,double width1,double len2,double
	 * width2) {
	 * 
	 * double area1=len1*width1; double area2=len2*width2; if(area1>area2) {
	 * System.out.println("第一个长方形的面积比第二个要大"); }else {
	 * System.out.println("第二个长方形的面积比第一个要大"); }
	 * }
	 */
	public static  double getArea(double len,double width) {
		double area=len*width;
		return area;
	}
	
	
}
