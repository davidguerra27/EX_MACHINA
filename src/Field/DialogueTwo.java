package Field;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;


import javax.swing.*;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class DialogueTwo {
    public Rectangle dialogue;
    public Scanner scanner;
    String input;
    int answer;

    public boolean rightAnswerTwo;

    public DialogueTwo() {


        input = JOptionPane.showInputDialog(" Wake up after my beauty sleep and take a breath between the eights:");
        switch (input) {
            case "488O288":
                JOptionPane.showMessageDialog(null, input + " : that's the right code! the field has been disabled.");
                rightAnswerTwo = true;
                break;
            default:
                JOptionPane.showMessageDialog(null, input + " : that is the wrong answer noob! You need to stop smoking. It's messing with your head.");
                rightAnswerTwo = false;
                break;
        }

        System.out.println(rightAnswerTwo);


    }

    public void init() {


    }
}
