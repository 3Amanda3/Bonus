import java.util.Scanner;

/**
 * 
 */

/**
 * @author a.schepp
 *
 */;
public class Age {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner userInput = new Scanner(System.in);
		 
		 int age;
		 String name;
		 
		 
		 System.out.println("What is your name?");
		    name = userInput.nextLine();
		 
		 System.out.println("Please enter your age");
		 	age = userInput.nextInt();
		 	
		 	
		 	if(age < 16){
		 	 System.out.println(name+ " is "+age+ "\n You are still a child");
		 	 userInput.close();
		 	}
		 	else if(age < 18){
		 	 System.out.println(name+ " is "+age+ "\n you could drive but not vote!");
		 	 userInput.close();
		 	 }
		 	else if(age < 24 ){
		 	 System.out.println(name+ " is "+age+ "\n You can vote! but not rent a car");
		 	 userInput.close();
		 	 }
		 	 else if (age < 100000000) {
		 		 System.out.println(name+ " is "+age+ "\n your pretty much an adult");
		 		 userInput.close();
		 		
		 	 }
		 	}
	        
		 
		 
		 
		 
		 
		 
		 
	}


