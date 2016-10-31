package security.cbc.com.appsecurity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class configuracion extends AppCompatActivity {
    Spinner spinnerLocalidades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

        spinnerLocalidades = (Spinner) findViewById(R.id.cbxlocalidades);
        ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( this, R.array.localidades, android.R.layout.simple_spinner_item);
        spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLocalidades.setAdapter(spinner_adapter);

    }

    public void regresaLogin(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
