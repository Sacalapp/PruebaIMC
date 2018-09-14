package com.example.prueba.pruebajarvic;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

     double estatura = 0;
     double masa= 0,peso;

     TextView resultado;
     EditText est,mas;
     Button calcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        est = (EditText)findViewById(R.id.txt_masa);
        mas = (EditText)findViewById(R.id.txt_estatura);
        resultado = (TextView) findViewById(R.id.txt_resultado);



        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String valor1=mas.getText().toString();
                String valor2=est.getText().toString();

                estatura = Double.parseDouble(valor2);
                masa = Double.parseDouble(valor1);

                peso= masa*(estatura*estatura);


                if(peso < 18.50){

                    if (peso <16.00){

                      resultado.setText("Delagadez Severa");

                    }else if (peso >= 16.00 || peso <16.99){

                        resultado.setText("Delagadez moderada");

                    }else if (peso >= 17.00 || peso <18.49){

                        resultado.setText("Delagadez leve");

                    }


                }else if (peso > 18.5 || peso <24.99){

                    resultado.setText("Normal");


                }else if (peso >= 25.00){

                    resultado.setText("Preobeso");

                }else if (peso >= 30.00){

                    if (peso >30.00 | peso <34.99 ){

                        resultado.setText("obesidad leve");

                    }else if (peso >= 35.00 || peso <39.99){

                        resultado.setText("Obesidad media");

                    }else if (peso >= 40.00){

                        resultado.setText("Obesidad morbida");

                    }

                }

            }
        });


    }


}
