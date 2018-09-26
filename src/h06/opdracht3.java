package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht3 extends Applet {


    int a, b, c, uitkomst;

    public void init() {
        a = 2147483647;
        b = 10000;
        c = 0;
        uitkomst = (a + b);
    }

    public void paint(Graphics g) {
        g.drawString(" uitkomt is: " + uitkomst, 20, 40);


    }
}





