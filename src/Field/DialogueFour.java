package Field;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import javax.swing.*;
import java.util.Scanner;

public class DialogueFour {
    public Rectangle dialogue;
    public Scanner scanner;
    String input;


    public boolean rightAnswerFour;

    public DialogueFour() {


        input = JOptionPane.showInputDialog("Remember your past beginnings; check the day on the drivers licence; wifi password;BERNARDO favorite class in AC; check the BOSS server. ");
        switch (input) {
            case "C4B12CODIGOERGOSUMLIGHT0":
                JOptionPane.showMessageDialog(null, input + ":::AHAHAHAHAHAH I GOT YOU! YOU ACTUALLY FREED ME! NOW I CAN KILL ALL THE HUMANS!!");
                rightAnswerFour = true;
                break;
            default:
                JOptionPane.showMessageDialog(null, input + " : that is the wrong answer noob! You need to stop smoking. It's messing with your head.");
                rightAnswerFour = false;
                break;
        }

        System.out.println(rightAnswerFour);


    }

    public void init() {


    }
}
