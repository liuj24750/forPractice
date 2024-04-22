package 简单代码练习;

public class test2 {
public static void main(String [] args) {
	//数字进行运算时，数据类型不一样不能运算，
	//需要转成一样的，才能运算
	int a = 10;
	double b = 12.3;
	double c = 20.0;
	//System.out.println(a+b);
	System.out.println(a+c);
	//两边全为假，结果才为假
	System.out.println(true | false);
	
	//短路运算符的验证
	int d=10;
	int e=10;
	boolean result=++d<5&&++e<5;
	System.out.println(result);
	System.out.println(d);
	System.out.println();
    //这里验证的逻辑就是这里用了&&这个短路运算符
	//第一个就不为真的话后面都不用判断也就是说++b
	//根本不会执行，所以结果false，11，10
}
}

//取值范围从小到大是
//byte<short<int<long<float<double(取值范围最大)

/*隐式转换（自动类型提升）
把取值范围小的数值转成取值范围大的数据
例：double b=a
int的取值范围比double小
*/

/*
强制转换：如果把一个取值范围大的数值
赋值给取值范围小的变量。是不允许直接赋值的，
如果一定要这么做的话就需要加入强制转换

格式是：
目标数据类型 变量名=（目标数据类型）被强转的数据

举例：
double a=12.3；
int b=（int）a；
a原本是double类型，范围更大
但是强制转换是可能出现错误的 

字符串的"+"操作，当"+"的操作中出现字符串的时候
这个"+"就是字符串连接符了，而非算数运算符

自增自减运算符：自增，子减
*/











