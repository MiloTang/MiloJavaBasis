package Com.MiloJavaBasis.Demo;

import org.junit.Test;

public class VarParameter {

	@Test
	public void testsum() {
		int arr[] = { 2, 9, 7, 10, 100 };
		System.out.println(add(arr));
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
}
