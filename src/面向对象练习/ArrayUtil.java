package 面向对象练习;
public class ArrayUtil {
	
	//私有化构造方法
	//目的:为了不让外界创建它的对象
	private ArrayUtil() {		
	}
	
	//需要定义为静态的，方便调用
	public static String printArr(int[]arr) {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]+" , ");
			}
		}
		sb.append("]");
		//这里sb只是一个StringBuilder对象，把它转换成字符串
		return sb.toString();
	}
	
	//需要定义为静态的，方便调用
	public static double getAverage(double []arr) {
		double sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		//总和除以数组长度
		return sum/arr.length;
	}
}
