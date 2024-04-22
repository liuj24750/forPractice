package 简单代码练习;
public class Test318 {
	public static void main(String  []args) {
		int sum = 0;
		//20-50范围内，那就循环从20开始50结束
		//因为知道循环范围，用for循环
		for(int i=20;i<=50;i++) {
			if(i%3==0) {
				sum = sum+i;
			}
		}
		//打印语句写在循环外
		System.out.println("20-50内部，所有3的倍数的数字的合计值为："+sum);
	}
}
