package 集合练习;

public class 泛型练习 {
	public static void main(String [ ]args) {
		
//		泛型:可以在编译阶段约束操作的数据类型,并进行检查
//		泛型格式:<数据类型>
//		注意:1.泛型只能支持引用数据类型 2.指定泛型的具体类型后,传递数据时,可以传入该类类型或者其子类类型
//		例如：ArrayList<String> list = new ArrayList<>( )这里的<String>就是泛型，它就像看门大爷一样在检查
//		如果没有给集合指定类型，默认为所有数据类型是Object类型，此时可以往集合里添加任意的数据类型
//		出现一个坏处，获取数据的时候无法使用它特有的行为，此时推出了泛型，可以在添加数据时就统一类型
//		(多态的弊端是不能使用子类独有的方法)
		
//		泛型可以在很多地方定义
//		泛型类：当一个类中，某个变量的数据类型不确定时，就可以定义带有泛型的类 
		
//		练习：可以自己编写一个泛型类
		
//		泛型方法：仅仅是方法中形参类型不确定的时候，其实可以只在方法申明上定义自己的泛型
		
//		练习：定义一个工具类ListUtil 类中定义一个静态方法addAll，用来添加多个集合的元素
		
//		泛型接口：修饰符interface 接口名<类型>{ }
//		重点：如何使用一个带泛型的接口
//		方式1：实现类给出具体类型
//		方式2：实现类延续泛型，创建对象时再确定
	}
}
