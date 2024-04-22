package 常见API练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_practice_SimpleDateFormat {
	public static void main(String []args) throws ParseException {
		//  SimpleDateFormat  格式化时间类,让时间以指定的方式来进行展示 2023年10月1日 2023-10-1 2023/10/1
		
		//  public final String format(Date date)    格式化:（日期对象 -> 字符串）把时间变成我们喜欢的格式
		//  public Date parse(String source)    解析:（字符串 -> 日期对象）变成Date对象之后就可以对时间进行计算或者判断等操作
		
		//  格式化的时间形式的常用的模式对应关系如下：
		//  2023-11-11 13:27:06        2023年11月11日 13:27:06
		//  yyyy-MM-dd HH:mm:ss    yyyy年MM月dd日 HH:mm:ss
		
		//利用空参构造创建SimpleDateFormat对象,默认格式
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		Date d1 = new Date(0L);
		//格式化的练习
		String str1 = sdf1.format(d1);
		System.out.println(str1);//1970/1/1 上午8:00
		
		System.out.println("-------------------------------------------");
		
		//利用带参构造创建SimpleDateFormat对象,指定格式
		//课堂练习：多加一个星期几上去
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
		String str2 = sdf2.format(d1);
		System.out.println(str2);
		
		System.out.println("-------------------------------------------");
		
		//解析的练习
		//1.定义一个字符串表示时间
		String str = "2023-11-11 11:11:11";
		//2.利用空参构造创建SimpleDateFormat对象
		//细节
		//创建对象的格式要跟字符串的格式完全一致
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//返回一个Date对象
		Date date = sdf.parse(str);
		System.out.println(date);
		
		System.out.println("-------------------------------------------");
		
		System.out.println(date.getTime());//1699672271000
	}
}
