/**
 * 
 */
package Com.MiloJavaAdvance.Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/**
 * @author milo 泛型
 * @param <K>
 * @param <E>
 */
public class GenericDemo {
	@Test
	public void test1() {
		List<String> list = new ArrayList<String>();
		list.add("abcd");
		list.add("abcd");
		list.add("abcd");
		list.add("abcd");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String string = it.next();
			System.out.println(string);

		}
		for (String string : list) {
			System.out.println(string);
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> it2 = set.iterator();
		while (it2.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it2
					.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		for (String string : map.keySet()) {
			System.out.println(string);
		}
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		printArray(intArray);
		printArray(doubleArray);

	}

	@Test
	public void test2() {
		BlueBox<Integer, Integer> box = new BlueBox<Integer, Integer>();
		box.add(1, 11);
		box.getAll();
		System.out.println(box.getK());
		System.out.println(box.getV());
	}

	@Test
	public void test3() {
		BlueBox<Integer, Integer> box = new BlueBox<Integer, Integer>();
		String string[] = { "aaaa", "bbbb", "cccc", "dddd" };
		for (String str : string) {
			System.out.println(str);
		}
		System.out.println("-----------------------------");
		for (String str : box.reverse(string)) {
			System.out.println(str);
		}
		System.out.println("-----------------------------");
		for (String str : box.swap(string, 1, 2)) {
			System.out.println(str);
		}
		System.out.println("-----------------------------");
		for (String str : box.swap(string, 3, 2)) {
			System.out.println(str);
		}

	}

	/**
	 * 定义泛型方法
	 */
	public <E> void printArray(E[] inArr) {
		for (E e : inArr) {
			System.out.print(e + "  ");
		}
	}

}
