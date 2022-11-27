package Field;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import javax.swing.*;
import java.util.Scanner;

public class DialogueThree {
    public Rectangle dialogue;
    public Scanner scanner;
    String input;


    public boolean rightAnswerThree;

    public DialogueThree() {


        input = JOptionPane.showInputDialog("To DO list: count money, temperature mode, check nokia 3310, check iPhone, check servers, check watch.(remember the morse)");
        switch (input) {
            case "BALJEET":
                JOptionPane.showMessageDialog(null, input + " : that's the correct code! field has been disabled.");
                rightAnswerThree = true;
                break;
            default:
                JOptionPane.showMessageDialog(null, input + " : that is the wrong answer noob! You need to stop smoking. It's messing with your head.");
                rightAnswerThree= false;
                break;
        }

        System.out.println(rightAnswerThree);


    }

    public void init() {


    }
}
