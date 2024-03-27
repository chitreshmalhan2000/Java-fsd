package Practice_Project19;
public class Practice_Project19 {
	 public static void main(String[] args) {
	        AnimalImpl animal = new AnimalImpl();
	        animal.eat(); // Output: Animal is eating.
	        animal.bark(); // Output: Dog is barking.
	        animal.meow(); // Output: Cat is meowing.
	    }
	}
//Common interface
public interface Animal {
void eat();
}
//Interface inheriting from Animal
public interface Cat extends Animal {
void meow();
}
//Interface inheriting from Animal
public interface Dog extends Animal {
void bark();
}
//Class implementing both Dog and Cat interfaces
class AnimalImpl implements Dog, Cat {
@Override
public void eat() {
   System.out.println("Animal is eating.");
}

@Override
public void bark() {
   System.out.println("Dog is barking.");
}

@Override
public void meow() {
   System.out.println("Cat is meowing.");
}
}
