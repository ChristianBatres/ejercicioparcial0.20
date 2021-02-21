package sv.edu.udb.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText sueldo;
    private EditText anios;
    double su=0;
    double an=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sueldo=(EditText)findViewById(R.id.txtsueldo);
        anios=(EditText)findViewById(R.id.txtanios);
    }
    public void segundaActividad (View v) {
        String s=sueldo.getText().toString();
        String a=anios.getText().toString();
        su=Double.valueOf(s);
        an=Double.valueOf(a);

        if(su>=100){

            if (an>0) {
                Intent i = new Intent(this, segundaActivida.class);
                i.putExtra("txtsueldo", sueldo.getText().toString());
                i.putExtra("txtanios", anios.getText().toString());
                startActivity(i);
            }
            else{
                Toast notificacion=Toast.makeText(this,"Debe ingresar valores positivos",Toast.LENGTH_LONG);
                notificacion.show();
            }
        }
        else{
            Toast notificacion=Toast.makeText(this,"El salario deber ser mayor o igual a $100",Toast.LENGTH_LONG);
            notificacion.show();

        }
    }
}