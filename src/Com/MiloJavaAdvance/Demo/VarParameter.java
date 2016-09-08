package Com.MiloJavaAdvance.Demo;

import org.junit.Test;

/**
 * 
 * @author milo
 * @version 可变参数
 */
public class VarParameter {

	@Test
	public void testsum() {
		int arr[] = { 2, 9, 7, 10, 100 };
		System.out.println(add(arr));
		System.out.println(addM(10,2,3,4,5,6,7));
	}

	public int add(int... nums) {
		// 可变参数
		int sum = 0;
		for (int i : nums) {
			// 增强for循环
			sum += i;
		}
		return sum;
	}

	public int addM(int x, int... nums) {
		// 可变参数需要放后面
		int sum = 0;
		for (int i : nums) {
			// 增强for循环
			sum += i;
		}
		return x * sum;
	}
	
	
}
