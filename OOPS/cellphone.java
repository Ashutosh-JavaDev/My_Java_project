//cellphone function
class phone{
	public void vibrate(){
		System.out.println("Vibrating...");
	}
	public void ring(){
		System.out.println("Ringing...");
	}
	
	public void call(){
		System.out.println("Calling...");
	}	
}
public class cellphone{
	public static void main(String[]args){
		phone vivo=new phone();
		vivo.call();
		vivo.vibrate();
		vivo.ring();
	}
}