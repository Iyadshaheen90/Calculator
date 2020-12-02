/*
Author: Iyad Shaheen
Date: 9/14/18
Calculator APP GUI
Project1
COMP585
Professor: Sevak
 */


/*
in this project we were asked to create and develop a basic Calculator that performs
basic calculations using GUI and in a OO design that uses helper functions
this is my main and as you see it is OO design as i will go in more details in each of the
other classes
 */
import javax.swing.JFrame;

public class Calculator{
    public static void main(String[] args){

        run();
    }

    
    private static void run()
    {
        CalculatorFrame frame = new CalculatorFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}