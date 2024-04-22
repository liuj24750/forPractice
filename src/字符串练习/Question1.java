package 字符串练习;
import java.util.Scanner;
public class Question1 {
    //已知正确的用户名和密码，请用程序实现模拟用户登录。
	//总共三次机会，登录之后，给出相应的提示
	public static void main(String []args) {
		//读题拆解
		//1.定义两个变量记录正确的用户名和密码
		String rightUsername="liujun";
		String rightPassword="805153513";
		//2.键盘录入用户名和密码
		for(int i=0;i<3;i++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username=sc.next();
		System.out.println("请输入用户密码:");
		String password=sc.next();
		//比较
		if(username.equals(rightUsername)&&password.equals(rightPassword)) {
			System.out.println("用户登录成功");
			//记得加上一个结束语句，登录成功就退出去
			break;
		}else{
			if(i==2) {
				//最后一次机会也输入错误，此时提示账号被锁定
				System.out.println("账号已被锁定");
			}else{
			System.out.println("用户登录失败，您还剩下"+(2-i)+"次机会");
		}
		}
	}
	}
}
