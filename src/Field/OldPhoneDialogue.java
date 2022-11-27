package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class OldPhoneDialogue {


        public static Rectangle phoneDialogue = new Rectangle(150, 150, 670, 100);
        public static Text text = new Text(170, 170, "(inner voice) What the fuck is this? is this a tv remote?...there's only the number 0100 on the screen.");
        public static Text text1 = new Text(170, 200, "                                                                             (F:close)");

        public OldPhoneDialogue() {

        }

        public void init() {

            phoneDialogue.setColor(Color.BLACK);
            phoneDialogue.fill();


            text.setColor(Color.RED);
            text.draw();
            text1.setColor(Color.RED);
            text1.draw();
        }


        public void remove() {

            text.delete();
            text1.delete();
            phoneDialogue.delete();
            System.out.println("delete");


        }
    }

