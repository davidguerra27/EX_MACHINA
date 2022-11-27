package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class IntroDialogue {


        public static Rectangle introDialogue= new Rectangle(150,150,670,100);
        public static Text text = new Text(170,170,"(inner voice)HUMM....What a strange place....I better investigate....." );
        public static Text text1 = new Text(170,200,"                                                               (F:close)");

        public IntroDialogue(){


        }
        public void init(){

            introDialogue.setColor(Color.BLACK);
            introDialogue.fill();


            text.setColor(Color.RED);
            text.draw();
            text1.setColor(Color.RED);
            text1.draw();
        }



        public void remove(){


            text.delete();
            text1.delete();
            introDialogue.delete();
            System.out.println("delete");


        }
}
