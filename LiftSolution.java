import java.util.Scanner;

public class LiftSolution{
   int Currentfloor=0;
public void moving(int Destinationfloor){
  while(Currentfloor!=Destinationfloor){
     if(Currentfloor<Destinationfloor){
             Currentfloor++;
}
   else{
Currentfloor--;
}
System.out.println("You have crossesd "+ Currentfloor +" floor");
}
System.out.println("Lift  reached the Destination floor: " + Currentfloor);
}
public static void main(String[] args)
{
LiftSolution L=new LiftSolution();
Scanner sc=new Scanner(System.in);
System.out.println("enter your Destination floor: ");
int Destinationfloor=sc.nextInt();
L.moving(Destinationfloor);
}
}