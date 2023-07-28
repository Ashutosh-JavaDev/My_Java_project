import java.applet.Applet;
import java.awt.*;

public class abc1 extends Applet {
    Color cl;
    Font fl;

    public void init() {
        setBackground(Color.pink);
        cl = new Color(150, 26, 10);
        fl = new Font("arial", Font.BOLD | Font.ITALIC, 35);
    }

    public void paint(Graphics g) {
        g.drawString("this text color is normal", 30, 20);
        g.setColor(Color.RED);
        g.drawString("this text color is red", 30, 50);
        
        Font f1 = new Font("arial", Font.BOLD | Font.ITALIC, 50);
        Color c1 = new Color(100, 150, 200);
        g.setFont(f1);
        g.setColor(c1);
        g.drawString("this colour is mix & size is 35,50", 100, 100);
    }
    
    public static void main(String[] args) {
        // Applet code can be run as an application using the main method
        Frame frame = new Frame("Applet Frame");
        abc1 applet = new abc1();
        applet.init();
        frame.add(applet);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
