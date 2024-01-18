package appLet;
import java.awt.*;
import java.applet.*;
//<Applet code='setBackGround.class' width='600' height='600'></Applet>
public class setBackGround extends Applet {
   Color c1;
   Font f1;

   public void init(){
      setBackground(Color.CYAN);
      f1 = new Font("Arial", Font.BOLD + Font.ITALIC, 35);
      c1 = new Color(160, 40, 20);
   } 

   public void paint(Graphics g){ // Corrected method name to 'paint'
      g.drawString("This Text Color is Normal", 30, 30);
      
      // Set the color before drawing the red text
      g.setColor(Color.red);
      g.drawString("This text is Red", 30, 60); // Corrected y-coordinate to avoid overlapping text

      // Set color and font before drawing the mixed text
      g.setColor(c1);
      g.setFont(f1);
      g.drawString("This text is Mix & size is 35", 30, 100);
   }
}
