package local_bets_withoutbaseamt;
import java.util.ArrayList;
import java.util.Scanner;

public class game {
    static Scanner sc = new Scanner(System.in);
    static int autoincrement=0;
    game(){
        display();
    }
    private static int numberOfPlayers;
    private static int bets;
    public static int getBets(int bets) {
        return bets;
    }
    public static void setBets(int bets) {
        game.bets = bets;
    }
    static ArrayList<players> al;
    static{
        System.out.println("enter number of players");
        numberOfPlayers=Integer.parseInt(sc.nextLine());
        System.out.println("enter bets amt");
        bets=Integer.parseInt(sc.nextLine());
        al = new ArrayList<players>();
        for(int i=0;i<numberOfPlayers;i++){
            int j=i;
            System.out.println("enter player "+ ++j +" name");
            String name=sc.nextLine();
            al.add(i, new players(++autoincrement,name));
        }
    }
    void changebets(){
        System.out.println("enter new bets");
        int bets=Integer.parseInt(sc.nextLine());
        setBets(bets);
    }
    void addPlayer(){
        //System.out.println("enter player id");
        //int id=Integer.parseInt(sc.nextLine());
        System.out.println("enter player name");
        String name=sc.nextLine();
        al.add(new players(++autoincrement,name));
        numberOfPlayers = numberOfPlayers + 1;
    }
    void finilizePlayer(players p){
        if(p.getCuramt()>0){
            System.out.println(p.getName()+" collect winings of "+p.getCuramt());
        }else if(p.getCuramt() == 0){
            System.out.println(p.getName()+" ur are the safest player won ntg and lost ntg");
        }else{
            System.out.println(p.getName()+" give ur loosing of "+p.getCuramt());
        }
    }
    void removeplayer(){
        System.out.println("enter player id to remove");
        int id=Integer.parseInt(sc.nextLine());
        /*if(al.get(id-1).getId()==id){
            System.out.println(al.get(id-1));
            System.out.println("are u sure u want to delet this player if yes press 1 else press 0");
            if(Integer.parseInt(sc.nextLine())==1){
                finilizePlayer(al.get(id-1));
                al.remove(id-1);
                numberOfPlayers = numberOfPlayers - 1;
                System.out.println("player removed");
            }else{
                System.out.println("okie player not removed");
                display();
            }
        }else{*/
            for (players p : al) {
                if(p.getId()==id){
                    System.out.println(p);
                    System.out.println("are u sure u want to delet this player if yes press 1 else press 0");
                    if(Integer.parseInt(sc.nextLine())==1){
                        al.remove(al.indexOf(p));
                        numberOfPlayers = numberOfPlayers - 1;
                        finilizePlayer(p);
                        break;
                    }else{
                        System.out.println("okie player not removed");
                        display();
                    }
                }
            }
        }
    //}
    void display(){
        System.out.println("*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-");
        for(players p:al){
            System.out.println(p);
        }
        System.out.println("*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println();
    }
    void getwinner(){
        System.out.println("*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("entre the id of player who won");
        int id=Integer.parseInt(sc.nextLine());
        ArrayList<Integer> a=new ArrayList<>();
        for (players p:al) {
            a.add(p.getId());
        }
        if(a.contains(id)){
            for(players p:al){
                if(p.getId()==id){
                    p.win(numberOfPlayers, bets);
                }else{
                    p.lose(bets);
                }
            }
            System.out.println("*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println();
        }else{
            System.out.println("either id player not added or player is deleted select from below list");
            display();
            getwinner();
        }
    }
    void endgame(){
        for (players p : al) {
            finilizePlayer(p);
        }
    }    
}
