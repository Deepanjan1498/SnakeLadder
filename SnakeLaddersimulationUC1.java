public class SnakeLadderSimulationUC1
{
   //Constants
  static final int NoPlay=0;
  static final int Ladder=1;
  static final int Snake=2;
  static final int Max=100;
  public static void main(String args[])
  {
   int position=0;
   while(position!=Max)
   {
      int diceroll=(int)(Math.random()*10)%6+1;
      int option =(int)(Math.random()*10)%3;
      if(option==NoPlay)
        position=position+0;
      else if(option==Ladder)
        {
          position=position+diceroll;
          if(position>Max)
          position=position-diceroll;
         }
       else
        { 
          position=position-diceroll;
          if(position<0)
          position=0;
         }
    }
     System.out.println("The Player is playing the game");
   }
}





