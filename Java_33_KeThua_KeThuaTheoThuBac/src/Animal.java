
public class Animal {
	protected String name; // các lớp con sử dụng được thuộc tính này ngoài ra lớp khác không sử dụng được

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	public void eat() {
		System.out.println("I'm eating ");
	}
}
