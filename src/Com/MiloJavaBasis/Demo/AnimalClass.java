package Com.MiloJavaBasis.Demo;

/**
 * 
 * @author milo
 *
 * @explain 类：类是一个模板，它描述一类对象的行为和状态。比如说动物就是一个类,所以的类默认继承Object
 * @explain 对象：对象是类的一个实例，有状态和行为。比如说牛就是动物的一个实例
 * @explain 方法：方法就是行为，一个类可以有很多方法。 方法也可以有自己的变量叫做局部变量.
 * @explain 比如说牛叫,叫声的大小可以是一个变量.其中有一个特殊的方法叫做构造方法，
 * @explain 此方法如果没有显示声明那么其默认的是一个无参的构造方法
 * @explain 实例变量：每个对象都有独特的实例变量，对象的状态由这些实例变量的值决定。
 */
/*
 * 编写Java程序时，应注意以下几点： 大小写敏感：Java是大小写敏感的，这就意味着标识符Hello与hello是不同的。
 * 类名：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 Animal 。
 * 方法名：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。
 * 源文件名：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存 （切记Java是大小写敏感的），文件名的后缀为.java。
 */
/*
 * java关键字简单说明
 * 
 * abstract 抽象方法，抽象类的修饰符
 * 
 * assert 断言条件是否满足
 * 
 * boolean 布尔数据类型
 * 
 * break 跳出循环或者label代码段
 * 
 * byte 8-bit 有符号数据类型
 * 
 * case switch语句的一个条件
 * 
 * catch 和try搭配扑捉异常信息
 * 
 * char 16-bit Unicode字符数据类型
 * 
 * class 定义类
 * 
 * const 未使用
 * 
 * continue 不执行循环体剩余部分
 * 
 * default switch语句中的默认分支
 * 
 * do 循环语句，循环体至少会执行一次
 * 
 * double 64-bit双精度浮点数
 * 
 * else if条件不成立时执行的分支
 * 
 * enum 枚举类型
 * 
 * extends 表示一个类是另一个类的子类
 * 
 * final 表示一个值在初始化之后就不能再改变了表示方法不能被重写，或者一个类不能有子类
 * 
 * finally 为了完成执行的代码而设计的，主要是为了程序的健壮性和完整性，无论有没有异常发生都执行代码。
 * 
 * float 32-bit单精度浮点数
 * 
 * for for循环语句
 * 
 * goto 未使用
 * 
 * if 条件语句
 * 
 * implements 表示一个类实现了接口
 * 
 * import 导入类
 * 
 * instanceof 测试一个对象是否是某个类的实例
 * 
 * int 32位整型数
 * 
 * interface 接口，一种抽象的类型，仅有方法和常量的定义
 * 
 * long 64位整型数
 * 
 * native 表示方法用非java代码实现
 * 
 * new 分配新的类实例
 * 
 * package 一系列相关类组成一个包
 * 
 * private 表示私有字段，或者方法等，只能从类内部访问
 * 
 * protected 表示字段只能通过类或者其子类访问子类或者在同一个包内的其他类
 * 
 * public 表示共有属性或者方法
 * 
 * return 方法返回值
 * 
 * short 16位数字
 * 
 * static 表示在类级别定义，所有实例共享的
 * 
 * strictfp 浮点数比较使用严格的规则
 * 
 * super 表示基类
 * 
 * switch 选择语句
 * 
 * synchronized 表示同一时间只能由一个线程访问的代码块
 * 
 * this 表示调用当前实例或者调用另一个构造函数
 * 
 * throw 抛出异常
 * 
 * throws 定义方法可能抛出的异常
 * 
 * transient 修饰不要序列化的字段
 * 
 * try 表示代码块要做异常处理或者和finally配合表示是否抛出异常都执行finally中的代码
 * 
 * void 标记方法不返回任何值
 * 
 * volatile 标记字段可能会被多个线程同时访问，而不做同步
 * 
 * while while循环
 */
// 动物类
public abstract class AnimalClass implements BiologyClass {
	/*
	 * 有三个私有的实例变量。 对其进行了封装。关于变量定义需要注意以下几点：
	 * 所有的标识符都应该以字母（A-Z或者a-z）,美元符（$）、或者下划线（_）开始 首字符之后可以是任何字符的组合 关键字不能用作标识符
	 * 标识符是大小写敏感的 合法标识符举例：age、$salary、_value、__1_value 非法标识符举例：123abc、-salary
	 * 可访问修饰符 : default, public , protected, private 不可访问修饰符 : final, abstract,
	 * strictfp
	 * 
	 * 访问控制修饰符
	 * 
	 * 默认的，也称为 default，在同一包内可见，不使用任何修饰符。
	 * 
	 * 私有的，以 private 修饰符指定，在同一类内可见。
	 * 
	 * 共有的，以 public 修饰符指定，对所有类可见。
	 * 
	 * 受保护的，以 protected 修饰符指定，对同一包内的类和所有子类可见。
	 * 
	 * 非访问修饰符
	 * 
	 * static修饰符，用来创建类方法和类变量。
	 * 
	 * Final修饰符，用来修饰类、方法和变量，final修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。
	 * 
	 * Abstract修饰符，用来创建抽象类和抽象方法。
	 * 
	 * Synchronized和volatile修饰符，主要用于线程的编程。
	 */

	public final static String ClassName = "AnimalClass";

	// 类变量（静态变量）
	public static String biologyType = "Animal";

	/*
	 * 成员变量（非静态变量） 在面向对象程式设计方法中，封装（英语：Encapsulation）是指，
	 * 
	 * 一种将抽象性函式接口的实作细节部份包装、隐藏起来的方法。
	 * 
	 * 封装可以被认为是一个保护屏障，防止该类的代码和数据被外部类定义的代码随机访问。
	 */

	private int age;
	private double height;
	private String name;

	/*
	 * 构造函数
	 */
	public AnimalClass() {

	}

	public AnimalClass(AnimalClass animalClass) {

	}

	public AnimalClass(int age) {
		this.age = age;
	}

	public AnimalClass(String name) {
		this.name = name;
	}

	public AnimalClass(double height) {
		this.height = height;
	}

	public AnimalClass(int age, String name, double height) {
		this.age = age;
		this.name = name;
		this.height = height;
		AnimalThink();
	}

	/*
	 * 如下定义一了个非抽象方法
	 */
	public void AnimalSound(int volume) {
		// 局部变量
		int vol;
		vol = volume * 100;
		System.out.println("sound volume is :" + vol);
	}

	/*
	 * 如下定义了一个抽象方法
	 */
	public abstract void AnimalMove(int speed);

	/*
	 * 如下定义了一个私有方法
	 */
	private void AnimalThink() {
		System.out.println("AnimalThink");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * 重写是子类对父类的允许访问的方法的实现过程进行重新编写！返回值和形参都不能改变。即外壳不变，核心重写！
	 * 
	 * 重写的好处在于子类可以根据需要，定义特定于自己的行为。
	 * 
	 * 也就是说子类能够根据需要实现父类的方法。
	 * 
	 * 
	 * 参数列表必须完全与被重写方法的相同； 返回类型必须完全与被重写方法的返回类型相同；
	 * 访问权限不能比父类中被重写的方法的访问权限更低。例如：如果父类的一个方法被声明为public
	 * ，那么在子类中重写该方法就不能声明为protected。 父类的成员方法只能被它的子类重写。 声明为final的方法不能被重写。
	 * 声明为static的方法不能被重写，但是能够被再次声明。
	 * 子类和父类在同一个包中，那么子类可以重写父类所有方法，除了声明为private和final的方法。
	 * 子类和父类不在同一个包中，那么子类只能够重写父类的声明为public和protected的非final方法。
	 * 重写的方法能够抛出任何非强制异常，无论被重写的方法是否抛出异常
	 * 。但是，重写的方法不能抛出新的强制性异常，或者比被重写方法声明的更广泛的强制性异常，反之则可以。 构造方法不能被重写。
	 * 如果不能继承一个方法，则不能重写这个方法。
	 */
	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println(" Override biology Eat()");
	}

	@Override
	public void Move() {
		// TODO Auto-generated method stub
		System.out.println("Override biology Move()");
	}

	@Override
	public void Sound() {
		// TODO Auto-generated method stub
		System.out.println("Override biology Sound()");

	}

}
