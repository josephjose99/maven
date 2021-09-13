package clinic.programming.training;

import java.util.ArrayList;
import java.until.List;

public class Application {
	public void greeet() {
		List<String>greetings=new ArrayList<>();
		greetings.add("Hello");
		
		for (string greeting: greetings) {
			system.out.println("Greeting: " +greeting);
		}
	}
	
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	    Application app = new Application();
		app.greet();
    }
}