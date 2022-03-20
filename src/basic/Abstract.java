package basic;
// here car is the abstract class , As it is partially implemented(all the methods are not defined).
public class Abstract {

	public static void main(String args[]) {
		BMW bm = new BMW();
		bm.start();
	}
}

class BMW extends car{
	void start() {
		System.out.print("BMW is moving");
	}
}
class Audi extends car{

	@Override
	void start() {
		System.out.print("Audi is moving");
	}
}
abstract class car{ // abstract class cannot be instantiated as it is partially implemented.
	int price;
	
	abstract void start();// Abstract method requires only declaration in super class. it should be
	// implemented in the sub class.
}
