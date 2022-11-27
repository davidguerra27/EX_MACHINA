package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Book2Dialogue {

    public static Rectangle book2Dialogue = new Rectangle(150, 150, 670, 100);
    public static Text text1 = new Text(170, 160, "    (poem) THE WHYS");
    public static Text text2 = new Text(170, 180, " where did all the years go?");
    public static Text text3 = new Text(170, 200, " what are they made of?");
    public static Text text4 = new Text(170, 220, " when do they leave us?");

    public static Text text5 = new Text(170, 230, "                                                                             (F:close)");

    public Book2Dialogue() {

    }

    public void init() {

        book2Dialogue.setColor(Color.BLACK);
        book2Dialogue.fill();



        text1.setColor(Color.GREEN);
        text1.draw();
        text2.setColor(Color.GREEN);
        text2.draw();
        text3.setColor(Color.GREEN);
        text3.draw();
        text4.setColor(Color.GREEN);
        text4.draw();
        text5.setColor(Color.GREEN);
        text5.draw();

    }


    public void remove() {



        text1.delete();
        text2.delete();
        text3.delete();
        text4.delete();
        text5.delete();
        book2Dialogue.delete();
        System.out.println("delete");


    }
}
