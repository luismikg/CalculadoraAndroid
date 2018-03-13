package mx.ipn.cic.geo.calculadora_a18;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;


/*
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
*/


// Metodo 1. Usando un listener por cada widget.
/*
public class MainActivity extends AppCompatActivity {
    Button btnDigCero;
    Button btnDigUno;
    Button btnDigDos;
    Button btnDigTres;
    Button btnDigCuatro;
    Button btnDigCinco;
    Button btnDigSeis;
    Button btnDigSiete;
    Button btnDigOcho;
    Button btnDigNueve;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = this.findViewById(R.id.txtExpresion);

        this.btnDigCero = this.findViewById(R.id.btnDigCero);
        this.btnDigCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().toString().compareTo("0") != 0)
                    textView.setText(textView.getText() + "0");
            }
        });

        this.btnDigUno = this.findViewById(R.id.btnDigUno);
        this.btnDigUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "1");
            }
        });

        this.btnDigDos = this.findViewById(R.id.btnDigDos);
        this.btnDigDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "2");
            }
        });

        this.btnDigTres = this.findViewById(R.id.btnDigTres);
        this.btnDigTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "3");
            }
        });

        this.btnDigCuatro = this.findViewById(R.id.btnDigCuatro);
        this.btnDigCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "4");
            }
        });

        this.btnDigCinco = this.findViewById(R.id.btnDigCinco);
        this.btnDigCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "5");
            }
        });

        this.btnDigSeis = this.findViewById(R.id.btnDigSeis);
        this.btnDigSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "6");
            }
        });

        this.btnDigSiete = this.findViewById(R.id.btnDigSiete);
        this.btnDigSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "7");
            }
        });

        this.btnDigOcho = this.findViewById(R.id.btnDigOcho);
        this.btnDigOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "8");
            }
        });

        this.btnDigNueve = this.findViewById(R.id.btnDigNueve);
        this.btnDigNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "9");
            }
        });
    }
}
*/

/*
// Metodo 1a. Usando un listener por cada widget sin usar variables.
public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = this.findViewById(R.id.txtExpresion);

        this.findViewById(R.id.btnDigCero).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().toString().compareTo("0") != 0)
                    textView.setText(textView.getText() + "0");
            }
        });

        this.findViewById(R.id.btnDigUno).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "1");
            }
        });

        this.findViewById(R.id.btnDigDos).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "2");
            }
        });

        this.findViewById(R.id.btnDigTres).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "3");
            }
        });

        this.findViewById(R.id.btnDigCuatro).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "4");
            }
        });

        this.findViewById(R.id.btnDigCinco).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "5");
            }
        });

        this.findViewById(R.id.btnDigSeis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "6");
            }
        });

        this.findViewById(R.id.btnDigSiete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "7");
            }
        });

        this.findViewById(R.id.btnDigOcho).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "8");
            }
        });

        this.findViewById(R.id.btnDigNueve).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "9");
            }
        });
    }
}
*/

// Metodo 2. Usando un listener por clase.
/*
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnDigCero;
    Button btnDigUno;
    Button btnDigDos;
    Button btnDigTres;
    Button btnDigCuatro;
    Button btnDigCinco;
    Button btnDigSeis;
    Button btnDigSiete;
    Button btnDigOcho;
    Button btnDigNueve;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = this.findViewById(R.id.txtExpresion);

        this.btnDigCero = this.findViewById(R.id.btnDigCero);
        this.btnDigCero.setOnClickListener(this);

        this.btnDigUno = this.findViewById(R.id.btnDigUno);
        this.btnDigUno.setOnClickListener(this);

        this.btnDigDos = this.findViewById(R.id.btnDigDos);
        this.btnDigDos.setOnClickListener(this);

        this.btnDigTres = this.findViewById(R.id.btnDigTres);
        this.btnDigTres.setOnClickListener(this);

        this.btnDigCuatro = this.findViewById(R.id.btnDigCuatro);
        this.btnDigCuatro.setOnClickListener(this);

        this.btnDigCinco = this.findViewById(R.id.btnDigCinco);
        this.btnDigCinco.setOnClickListener(this);

        this.btnDigSeis = this.findViewById(R.id.btnDigSeis);
        this.btnDigSeis.setOnClickListener(this);

        this.btnDigSiete = this.findViewById(R.id.btnDigSiete);
        this.btnDigSiete.setOnClickListener(this);

        this.btnDigOcho = this.findViewById(R.id.btnDigOcho);
        this.btnDigOcho.setOnClickListener(this);

        this.btnDigNueve = this.findViewById(R.id.btnDigNueve);
        this.btnDigNueve.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        textView.setText(textView.getText() + ((Button)v).getText().toString());
    }
}
*/

// Metodo 2a. Usando un listener por clase sin variables.
/*
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = this.findViewById(R.id.txtExpresion);

        this.findViewById(R.id.btnDigCero).setOnClickListener(this);
        this.findViewById(R.id.btnDigUno).setOnClickListener(this);
        this.findViewById(R.id.btnDigDos).setOnClickListener(this);
        this.findViewById(R.id.btnDigTres).setOnClickListener(this);
        this.findViewById(R.id.btnDigCuatro).setOnClickListener(this);
        this.findViewById(R.id.btnDigCinco).setOnClickListener(this);
        this.findViewById(R.id.btnDigSeis).setOnClickListener(this);
        this.findViewById(R.id.btnDigSiete).setOnClickListener(this);
        this.findViewById(R.id.btnDigOcho).setOnClickListener(this);
        this.findViewById(R.id.btnDigNueve).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        textView.setText(textView.getText() + ((Button)v).getText().toString());
    }
}
*/

// Metodo 3. Usando el diseñador.
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textView;
    private static Boolean anOperationHasJustBeenDone = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = this.findViewById(R.id.txtExpresion);

        if( ExpressionClass.expression.size() == 0 ){
            ExpressionClass.expression.add( "0" );
        }
        textView.setText( ExpressionClass.expression.toString() );
    }


    @Override
    public void onClick(View v) {

        String newValue = ((Button)v).getText().toString();

        if( MainActivity.anOperationHasJustBeenDone ){
            MainActivity.anOperationHasJustBeenDone = false;
            if( Result.numbers.contains( newValue )||newValue.equals(".") ){
                ExpressionClass.expression.clear();
                ExpressionClass.expression.add( "0" );
                this.textView.setText( ExpressionClass.expression.toString() );
            }
        }

        this.checknewValue( newValue );
        textView.setText( ExpressionClass.expression.toString() );

    }

    private void checknewValue( String newValue ) {

        //Simbolos
        if( newValue.equals("=") ){
            String result = this.getResult();
            ExpressionClass.expression.clear();
            ExpressionClass.expression.add( result );
            return;
        }
        if( newValue.equals( this.getResources().getString(R.string.delete) ) ){
            String elementToRemoved = ExpressionClass.expression.remove( ExpressionClass.expression.size()-1 );

            if( elementToRemoved.length()>1 ){
                String str = new String();
                for(int i=0; i<elementToRemoved.length()-1; i++){
                    str = str+elementToRemoved.charAt(i);
                }
                ExpressionClass.expression.add( str );
            }
            if( ExpressionClass.expression.size()==0 ) {
                ExpressionClass.expression.add( "0" );
            }
            return;
        }
        if( newValue.equals(".") ){
            String lastElement = ExpressionClass.expression.remove(ExpressionClass.expression.size()-1 );
            if( this.isNumber(lastElement) ){
                if( lastElement.indexOf(".")==-1 ){
                    ExpressionClass.expression.add(lastElement + newValue);
                }
            }else{
                ExpressionClass.expression.add(lastElement);
                ExpressionClass.expression.add("0"+newValue);
            }
            return;
        }
        // solo +, -, /, *, ^
        if( Result.operators.contains(newValue) ){
            String lastElement = ExpressionClass.expression.remove(ExpressionClass.expression.size()-1 );
            if( Result.operators.contains(lastElement) ){
                ExpressionClass.expression.add(newValue);
            }else{
                ExpressionClass.expression.add(lastElement);
                ExpressionClass.expression.add(newValue);
            }
            return;
        }

        //Numeros
        // solo 0,1,2,3,4,5,6,7,8,9
        if( Result.numbers.contains(newValue) ){
            int size = ExpressionClass.expression.size();

            switch (size){
                case 1:
                    String lastElement = ExpressionClass.expression.remove(ExpressionClass.expression.size()-1 );
                    if( lastElement.equals("0") ){
                        ExpressionClass.expression.add( newValue );
                    }else {
                        if( this.isNumber(lastElement) ){
                            ExpressionClass.expression.add( lastElement+newValue );
                        }else {
                            ExpressionClass.expression.add( lastElement );
                            ExpressionClass.expression.add( newValue );
                        }
                    }
                    break;
                default:
                    lastElement = ExpressionClass.expression.remove(ExpressionClass.expression.size()-1 );
                    if( this.isNumber(lastElement) ){
                        ExpressionClass.expression.add( lastElement+newValue );
                    }else {
                        ExpressionClass.expression.add( lastElement );
                        ExpressionClass.expression.add( newValue );
                    }
            }
            return;
        }
    }

    private boolean isNumber(String element) {
        try {
            Double.parseDouble( element );
            return true;
        }catch (Exception e){
            return false;
        }
    }

    private String getResult(){
        String result = ExpressionClass.expression.toString();
        try {
            Result.init();
            result = Result.getAnswer(ExpressionClass.expression.toString());
            result = this.depurarResult(result);
            MainActivity.anOperationHasJustBeenDone = true;
        }catch (Exception e){
            //Error
            Toast toast = Toast.makeText(this, "Error en la expreción", Toast.LENGTH_SHORT);
            toast.show();
        }

        return result;
    }

    private String depurarResult(String result) {
        String[] arraResult = result.split("\\.");
        double fraction = Double.parseDouble( arraResult[1] );
        if( fraction==0 ){
            result = arraResult[0];
        } else{
            String strFraccion = arraResult[1];
            String auxFraccion = new String();

            int i;
            for (i=strFraccion.length()-1; i>=0; i--){
                if( strFraccion.charAt(i) != '0' ){
                    break;
                }
            }
            for (; i>=0; i--){
                auxFraccion = strFraccion.charAt(i) + auxFraccion;
            }
            result = arraResult[0]+"."+auxFraccion;
        }
        return result;
    }
}