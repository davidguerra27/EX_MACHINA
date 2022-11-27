package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class LicenseDialogue {
    public static Rectangle licenseDialogue = new Rectangle(150, 150, 670, 100);
    public static Text text = new Text(170, 170, "(inner voice) __/09/2022....Humm...weird...a Driver's Licence with no day?...never seen that.");
    public static Text text1 = new Text(170, 200, "                                                                             (F:close)");

    public LicenseDialogue() {

    }

    public void init() {

        licenseDialogue.setColor(Color.BLACK);
        licenseDialogue.fill();


        text.setColor(Color.RED);
        text.draw();
        text1.setColor(Color.RED);
        text1.draw();
    }


    public void remove() {


        text.delete();
        text1.delete();
        licenseDialogue.delete();
        System.out.println("delete");


    }
}