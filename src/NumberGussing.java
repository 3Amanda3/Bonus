import java.util.Random;
import java.util.Scanner;

/*
 *  a.schepp
 *user guessing
 * mr.hardman
 *nov 1
 */
public class NumberGussing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int computerNum;
		int userNum;
		int repeat;
		
		do{
		
		Random randGenerator = new Random();
        computerNum = randGenerator.nextInt(9) + 1;
        Scanner userInput = new Scanner(System.in);
        
        
        
        System.out.println("I am thinking of a number between 1-10,");
        System.out.println("Please enter your guess.");
        
        userNum = userInput.nextInt();
        
        
        if (userNum == computerNum){
        	System.out.println("Congratulations! you got the correct answer!");
        
        }
        
        else{
        	System.out.println("Sorry the correct answer is " +computerNum+ " sorry better luck next time.");
        	
        	
        	
        }
        System.out.println("Do you want to play again? enter -1 to end the game, or enter 1 to play again.");
        repeat = userInput.nextInt();
        
        if (repeat == -1){
        	 System.out.println("I am sorry to see you go,Bye!");
        	 userInput.close();
        }
        else if(repeat == 1){
        	 System.out.println("Please enter a new guess!");
        }
        	 
        } while (repeat == 1);
    }
}	

