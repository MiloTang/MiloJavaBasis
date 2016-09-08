package Com.MiloJavaBasis.Demo;

import java.util.List;

public class Person {

	public String name = "demo1";
	public static String love="abc";
	private int age;
	private double height;
	private String ID;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Person() {
		this.name = "demo";
		this.age = 22;
		this.height = 1.90;
		this.ID = "522111198808091267";

	}

	public Person(String str) {
		System.out.println(str);
	}

	public Person(int str) {
		System.out.println(str);
	}

	private Person(List list) {

		System.out.println(list);

	}

	public Person(int num, String str) {
		System.out.println(str + num);
	}

	public void printinfo() {
		System.out.println("此人是： " + name + "  年方:  " + age + " 身高: " + height
				+ " 身份ID是: " + ID);
		love();
	}

	private void love() {
		System.out.println("喜欢隔壁阿三");
	}
	public void test() {
		System.out.println("test");
	}
	public void test(String str) {
		System.out.println(str);
	}
	private void test(int num) {
		System.out.println(num);
	}
	public void test(String str,int num) {
		System.out.println(str+":"+num);
	}
	public static void test(int[] num) {
		for (int i : num) {
			System.out.print(i+"  ");
		}
		
	}
	public List<String> test(String str, List<String> list) {
		list.add(str);
		return list;
	}
	public static void main(String[] args) {
		for (String string : args) {
			System.out.println(string);
		}
	}
}
