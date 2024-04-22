package 常见API练习;

import java.util.Date;

public class Date_practice {
	public static void main(String []args) {
		
		//jdk7以前时间相关类 Date SimpleDateFormat Calendar
		
		//Date 时间类是一个jdk写好的javabean类,用来描述时间,精确到毫秒
		//利用空参构造创建的对象,默认表示系统当前时间  有参表示指定的时间
		
		//SimpleDateFormat  格式化时间类,让时间以指定的方式来进行展示 2023年10月1日 2023-10-1 2023/10/1
		//Calendar 日历类
		
		//创建对象表示一个时间
		Date d1 = new Date();
		System.out.println(d1);
		
		System.out.println("-------------------------------------------");
		
		//创建对象表示一个指定的时间
		Date d2 = new Date(0L);
		System.out.println(d2);
		
		System.out.println("-------------------------------------------");
		
		//setTime 修改时间 过了1000毫秒也就是1秒种
		d2.setTime(1000L);
		System.out.println(d2);
		
		System.out.println("-------------------------------------------");
		
		//getTime 获取当前时间的毫秒值 这个方法有什么用吗
		long time = d2.getTime();
		System.out.println(time);
		
		//实现两个需求：
		//1.打印时间原点开始一年之后的时间
		//2.定义任意两个Date对象,比较一下哪个时间在前哪个在后
	
		//jdk8新增时间相关类 ZoneId Instant ZoneDateTime DateTimeFormatter LocalDate LocalTime LocalDateTime...
		//包装类Byte Short Integer Long Float Double Character Boolean
		
	}
}
