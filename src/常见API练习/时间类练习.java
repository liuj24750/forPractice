package 常见API练习;

public class 时间类练习 {
	public static void main(String [] args) {
		
		//之所以要学JDK8新增时间相关类,是因为
		//JDK7:代码麻烦   多线程环境下会导致数据安全的问题
		//JDK8:简单   时间日期对象都是不可变的
		
		/* JDK8时间 */
		
		/*
		  Date类
		  ZoneId:时区
		  Instant:时间戳
		  ZoneDateTime:带时区的时间
		*/
		
		/*
		   日期格式化类 SimpleDateFormat 
		    DateTimeFormatter:用于时间的格式化和解析
		 */
		
		/*
		 * 日历类 Calendar 
		 *  LocalDate:年 月 日
		 *  LocalTime:时 分 秒
		 *  LocalDateTime:年 月 日 时 分 秒
		 */
		
		/*
		 * 工具类 
		 * Duration:时间间隔(秒,纳秒) 
		 * Period:时间间隔(年 月 日) 
		 * ChronoUnit:时间间隔(所有单位)
		 */
	}
}
