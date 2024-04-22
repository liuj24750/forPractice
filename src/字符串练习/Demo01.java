package 字符串练习;

public class Demo01 {
	//一维数组第一个元素和最后一个元素互换位置实现
	public static void main(String []args) {
		int []abc= {20,90,48,92};
		int sum=abc[0];
		abc[0]=abc[3];
		abc[3]=sum;
		for(int i=0;i<4;i++) {
			System.out.print(abc[i]+" ");
		}
	}
}
