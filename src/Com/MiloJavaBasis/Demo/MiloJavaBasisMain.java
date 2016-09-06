/**
 * 
 */
package Com.MiloJavaBasis.Demo;

/**
 * @author Milo
 * @version V1.20160906
 *
 */

public class MiloJavaBasisMain {

	private static final String Classname = "MiloJavaBasisMain";// 类变量全局变量
	private String ClassName = "MiloJavaBasisMain";// 成员变量
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiloJavaBasisMain m = new MiloJavaBasisMain();// 对象是类的一个实例
		String str = m.ClassName + " == " + Classname+" is "
				+ m.ClassName.equals(Classname);//局部变量
		System.out.println(str);
	}

}
