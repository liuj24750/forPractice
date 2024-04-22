package 继承练习;
public class Cook extends Employee{
	public Cook() {
	}
	
	public Cook(String id,String name,double salary) {
		super(id,name,salary);
	}
	
	@Override
	public void work() {
		System.out.println("厨師在炒菜");
	}
}
