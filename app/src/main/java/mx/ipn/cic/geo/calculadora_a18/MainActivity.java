package mx.ipn.cic.geo.calculadora_a18;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;


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
    private ArrayList<String> expression = new ArrayList<String>(){
        @Override
        public String toString() {
            String out = new String();
            for(int i=0; i<this.size(); i++){
                out += this.get( i );
            }
            return out;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = this.findViewById(R.id.txtExpresion);

        if( this.expression.size() == 0 ){
            this.expression.add( "0" );
        }
        textView.setText( this.expression.toString() );
    }


    @Override
    public void onClick(View v) {

        String newValueButton = ((Button)v).getText().toString();

        if( newValueButton.compareTo( this.getResources().getString(R.string.equeal) )==0 ){
            String result = this.getResult();
            this.expression.clear();
            this.expression.add( result );
        }else if( newValueButton.compareTo( this.getResources().getString(R.string.delete) )==0 ){
            String elementRemoved = this.expression.remove( this.expression.size()-1 );

            if( elementRemoved.length()>1 ){
                String str = new String();
                for(int i=0; i<elementRemoved.length()-1; i++){
                    str = str+elementRemoved.charAt(i);
                }
                this.expression.add( str );
            }

            if( this.expression.size()==0 ) {
                this.expression.add( "0" );
            }
        }else{
            if( this.expression.toString().compareTo( this.getResources().getString(R.string.zero) )==0 ) {
                this.expression.clear();
                this.expression.add( newValueButton );
            }else{
                int size = this.expression.size();
                if( size>0 ){
                    String lastElement = this.expression.remove(size-1);
                    if( Result.operators.contains(lastElement)||Result.operators.contains(newValueButton) ){
                        this.expression.add( lastElement );
                        this.expression.add( newValueButton );
                    }else{
                        if( newValueButton.compareTo(".")==0 ){
                            if( lastElement.indexOf(".")==-1 ){
                                this.expression.add(lastElement + newValueButton);
                            }else {
                                this.expression.add(lastElement);
                            }
                        }else {
                            this.expression.add(lastElement + newValueButton);
                        }
                    }
                }else {
                    this.expression.add(newValueButton);
                }
            }
        }
        textView.setText( this.expression.toString() );
    }

    private String getResult(){
        Result.init( this );
        String result = Result.getAnswer( this.expression.toString() );

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
            for (i=i; i>=0; i--){
                auxFraccion = strFraccion.charAt(i) + auxFraccion;
            }
            result = arraResult[0]+"."+auxFraccion;
        }
        return result;
    }
}