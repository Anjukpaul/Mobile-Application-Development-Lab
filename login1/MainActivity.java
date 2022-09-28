package com.example.login1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button b;
    String name="appu";
    String ps="3456";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = username.getText().toString();
                String p = password.getText().toString();
                if (s.equals("appu") || p.equals("3456")) {
                    Toast.makeText(getApplicationContext(), "sucess", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "failure", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}