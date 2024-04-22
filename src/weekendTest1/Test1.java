package weekendTest1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
	    public static void main(String[] args) {
	    	//把学生信息放在集合里面
	        List<Student> students = new ArrayList<>();
	        students.add(new Student("liujun", " A", 80, 85));
	        students.add(new Student("zhangmeng", " B", 90, 88));
	        students.add(new Student("renluchuan", " B", 75, 78));
	        students.add(new Student("linxin", " B", 85, 80));
	        
             //存储总成绩
	        Map<String, Integer> count = new HashMap<>();
	        //存储平均成绩
	        Map<String, Integer> avg = new HashMap<>();
	        //存储班级总人口
	        Map<String, Integer> num = new HashMap<>();

	        //增强for循环遍历学生列表
	        for (Student student : students) {
	        	//getOrDefault() 方法获取count中指定的键的值,没有就返回默认值0
	        	//count.getOrDefault(student.getClassName(), 0) + student.getTotalScore()实现成绩的累加
	            count.put(student.getClassName(), count.getOrDefault(student.getClassName(), 0) + student.getTotalScore());
	            num.put(student.getClassName(), num.getOrDefault(student.getClassName(), 0) + 1);
	        }

	        for (String className : count.keySet()) {
	        	//hashmap的get() 方法获取指定 key 对应value,也就是总成绩/学生数
	            int totalScore = count.get(className);
	            int studentCount = num.get(className);
	            int avgScore = (int) totalScore / studentCount;
	            //调用put方法把键值对插入
	            avg.put(className, avgScore);
	            System.out.println("班级: " + className + ", 总成绩: " + totalScore + ", 平均成绩: " + avgScore);
	        }
	    }
}
