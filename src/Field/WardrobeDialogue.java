package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class WardrobeDialogue {
    public static Rectangle wardrobeDialogue = new Rectangle(150, 150, 670, 100);
    public static Text text = new Text(170, 170, "(inner voice) Humm.... there's an inscription in the back of the closet : BFFs Carol&Mariana.");
    public static Text text1 = new Text(170, 200, "                                                                             (F:close)");

    public WardrobeDialogue() {

    }

    public void init() {

        wardrobeDialogue.setColor(Color.BLACK);
        wardrobeDialogue.fill();


        text.setColor(Color.RED);
        text.draw();
        text1.setColor(Color.RED);
        text1.draw();
    }


    public void remove() {


        text.delete();
        text1.delete();
        wardrobeDialogue.delete();
        System.out.println("delete");


    }
}
