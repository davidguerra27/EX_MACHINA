package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class TutorialDialogue {
    public static Rectangle tutorDialogue= new Rectangle(150,150,670,250);
    public static Text text1 = new Text(170,170,"(automated voice) HEY THERE!!!! HEY YOU!!... YES YOU WHO JUST ENTERED.");

    public static Text text2 = new Text(170,190," I'M THE HOUSE SECURED AUTOMATED SYSTEM AI, BUT YOU CAN CALL ME S.A.R.A.");
    public static Text text3 = new Text(170,210,"...MASTER BERNARDO LEFT BUT YOU CAN USE THE HOUSE.....THERE'S IS ONLY ONE SMALL ISSUE...");
    public static Text text4 = new Text(170,230,"...THIS IS A SECURED HOUSE AND EVERY ROOM IS PASSCODE PROTECTED...");
    public static Text text5 = new Text(170,250,"....BUT BECAUSE MASTER SMOKES TOO MUCH WEED......................");
    public static Text text6 = new Text(170,270,"... HE LEAVES REFERENCES TO THE PASSCODES ALL OVER THE HOUSE.....");

    public static Text text7 = new Text(170,290,"....YOU CAN TRY AND GUESS ALL THE PASSCODES...I HAVE TOTAL CONFIDENCE IN YOU.GOOD LUCK!");

      public static Text text8 = new Text(170,350," (hint : all letters are CAPITALIZED)                                                                            (F:close)");

    public TutorialDialogue(){








    }
    public void init(){

        tutorDialogue.setColor(Color.BLACK);
        tutorDialogue.fill();


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
        text6.setColor(Color.GREEN);
        text6.draw();
        text7.setColor(Color.GREEN);
        text7.draw();
        text8.setColor(Color.GREEN);
        text8.draw();
    }



    public void remove(){


        text1.delete();
        text2.delete();
        text3.delete();
        text4.delete();
        text5.delete();
        text6.delete();
        text7.delete();
        text8.delete();
        tutorDialogue.delete();
        System.out.println("delete");


    }
}
