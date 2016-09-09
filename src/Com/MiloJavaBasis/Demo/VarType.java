package Com.MiloJavaBasis.Demo;

import org.junit.Test;

public class VarType {
	@Test
	public void BasisType() {

		// Byte
		System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
		System.out.println("包装类：java.lang.Byte");
		System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
		System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
		System.out.println();

		// short
		System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
		System.out.println("包装类：java.lang.Short");
		System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
		System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
		System.out.println();

		// int
		System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
		System.out.println("包装类：java.lang.Integer");
		System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
		System.out.println();

		// long
		System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
		System.out.println("包装类：java.lang.Long");
		System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
		System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
		System.out.println();

		// float
		System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
		System.out.println("包装类：java.lang.Float");
		System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
		System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
		System.out.println();

		// double
		System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
		System.out.println("包装类：java.lang.Double");
		System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
		System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
		System.out.println();

		// char
		System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
		System.out.println("包装类：java.lang.Character");
		// 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
		System.out.println("最小值：Character.MIN_VALUE="
				+ (int) Character.MIN_VALUE);
		// 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
		System.out.println("最大值：Character.MAX_VALUE="
				+ (int) Character.MAX_VALUE);
	}

	/*
	 * 引用类型指向一个对象，指向对象的变量是引用变量。
	 * 
	 * 这些变量在声明时被指定为一个特定的类型。变量一旦声明后，
	 * 
	 * 类型就不能被改变了。 对象、数组都是引用数据类型。
	 * 
	 * 所有引用类型的默认值都是null。 一个引用变量可以用来引用与任何与之兼容的类型。
	 */
	@Test
	public void QuoteType() {

		String str = new String("abcd");
		CowClass cc = new CowClass();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(str + " " + cc + " " + arr + " 都是引用变量");
	}

	/*
	 * 操作符 描述 例子 + 加法 - 相加运算符两侧的值 a+ b等于16
	 * 
	 * - 减法 - 左操作数减去右操作数 a – b等于-4
	 * 
	 * 乘法 - 相乘操作符两侧的值 a * b等于60
	 * 
	 * / 除法 - 左操作数除以右操作数 b / a等于1
	 * 
	 * ％ 取模 - 左操作数除右操作数的余数 b%a等于4
	 * 
	 * + + 自增 - 操作数的值增加1 a + +等于6
	 * 
	 * -- 自减 -- 操作数的值减少1 a - -等于7
	 * 
	 * == 检查如果两个操作数的值是否相等，如果相等则条件为真。 （A == B）为假(非真)。
	 * 
	 * != 检查如果两个操作数的值是否相等，如果值不相等则条件为真。 (A != B) 为真。
	 * 
	 * > 检查左操作数的值是否大于右操作数的值，如果是那么条件为真。 （A> B）非真。
	 * 
	 * < 检查左操作数的值是否小于右操作数的值，如果是那么条件为真。 （A <B）为真。
	 * 
	 * > = 检查左操作数的值是否大于或等于右操作数的值，如果是那么条件为真。 （A> = B）为假。
	 * 
	 * <= 检查左操作数的值是否小于或等于右操作数的值，如果是那么条件为真。 （A <= B）为真。
	 * 
	 * ＆ 按位与操作符，当且仅当两个操作数的某一位都非0时候结果的该位才为1。 （A＆B），得到12，即0000 1100
	 * 
	 * | 按位或操作符，只要两个操作数的某一位有一个非0时候结果的该位就为1。 （A | B）得到61，即 0011 1101
	 * 
	 * ^ 按位异或操作符，两个操作数的某一位不相同时候结果的该位就为1。 （A ^ B）得到49，即 0011 0001
	 * 
	 * 〜 按位补运算符翻转操作数的每一位。 （〜A）得到-61，即1100 0011
	 * 
	 * << 按位左移运算符。左操作数按位左移右操作数指定的位数。 A << 2得到240，即 1111 0000
	 * 
	 * >> 按位右移运算符。左操作数按位右移右操作数指定的位数。 A >> 2得到15即 1111
	 * 
	 * >>> 按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。 A>>>2得到15即0000 1111
	 * 
	 * && 称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。 （A && B）为假。
	 * 
	 * | | 称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。 （A | | B）为真。
	 * 
	 * ！ 称为逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。 ！（A && B）为真。
	 * 
	 * = 简单的赋值运算符，将右操作数的值赋给左侧操作数 C = A + B将把A + B得到的值赋给C
	 * 
	 * + = 加和赋值操作符，它把左操作数和右操作数相加赋值给左操作数 C + = A等价于C = C + A
	 * 
	 * - = 减和赋值操作符，它把左操作数和右操作数相减赋值给左操作数 C - = A等价于C = C - A =
	 * 乘和赋值操作符，它把左操作数和右操作数相乘赋值给左操作数 C * = A等价于C = C * A
	 * 
	 * / = 除和赋值操作符，它把左操作数和右操作数相除赋值给左操作数 C / = A等价于C = C / A
	 * 
	 * （％）= 取模和赋值操作符，它把左操作数和右操作数取模后赋值给左操作数 C％= A等价于C = C％A
	 * 
	 * << = 左移位赋值运算符 C << = 2等价于C = C << 2
	 * 
	 * >> = 右移位赋值运算符 C >> = 2等价于C = C >> 2
	 * 
	 * ＆= 按位与赋值运算符 C＆= 2等价于C = C＆2
	 * 
	 * ^ = 按位异或赋值操作符 C ^ = 2等价于C = C ^ 2
	 * 
	 * | = 按位或赋值操作符 C | = 2等价于C = C | 2
	 */
	@Test
	public void Operate() {

		// 赋值运算符
		int a = 6;
		int b = 10;
		int c = 15;
		int d = 20;
		int A = 10;
		int B = 20;

		// 算术运算符
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("b / a = " + (b / a));
		System.out.println("b % a = " + (b % a));
		System.out.println("c % a = " + (c % a));
		System.out.println("a++   = " + (a++));
		System.out.println("a--   = " + (a--));
		// 查看 d++ 与 ++d 的不同
		System.out.println("d++   = " + (d++));
		System.out.println("++d   = " + (++d));

		// 关系运算符
		System.out.println("a == b = " + (A == B));
		System.out.println("a != b = " + (A != B));
		System.out.println("a > b = " + (A > B));
		System.out.println("a < b = " + (A < B));
		System.out.println("b >= a = " + (B >= A));
		System.out.println("b <= a = " + (B <= A));

		// 位运算符
		c = a & b; /* 12 = 0000 1100 */
		System.out.println("a & b = " + c);
		c = a | b; /* 61 = 0011 1101 */
		System.out.println("a | b = " + c);
		c = a ^ b; /* 49 = 0011 0001 */
		System.out.println("a ^ b = " + c);
		c = ~a; /*-61 = 1100 0011 */
		System.out.println("~a = " + c);
		c = a << 2; /* 240 = 1111 0000 */
		System.out.println("a << 2 = " + c);
		c = a >> 2; /* 15 = 1111 */
		System.out.println("a >> 2  = " + c);
		c = a >>> 2; /* 15 = 0000 1111 */
		System.out.println("a >>> 2 = " + c);
		System.out.println("a is : " + a + " b is : " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a is : " + a + " b is : " + b);

		// 逻辑运算符
		boolean aa = true;
		boolean bb = false;
		System.out.println("a && b = " + (aa && bb));
		System.out.println("a || b = " + (aa || bb));
		System.out.println("!(a && b) = " + !(aa && bb));

		// 赋值运算符
		c = a + b;
		System.out.println("c = a + b = " + c);
		c += a;
		System.out.println("c += a  = " + c);
		c -= a;
		System.out.println("c -= a = " + c);
		c *= a;
		System.out.println("c *= a = " + c);
		a = 10;
		c = 15;
		c /= a;
		System.out.println("c /= a = " + c);
		a = 10;
		c = 15;
		c %= a;
		System.out.println("c %= a  = " + c);
		c <<= 2;
		System.out.println("c <<= 2 = " + c);
		c >>= 2;
		System.out.println("c >>= 2 = " + c);
		c >>= 2;
		System.out.println("c >>= a = " + c);
		c &= a;
		System.out.println("c &= 2  = " + c);
		c ^= a;
		System.out.println("c ^= a   = " + c);
		c |= a;
		System.out.println("c |= a   = " + c);

		// 条件运算符（?:）
		a=10;
		b = (a == 1) ? 11 : 22;
		System.out.println("Value of b is : " + b);
		b = (a == 10) ? 11 : 22;
		System.out.println("Value of b is : " + b);
		
		//instanceOf 运算符
		AnimalClass an=new AnimalClass() {
			
			@Override
			public void AnimalMove(int speed) {
				// TODO Auto-generated method stub
				
			}
		};
		CowClass cwc=new CowClass();
		System.out.println( cwc instanceof AnimalClass);
		System.out.println( an instanceof CowClass);
		

	}
}
