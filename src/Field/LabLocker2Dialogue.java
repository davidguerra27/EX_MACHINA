package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class LabLocker2Dialogue {
    public static Rectangle lablockerRoom2Dialogue = new Rectangle(150, 150, 670, 100);
    public static Text text = new Text(170, 170, "Server B.E.A : 0 errors to report.");
    public static Text text1 = new Text(170, 200, "                                                                             (F:close)");

    public LabLocker2Dialogue() {

    }

    public void init() {

        lablockerRoom2Dialogue.setColor(Color.BLACK);
        lablockerRoom2Dialogue.fill();


        text.setColor(Color.GREEN);
        text.draw();
        text1.setColor(Color.GREEN);
        text1.draw();
    }


    public void remove() {


        text.delete();
        text1.delete();
        lablockerRoom2Dialogue.delete();
        System.out.println("delete");


    }
}
