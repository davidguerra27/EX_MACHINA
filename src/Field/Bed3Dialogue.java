package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Bed3Dialogue {
    public static Rectangle bed3Dialogue= new Rectangle(150,150,670,100);
    public static Text text = new Text(170,170,"(automated Bed) Welcome back master. Ready four your sleep?");
    public static Text text1 = new Text(170,200,"                                                              (F:close)");

    public Bed3Dialogue(){








    }
    public void init(){

        bed3Dialogue.setColor(Color.BLACK);
        bed3Dialogue.fill();


        text.setColor(Color.ORANGE);
        text.draw();
        text1.setColor(Color.ORANGE);
        text1.draw();
    }



    public void remove(){


        text.delete();
        text1.delete();
        bed3Dialogue.delete();
        System.out.println("delete");


    }
}
