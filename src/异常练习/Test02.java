package 异常练习;

public class Test02 {
	public static void main(String []args) {
		int []arr = null;
		int max = 0;
		try {
			max = getMax(arr);
		}catch(NullPointerException e) {
			System.out.println("空指针异常");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("索引越界异常");
		}
		System.out.println(max);
	}

	//NullPointerException,ArrayIndexOutOfBoundsException的爷爷都是RuntimeException异常
	//RuntimeException异常属于运行时期异常,运行时期异常不需要手动声明
	public static int getMax(int []arr) throws NullPointerException,ArrayIndexOutOfBoundsException{
		if(arr == null) {
			//创建一个异常对象,并把这个异常方法交给方法的调用者
			//此时方法就会结束,下面的代码就不会再执行了
			throw new NullPointerException();
		}
		if(arr.length == 0) {
			//索引越界异常
			//创建一个异常对象,并把这个异常方法交给方法的调用者
			//此时方法就会结束,下面的代码就不会再执行了
			throw new ArrayIndexOutOfBoundsException( );
		}
		System.out.println("看看我执行了吗");
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
}
//抛出处理:throws和throw
//throws:写在方法定义处,表示声明一个异常,告诉调用者,使用本方法可能会有哪些异常
//public void 方法( ) throws 异常类名 1,异常类名 2{ }
//throw:写在方法内,结束方法,手动抛出异常对象,交给调用者,方法中下面的代码不再执行了
//public void 方法( ) {throw new NullPointerException( );}