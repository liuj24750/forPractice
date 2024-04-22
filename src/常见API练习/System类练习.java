package 常见API练习;

public class System类练习 {
	public static void main(String []args) {
		
		//         System也是一个工具类,提供了一些与系统相关的方法
		//         public static void exit(int status)          终止当前运行的java虚拟机
		//         public static long currentTimeMillis()   返回当前系统的时间毫秒值形式
		//         public static void arraycopy(数据源数组,起始索引,目的地数组,起始索引,拷贝个数)   数组拷贝
		
		           //System.exit(0);
		           //0:表示当前虚拟机是正常停止
		
		            //long l = System.currentTimeMillis();
		            //System.out.println(l);
		            //判断两个实现同一个功能的方法的性能的时候可以用这个方法来判断,获取程序运行的总时间
                    
		             //拷贝数组
		             int []arr1 =  {1,2,3,4,5,6,7,8,9,10};
		             int []arr2 =  new int[10];
		             //把arr1数组中的数据拷贝到arr2中
		             System.arraycopy(arr1, 0, arr2, 4, 3);
		             //验证
		             for(int i=0;i<arr2.length;i++) {
		            	 System.out.print(arr2[i]+" ");
		             }
		             
		             //如果数据源数组和目的地数组都是基本数据类型,那么两者的类型必须保持一致,否则会报错
		             //在拷贝的时候需要考虑数组的长度,如果超出范围会报错
		             //如果数据源数组和目的地数组都是引用数据类型,那么子类类型可以赋值给父类类型
		             //如果是引用数据类型的话,实际上拷贝过来的是对象的地址值
	}
}
