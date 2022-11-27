package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class LabLocker3Dialogue {
    public static Rectangle lablockerRoom3Dialogue = new Rectangle(150, 150, 670, 100);
    public static Text text = new Text(170, 170, "Server F.E.R.R.A.O. : 0 errors to report.");
    public static Text text1 = new Text(170, 200, "                                                                             (F:close)");

    public LabLocker3Dialogue() {

    }

    public void init() {

        lablockerRoom3Dialogue.setColor(Color.BLACK);
        lablockerRoom3Dialogue.fill();


        text.setColor(Color.GREEN);
        text.draw();
        text1.setColor(Color.GREEN);
        text1.draw();
    }


    public void remove() {


        text.delete();
        text1.delete();
        lablockerRoom3Dialogue.delete();
        System.out.println("delete");


    }
}