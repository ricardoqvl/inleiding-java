package h03;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {
    //Voorbeeld 6.1




    public class Reken extends Applet {
        int a;
        int b;
        int c;
        int uitkomst;

        public void init() {
            a = 7;
            b = 8;
            c = 3;
            uitkomst = (a + b) / c;
        }

        public void paint(Graphics g) {
            g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        }
    }
}
