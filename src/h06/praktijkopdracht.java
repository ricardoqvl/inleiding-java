package h06;

import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht extends Applet {

    double a,b,c,d, gemiddelde;
    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        gemiddelde  = (a + b + c) / d;
        gemiddelde  = (int)  (gemiddelde * 10);
        gemiddelde  = (gemiddelde / 10);
    }

    public void paint(Graphics g) {
        g.drawString("gemiddelde : " + gemiddelde, 20, 20);

    }
}






