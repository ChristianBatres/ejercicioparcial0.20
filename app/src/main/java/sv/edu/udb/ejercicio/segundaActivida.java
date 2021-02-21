package sv.edu.udb.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;
import android.widget.Toast;

public class segundaActivida extends AppCompatActivity {
    private TextView tvSueldo;
    private TextView tvSueldoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_activida);

        tvSueldo=(TextView)findViewById(R.id.tsueldo);
        tvSueldoa=(TextView)findViewById(R.id.tsueldoa);
        Bundle bundle = getIntent().getExtras();
        String su=bundle.getString("txtsueldo");
        tvSueldoa.setText(su);
        double anios=Double.parseDouble( bundle.getString("txtanios"));
        double sueldo=Double.parseDouble( bundle.getString("txtsueldo"));



        if( sueldo<500 && anios>=10){
            double aumento= Math.round( sueldo*1.12 ) ;
            tvSueldo.setText(String.valueOf(aumento));
        }
        if (sueldo<500 && anios<10){
            double aumento=Math.round(sueldo*1.05);
            tvSueldo.setText(String.valueOf(aumento));
        }
        if(sueldo>=500 ){
          tvSueldo.setText(su);
        }
    }
    public void finalizar(View v) {

        finish();
    }
}