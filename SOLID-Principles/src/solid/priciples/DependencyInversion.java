package solid.priciples;

//Abstractions should not depend on details. Details should depend on abstractions

interface SwitchOnOff {
	void turnOn();
}
class Light implements SwitchOnOff{
	public void turnOn() {
		System.out.println("Light on");
	}
}
class Fan implements SwitchOnOff{
	public void turnOn() {
		System.out.println("Fan is on");
	}
}
// Switch depends on Interface, not implementation
class Switch{
	private SwitchOnOff device;
	
	public Switch(SwitchOnOff device) {
		this.device = device;
	}
	public void operate() {
		device.turnOn();
	}
}
public class DependencyInversion {

	public static void main(String[] args) {
		SwitchOnOff light = new Light();
		SwitchOnOff fan = new Fan();
		
		Switch switch1 = new Switch(light);
		Switch switch2 = new Switch(fan);
		
		switch1.operate();
		switch2.operate();
		

	}

}
