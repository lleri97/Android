package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    RadioButton primerRadio;
    RadioButton segundoRadio;
    RadioButton tercerRadio;
    RadioButton cuartoRadio;
    RadioGroup grupo;
    CheckBox check;
    TextView titulo;
    TextView cambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       grupo=(RadioGroup) findViewById(R.id.grupito);
       titulo=(TextView) findViewById(R.id.titulo);
       cambio=(TextView) findViewById(R.id.cambio);

       grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
           public void onCheckedChanged(RadioGroup group, int checkedId){

               if(checkedId==R.id.primerRadio){
                   cambio.setText(R.string.opcion1);
               }else if(checkedId==R.id.segundoRadio){

                   cambio.setText(R.string.opcion2);

               }else if(checkedId==R.id.tercerRadio){
                   cambio.setText( R.string.opcion3);
               }
               else if(checkedId == R.id.cuartoRadio){
                   cambio.setText(R.string.opcion4);

               }

           }

       });
       check=(CheckBox) findViewById(R.id.check);
       check.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener(){
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

               if (isChecked){

                   grupo.clearCheck();
                   cambio.setText(R.string.Me_gusta);
               }else{
                   cambio.setText("");

               }
           }



       });
        cambio.setVisibility(View.VISIBLE);

    }





    }

