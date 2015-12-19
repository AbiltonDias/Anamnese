package br.com.anamnese.psicologica.anamnese;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tLogin, tSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin = (Button) findViewById(R.id.btn_Login);

    }

    private void alert(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    public void ClickButton(View view){
        tLogin = (TextView) findViewById(R.id.edtLogin);
        tSenha = (TextView) findViewById(R.id.edtSenha);
        String login = tLogin.getText().toString();
        String senha = tSenha.getText().toString();

        if ("abilton".equals(login) && "1234".equals(senha)) {
            alert("Bem-Vindo, Login realizado com Sucesso.");
        } else {
            alert("Login e Senha não conferem");
        }

        Intent it = new Intent(this, Welcome.class);
        it.putExtra("passando",login);
        startActivity(it);
    }
}

