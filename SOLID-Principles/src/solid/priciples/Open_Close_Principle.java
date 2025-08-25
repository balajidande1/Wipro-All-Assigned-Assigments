package solid.priciples;

//closed for modification
interface PaymentMethod{
	void pay();
}

class creditCard implements PaymentMethod{
	
	public void pay() {
		System.out.println("Credit card payment process");
	}
}
// new feature
class debitCard implements PaymentMethod{
	public void pay() {
		System.out.println("Debit card payment process");
	}
}

class Processor{
	void process(PaymentMethod paymentMethod) {
		paymentMethod.pay();
	}
}

public class Open_Close_Principle {
	public static void main(String[] args) {
		
		Processor p = new Processor();
		p.process(new creditCard());
		p.process(new debitCard());
	}

}
