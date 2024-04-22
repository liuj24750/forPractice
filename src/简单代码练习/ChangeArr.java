package 简单代码练习;

public class ChangeArr {
	public static void main(String []args) {
		/*
		 * int []a= {1,2,3,4,5}; 
		 * int []b=new int[5];
		 *  for(int i=0;i<a.length;i++) 
		 *  {b[4-i]=a[i]; } 
		 * for(int i=0;i<b.length;i++) 
		 * { System.out.println(b[i]); }
		 */
		
		//也可以定义一个临时的第三方变量temp
		
		//需求:定义一个数组，存入12345，交换首尾索引对应的元素
		//交换前：1，2，3，4，5
		//交换后：5，4，3，2，1
		//利用for循环实现代码
		int []arr= {9,6,3,4,5};
		//i<j,代表的是i对应的索引跑到了j右边，也就代表着所有数据已经换了一遍
		for(int i=0, j=arr.length-1;i<j;i++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
