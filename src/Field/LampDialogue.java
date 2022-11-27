package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class LampDialogue {
    public static Rectangle lampDialogue = new Rectangle(150, 150, 670, 100);
    public static Text text = new Text(170, 170, "The LIGHT side of the moon....");
    public static Text text1 = new Text(170, 200, "                                                                             (F:close)");

    public LampDialogue() {

    }

    public void init() {

        lampDialogue.setColor(Color.BLACK);
        lampDialogue.fill();


        text.setColor(Color.GREEN);
        text.draw();
        text1.setColor(Color.GREEN);
        text1.draw();
    }


    public void remove() {


        text.delete();
        text1.delete();
        lampDialogue.delete();
        System.out.println("delete");


    }
}