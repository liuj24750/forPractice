package 异常练习;

public class Test {
	public static void main(String []args) {
		int [] arr= {1,2,3,4,5,6};
		try {
			                                           //可能出现异常的代码
			System.out.println(arr[10]);//这里出现了异常,程序就会在这里创建一个ArrayIndexOutOfBoundsException对象
			                                           //new  ArrayIndexOutOfBoundsException( );
			                                           //拿着这个对象到catch的小括号中对比,看括号中的变量是否可以接收这个对象
			                                           //如果能被接收,就表示该异常就被捕获,执行catch里面对应的代码
			                                           //当catch里面的所有代码执行完毕,继续执行try...catch体系下面的其他代码
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("索引越界了");//结合IO的知识把错误的信息保存到本地
		}
		System.out.println("看看我执行了吗");
	}
}
//               1.如果try中可能会遇到多个问题,怎么执行？
//                  会写多个catch与之对应(如果我们要捕获多个异常,这些异常如果存在父子关系的话,父类要写在下面)
//               2.如果try中可能会遇到了问题,那么try下面的其他代码还会执行吗？
//                  下面的代码就不会执行了,直接跳转到对应的的catch当中,执行catch里面的语句体

//                  try...catch的好处:让程序继续往下执行,不会停止
//                  格式:
//                  try {
//    	                  可能出现异常的代码;
//                  }catch(异常类名 变量名) {
//	                异常的处理代码;
//                  }
//                  捕获异常的目的是:当代码出现异常的时候,可以让程序继续往下执行
