import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Game{
    
    private int posx;
    private int posy;
    private int endx;
    private int endy;
    public int numMines;
    public int[][] mines;
    private String result;
    private int numClear;
    private int player;
    
    public Game(){
        posx = 8;
        posy = 8;
        result = "";
        numClear = 4;
    }
    
    public void mine(int numines){
        numMines = (int)(Math.random() * numines) + 5;
        //System.out.println(numMines);
        mines = new int[numMines][2];
        for(int i = 0; i < numMines; i++){
            mines[i][0] = (int)(Math.random() * 17) + 1;
            mines[i][1] = (int)(Math.random() * 17) + 1;
        }
        printer prin = new printer();
        //prin.prinA(mines);
        endx = (int)(Math.random() * 17) + 1;
        endy = (int)(Math.random() * 17) + 1;
     }
    
    public void runGame(String a){
        if(a.equals("w")){
            posx -= 1;
        }
        if(a.equals("a")){
            posy -= 1;
        }
        if(a.equals("s")){
            posx += 1;
        }
        if(a.equals("d")){
            posy += 1;
        }
        if(a.toUpperCase().equals("CLEAR")){
            if(numClear > 0){
            //clear();
            }
        }
        
    }
    
    public void clear(){
        numClear--;
        for(int i = 0; i < mines.length; i++){
            if(mines[i][0] == posx + 1 && mines[i][1] == posy){
                //result += " Mine at: " + mines[i][0] + ", " + mines[i][1];
                player++;
            }
            if(mines[i][0] == posx + 0 && mines[i][1] == posy + 1){
                //result += " Mine at: " + mines[i][0] + ", " + mines[i][1];
                player++;
            }
            if(mines[i][0] == posx + 1 && mines[i][1] == posy + 1){
                //result += " Mine at: " + mines[i][0] + ", " + mines[i][1];
                player++;
            }
            if(mines[i][0] == posx + 1 && mines[i][1] == posy -1){
                //result += " Mine at: " + mines[i][0] + ", " + mines[i][1];
                player++;
            }
            if(mines[i][0] == posx - 1 && mines[i][1] == posy + 1){
                //result += " Mine at: " + mines[i][0] + ", " + mines[i][1];
                player++;
            }
            if(mines[i][0] == posx - 1 && mines[i][1] == posy -1){
                //result += " Mine at: " + mines[i][0] + ", " + mines[i][1];
                player++;
            }
            if(mines[i][0] == posx - 1 && mines[i][1] == posy){
                //result += " Mine at: " + mines[i][0] + ", " + mines[i][1];
                player++;
            }
            if(mines[i][0] == posx + 0 && mines[i][1] == posy -1){
                //result += " Mine at: " + mines[i][0] + ", " + mines[i][1];
                player++;
            }
            
        }
    }
    
    public void Print(){
        for(int i = 0; i < 17; i++){
            for(int k = 0; k < 17; k++){
                if(i == endx && k == endy && (posx!= endx || posy != endy)){
                    System.out.print("X");
                }
                else if(posx == i && posy == k){
                    System.out.print(player);
                }
                else{
                    System.out.print("_");
                }
                
                
            }
            System.out.println();
        }
        player = 0;
        
    }
    
    public boolean end(){
        for(int j = 0; j < mines.length; j++){
                    if(mines[j][0] == posx && mines[j][1] == posy){
                        result = "Game over!";
                        return false;
                    }
                    else if(posx == endx && posy == endy){
                        result = "Game Won!";
                        return false;
                    }
                }
                return true;
    }
    
    public String toString(){
        return result + "\nPos: " + posx + " " +  posy;
    }
    
    

}
