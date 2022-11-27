package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Book1Dialogue {
    public static Rectangle book1Dialogue= new Rectangle(150,150,670,100);
    public static Text text = new Text(170,170,"THE AGES: AGE OF DISCOVERY; AGE OF ENLIGHTENMENT; AGE OF GUNPOWDER");
    public static Text text1 = new Text(170,200,"                                                                             (F:close)");

    public Book1Dialogue(){








    }
    public void init(){

        book1Dialogue.setColor(Color.BLACK);
        book1Dialogue.fill();


        text.setColor(Color.GREEN);
        text.draw();
        text1.setColor(Color.GREEN);
        text1.draw();
    }



    public void remove(){


        text.delete();
        text1.delete();
        book1Dialogue.delete();
        System.out.println("delete");


    }
}
