
public class Person {
	
	private String name, jobTitle;
	private int age;
	
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [Name = " + name + ", Age = " + age + ", Job Title = " + jobTitle + "]";
	}
	
	

}
