package xyz.yoandroide.proyectofinalbii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class createAcount extends AppCompatActivity {

    EditText emailETxt,passWordETxt,confPasswordETxt;
    Button createCount;
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_acount);

        emailETxt=findViewById(R.id.email2);
        passWordETxt=findViewById(R.id.passWord2);
        confPasswordETxt=findViewById(R.id.confiPassWord2);
        login=findViewById(R.id.login2);
        createCount=findViewById(R.id.btnRegister3);

        login.setOnClickListener(v -> finish());

        createCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login.setText("REGISTRO DE USUARIO CORRECTO");
            }
        });
    }







}