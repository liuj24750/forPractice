package Arraylist练习;
import java.util.ArrayList;
public class ArrayList_practice05 {
	public static void main(String []args) {
//		定义一个JavaBean类：phone
//		phone属性：品牌，价格
//		main方法中定义一个集合，存入三个手机对象
//		分别为：小米 1000 苹果 8000 锤子 2999
//		定义一个方法，将价格低于3000的手机信息返回
		
//		创建集合对象
		ArrayList<phone> list = new ArrayList<>();
		
//		创建手机的对象
		phone p1 = new phone("小米",1000);
		phone p2 = new phone("苹果",8000);
		phone p3 = new phone("锤子",2999);
		
//      添加数据
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
//		调用方法
//      此时方法返回了一个集合，需要拿一个集合来接收		
	    ArrayList<phone> phoneInfo = GetphoneInfo(list);
	    
//	    遍历集合
	    for(int i=0;i<phoneInfo.size();i++){
//	    get方法得到的是集合里的一个元素，
//	    也就是一个phone类型的数据，自然需要用一个phone类型的对象来接受
	    	phone pp=phoneInfo.get(i);
	    	System.out.println(pp.getBrand()+","+pp.getPrice());
	    }
	}
			
//		1.我要干嘛？ 将价格低于3000的手机信息返回
//		2.我干这件事，需要什么才能完成？price 集合list(在哪去查)
//		3.我干完了方法的调用处是否需要继续使用结果？返回
		
//       技巧:如果我们要返回多个数据，可以把这些数据先放到一个容器里面，再把容器返回
//       集合  数组
	
		public static ArrayList<phone>  GetphoneInfo(ArrayList<phone> list) {
			//定义一个集合用于存储价格低于3000的手机对象
			ArrayList<phone> result = new ArrayList<>();
			for(int i=0;i<list.size();i++) {
				phone p=list.get(i);
				int price = p.getPrice();
				if(price<3000) {
//					System.out.println(p.getBrand()+" , "+p.getPrice());
//					如果当前价格是小于3000的，不需要打印，直接把当前的手机对象p添加到集合当中
					result.add(p);
					}
			}
			return  result;
	}
}
