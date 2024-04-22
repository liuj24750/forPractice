package 简单代码练习;

/*初始化语句只执行一次；
判断语句为true，循环才继续
判断语句为false，循环结束*/

//需求，用while循环打印1-100
public class Test0318 {
	public static void main(String []args) {
//		int i = 1;
//		while(i<=100) {
//			System.out.println("打印数字，此次循环打印版的数字为："+i);
//			i++;
//		}

/*for和while的对比，相同点：运行规则是一样的
不同点:for循环中，控制循环的变量，因为归属for循环的语法结构中
for循环结束后，就不能再次被访问到了
while循环中，控制循环的变量，while循环结束后，该变量还可以使用
这么说其实是不对的，知道循环次数或者循环的范围时，用for循环
不知道循环的次数和范围，只知道循环的结束条件时，用while循环
*/
		double a = 0.1;
		double b=8844430;
		int count = 0;
		while(a<b) {
//			折叠纸张
			a=a*2;
			count =count+1;
		}
		System.out.println("此时这个纸张折了"+count+"次了");
	}
}
