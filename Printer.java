public class printer{
    public printer(){
        
    }
    
    public void rules(){
        System.out.println("Rules\nPress w, a, s, d + enter to move.\nThe goal is to move the number (player) to the X (exit)\nThe number of your player shows the amount of mines around you.\nPress enter to start.");
    }
    
    public void prinA(int[][]  arr){
        for(int[] p : arr){
            for(int k : p){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
