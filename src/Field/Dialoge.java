package Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;


import javax.swing.*;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Dialoge {
    public Rectangle dialogue;
    public Scanner scanner;
    String input;
    int answer;

    public boolean rightAnswer;

    public Dialoge() {


        input = JOptionPane.showInputDialog("BEST FRIENDS INITIALS; COUNT THE hAGES ; COUNT THE WHyS:");
        switch (input) {
            case "CM14":
                JOptionPane.showMessageDialog(null, input + " : that's the right code. The field has been disabled.");
                rightAnswer = true;
                break;
            default:
                JOptionPane.showMessageDialog(null, input + " : that is the wrong answer noob! You need to stop smoking. It's messing with your head.");
                rightAnswer = false;
                break;
        }

        System.out.println(rightAnswer);


    }

    public void init() {


    }
}
