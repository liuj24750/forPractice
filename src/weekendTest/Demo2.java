package weekendTest;
import java.util.ArrayList;
//27 171 
public class Demo2 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		int[] err = { 68, 27, 95, 88, 171, 996, 51, 210,15,5,5000 };
		for (int i = 0; i < err.length; i++) {
			//外面这个判断比较多余
			if (err[i] >= 100 && err[i] < 1000) {
				if (err[i] / 10 % 5 != 0 && err[i] % 5 != 0 && err[i] % 2 != 0)
					list.add(err[i]);
			} else if (err[i] < 100 && err[i] > 0) {
				if (err[i] / 10 % 5 != 0 && err[i] % 5 != 0 && err[i] % 2 != 0) {
					list.add(err[i]);
				}
			}
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
