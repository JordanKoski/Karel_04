/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Jordan Koski>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04 
{
   public static void takeTheField(Athlete arg) 
   {
     arg.move();
     arg.move();
     arg.move();
     arg.move();
     arg.turnRight();
     arg.move();
     arg.move();     
    }
    public static void coach(Athlete arg) {    
    arg.move();
    arg.move();
    arg.turnRight();
    arg.move();
}

      public static void main(String[] arg) {
          
             Display.openWorld("maps/arenandy.map");
   Display.setSize(10, 10);
   Display.setSpeed(5);
   
   Athlete andy = new Athlete();
   Athlete bob = new Athlete();
   Athlete charles = new Athlete();
   Athlete dan = new Athlete();
   Athlete eve = new Athlete();
   Athlete fred = new Athlete();
   Athlete george = new Athlete();
   
   takeTheField(andy);
   takeTheField(bob);
   takeTheField(charles);
   takeTheField(dan);
   takeTheField(bob);
   takeTheField(eve);
   takeTheField(george);
      andy.move();
      andy.move();
      andy.move();
      andy.turnLeft();
      andy.move();
      andy.move();
      andy.turnAround();
      bob.move();
      bob.turnLeft();
      bob.move();
      bob.turnAround();
      charles.move();
      charles.move();
      charles.turnRight();
      dan.move();
      dan.move();
      dan.move();
      dan.turnRight();
      eve.move();
      eve.move();
      eve.move();
      eve.move();
      eve.turnRight();
      fred.move();
      fred.move();
      fred.move();
      fred.move();
      fred.move();
      fred.turnLeft();
      fred.move();
      fred.turnAround();
      
     }
} 