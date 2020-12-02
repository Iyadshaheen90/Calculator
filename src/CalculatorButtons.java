/*
Author: Iyad Shaheen
Date: 9/14/18
Calculator APP GUI
Project1
COMP585
Professor: Sevak
 */

/*
The following are all the needed imports to create the buttons of the calculator
add them to the panel. they are sent to the calculator frame when it was called
by the "button" object in calculatorFrame. i added the ActionListeners to each
of the buttons so they function when they are clicked or typed.
 */
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;


import javax.swing.JTextField;
public class CalculatorButtons extends JButton {

    /*
    i created two panels one of them is for the textfield and the other is for the buttons of the calculator
     */
    JPanel panel = new JPanel();
    JPanel panel0 = new JPanel(new BorderLayout());
    boolean flag = false;//this boolean "flag" is used as an indicator for when the equal sign
    //is used so the buttons perform as intended.

    public JPanel createButtons() {
        /*
        the following codes are the buttons 0 to 9, clear, delete, decimal point, the operators, back
        and the parenthesis and the equal button i also labeled the rows for the buttons as row1
        etc.
         */

        //Row1

        JButton btnDel = new JButton("DEL");
        btnDel.setFont((new Font("Arial", Font.BOLD, 12)));
        btnDel.setOpaque(true);
        btnDel.setBorderPainted(false);
        btnDel.setBackground(Color.red);


        JButton btnMod = new JButton("MOD");
        btnMod.setFont((new Font("Arial", Font.BOLD, 12)));


        JButton btnClear = new JButton("C");
        btnClear.setFont((new Font("Arial", Font.BOLD, 12)));

        JButton btnDiv = new JButton("/");
        btnDiv.setFont(new Font("Arial",Font.BOLD,12));


        //ROW2
        JButton btn7 = new JButton("7");
        btn7.setFont(new Font("Arial",Font.BOLD,12));


        JButton btn8 = new JButton("8");
        btn8.setFont(new Font("Arial",Font.BOLD,12));

        JButton btn9 = new JButton("9");
        btn9.setFont(new Font("Arial",Font.BOLD,12));

        JButton btnMult = new JButton("*");
        btnMult.setFont((new Font("Arial", Font.BOLD, 12)));
        //ROW3

        JButton btn4 = new JButton("4");
        btn4.setFont((new Font("Arial", Font.BOLD, 12)));


        JButton btn5 = new JButton("5");
        btn4.setFont((new Font("Arial", Font.BOLD, 12)));

        JButton btn6 = new JButton("6");
        btn4.setFont((new Font("Arial", Font.BOLD, 12)));

        JButton btnMinus = new JButton("-");
        btnMinus.setFont((new Font("Arial", Font.BOLD, 12)));

        //row4

        JButton btn1 = new JButton("1");
        btn1.setFont((new Font("Arial", Font.BOLD, 12)));

        JButton btn2 = new JButton("2");
        btn2.setFont((new Font("Arial", Font.BOLD, 12)));

        JButton btn3 = new JButton("3");
        btn3.setFont((new Font("Arial", Font.BOLD, 12)));

        JButton btnPlus = new JButton("+");
        btnPlus.setFont((new Font("Arial", Font.BOLD, 12)));

        //row5

        JButton btnOpen = new JButton("(");
        btnOpen.setFont((new Font("Arial", Font.BOLD, 12)));

        JButton btn0 = new JButton("0");
        btn0.setFont((new Font("Arial", Font.BOLD, 12)));

        JButton btnClose = new JButton(")");
        btnClose.setFont((new Font("Arial", Font.BOLD, 12)));

        JButton btnEqual = new JButton("=");
        btnEqual.setFont((new Font("Arial", Font.BOLD, 20)));

        //row6

        JButton btnBlank1 = new JButton();
        btnBlank1.setBorderPainted(false);

        JButton btnDot = new JButton(".");
        btnDot.setFont((new Font("Arial", Font.BOLD, 12)));

        JButton btnBlank2 = new JButton();
        btnBlank2.setBorderPainted(false);



        //String total = "0";
        panel.setLayout(new GridLayout(6,5));//this is to set the layout of the panel
        JTextField textField = new JTextField(25);//instantiating a textfield
        textField.setFont(new Font("Arial",Font.BOLD,16));//editing the text font
        textField.setEditable(true);//allowing the textfield to be editable so the user can use it
        textField.setBackground(Color.cyan);//setting the light blue color of the textfield
        textField.setHorizontalAlignment(JTextField.RIGHT);//this code is to align the text in the
                                                            //textfield to the right like in any calculator
        //textField.setLocation(1,1);
        //textField.setText(total);


        /*

        in the following lines of code i add the actionlisteners to the buttons so they are functioning and
        implement the abstract method of the action listener, action performed.
        each of the buttons has the same lines of code that add the appropriate value of the button to the
        textfield. the flag is originally set to false and only reset to true when the equal button is selected.
        the when the flag is false the entry of the button will add the value of the button to the pre-existing
        text in the textfield. However, when the equal button is pressed the flag becomes true, which will cause
        the other buttons, numbers, parenthesis and decimal point to act differently. the flag is true, then the
        text field will clear when one of these buttons is pressed and that will add the pressed button to the
        now-empty field which is fresh start and prevents the value of the button to be added to the previous total
        and instead starts a new string, a new calculation. then it resets the flag to false allowing the buttons
        value to add to the existing values of the new string. Operation buttons function slightly different. they
        set the flag to false after the equal is pressed and had set the flag to true and that allows the user to
        add, divide, subtract, multiply and even mod the answer of the previous calculation easily so they can use
        the previous answer as a part of the new calculation if needed
         */
        btn0.addActionListener(new ActionListener()
        {
            @Override

            public void actionPerformed(ActionEvent e)
            {
                if(!flag) {
                    textField.setText(textField.getText() + "0");
                }
                else if(flag)
                {
                    textField.setText("");
                    textField.setText(textField.getText() + "0");
                    flag=false;
                }
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!flag) {
                    textField.setText(textField.getText() + "1");
                }
                else if(flag)
                {
                    textField.setText("");
                    textField.setText(textField.getText() + "1");
                    flag=false;
                }
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!flag) {
                    textField.setText(textField.getText() + "2");
                }
                else if(flag)
                {
                    textField.setText("");
                    textField.setText(textField.getText() + "2");
                    flag=false;
                }
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!flag) {
                    textField.setText(textField.getText() + "3");
                }
                else if(flag)
                {
                    textField.setText("");
                    textField.setText(textField.getText() + "3");
                    flag=false;
                }
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!flag) {
                    textField.setText(textField.getText() + "4");
                }
                else if(flag)
                {
                    textField.setText("");
                    textField.setText(textField.getText() + "4");
                    flag=false;
                }
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!flag) {
                    textField.setText(textField.getText() + "5");
                }
                else if(flag)
                {
                    textField.setText("");
                    textField.setText(textField.getText() + "5");
                    flag=false;
                }
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!flag){
                    textField.setText(textField.getText() + "6");
                }
                else if(flag)
                {
                    textField.setText("");
                    textField.setText(textField.getText() + "6");
                    flag=false;
                }
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!flag) {
                    textField.setText(textField.getText() + "7");
                }
                else if(flag)
                {
                    textField.setText("");
                    textField.setText(textField.getText() + "7");
                    flag=false;
                }
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!flag) {
                    textField.setText(textField.getText() + "8");
                }
                else if(flag)
                {
                    textField.setText("");
                    textField.setText(textField.getText() + "8");
                    flag=false;
                }
            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!flag) {
                    textField.setText(textField.getText() + "9");
                }
                else if(flag)
                {
                    textField.setText("");
                    textField.setText(textField.getText() + "9");
                    flag=false;
                }
            }
        });

        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!flag) {
                    textField.setText(textField.getText() + ".");
                }
                else if(flag)
                {
                    textField.setText("");
                    textField.setText(textField.getText() + ".");
                    flag=false;
                }
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag=false;
                textField.setText(textField.getText() + "/");
            }
        });

        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag=false;
                textField.setText(textField.getText() + "*");
            }
        });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag=false;
                textField.setText(textField.getText() + "+");
            }
        });

        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag=false;
                textField.setText(textField.getText() + "-");
            }
        });

        btnMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag=false;
                textField.setText(textField.getText() + "%");
            }
        });

        btnOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!flag) {
                    textField.setText(textField.getText() + "(");
                }
                else if(flag)
                {
                    textField.setText("");
                    textField.setText(textField.getText() + "(");
                    flag=false;
                }
            }
        });

        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!flag) {
                    textField.setText(textField.getText() + ")");
                }
                else if(flag)
                {
                    textField.setText("");
                    textField.setText(textField.getText() + ")");
                    flag=false;
                }
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        /*
        the delete button allows the user to easily backtrack and delete certain entries without the need to
        restart the whole entry in case they made a mistake. we approach this by saving the string in a string
        holder variable and if the string is of length 1 or more we use the substring call and subtract
        1 from the original string length which deletes the last character of the string.
         */
        btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!flag) {
                    //String stringHolder = textField.getText();
                    if (textField.getText().length() > 0)
                        textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
                }
                else if(flag)
                {
                    textField.setText("");
                    flag=false;
                }
            }
        });
        /*
        for OO purposes we instantiate a Solver object called solve. i then use a string variable to hold the
        result that is returned by the solver function which takes a string and uses javascript to evaluate the
        string passed and return a result as a string. now that the result string is returned and saved in the
        local variable result all we have left to do is to display it in the textfield and set the flag to true.
         */
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = "";
                Solver solve = new Solver();
                result = solve.getResult(textField.getText());
                textField.setText(result);
                flag=true;

            }

        });

        /*
        the following lines are adding each of the buttons to the panel
         */

        panel.add(btnDel);
        panel.add(btnMod);
        panel.add(btnClear);
        panel.add(btnDiv);

        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btnMult);

        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btnMinus);

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btnPlus);

        panel.add(btnOpen);
        panel.add(btn0);
        panel.add(btnClose);
        panel.add(btnEqual);

        panel.add(btnBlank1);
        panel.add(btnDot);
        panel.add(btnBlank2);

        panel0.add(textField,BorderLayout.PAGE_START);
        panel0.add(panel,BorderLayout.CENTER);

        //we finally return the finalized panel to the calculaterframe where it is used to add this panel to
        //the frame
        return panel0;
    }

}

