package Gaming;
import java.util.*;
public class GamingState {
    public static void main(String[] args) {
    	Scanner read=new Scanner(System.in);
    	weapons b=new weapons();
    	System.out.print("Enter the state of game(on/off):");
    	String state=read.next();
        GState obj = GState.getInstance();
        obj.msg(state);
        if(state.equalsIgnoreCase("ON"))
        {
        	System.out.print("Enter which level you want to play:");
        	int level=read.nextInt();
        	System.out.println("Enter your choice(true/false):");
        	boolean choice=read.nextBoolean();
            A wea=Choice.getA(choice);
            Loadout l=b.getLoadout(level);
        	Result a=new Result();
            Enemies obj1=a.getEnemies(level);
            obj1.Strength();
            wea.weapon();
        }
        read.close();
    }
}