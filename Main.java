import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        printer print = new printer();
        print.rules();
        int k = 0;
        for(int i = 1; i < 10; i++){
            k = (int)(Math.random() * i) + 8;
            System.out.println("Game: " + i);
        Scanner in = new Scanner(System.in);
        Game game = new Game();
        game.mine(i+ k);
        boolean run = true;
        while(run){
            String hi = in.nextLine();
            game.runGame(hi);
            game.clear();
            game.Print();
            run = game.end();
            System.out.println(game);
        }
        }
        
        
    }
}
