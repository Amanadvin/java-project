
//create a game in java is stone paper scisssor.
import java.util.Scanner;
import java.util.Random;

public class paper {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Which you want to pickup : ,1 = Stone, 2= Paper , 3 = Scissor ");
    int a = sc.nextInt();
    if (a == 1){
        System.out.println("You have picked the stone");
    }
    else if(a == 2){
        System.out.println("you have picked the paper ");
    }
    else if (a == 3){
        System.out.println("you have picked scissor");
    } else {
            System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            return; // Exiting the program if the choice is invalid.
        }
    
    Random ran = new Random();
    int b = ran.nextInt(3) + 1;
    if(b == 1){
        System.out.println("PC has picked Stone :");
    }
    else if (b == 2){
        System.out.println("PC has picked the Paper");
    }
    else if (b==3){
        System.out.println("PC has picked the Scissor");
    }
    switch(b){
        case 1:
        System.out.println("PC has picked the Stone");
        break;
        case 2:
        System.out.println("PC has picked the Paper");
        break;
        case 3:
        System.out.println("PC has picked the Scissor");
        break;
    }
    if(a == 1 & b==1){
        System.out.println("the game is draw :");
    }
    else if (a==1 & b==2){
        System.out.println("PC is Winner");
    }
    else if(a == 1 & b== 3){
        System.out.println("you are the Winner");
    }
    else if(a==2 & b==1){
        System.out.println("You are the Winner");
    }
    else if(a==2 & b==2){
        System.out.println("the game is Draw");
    }
    else if(a==2 & b==3){
        System.out.println("Pc is the Winner");
    }
    else if(a==3 & b== 1){
        System.out.println("PC is the Winner");
    }
    else if(a==3 & b==2){
        System.out.println("You are the Winner");
    }
    else if ( a==3 & b==3){
        System.out.println("The game is Draw ");
    }

}

}
