package Arraylist练习;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_practice03 {
	public static void main(String []args) {
		//需求：定义一个集合，添加一些学生对象，并进行遍历
		//学生类的属性为：姓名，年龄
		//会报错的原因是还没有创建Student这个类
		
		//创建集合
		ArrayList<Student> list=new ArrayList<>();
		
//		创建学生对象
//		Student s1=new Student("张三",23);
//		Student s2=new Student("李四",24);
//		Student s3=new Student("王五",25);
		//不过此时集合里面依旧是没有任何数据的，没有把学生对象往里面放
		//添加元素
		//list.add(s1);
		//list.add(s2);
		//list.add(s3);
		
		
//	    这么写其实是有问题的，因为集合并不是指定长度的，长度为0，
//		所以第一个判断，i<list.size()时就已经false了
//		for(int i= 0;i<list.size();i++) {
//			System.out.println("看看我是否执行了");
//			Student s=new Student();
//			list.add(s);
//		}
//		System.out.println(list.size());
		
		
//       键盘录入学生信息并添加到集合当中		
//		 需要注意的是，如果把创建对象的代码写在了循环外面，
//		 那么遍历输出的只会是最后录入的那个数据
//       因为集合里面实际存储的是地址		
		Scanner sc=new Scanner(System.in);	
		for(int i=0;i<3;i++) {
			Student s=new Student();
			
			System.out.println("请输入学生的姓名:");
			String name=sc.next();
			System.out.println("请输入学生的年龄:");
			int age=sc.nextInt();
			
//			此时还未将数据放入集合,把name和age赋值给学生对象
			s.setName(name);
			s.setAge(age);
			
//			把学生对象添加到集合当中
			list.add(s);
			}
		System.out.println(list.size());	
		
//       遍历
		for(int i=0;i<list.size();i++) {
			Student stu=list.get(i);
			System.out.println(stu.getName()+","+stu.getAge());
		}
		
//		遍历集合,这里遍历集合的方式是不一样的
//		for(int i=0;i<list.size();i++) {
//			i  索引 通过索引把元素获取出来   获取的方式通过list.get(i)把值传递过去   这个就是元素/学生对象
//			Student stu = list.get(i);
//			//因为student类不是java写的，是自己写的，没有经过特殊处理，
//			//如果直接打印对象println(stu),那么打印的是地址值，
//			//需要将属性get出来
//			System.out.println(stu.getName()+","+stu.getAge());
//			}
	}
}
