package studentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		menu: while (true) {
			System.out.println("--------------------欢迎来到本学生管理系统------------------------");
			System.out.println("1.添加学生");
			System.out.println("2.删除学生");
			System.out.println("3.修改学生");
			System.out.println("4.查询学生");
			System.out.println("请输入您的选择:");
			Scanner sc = new Scanner(System.in);
			String choose = sc.next();
			switch (choose) {
			case "1" -> addStudent(list);
			case "2" -> deleteStudent(list);
			case "3" -> updateStudent(list);
			case "4" -> queryStudent(list);
			case "5" -> {
				System.out.println("退出");
				// 不能只写break,这样只是跳出switch循环而已
				break menu;
			}
			default -> System.out.println("没有这个选项");
			}
		}
	}

//添加学生
//直接键盘录入，但是要保证一个条件就是id唯一
	public static void addStudent(ArrayList<Student> list) {
		// 利用空参构造先创建学生对象
		Student stu = new Student();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入学生的id:");
			String id = sc.next();
			// 调用空参构造里面的setId()方法前先做一个判断
			Boolean flag = fix(list, id);
			if (flag) {
				// 此时flag值为true,说明录入的id重复，需要再次录入
				System.out.println("id已经存在，请重新录入");
			} else {
				// else表示id不存在，可以使用
				stu.setId(id);
				break;
			}
		}

		System.out.println("请输入学生的姓名:");
		String name = sc.next();
		stu.setName(name);

		System.out.println("请输入学生的年龄:");
		int age = sc.nextInt();
		stu.setAge(age);

		System.out.println("请输入学生的家庭住址:");
		String address = sc.next();
		stu.setAddress(address);
	    //if(address != null && address.equals("")) {
		//}
		
		// 把学生对象添加到学生集合当中
		list.add(stu);
		// 提示一下用户
		System.out.println("学生信息添加成功！");
	}

//删除学生
	public static void deleteStudent(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要删除的学生id:");
		String id = sc.next();
//查询id在集合中的索引
		int index = getIndex(list, id);
//对index进行判断
//如果>=0,表示存在,直接删除
//如果-1,就表示不存在，结束方法，回到初始菜单
		if (index >= 0) {
			list.remove(index);
			System.out.println("id为:" + id + "的学生删除成功");
		} else {
			System.out.println("id不存在，删除失败");
		}
	}

//修改学生
	public static void updateStudent(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要修改的学生id:");
		String id = sc.next();
//调用getIndex方法,判断是否存在，并且拿到索引,通过索引获取学生对象，然后修改
		int index = getIndex(list, id);
		if (index == -1) {
			System.out.println("要修改的id" + id + "不存在，请重新输入");
			return;
		}
		// 代码能执行到这里说明当前id是存在的
		Student stu = list.get(index);

		// 输入其他的信息并修改
		System.out.println("请输入要修改的学生姓名:");
		String newname = sc.next();
		stu.setName(newname);

		System.out.println("请输入要修改的学生年龄:");
		int newage = sc.nextInt();
		stu.setAge(newage);

		System.out.println("请输入要修改的学生家庭住址:");
		String newaddress = sc.next();
		stu.setAddress(newaddress);

		System.out.println("学生信息修改成功");
	}
	

//查询学生
	public static void queryStudent(ArrayList<Student> list) {
//如果学生信息为0
		if (list.size() == 0) {
			System.out.println("当前无学生信息，请添加后再查询");
			return;
		}
		
		System.out.println("您想根据什麽來查:");
		Scanner sc = new Scanner(System.in);
		String choose1 = sc.next();
		System.out.println("請輸入id:");
		String scannerid = sc.next();
		switch (choose1) {
		case "id" ->getMessage(list,scannerid);
		case "name" -> System.out.println("該功能尚未實現");
		case "age" -> System.out.println("該功能尚未實現");
		case "address" -> System.out.println("該功能尚未實現");
		}
		
		// 打印表头信息
//		System.out.println("id\t\t姓名\t年龄\t家庭住址");
//		for (int i = 0; i < list.size(); i++) {
//			Student stu = list.get(i);
//			System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
//		}
	}

//实现判断id是否唯一的方法，也就是判断id是否在集合中存在，两个参数，一个集合，一个是需要查询的id
	public static boolean fix(ArrayList<Student> list, String id) {
		// 循环遍历集合得到里面的每一个学生对象
		// 得到学生对象后，获取id并进行判断
		// 存在 返回true 不存在 返回false
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			String sid = stu.getId();
			if (sid.equals(id)) {
				// 存在，true
				return true;
			}
		}
		// 不存在，false
		return false;
	}
//fix方法还可以调用getIndex方法来实现自己的功能，时间不够，后面再来改写

//通过id获取索引的方法
	public static int getIndex(ArrayList<Student> list, String id) {
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			String sid = stu.getId();
			if (sid.equals(id)) {
				// 如果一样,返回索引
				return i;
			}
		}
		// 当循环结束后还没有找到，就表示不存在，就返回-1 这个不存在的索引就可以了
		return -1;
	}
	
	public static void getMessage(ArrayList<Student> list,String id) {
		int index = getIndex(list, id);
		if (index == -1) {
			System.out.println("要修改的id" + id + "不存在，请重新输入");
			return;
		}
		// 代码能执行到这里说明当前id是存在的
		Student stu = list.get(index);
		System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
	}
}
