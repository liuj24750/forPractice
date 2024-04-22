package 常见API练习;

import java.util.Calendar;

public class 日历对象 {
	public static void main(String []args) {
		
		//Calendar代表了系统当前时间的日历对象·,可以单独修改,获取时间中的年月日
		//要注意:Calendar是一个抽象类,不能直接创建对象
		
		//获取Calendar日历类对象的方法 
		//方法名:public static Calendar getInstance()  获取当前时间的日历对象
		//会根据系统的不同时区来获取不同的日历对象,默认表示当前时间
		//会把时间中的纪元0 年1 月2 日 时 分 秒 星期等等的都放到一个数组当中
		//月份范围:0~11,如果获取出来的是0,那么实际上是1月 另外国外把周日当第一天
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println("-------------------------------------------");
		
		//public final Date getTime( )获取日期对象
		//public final setTime(Date date )给日历设置日期对象
		//修改一下日历代表的时间,设置成时间原点
//		Date d = new Date(0L);
//		c.setTime(d);
//		System.out.println(c);
//		System.out.println("-------------------------------------------");
		
		//public long getTimeInMillis( )拿到时间毫秒值
		//public void setTimeInMillis(long millis)给日历设置时间毫秒值
		
		//public int get(int field)取日期中的某个字段信息
		//public void set(int field,int value)修改日历的某个字段信息
		//public void add(int field,int amount)为某个字段增加/减少指定的值
		int year = c.get(1);
		int month = c.get(2)+1;
		int date = c.get(5);
		System.out.println(year+","+month+","+date);
		System.out.println("-------------------------------------------");
		//不按上面那样写也可以,已经被设置为常量
		int year1 = c.get(Calendar.YEAR);
		int month1 = c.get(Calendar.MONTH)+1;
		int date1 = c.get(Calendar.DAY_OF_MONTH);
		int week=c.get(Calendar.DAY_OF_WEEK);
		System.out.println(year1+","+month1+","+date1+","+getWeek(week));
		System.out.println("-------------------------------------------");
		c.set(Calendar.YEAR,2022 );
		c.set(Calendar.MONTH,3);
		c.set(Calendar.DAY_OF_MONTH,6);
		System.out.println(c);
		System.out.println("-------------------------------------------");
		c.add(Calendar.MONTH, 1);
		System.out.println(c);
		
	}
	//查表法
	//表:容器
	//让数据跟索引产生对应的关系
	
	//传入对应的数字1~7
	//返回对应的星期
	public static String getWeek(int index) {
		String [] arr= {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		return arr[index];
	}
}
