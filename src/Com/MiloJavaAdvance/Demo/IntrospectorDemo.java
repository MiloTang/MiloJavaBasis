package Com.MiloJavaAdvance.Demo;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * 
 * @author milo
 * @内省操作
 *
 */
public class IntrospectorDemo {
	/**
	 * 
	 * @throws Exception
	 *             获取bean所以的属性
	 */
	@Test
	public void test1() throws Exception {
		BeanInfo bInfo = Introspector.getBeanInfo(Animal.class);
		PropertyDescriptor[] pds = bInfo.getPropertyDescriptors();
		for (PropertyDescriptor pd : pds) {
			System.out.println(pd.getName());
		}
	}

	/**
	 * 
	 * @throws Exception
	 *             获取bean自己的属性
	 */
	@Test
	public void test2() throws Exception {
		BeanInfo bInfo = Introspector.getBeanInfo(Animal.class, Object.class);
		PropertyDescriptor[] pds = bInfo.getPropertyDescriptors();
		for (PropertyDescriptor pd : pds) {
			System.out.println(pd.getName());
		}
	}

	/**
	 * 
	 * @throws Exception
	 *             操作bean属性
	 */
	@Test
	public void test3() throws Exception {
		Animal animal = new Animal();
		PropertyDescriptor pd = new PropertyDescriptor("animaltype",
				Animal.class);
		Method m = pd.getWriteMethod();
		m.invoke(animal, "dog");
		System.out.println(animal.getAnimaltype());
		m = pd.getReadMethod();
		System.out.println(m.invoke(animal));
		System.out.println(pd.getPropertyType());
	}
}
