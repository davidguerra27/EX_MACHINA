package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class HeatingDialogue {

        public static Rectangle heatingDialogue = new Rectangle(150, 150, 670, 100);
        public static Text text = new Text(170, 170, "TEMPERATURE MODE : 01");
        public static Text text1 = new Text(170, 200, "                                                                             (F:close)");

        public HeatingDialogue() {

        }

        public void init() {

            heatingDialogue.setColor(Color.BLACK);
            heatingDialogue.fill();


            text.setColor(Color.GREEN);
            text.draw();
            text1.setColor(Color.GREEN);
            text1.draw();
        }


        public void remove() {


            text.delete();
            text1.delete();
            heatingDialogue.delete();
            System.out.println("delete");


        }
    }


