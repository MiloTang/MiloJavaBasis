package Com.MiloJavaAdvance.Demo;

import org.junit.Test;

enum Grade {
	A("100-90") {
		public String localValue() {
			return "优";
		}
	},
	B("89-80") {
		public String localValue() {
			return "良";
		}
	},
	C("79-70") {
		public String localValue() {
			return "中";
		}
	},
	D("69-60") {
		public String localValue() {
			return "差";
		}
	},
	E("59-0") {
		public String localValue() {
			return "不及格";
		}
	};
	private String value;

	private Grade(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public abstract String localValue();

}

/*
 * 单例设计模式
 */
enum single {
	single;
}

public class EnumDemo {

	@Test
	public void print() {
		System.out.println(Grade.A.getValue() + " local is: "
				+ Grade.A.localValue());
		System.out.println(Grade.C.name());
		System.out.println(Grade.C.ordinal());
		System.out.println(Grade.valueOf("B").localValue());
		System.out.println(Grade.values()[4].localValue());
	}
}
