package Com.MiloJavaAdvance.Demo;

import java.util.Date;

//JavaBean
public class Animal {

	private String Animaltype;
	private int age;
	private String region;
	private Date birthday;

	public String getString() {

		return "string";
	}

	public String getAnimaltype() {
		return Animaltype;
	}

	public void setAnimaltype(String animaltype) {
		Animaltype = animaltype;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
