
import java.util.Scanner;
public class Numbergame {
    
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      double random = Math.random()*(100-1+1)+1;
       random =(int)random;
      int guess  = 0;
      System.out.println("Enter the Number of Attempts");
       char option ;
      int attempts = s.nextInt();
      int limit = 0;
      int score = 0;
      
      while(guess!=random){
          System.out.println("Enter the Number");
         guess  = s.nextInt();
         
         if(guess==random){
              System.out.println("The Guess is Correct");
              
              score++;  
             random = (int) (Math.random()*100);
             random =(int)random;
              
         }else if(guess>random){
              System.out.println("Too High");
             
             limit++;
          }else {
              System.out.println("Too Low");
              
              limit++;
          }
          if(limit>=attempts){
              
              System.out.println("Do you Want to play again ? yes / no"); 
              option = s.next().charAt(0);
             
              
              if(option=='y'){
                   
               attempts++;
            
              }
              else if(option=='n') {
                 break;
              }
          }
      }
      attempts = attempts - 1;
        System.out.println("You Won"+" "+score);
        System.out.println("Your Attempts"+" "+attempts);
    }
    
}