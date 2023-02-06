package local_bets_withoutbaseamt;

//import java.util.ArrayList;


public class players {
    private int id;
    private String name;
    private int curamt;
    public players(){
        this.id = 0;
        this.name = "johndoe";
        this.curamt=0;
    }
    public players(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getCuramt() {
        return curamt;
    }
    public void setCuramt(int curamt) {
        this.curamt =curamt;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    void win(int numberOfPlayers,int betsAmt){
        setCuramt(getCuramt()+(numberOfPlayers-1)*betsAmt);
    }

    void lose(int betsAmt){
        setCuramt(getCuramt()-betsAmt);
    }
    
    public String toString(){
        return "playerId: "+getId()+" Player name "+getName()+" current balance "+getCuramt();
    }
    public static void main(String[] args) {
        // ArrayList<Integer>al=new ArrayList<Integer>();
        // for(int i=0;i<5;i++){
        //     al.add(i);
        // }
        // al.remove(4);
        // System.out.println(al.size());
        
    }
    
}
