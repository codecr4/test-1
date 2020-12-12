import java.util.Scanner ;

class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");

	Scanner input = new Scanner(System.in);
	System.out.print("Enter you age : ");
	int age = input.nextInt();
	System.out.print("Enter your name :");
	String name = input.next();

	if (age > 18 ){
		sayHello(name , age);
	}else {
		System.out.println("Sorry " + name );
	}

  }

  public static void sayHello(String name , int age ) {
	  System.out.println("You are " + name + " and you are " + age + "yrs old ;");
  }
}