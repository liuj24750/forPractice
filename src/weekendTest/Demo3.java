package weekendTest;
import java.util.ArrayList;
public class Demo3 {
	public static void main(String []args) {
		ArrayList<Car> list=new ArrayList<>();
		Car c1=new Car("阿尔法",1000000);
		Car c2=new Car("奔驰",1200000);
		list.add(c1);
		list.add(c2);
		//删除
		list.remove(0);
		//删了一个,现在查出来的是奔驰
		Car c=list.get(0);
		System.out.println(c.getName()+","+c.getPrice());
		
		//漏写一个需求
		
		//求长度，顺便判断是否为空
		int i=list.size();
		System.out.println(i);
		//清空
		list.removeAll(list);
		//删除的写法还有一种:list.clear();
		}
}
