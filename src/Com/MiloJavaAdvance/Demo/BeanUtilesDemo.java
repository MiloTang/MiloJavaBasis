package Com.MiloJavaAdvance.Demo;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.junit.Test;

/**
 * 
 * @author milo
 * @使用BeanUtiles操作bean的属性
 */

public class BeanUtilesDemo {
	@Test
	public void test1() throws IllegalAccessException,
			InvocationTargetException {
		Animal animal = new Animal();
		BeanUtils.setProperty(animal, "region", "CN");
		System.out.println(animal.getRegion());
	}

	@Test
	public void test2() throws IllegalAccessException,
			InvocationTargetException {
		String Animaltype = "duck";
		String age = "20";
		String region = "HK";
		String birthday = "2010-02-09";
		/**
		 * 注册日期转换器
		 */
		ConvertUtils.register(new Converter() {

			@SuppressWarnings("unchecked")
			@Override
			public <T> T convert(Class<T> type, Object value) {
				// TODO Auto-generated method stub
				if (value == null) {
					return null;
				}
				if (!(value instanceof String)
						|| value.toString().length() != 10) {
					throw new ConversionException("请检查你的数据");
				}
				if (value.toString().trim().equals("")) {

					return null;

				}
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				try {
					return (T) sdf.parse(value.toString());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException(e);
				}
			}
		}, Date.class);
		Animal animal = new Animal();
		BeanUtils.setProperty(animal, "region", region);
		BeanUtils.setProperty(animal, "animaltype", Animaltype);
		BeanUtils.setProperty(animal, "age", age);
		BeanUtils.setProperty(animal, "birthday", birthday);

		System.out.println(animal.getAnimaltype());
		System.out.println(animal.getRegion());
		System.out.println(animal.getAge());// 只支持8种基本数据类型的转换
		System.out.println(animal.getBirthday());

	}

	@Test
	public void test3() throws IllegalAccessException,
			InvocationTargetException {
		String Animaltype = "duck";
		String age = "20";
		String region = "HK";
		String birthday = "1998-08-09";
		ConvertUtils.register(new DateLocaleConverter(), Date.class);
		Animal animal = new Animal();
		BeanUtils.setProperty(animal, "region", region);
		BeanUtils.setProperty(animal, "animaltype", Animaltype);
		BeanUtils.setProperty(animal, "age", age);
		BeanUtils.setProperty(animal, "birthday", birthday);

		System.out.println(animal.getAnimaltype());
		System.out.println(animal.getRegion());
		System.out.println(animal.getAge());// 只支持8种基本数据类型的转换
		System.out.println(animal.getBirthday());

	}

	/**
	 * 
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 *             用map集合的值填充bean的属性
	 */
	@Test
	public void test4() throws IllegalAccessException,
			InvocationTargetException {
		Map<String, String> map = new HashMap<String, String>();
		map.put("animaltype", "pig");
		map.put("age", "3");
		map.put("region", "jp");
		map.put("birthday", "2013-09-19");
		/**
		 * 注册日期转换器
		 */
		ConvertUtils.register(new Converter() {

			@Override
			public <T> T convert(Class<T> type, Object value) {
				// TODO Auto-generated method stub
				if (value == null) {
					return null;
				}
				if (!(value instanceof String)
						|| value.toString().length() != 10) {
					throw new ConversionException("请检查你的数据");
				}
				if (value.toString().trim().equals("")) {

					return null;

				}
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				try {
					return (T) sdf.parse(value.toString());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException(e);
				}
			}
		}, Date.class);
		Animal animal = new Animal();
		BeanUtils.populate(animal, map);

		System.out.println(animal.getAnimaltype());
		System.out.println(animal.getRegion());
		System.out.println(animal.getAge());// 只支持8种基本数据类型的转换
		System.out.println(animal.getBirthday());

	}
}
