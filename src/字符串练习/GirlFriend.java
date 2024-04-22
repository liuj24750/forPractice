package 字符串练习;

public class GirlFriend {
	//用private是为了数据的安全性
	private String name;
	private int age;
	private String gender;
	//空参构造
	public GirlFriend() {
		System.out.println("验证一下看这个构造方法是否执行了");
	}
	//有参构造
	public GirlFriend(String name,int age,String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	
	//针对于每一个私有化的成员变量，都要提供get和set方法
	//set方法：给成员变量赋值
	//get方法：对外提供成员变量的值
	
	//作用：给成员变量name进行赋值的
	public void setName(String n) {
		name=n;
	}
	//作用：对外提供name属性的
	public String getName() {
		return name;
	}
	//setAge:给成员变量age进行赋值的
	public void setAge(int a) {
		if(a>=18&&a<=50) {
			age=a;
		}else {
			System.out.println("非法参数");
		}
	}
	public int getAge() {
		return age;
	}
	
	public void setGender(String g) {
		gender=g;
	}
	
	public String getGender() {
		return gender;
	}
	

	//行为
	public void sleep() {
		System.out.println("女朋友在睡觉");
	}
	public void eat() {
		System.out.println("女朋友在吃饭");
	}

}
