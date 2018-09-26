package h04;

import java.awt.*;
import java.applet.*;

public class opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.GREEN);
        g.setColor(Color.white);
        g.fillRect(150, 120, 100, 100);
        g.setColor(Color.black);
        g.fillRect(220, 190, 15, 30);
        g.setColor( Color.cyan);
        g.fillRect(170, 170, 25, 25);

}
}