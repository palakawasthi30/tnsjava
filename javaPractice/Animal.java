
abstract class Animal {
	String name;
	int age;
	abstract void makeSound();
}
class Dog extends Animal{
	void makeSound(){
		System.out.println("Woof");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Meow");
	}
}
