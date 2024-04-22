package 异常练习;

public class GirlFriend {
	private String name;
	private int age;
	public GirlFriend() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	/**
	 * @param name
	 * @param age
	 */
	public GirlFriend(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//判断写在set方法内部
		int len = name.length();
		if(len<3 || len>10) {
			throw new NameFormatException(name+"格式有误,长度应该为3-10");
		}
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<18 || age>40) {
			throw new AgeOutOfBoundException(age+"超出了范围");
		}
		this.age = age;
	}
	
	public String toString() {
		return "GirlFriend{"+"name="+name+",age="+age+"}";
	}
}
