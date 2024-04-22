package 面向对象练习;
public class Student02 {
		//需求：写一个JavaBean类来描绘这个班级的学生
		//属性：姓名，年龄，性别
		//行为：学习
		private String name;
		private int age;
		private String gender;
		
		public Student02(String name,int age,String gender) {
			this.name=name;
			this.age=age;
			this.gender=gender;
		}
		
		public Student02() {
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}
		
		//行为
		public void study() {
			System.out.println(name+"正在学习");
		}
		public void show() {
			System.out.println(name+" , "+age+" , "+gender+",");
		}
}