package 常见API练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_practice_SimpleDateFormat_test {
	public static void main(String []args) throws ParseException {
		
		//需求:把2000-11-11转换成2000年11月11日
		//1.可以通过2000-11-11进行解析,解析成一个Date对象
		String str = "2000-11-11";
		//2.解析
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    Date date = sdf.parse(str);
		//3.格式化
	    SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日");
	    String result =sdf1.format(date);
	    System.out.println(result);
	}
}
