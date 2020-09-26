public class SnakeLadderSimulationUC1
{
   //Constants
  static final int NoPlay=0;
  static final int Ladder=1;
  static final int Snake=2;
  public static void main(String args[])
  {
   int position=0;
   int diceroll=(int)(Math.random()*10)%6+1;
   int option =(int)(Math.random()*10)%3;
   if(option==NoPlay)
       position=position+0;
   else if(option==Ladder)
       position=position+diceroll;
   else
       position=position-diceroll;
System.out.println("The Player Position is "+position+" for the Diceroll of "+diceroll);
   }
}



