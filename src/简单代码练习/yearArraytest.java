package 简单代码练习;
//四个季度营业额的分别计算及全年总营业额的计算
public class yearArraytest {
	public static void main(String []args) {
		int [][] yearArr= {
				{22,66,44},
				{77,33,88},
				{25,45,65},
				{11,66,99}
		};
		int yearSum=0;
		
		//遍历二维数组，得到每一个一维数组并求和
		for(int i=0;i<yearArr.length;i++) {
			//此时拿到的是一维数组
			int [] quarterArr=yearArr[i];
			int sum=getarraySum(quarterArr);
			System.out.println("第"+(i+1)+("个季度的总营业额为："+sum));
			yearSum=yearSum+sum;
		}
		System.out.println("全年营业额为:"+yearSum);
	}
	
	public static int getarraySum(int []arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];	
		}
		return sum;
	}
}
