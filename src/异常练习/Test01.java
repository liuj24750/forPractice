package 异常练习;

public class Test01 {
	public static void main(String []args) {
		
		int [] arr= {1,2,3,4,5};
		try {
			System.out.println(arr[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
		    //String message = e.getMessage();
		    //System.out.println(message);
			
	        //String str = e.toString();
		    //System.out.println(str);
			
			//会以红色字体把异常打印出来,但是不会停止运行程序
			//printStackTrace()其实已经包含了其他两个方法在里面
			//所以这个方法是最常用的
			e.printStackTrace();
		}
		System.out.println("看看我执行了吗");
	}
}
// 顶级父类Throwable里的成员方法
// public String getMessage( )  返回此throwable的详细消息字符串
// public String toString( )  返回此可抛出的简短描述
// public void printStackTrace( )  把异常的错误信息输出在控制台 在底层是利用System.err.println进行输出
