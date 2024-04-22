package 面向对象练习;
import java.util.ArrayList;
public class StudentUtil {
	private StudentUtil() {
	}
	//静态方法
	public static int getMaxAge(ArrayList<Student02> list) {
		//定义一个参照物
		int max = list.get(0).getAge();
		//循环遍历集合
		for(int i=0;i<list.size();i++) {
			//i是索引 list.get(i)元素/它是一个学生对象，不能直接比较
			//我们还需要getAge()获取到年龄之后再进行比较
			
			//这里还有更加简便的写法，链式写法
			if(max<list.get(i).getAge()) {
				max=list.get(i).getAge();
			}
		}
		return max;	
		}
}
