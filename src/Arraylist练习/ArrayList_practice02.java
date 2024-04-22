package Arraylist练习;
import java.util.ArrayList;
public class ArrayList_practice02 {
	public static void main(String []args) {
//      需求：定义一个集合，添加数字，并进行遍历
//      要注意：集合里面是不可以直接添加基本数据类型，
//		想添加的话，把他变成对应的包装类,写对应的包装类
		
//		基本数据类型对应的包装类
		/*
		 * byte    Byte 
		 * short   Short 
		 * char    Character  重点
		 * int       Integer       重点
		 * long    Long 
		 * float    Float 
		 * double  Double 
		 * boolean  Boolean
		 */
		//创建集合
		ArrayList<Integer> list = new ArrayList<>();
		//添加元素
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//遍历集合
		System.out.print("[");
		for(int i=0;i<list.size();i++) {
			//这里的意思是最后一个数据，不要打印，了
			if(i==list.size()-1) {
				System.out.print(list.get(i));
			}else {
				System.out.print(list.get(i)+", ");
			}
		}
		System.out.print("]");
	}
}
