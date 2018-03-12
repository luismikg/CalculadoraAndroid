package mx.ipn.cic.geo.calculadora_a18;

import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by admin on 3/11/18.
 */

public class Result {

    private static Result sigleton;

    public static final ArrayList<String> operators = new ArrayList<>(Arrays.asList("+","-","*","/","^" ));

    private Stack<String> lstExpression;
    private Stack<String> lstStack;
    private Stack<String> lstSuffixExpression;

    private String expression;
    private Activity father;


    public Result(){
        this.lstExpression        = new Stack<String>();
        this.lstStack             = new Stack<String>();
        this.lstSuffixExpression  = new Stack<String>();
    }

    public static void init( Activity father ){
        Result.getResult().father = father;
        Result.sigleton=null;
    }

    private static Result getResult(){
        if( Result.sigleton==null ) Result.sigleton = new Result();
        return Result.sigleton;
    }

    public static void setExpression( String expression ){
        Result.getResult().expression = expression;
    }

    public static String getAnswer( String expression ){
        Result.setExpression( expression );
        return Result.getAnswer();
    }

    public static String getAnswer(){
        Result.getResult().initExpression();
        Result.getResult().initSuffixExpression();

        for (int i = Result.getResult().lstSuffixExpression.size() - 1; i >= 0; i--) {
            Result.getResult().lstExpression.push( Result.getResult().lstSuffixExpression.elementAt(i) );
        }

        //Algoritmo de Evaluación Postfija o sufija
        while (!Result.getResult().lstExpression.isEmpty()) {
            if (Result.operators.contains("" + Result.getResult().lstExpression.peek())) {

                String operator = Result.getResult().lstExpression.pop();
                String number2 = Result.getResult().lstStack.pop();
                String number1 = Result.getResult().lstStack.pop();

                String result = Result.getResult().exec( operator, number1, number2 );

                Result.getResult().lstStack.push(result);
            }else {
                Result.getResult().lstStack.push(Result.getResult().lstExpression.pop());
            }
        }

        return Result.getResult().lstStack.pop();
    }

    private void initExpression(){
        String str = new String();
        //Deja espacios entre operadores
        for (int i = 0; i < Result.getResult().expression.length(); i++) {
            if (Result.operators.contains("" + Result.getResult().expression.charAt(i))) {
                str += " " + Result.getResult().expression.charAt(i) + " ";
            }else{
                str += Result.getResult().expression.charAt(i);
            }
        }
        Result.getResult().expression = str;

        String[] arrExpression = Result.getResult().expression.split(" ");

        //Covertimos la entrada en una pila
        for (int i=arrExpression.length-1; i>=0; i--){
            Result.getResult().lstExpression.push( arrExpression[i] );
        }
    }

    private void initSuffixExpression(){

        try {
            while (!Result.getResult().lstExpression.isEmpty()) {
                String element = Result.getResult().lstExpression.peek();
                int priority = Priority.getPriorityOf(element);

                switch (priority) {
                    case 1:
                        Result.getResult().lstStack.push(element);
                        break;
                    case 3:
                    case 4:
                        if( !Result.getResult().lstStack.isEmpty() && !Result.getResult().lstExpression.isEmpty() ){
                            while (Priority.getPriorityOf(Result.getResult().lstStack.peek()) >= Priority.getPriorityOf(Result.getResult().lstExpression.peek())) {
                                Result.getResult().lstSuffixExpression.push(Result.getResult().lstStack.pop());
                                if( Result.getResult().lstStack.isEmpty() || Result.getResult().lstExpression.isEmpty() ){ break; }
                            }
                        }

                        Result.getResult().lstStack.push(Result.getResult().lstExpression.pop());
                        break;
                    case 2:
                        while (!Result.getResult().lstStack.peek().equals("(")) {
                            Result.getResult().lstSuffixExpression.push(Result.getResult().lstStack.pop());
                        }
                        Result.getResult().lstStack.pop();
                        Result.getResult().lstExpression.pop();
                        break;
                    default:
                        Result.getResult().lstSuffixExpression.push(Result.getResult().lstExpression.pop());
                }
            }
            while(!Result.getResult().lstStack.isEmpty()){
                Result.getResult().lstSuffixExpression.push(Result.getResult().lstStack.pop());
            }
        }catch (Exception e){
            //Error
            Toast toast = Toast.makeText(Result.this.father, "Error en la expreción", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    private String exec( String operator, String number1, String number2 ){
        String a;
        String b;
        switch ( operator) {
            case "add":case "+":

                return (Double.parseDouble(number1) + Double.parseDouble(number2)) + new String();
            case "substract":case "-":

                return (Double.parseDouble(number1) - Double.parseDouble(number2)) + new String();
            case "multiply":case "*":

                return (Double.parseDouble(number1) * Double.parseDouble(number2)) + new String();
            case "divide":case "/":

                return (Double.parseDouble(number1) / Double.parseDouble(number2)) + new String();
            case "power":case "^":

                return (Math.pow(Double.parseDouble(number1), Double.parseDouble(number2)) + new String());
        }
        return "0";
    }

    private static class Priority{

        private static final int maxPriority = 999;

        public static int getPriorityOf( String element ){

            int priority = Priority.maxPriority;

            if( element.equals("^") ){ priority = 5;}
            else if( element.equals("*") || element.equals("/")){ priority = 4;}
            else if( element.equals("+") || element.equals("-")){ priority = 3;}
            else if( element.equals(")") ){ priority = 2;}
            else if( element.equals("(") ){ priority = 1;}

            return priority;
        }
    }

}
