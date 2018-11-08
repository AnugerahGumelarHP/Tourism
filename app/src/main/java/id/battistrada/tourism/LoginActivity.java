package id.battistrada.tourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // ImageButton
        ImageButton btnGoogle = (ImageButton) findViewById(R.id.btngoogle);
        ImageButton btnFacebook = (ImageButton)findViewById(R.id.btnfacebook);

        // Show toast message when button is clicked
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Integrasi Google", Toast.LENGTH_LONG).show();// Set your own toast  message
            }
        });

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Integrasi Facebook", Toast.LENGTH_LONG).show();// Set your own toast  message
            }
        });

        //Button Register
        Button btnregister = (Button)findViewById(R.id.btn_register);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(LoginActivity.this, RegisterEmail.class);
                startActivity(register);
            }
        });

        //Button Login
        Button btnlogin = (Button)findViewById(R.id.btn_login);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(LoginActivity.this, MainActivity.class);
                Toast.makeText(getApplicationContext(), "Selamat datang di Tourism App", Toast.LENGTH_LONG).show();// Set your own toast  message
                startActivity(login);
            }
        });

    }
}
