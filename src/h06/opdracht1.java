package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {


    double a,b,c, uitkomst;
        public void init() {
            a = 113;
            b = 0;
            c = 4;
            uitkomst = (a + b) / c;
        }

        public void paint(Graphics g) {
            g.drawString("Jan : " + uitkomst, 20, 20);
            g.drawString("Ali : " + uitkomst, 20, 40);
            g.drawString("Jeannette : " + uitkomst, 20, 60);
            g.drawString("Ricardo : " + uitkomst, 20, 80);
        }
    }




