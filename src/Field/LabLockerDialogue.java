package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class LabLockerDialogue {

    public static Rectangle lablockerRoom1Dialogue = new Rectangle(150, 150, 670, 100);
    public static Text text = new Text(170, 170, "Server G.U.G.A : 0 errors to report.");
    public static Text text1 = new Text(170, 200, "                                                                             (F:close)");

    public LabLockerDialogue() {

    }

    public void init() {

        lablockerRoom1Dialogue.setColor(Color.BLACK);
        lablockerRoom1Dialogue.fill();


        text.setColor(Color.GREEN);
        text.draw();
        text1.setColor(Color.GREEN);
        text1.draw();
    }


    public void remove() {


        text.delete();
        text1.delete();
        lablockerRoom1Dialogue.delete();
        System.out.println("delete");


    }
}

