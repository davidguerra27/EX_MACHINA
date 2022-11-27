package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class CoinsDialogue {


        public static Rectangle coinsDialogue = new Rectangle(150, 150, 670, 100);
        public static Text text = new Text(170, 170, "(inner voice) Humm.... this guy is so weird... who the fuck keeps exactly 1000 coins at home?");
        public static Text text1 = new Text(170, 200, "                                                                             (F:close)");

        public CoinsDialogue() {

        }

        public void init() {

            coinsDialogue.setColor(Color.BLACK);
            coinsDialogue.fill();


            text.setColor(Color.RED);
            text.draw();
            text1.setColor(Color.RED);
            text1.draw();
        }


        public void remove() {


            text.delete();
            text1.delete();
            coinsDialogue.delete();
            System.out.println("delete");


        }
    }

