package edu.temple.signupform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userName;
    EditText userEmail;
    EditText userPassword;
    EditText userConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.userName);
        userEmail = findViewById(R.id.userEmail);
        userPassword = findViewById(R.id.userPassword);
        userConfirmPassword = findViewById(R.id.userConfirmPassword);

        findViewById(R.id.saveButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userName.getText().toString().isEmpty() || userEmail.getText().toString().isEmpty() || userPassword.getText().toString().isEmpty() || userConfirmPassword.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "You have not filled in all fields", Toast.LENGTH_SHORT).show();
                } else if (!userPassword.getText().toString().equals(userConfirmPassword.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Your passwords do not match", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Welcome, " + userName.getText().toString() + " to the SignUpForm app", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
