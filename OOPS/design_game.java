//design a meathod for a game character
import java.util.*;
class tommy{
	public void hit(){
		System.out.println("Hit the enemy");
	}
	public void run(){
		System.out.println("Run from the enemy");
		
	}
	public void fire(){
		System.out.println("Fire to the enemy");
	}
}
public class design_game{
	
	public static void main(String[]args){
		tommy player=new tommy();
		
		player.run();
		player.hit();
		player.fire();
	}
}