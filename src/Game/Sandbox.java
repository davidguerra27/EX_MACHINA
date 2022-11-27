package Game;
import Field.FieldCreator;
import Character.Player;
import Field.MapFactory;
import MenuRepresentation.MenuRepresentation;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Sandbox {
    public static void main(String[] args) throws InterruptedException {


        FieldCreator field = new FieldCreator();



        Sound soundOne = new Sound("/Resources/sound/clipfalling.wav");
        soundOne.play(true);
        field.init();
        soundOne.stop();


    }
}
