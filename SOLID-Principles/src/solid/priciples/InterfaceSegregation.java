package solid.priciples;

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker implements Workable, Eatable {
    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating");
    }
}
class RobotWorker implements Workable {
    public void work() {
        System.out.println("Robot working");
    }
}

public class InterfaceSegregation {

	public static void main(String[] args) {
		Workable human = new HumanWorker();
        Workable robot = new RobotWorker();
        Eatable eater = new HumanWorker();

        human.work(); 
        robot.work();  
        eater.eat();    
	}

}
