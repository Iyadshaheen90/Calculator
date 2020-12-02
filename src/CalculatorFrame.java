/*
Author: Iyad Shaheen
Date: 9/14/18
Calculator APP GUI
Project1
COMP585
Professor: Sevak
 */

/*
this class is where i create the frame of the calculator and therefore it has to extending JFrame
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;

public class CalculatorFrame extends JFrame{

    //instantiating an object of the class CalculatorButtons which i will explain
    //in detail later on in that class and how it functions
    CalculatorButtons buttons = new CalculatorButtons();

    /*
    the following lines are some definitions and initialized variables that we are going to use in order
    create the calculator. the panel is used to hold the panel returned from the class CalculatorButtons
    and that is where the buttons of the calculator are added and the textfield, as well ass the listeners
    i will go into more detail in that class to further explain how it works and functions.
    the other private variables are a menu, menuBar and MenuItem that i use to create the menu with the
    exit choice that the user can use in order to exit the program. they are used in build menu to add the
    menu on the frame

     */
    private JPanel panel;
    private JMenu menu;
    private JMenuBar menuBar;
    private JMenuItem menuItem;

    //these are the dimensions of the frame of our calculator
    private static final int FRAME_WIDTH = 350;
    private static final int FRAME_HEIGHT = 350;

    /*
    in this constructor we call the buildMenu, createFrame, and addMenuListeners functions which
    makes use of these functions to create the calculator we see, and thats how we instantiated a new object
    of this class in main, using this constructor.
     */
    public CalculatorFrame(){

        buildMenu();
        createFrame();
        addMenuListener();
    }
    /*
    to create a frame we need a panel so we instantiate and initialize a new panel. but to initialize the
    panel we use the buttons object of the class CalculatorButtons which allows us to access the method in
    that class which in turn returns a jpanel that has all the buttons along with the keylisteners and the
    textfield that displays the entry and the answer for the user
    (the function in the class is called createButtons) and i will explain it further in the class
    CalculatorButtons. now that we have our panel returned to us from that class we save it in our panel in
    this class and we set the title bar to read "Calculator", and then we set its size and finally we add the
    panel to the frame. we also set the menuBar to the frame so that it appears in our calculator
     */
    private void createFrame()
    {

        panel=new JPanel();

        panel=(buttons.createButtons());//buttons.createButtons is returning a JPanel with the buttons and the
                                        // textfield

        setTitle("Calculator");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        add(panel);

        setJMenuBar(menuBar);
    }

    /*
    this function is to build a menu that has a menu item "EXIT" and then i added
    this Item to the menu and then i added the menu to the menuBar
     */
    private void buildMenu()
    {
        menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        menuItem = new JMenuItem("EXIT");
        menu.add(menuItem);
        menuBar.add(menu);
    }

    /*
    the addMenuListener is invoking the interface of the ActionListener and adding a actionListener
    that gives functionality to the menu when you click on it, and in the action performed
    we exit by calling the System.exit command as we click on exit which in turns leads to closing,
    terminating the program
    */
    private void addMenuListener()
    {
        menuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                exitActionPerformed();
            }
        });
    }

    private void exitActionPerformed()
    {
        System.exit(0);
    }

}