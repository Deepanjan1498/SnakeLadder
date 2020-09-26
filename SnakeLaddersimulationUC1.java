public class SnakeLadderSimulationUC1
{
   //Constants
  static final int NoPlay=0;
  static final int Ladder=1;
  static final int Snake=2;
  static final int Max=100;
  public static int pos(int position)
{
   int p=0; 
   int diceroll=(int)(Math.random()*10)%6+1;
   int option =(int)(Math.random()*10)%3;
   if(option==NoPlay)
     position=position+0;
   else if(option==Ladder)
        {
          position=position+diceroll;
          if(position>Max)
             position=position-diceroll;
          else
           p=0;
           return pos(position);
         }
       else
        { 
          position=position-diceroll;
          if(position<0)
          position=0;
         }
       return position;
}

  public static void main(String args[])
  {
    int P1Position=0;
    int P2Position=0;
    int P1Initial,P2Initial,p1=0,p2=0;
    System.out.println("Player 1 starts the game");
    while(P1Position!=Max && P2Position!=Max)
      {
       P1Position=pos(P1Position);
       P2Position=pos(P2Position);
       }
     if(P1Position==Max)
        System.out.println("Player 1 wins the game");
     if(P2Position==Max)
        System.out.println("Player 2 wins the game");
   }
}
