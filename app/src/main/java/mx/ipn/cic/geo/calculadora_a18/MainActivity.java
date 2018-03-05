package mx.ipn.cic.geo.calculadora_a18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


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
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = this.findViewById(R.id.txtExpresion);
    }

    @Override
    public void onClick(View v) {
        textView.setText(textView.getText() + ((Button)v).getText().toString());
    }
}