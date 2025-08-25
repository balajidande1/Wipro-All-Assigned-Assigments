package solid.priciples;

abstract class Bird{
	abstract void eat();
}
abstract class FlyingBird extends Bird{
	abstract void fly();
}
class Sparrow extends FlyingBird{
	
	public void fly() {
		System.out.println("Sparrow can fly");
	}

	public void eat() {
		System.out.println("Sparrow Can eat");
		
	}
}
class Ostrich extends Bird{
	public void eat() {
		System.out.println("Ostrich can't fly, Can eat");
	}
}


public class LiskovSubstitution {
	public static void main(String[] args) {
		Bird ostrich = new Ostrich();
		ostrich.eat();
		FlyingBird sp = new Sparrow();
		sp.eat();
		sp.fly();
	}

}
