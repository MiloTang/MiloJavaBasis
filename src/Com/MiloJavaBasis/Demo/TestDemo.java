package Com.MiloJavaBasis.Demo;

import org.junit.Test;

public class TestDemo extends CowClass {
	/*
	 * 对象是根据类创建的。在Java中，使用关键字new来创建一个新的对象。创建对象需要以下三步：
	 * 
	 * 声明：声明一个对象，包括对象名称和对象类型。
	 * 
	 * 实例化：使用关键字new来创建一个对象。
	 * 
	 * 初始化：使用new创建对象时，会调用构造方法初始化对象。
	 * 
	 * 如果有抽象方法需要new的时候实现抽象方法
	 */
	@Test
	public void test1() {
		AnimalClass anm = new AnimalClass() {

			@Override
			public void AnimalMove(int speed) {
				// TODO Auto-generated method stub
				System.out.println("TestDemo AnimalMove Speed is:" + speed);
			}
		};
		anm.AnimalMove(11);
		anm.AnimalSound(10);
		anm.Eat();
		super.Eat();
		Eat();
	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println("TestDemo Eat()");
	}

	/*
	 * 多态是同一个行为具有多个不同表现形式或形态的能力。
	 * 
	 * 多态性是对象多种表现形式的体现。
	 * 
	 * 多态存在的三个必要条件:
	 * 
	 * 继承
	 * 
	 * 重写
	 * 
	 * 父类引用指向子类对象
	 * 
	 * 多态就是同一个事件发生在不同的对象上会产生不同的结果。
	 */

	@Test
	public void test2() {
		BiologyClass by = new CowClass();
		by.Move();
		BiologyClass by2 = new AnimalClass() {

			@Override
			public void AnimalMove(int speed) {
				// TODO Auto-generated method stub

			}
		};
		by2.Move();
	}
}
