package br.com.anamnese.psicologica.anamnese;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

public class Welcome extends AppCompatActivity {

    TextView labelName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);



        labelName = (TextView) this.findViewById(R.id.txt_labelName);

        Intent it = getIntent();
        String label = it.getStringExtra("passando");
    }
}
