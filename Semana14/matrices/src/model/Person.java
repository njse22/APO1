package model; 
import java.util.Date; 
import java.util.Calendar; 

public abstract class Person {

	private String name;
	private int age;
	private Date birthdate;
	private Calendar calendar;  

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.calendar = Calendar.getInstance();
		this.birthdate = calendar.getTime();
	}

	public void setName(String name) {
    	this.name = name;
	}

	public String getName() {
    	return name;
	}

	public void setAge(int age) {
    	this.age = age;
	}

	public int getAge() {
    	return age;
	}

	public String getBirthdate(){
		return this.birthdate.toString();
	}

}
