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

    public static final ArrayList<String> operatorsTrigonometric = new ArrayList<>(Arrays.asList("sen","cos","tan","ctg","sec","csc"));
    public static final ArrayList<String> operators = new ArrayList<>(Arrays.asList("+","-","*","/","^","(",")","sen" ));
    public static final ArrayList<String> numbers = new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));

    private Stack<String> lstExpression;
    private Stack<String> lstStack;
    private Stack<String> lstSuffixExpression;

    private ArrayList<String> expression;

    public Result(){
        this.lstExpression        = new Stack<String>();
        this.lstStack             = new Stack<String>();
        this.lstSuffixExpression  = new Stack<String>();
    }

    public static void init(){
        Result.sigleton=null;
    }

    public static Result getResult(){
        if( Result.sigleton==null ) Result.sigleton = new Result();
        return Result.sigleton;
    }

    public static void setExpression( ArrayList<String> expression ){
        Result.getResult().expression = expression;
    }

    public static String getAnswer( ArrayList<String> expression ) throws Exception {
        Result.setExpression( expression );
        try {
            return Result.getAnswer();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }

    public static String getAnswer() throws Exception {
        try {
            Result.getResult().initExpression();
            Result.getResult().initSuffixExpression();

            for (int i = Result.getResult().lstSuffixExpression.size() - 1; i >= 0; i--) {
                Result.getResult().lstExpression.push(Result.getResult().lstSuffixExpression.elementAt(i));
            }

            //Algoritmo de Evaluación Postfija o sufija
            while (!Result.getResult().lstExpression.isEmpty()) {
                String element = Result.getResult().lstExpression.peek();
                if (Result.operators.contains( element ) || Result.operatorsTrigonometric.contains( element )) {

                    String result = new String();

                    String operator = Result.getResult().lstExpression.pop();
                    if( Result.operatorsTrigonometric.contains( element )){
                        String number1 = Result.getResult().lstStack.pop();
                        result = Result.getResult().exec(operator, number1, "");
                    }else {
                        String number2 = Result.getResult().lstStack.pop();
                        String number1 = Result.getResult().lstStack.pop();
                        result = Result.getResult().exec(operator, number1, number2);
                    }



                    Result.getResult().lstStack.push(result);
                } else {
                    Result.getResult().lstStack.push(Result.getResult().lstExpression.pop());
                }
            }

            return Result.getResult().lstStack.pop();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    private void initExpression(){
        String str = new String();
        //Deja espacios entre operadores
        for (int i = 0; i < Result.getResult().expression.size(); i++) {
            String element = Result.getResult().expression.get(i);
            if (Result.operators.contains( element ) || Result.operatorsTrigonometric.contains( element )) {
                if( element.equals("(") || Result.operatorsTrigonometric.contains(element) ){
                    str += Result.getResult().expression.get(i) + " ";
                }else {
                    if( element.equals(")")){
                        str += " " + Result.getResult().expression.get(i);
                    }else {
                        str += " " + Result.getResult().expression.get(i) + " ";
                    }
                }
            }else{
                str += Result.getResult().expression.get(i);
            }
        }

        String[] arrExpression = str.split(" ");

        //Covertimos la entrada en una pila
        for (int i=arrExpression.length-1; i>=0; i--){
            Result.getResult().lstExpression.push( arrExpression[i] );
        }
    }

    private void initSuffixExpression() throws Exception {

        try {
            while (!Result.getResult().lstExpression.isEmpty()) {
                String element = Result.getResult().lstExpression.peek();
                int priority = Priority.getPriorityOf(element);

                switch (priority) {
                    case 1:
                        Result.getResult().lstStack.push( Result.getResult().lstExpression.pop() );
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
                    case 5:case 6:
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
            throw new Exception("Error al convertir la expreciona a sufijo");
        }
    }

    private String exec( String operator, String number1, String number2 ){
        String a;
        String b;
        switch ( operator) {
            case "plus":case "+":

                return String.format("%.9f", Double.parseDouble(number1) + Double.parseDouble(number2));
            case "minus":case "-":

                return String.format("%.9f", Double.parseDouble(number1) - Double.parseDouble(number2));
            case "multiply":case "*":

                return String.format("%.9f", Double.parseDouble(number1) * Double.parseDouble(number2));
            case "divide":case "/":

                return String.format("%.9f", Double.parseDouble(number1) / Double.parseDouble(number2));
            case "power":case "^":

                return String.format("%.9f", Math.pow(Double.parseDouble(number1), Double.parseDouble(number2)));

            case "sen":

                return String.format("%.9f", Math.sin(Double.parseDouble(number1)));

            case "cos":

                return String.format("%.9f", Math.cos(Double.parseDouble(number1)));

            case "tan":

                return String.format("%.9f", Math.tan(Double.parseDouble(number1)));

            case "ctg":

                return String.format("%.9f", Math.atan(Double.parseDouble(number1)));

            case "sec":

                return String.format("%.9f", Math.asin(Double.parseDouble(number1)));

            case "csc":

                return String.format("%.9f", Math.acos(Double.parseDouble(number1)));
        }
        return "0";
    }

    private static class Priority{

        private static final int maxPriority = 999;

        public static int getPriorityOf( String element ){

            int priority = Priority.maxPriority;

            if( Result.operatorsTrigonometric.contains( element ) ){ priority = 5;}
            else if( element.equals("^") ){ priority = 5;}
            else if( element.equals("*") || element.equals("/")){ priority = 4;}
            else if( element.equals("+") || element.equals("-")){ priority = 3;}
            else if( element.equals(")") ){ priority = 2;}
            else if( element.equals("(") ){ priority = 1;}

            return priority;
        }
    }

}
