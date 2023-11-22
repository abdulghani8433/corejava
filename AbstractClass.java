package corejava.abstractmodifier;

public abstract class AbstractClass {

	public static void main(String[] args) {
	}

	public abstract void printNumberOfWheels();

}


/* we cannot create object for abstract class
 * if we are not implementing abstract methods in child class then we have to declare child class as abstract
 * ab abstract class contains final methods where as final class cant contains abtract methods 
 * and highly recomend to use cos it pramotes oop features like (inheriatnce and polymorphism) 
 */




class Bus extends AbstractClass {
	

	@Override
	public void printNumberOfWheels() {

		System.out.println("bus has 8 ");

	}

	

}
