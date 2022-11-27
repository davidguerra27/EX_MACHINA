package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class WristWatchDialogue {
    public static Rectangle wristDialogue = new Rectangle(150, 150, 670, 100);
    public static Text text = new Text(170, 170, "(inner voice) Humm... the watch its stopped on 1 PM.");
    public static Text text1 = new Text(170, 200, "                                                                             (F:close)");

    public WristWatchDialogue() {

    }

    public void init() {

        wristDialogue.setColor(Color.BLACK);
        wristDialogue.fill();


        text.setColor(Color.RED);
        text.draw();
        text1.setColor(Color.RED);
        text1.draw();
    }


    public void remove() {


        text.delete();
        text1.delete();
        wristDialogue.delete();
        System.out.println("delete");


    }
}
