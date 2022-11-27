package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class RouterDialogue {
    public static Rectangle routerDialogue = new Rectangle(150, 150, 670, 100);
    public static Text text = new Text(170, 170, "WIFI-PASSWORD: [CO****ER***UM]");
    public static Text text1 = new Text(170, 200, "                                                                             (F:close)");

    public RouterDialogue() {

    }

    public void init() {

        routerDialogue.setColor(Color.BLACK);
        routerDialogue.fill();


        text.setColor(Color.GREEN);
        text.draw();
        text1.setColor(Color.GREEN);
        text1.draw();
    }


    public void remove() {


        text.delete();
        text1.delete();
        routerDialogue.delete();
        System.out.println("delete");


    }
}