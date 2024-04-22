package Arraylist练习;
import java.util.ArrayList;
public class ArrayList_practice04 {
	public static void main(String []args) {
//		需求：main方法里面定义一个集合，存入三个用户对象，用户属性为：id，username，password
//		要求：定义一个方法，根据id查找对应的用户信息。如果存在，返回true，如果不存在，返回false
		
		//创建集合
		ArrayList<User> list = new ArrayList<>( );
		
		//创建三个用户对象
		User u1 = new User("heima001","张三","123456");
		User u2 = new User("heima002","李四","12345678");
		User u3 = new User("heima003","王五","123456qwer");
		
		//把用户对象添加到集合当中
		list.add(u1);
		list.add(u2);
		list.add(u3);
		
		//写测试类，调用方法查看id是否存在
		boolean flag=contains(list,"heima005");
		System.out.println(flag);
	}
	
	//1.我要干嘛    根据id查找用户
	//2.我干这件事需要什么才能完成   id，在集合list中找对应的id
	//3.调用处是否需要使用方法的结果  返回
	
	public static boolean contains(ArrayList<User> list,String id) {
		for(int i=0;i<list.size();i++) {
			//这里是从集合中拿一个user对象
			User u = list.get(i);
			//根据构造方法里的getId()拿到这个user对象里的属性中的id值，
			//这里也就完成了拿到id这一步，接下来根据id去查找信息
			String uid = u.getId();
			if(uid.equals(id)) {
				//遍历集合，如果找到了对应的id，返回true
				return true;
			}	
		}
		//遍历循环完成，表示集合里面的所有元素都已经比较完毕，没找到一样的，返回false
		return false;
		
		
		//如果换一个需求，定义一个方法，根据id查找对应的用户信息，
		//如果存在，返回索引
		//如果不存在，返回-1
		//区别只在于返回值，返回i(也就是索引)和-1
		//如果两个都要返回，可以在contains()方法里调用一个返回索引的方法，并判断下是否>=0
	}
}
