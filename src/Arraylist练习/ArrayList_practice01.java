package Arraylist练习;
import java.util.ArrayList;
public class ArrayList_practice01 {
	public static void main(String []args) {
		//定义一个集合，添加字符串，并进行遍历，遍历格式为[元素1，元素2，元素3]
		
		//创建一个集合,后面的<>里面可以不写
		ArrayList<String>  list=new ArrayList<>();
		//添加元素
		list.add("点赞了吗");
		list.add("收藏了吗");
		list.add("投币了吗");
		list.add("转发了吗");
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
