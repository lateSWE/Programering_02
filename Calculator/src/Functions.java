import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Functions {
    /**
     * A method used to replace the text the button sets to the text that javascript uses
     *
     * @param in
     * The input string
     *
     * @return
     * The string that is returned to be used in the scriptengine
     */
    private static String format(String in){

        in = parentheses(in);

        in = in.replaceAll("sqrt", "Math.sqrt ");
        in = in.replaceAll("sin", "Math.sin ");
        in = in.replaceAll("cos", "Math.cos ");
        in = in.replaceAll("tan", "Math.tan ");

        return in;
    }

    /**
     * A method to add the correct amount of closing parenthesises
     *
     * @param in
     * The string to add the closing parenthesise to
     *
     * @return
     * Returns the string that has the correct amount of closing parenthesises
     */
    private static String parentheses(String in){
        while (AmountOfCharInString(in, '(') > AmountOfCharInString(in, ')')){
            in = in.concat(")");
            System.out.println("Added a \")\"");
        }
        return in;
    }

    /**
     * Function used to find how many of a specific Char is in a String
     *
     * @param in
     * String to checked for char
     *
     * @param CharIn
     * What char to check for in the string
     *
     * @return
     * Retruns the amount of the char is in the inputed string
     */
    private static int AmountOfCharInString(String in, char CharIn){
        int out=0;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == CharIn){
                out++;
            }
        }
        return out;
    }

    /**
     * Function used to calculate the string
     *
     * @param in
     * The string to be calculated in the scriptengine
     *
     * @return
     * The calculated number returned as a string
     */
    public static String calc(String in){
        String out = "";
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            out = engine.eval(format(in)).toString();
            System.out.println(format(in));
            System.out.println("Equals: " + engine.eval(format(in)).toString());
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return out;
    }
}
