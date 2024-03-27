package Practice_Project19;
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