package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Bed2Dialogue {
    public static Rectangle bed2Dialogue= new Rectangle(150,150,670,100);
    public static Text text = new Text(170,170,"(inner voice) Humm....funny...it looks like the oxigen symbol..");
    public static Text text1 = new Text(170,200,"                                                       (F:close)");

    public Bed2Dialogue(){








    }
    public void init(){

        bed2Dialogue.setColor(Color.BLACK);
        bed2Dialogue.fill();


        text.setColor(Color.RED);
        text.draw();
        text1.setColor(Color.RED);
        text1.draw();
    }



    public void remove(){


        text.delete();
        text1.delete();
        bed2Dialogue.delete();
        System.out.println("delete");


    }
}
