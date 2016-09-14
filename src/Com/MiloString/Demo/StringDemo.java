package Com.MiloString.Demo;

import org.junit.Test;

public class StringDemo {
	@Test
	public void StringCompare() {
		/*
		 * ==默认比较对象在JVM中的地址。
		 * 
		 * 　　hashCode 默认返回对象在JVM中的存储地址。
		 * 
		 * 　　equal比较对象值，默认也是比较对象在JVM中的地址，同==
		 */
		String str1 = "hello wolrd";
		String str2 = "hello wolrd";
		String str3 = new String("hello wolrd");
		String str4 = new String("hello wolrd");
		String str5 = "Hello Wolrd";
		String str6 = "hello " + "wolrd";

		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str5);
		System.out.println(str1 == str6);
		System.out.println(str3 == str6);

		System.out.println("----------------------------------");
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str4.equals(str5));
		System.out.println(str1.equals(str6));
		System.out.println(str3.equals(str6));

		System.out.println("----------------------------------");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));

		System.out.println("----------------------------------");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
		System.out.println(str6.hashCode());

		System.out.println("----------------------------------");
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str5));
		System.out.println(str1.compareTo(str3));
		System.out.println(str4.compareTo(str3));
		System.out.println(str4.compareTo(str6));

		System.out.println("----------------------------------");
	}

	@Test
	public void FindString() {
		// TODO Auto-generated method stub
		String str1 = "解决方式直接将tomcat的server文件修改为";
		if (str1.lastIndexOf("文件") == -1) {

			System.out.println("文件二字没有被找到");
		} else {
			System.out.println("文字被找到位置就在第：" + str1.lastIndexOf("文件") + " 位");
		}

	}

	@Test
	public void RemoveString() {
		// TODO Auto-generated method stub
		String str1 = "解决方式直接将tomcat的server文件修改为";
		if (str1.lastIndexOf("文件") == -1) {

			System.out.println("文件二字没有被找到");
		} else {
			System.out.println("文字被找到位置就在第：" + str1.lastIndexOf("文件") + " 位");
		}
		str1 = str1.substring(0, 20) + str1.substring(22);
		System.out.println(str1);
		if (str1.lastIndexOf("文件") == -1) {

			System.out.println("文件二字没有被找到");
		} else {
			System.out.println("文字被找到位置就在第：" + str1.lastIndexOf("文件") + " 位");
		}

	}

	@Test
	public void ReplaceString() {
		// TODO Auto-generated method stub
		String str1 = "解决方式直接将tomcat的server文件修改为";
		System.out.println(str1.replace("e", "o"));
		System.out.println(str1.replaceFirst("e", "o"));
		System.out.println(str1.replaceAll("e", "o"));

	}

	@Test
	public void ReverseString() {
		// TODO Auto-generated method stub
		String str1 = "解决方式直接将tomcat的server文件修改为";
		System.out.println(new StringBuffer(str1).reverse().toString());
	}
	
	@Test
	public void SplitString() {
		// TODO Auto-generated method stub
		String str1 = "解决方式直接将tomcat的server文件修改为";
		for (String str : str1.split("e")) {
			System.out.println(str);
		};
	}
}
