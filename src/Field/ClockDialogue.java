package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class ClockDialogue {
    public static Rectangle clockDialogue= new Rectangle(150,150,670,100);
    public static Text text = new Text(170,170,"(inner voice)Hummm....88:88...that's a strange time!");
    public static Text text1 = new Text(170,200,"                                                                 (F:close)");

    public ClockDialogue(){








    }
    public void init(){

        clockDialogue.setColor(Color.BLACK);
        clockDialogue.fill();


        text.setColor(Color.RED);
        text.draw();
        text1.setColor(Color.RED);
        text1.draw();
    }



    public void remove(){


        text.delete();
        text1.delete();
        clockDialogue.delete();
        System.out.println("delete");


    }
}
