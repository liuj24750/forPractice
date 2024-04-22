package 字符串练习;

public class GirlFriendTest {
	public static void main(String []args) {
		/*
		 * GirlFriend gf1=new GirlFriend(); gf1.setName("小诗诗"); gf1.setAge(18);
		 * gf1.setGender("女");
		 * 
		 * System.out.println(gf1.getName()); System.out.println(gf1.getAge());
		 * System.out.println(gf1.getGender()); gf1.eat(); gf1.sleep();
		 */
		
		//带参构造 ，也不是所有时候都能用，如果提前不知道数据
		//也没法使用带参构造，所以，无论是否适用，都手动书写
		//无参数构造方法，和带全部参数的构造方法
		GirlFriend gf1= new GirlFriend("刘浩存",22,"女");
		System.out.println(gf1.getName());
		System.out.println(gf1.getAge());
		System.out.println(gf1.getGender());
	}
}
