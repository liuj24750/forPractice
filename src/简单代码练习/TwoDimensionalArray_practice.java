package 简单代码练习;

public class TwoDimensionalArray_practice {
	public static void main( String []args) {
		//二维数组的练习：数组里面存数组
		//当我们需要把数据分组管理的时候，就需要用到二维数组
		
		//简化格式:int [][] arr={{11,22},{33,44}}
		//建议把每一个一维数组，单独写成一行
		int [][]arr= {
				{1,2},
				{3,4}
		};
		
		//利用动态初始化格式创建二维数组
		//遍历二维数组
		//外循环：遍历二维数组里面的每一个一维数组
		//内循环：遍历一维数组获取每一个元素
		int [][]arr1=new int[3][5];
		arr1[0][0]=10;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		//获取元素
		//此时表示获取二维数组中的第一个一维数组的地址
		System.out.println(arr[0]);
		//想要拿到实际数据，需要在加上一个方括号
		System.out.println(arr[0][0]);
		
		//二维数组的遍历:先得到一维数组，再遍历一维数组获取数据
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//二维数组的动态初始化
		//格式：数据类型[][] 数组名=new 数据类型[m][n]
		//m表示这个二维数组，可以存放多少个一维数组
		//n表示每一个一维数组，可以存放多少个元素
		//范例： int [][]arr=new int[2][3];
	}
}
