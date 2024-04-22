package 常见API练习;

public class 正则表达式练习 {
	public static void main(String []args) {
		String qq = "805153513";
		//System.out.println(checkQQ(qq));
		
		//正则表达式,判断条件写在里面
		//不能以0开头,那就是[1-9]  表示数字\\d
		//6位到20位,除掉第一个也就还有5到19位,{5,19}
		System.out.println(qq.matches("[1-9]\\d{5,19}"));
	}
	
	public static boolean checkQQ(String qq) {
		//6位及20位以内，0不能在开头，必须全部是数字
		//这种写法的核心思想就是先把异常数据进行过滤
		//然后就是满足要求的数据了
		//这是根据目前所学知识的写法
		//体验一下正则表达式校验
		int len = qq.length();
		if(len<6 || len>20) {
			return false;
		}
		
		//0不能在开头
		if(qq.startsWith("0")) {
			return false;
		}
		
		//必须全部是数字
		for(int i=0;i<qq.length();i++) {
			char c = qq.charAt(i);
			if(c<'0' || c>'9') {
				return false;
			}
		}
		return true;
	}
}
