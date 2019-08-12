package day0812;

public class Demo {
	 static final String salutation = "Hello! ";

	public static void main(String[] args) {
		GreetingService greetService1 = message -> System.out.println(salutation + message);
		greetService1.sayMessage("Runoob");
	}

interface GreetingService {
		void sayMessage(String message);
	}

}
