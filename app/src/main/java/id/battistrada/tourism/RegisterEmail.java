package id.battistrada.tourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class RegisterEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_email);

        //Button Konfirmasi Register
        Button btnconfirmationregister = (Button)findViewById(R.id.btn_konfirmasi_account);
        btnconfirmationregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(RegisterEmail.this, MainActivity.class);
                Toast.makeText(getApplicationContext(), "Selamat Anda Sudah Terdaftar pada aplikasi ini", Toast.LENGTH_LONG).show();
                startActivity(register);
            }
        });

    }
}
