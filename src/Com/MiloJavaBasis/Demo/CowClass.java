package Com.MiloJavaBasis.Demo;

import org.junit.Test;

/*
 * 继承
 * 
 * 
 * 在Java中，类的继承是单一继承，也就是说，一个子类只能拥有一个父类，但是可以有多个接口 
 * 通过使用关键字extends，子类可以继承父类所有的方法和属性，但是无法使用 private(私有) 的方法和属性。
 * 
 * 需要注意的是因为AnimalClass已经实现了接口BiologyClass的抽象方法所以CowClass不用
 * 再实现其抽象方法，所以和
 */
public class CowClass extends AnimalClass implements BiologyClass {

	/*
	 * 重写是子类对父类的允许访问的方法的实现过程进行重新编写！返回值和形参都不能改变。即外壳不变，核心重写！
	 * 
	 * 重写的好处在于子类可以根据需要，定义特定于自己的行为。
	 * 
	 * 也就是说子类能够根据需要实现父类的方法。
	 */
	@Override
	public void AnimalMove(int speed) {
		// TODO Auto-generated method stub
		System.out.println("CowClass.AnimalMove()");
	}
	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		super.Eat();
		System.out.println("CowClass Eat()");
	}
	
	@Override
	public void Move() {
		// TODO Auto-generated method stub
		System.out.println("Override Animal Move()");
	}
	/*
	 * 重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。
	 * 
	 * 每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。
	 * 
	 * 
	 * 重载规则
	 * 
	 * 被重载的方法必须改变参数列表； 被重载的方法可以改变返回类型； 被重载的方法可以改变访问修饰符； 被重载的方法可以声明新的或更广的检查异常；
	 * 方法能够在同一个类中或者在一个子类中被重载。
	 */
	public void CowMethod() {

	}

	public String CowMethod(String string) {
		return string;

	}

	public void CowMethod(int num) {

	}

	public void CowMethod(int num, String string) {
		System.out.println();
	}

	/*
	 * 区别点 重载方法 重写方法
	 * 
	 * 参数列表 必须修改 一定不能修改
	 * 
	 * 返回类型 可以修改 一定不能修改
	 * 
	 * 异常 可以修改 可以减少或删除，一定不能抛出新的或者更广的异常
	 * 
	 * 访问 可以修改 一定不能做更严格的限制（可以降低限制）
	 */
}

/*
 * 一个源文件中只能有一个public类
 * 
 * 一个源文件可以有多个非public类
 */
class TestClass {
	@Test
	public void test() {
		System.out.println("test");
	}
	
}
