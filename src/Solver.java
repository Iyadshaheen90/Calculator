
/*
Author: Iyad Shaheen
Date: 9/14/18
Calculator APP GUI
Project1
COMP585
Professor: Sevak
 */

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/*
this class is the brains of the calculator which uses the script library of java that takes a string
and evaluates it to a result as a string. the way it does it is by using the script manager and eval function
of the script library. it basically parses the string of the textfield after the user has clicked equal
and returns the result to the calculatorbuttons class which in turns display it on the textfield of the calculator
the try and catch block is used to prevent a null pointer or an illegal entry and it returns the ERR message
to the user, letting them know that there was a mistake or invalid operation that they entered.

 */
public class Solver extends CalculatorButtons {


    public String getResult(String total)
    {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine myEngine = manager.getEngineByName("JavaScript");

        try
        {
            if(myEngine.eval(total).toString().equals("Infinity")||
                    myEngine.eval(total).toString().equals("NaN"))
                return "ERR";
            else
                total = myEngine.eval(total).toString();

        }
        catch (Exception r)
        {
            total = "ERR";
        }
        return total;
    }
}
