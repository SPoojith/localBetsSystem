package local_bets_withoutbaseamt;

import java.util.Scanner;

public class local_bets_system {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        game g=new game();
        Character choice;
        System.out.println();
        System.out.println("*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("select the choice");
        System.out.println("press 1 for select winner");
        System.out.println( "press 2 for endgame");
        System.out.println( "press 3 for change bets");
        System.out.println( "press 4 for add players");
        System.out.println( "press 5 for remove player");
        System.out.println("press 6 for score");
        choice= sc.nextLine().charAt(0);
        System.out.println();
        System.out.println("*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println();
        do{
        switch(choice){
            case '1':g.getwinner();
                    g.display();
            break;
            case '2':g.endgame();
            break;
            case '3':g.changebets();
            break;
            case '4':g.addPlayer();
            break;
            case '5':g.removeplayer();
            break;
            case '6':g.display();
            break;
            default:System.out.println("enter valid choice");      
        }
        System.out.println();
        System.out.println("*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("select the choice");
        System.out.println("press 1 for select winner");
        System.out.println( "press 2 for endgame");
        System.out.println( "press 3 for change bets");
        System.out.println( "press 4 for add players");
        System.out.println( "press 5 for remove player");
        System.out.println("press 6 for score");
        choice =sc.nextLine().charAt(0);
        System.out.println();
        System.out.println("*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println();
        if(choice.equals('2')){
            break;
        }
        }while(true); 
        g.endgame();
        sc.close();
    }
    
}
