package Com.MiloJavaAdvance.Demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.junit.Test;

/**
 * 
 * @author Milo
 * @version V1.10
 */
/*
 * 反射就是加载类，并解剖出类的各个组成部分(成员变量，方法，构造方法等)
 */
public class ReflectDemo {
	// 加载类的字节码
	@Test
	public void ClassLoad() throws ClassNotFoundException {
		Class<?> csa = Class.forName("Com.MiloJavaAdvance.Demo.Person");
		Class<?> csb = new Person().getClass();
		Class<Person> csc = Person.class;
		GetClassInfo(csa);
		GetClassInfo(csb);
		GetClassInfo(csc);

	}

	@Test
	public void UseReflect() throws Exception {
		Class<?> cs = Class.forName("Com.MiloJavaAdvance.Demo.Person");
		Constructor<?> constructor = cs.getConstructor();
		Person p = (Person) constructor.newInstance();
		System.out.println(p.name);
		Person p2 = (Person) cs.getConstructor(String.class).newInstance("abc");
		System.out.println(p2.name);
		Person p3 = (Person) cs.getConstructor(int.class, String.class)
				.newInstance(22, "xiaohua");
		p3.printinfo();
		Constructor<?> c = cs.getDeclaredConstructor(List.class);
		List<String> list = new ArrayList<String>();
		list.add("xiao hua");
		list.add("xiao er");
		list.add("xiao meng");
		list.add("xiao ling");
		c.setAccessible(true);
		Person p4 = (Person) c.newInstance(list);
		p4.printinfo();
		Person p5 = (Person) cs.newInstance();// 无参创建对象
		p5.printinfo();
	}

	private void GetClassInfo(Class<?> cs) {

		for (Constructor<?> it : cs.getConstructors()) {
			System.out.println(it);
		}
		for (Field it : cs.getFields()) {
			System.out.println(it);
		}
		for (Method it : cs.getMethods()) {
			System.out.println(it);
		}
		for (Constructor<?> it : cs.getDeclaredConstructors()) {
			System.out.println(it);
		}
		for (Field it : cs.getDeclaredFields()) {
			System.out.println(it);
		}
		for (Method it : cs.getDeclaredMethods()) {
			System.out.println(it);
		}

	}

	@Test
	public void ReflectMethod1() throws Exception {
		Person p = new Person();
		Class<?> cs = Class.forName("Com.MiloJavaAdvance.Demo.Person");
		Method m = cs.getMethod("test", null);
		m.invoke(p, null);
	}

	@Test
	public void ReflectMethod2() throws Exception {
		Person p = new Person();
		Class<?> cs = Class.forName("Com.MiloJavaAdvance.Demo.Person");
		Method m = cs.getMethod("test", String.class);
		m.invoke(p, "testparam");
	}

	@Test
	public void ReflectMethod3() throws Exception {
		Person p = new Person();
		Class<?> cs = Class.forName("Com.MiloJavaAdvance.Demo.Person");
		Method m = cs.getMethod("test", String.class, int.class);
		m.invoke(p, "testparam", 100);
	}

	@Test
	public void ReflectMethod4() throws Exception {
		Person p = new Person();
		Class<?> cs = Class.forName("Com.MiloJavaAdvance.Demo.Person");
		Method m = cs.getDeclaredMethod("test", int.class);
		m.setAccessible(true);
		m.invoke(p, 100);
	}

	@Test
	public void ReflectMethod5() throws Exception {
		Person p = new Person();
		Class<?> cs = Class.forName("Com.MiloJavaAdvance.Demo.Person");
		Method m = cs.getDeclaredMethod("test", int[].class);
		m.setAccessible(true);
		m.invoke(null, new int[] { 100, 20, 20 });
		m.invoke(p, new int[] { 100, 30, 30 });
	}

	@Test
	public void ReflectMethod6() throws Exception {
		Person p = new Person();
		Class<?> cs = Class.forName("Com.MiloJavaAdvance.Demo.Person");
		Method m = cs.getDeclaredMethod("main", String[].class);
		m.invoke(null, (Object) new String[] { "100", "20", "20" });
		m.invoke(p, new Object[] { new String[] { "100", "30", "30" } });
	}

	@Test
	public void ReflectFiled1() throws Exception {
		Person p = new Person();
		Class<?> cs = Class.forName("Com.MiloJavaAdvance.Demo.Person");
		Field f = cs.getField("name");
		f.set(p, "abbbbbbb");
		System.out.println(f.get(p) + " lei xing wei : " + f.getType());
		f = cs.getDeclaredField("age");
		f.setAccessible(true);
		f.set(p, 80);
		System.out.println(f.get(p) + " lei xing wei : " + f.getType());
		f = cs.getField("love");
		f.set(null, "love mmmmmmmmmmmmmm");
		System.out.println(f.get(null));
		
	}

}
