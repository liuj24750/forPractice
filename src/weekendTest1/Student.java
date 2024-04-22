package weekendTest1;

public class Student {
	String name;
	String classname;
	int math;
	int chinese;

	public Student(String name, String classname, int math, int chinese) {
		this.name = name;
		this.classname = classname;
		this.math = math;
		this.chinese = chinese;
	}

	//获取班级名的方法
	public String getClassName() {
		return classname;
	}

	//获取总成绩的方法
	public int getTotalScore() {
		return math + chinese;
	}
}