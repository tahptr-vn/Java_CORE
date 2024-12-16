
public class Main {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		Bird b = new Bird();
		
		d.eat();
		d.makeSound();
		d.sleep();
		System.out.println("---------");
		c.eat();
		c.makeSound();
		c.sleep();
		System.out.println("---------");
		b.eat();
		b.makeSound();
		b.sleep();
	}
}
