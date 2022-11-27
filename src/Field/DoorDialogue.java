package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class DoorDialogue {

    public static Rectangle doorDialogue= new Rectangle(150,150,670,100);
    public static Text text = new Text(170,170,"OH NO! THERE'S A INVISIBLE FORCE FIELD IN YOUR WAY! INSERT THE RIGHT CODE TO GET THROUGH!");
    public static Text text1 = new Text(170,200,"                                                                             (F:close)");
    public DoorDialogue(){








    }
    public void init(){

        doorDialogue.setColor(Color.BLACK);
        doorDialogue.fill();


        text.setColor(Color.GREEN);
        text.draw();
        text1.setColor(Color.GREEN);
        text1.draw();
    }



    public void remove(){


        text.delete();
        text1.delete();
        doorDialogue.delete();
        System.out.println("delete");


    }
}
