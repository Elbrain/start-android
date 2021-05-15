package uk.org.websolution.starterpack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView textViewGreeting;
    private EditText editTextSurname;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextPhone;
    private TextView textViewResult;
    private Button buttonResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();
        Intent intent = getIntent();
        if (intent.hasExtra(MainActivity.USER_NAME)){
            textViewGreeting.append(intent.getStringExtra(MainActivity.USER_NAME));
        }
    }

    private void init() {
        textViewGreeting = findViewById(R.id.textViewGreetings);
        editTextSurname = findViewById(R.id.editTextTextPersonSurname);
        editTextEmail = findViewById(R.id.editTextTextPersonEmail);
        editTextPassword = findViewById(R.id.editTextTextPersonPassword);
        editTextPhone = findViewById(R.id.editTextTextPersonPhone);
        textViewResult = findViewById(R.id.textViewResult);
        buttonResult = findViewById(R.id.buttonSubmit);
        buttonResult.setOnClickListener(v -> {
            textViewResult.setText(editTextSurname.getText().toString());
            textViewResult.append("\n");
            textViewResult.append(editTextEmail.getText().toString());
            textViewResult.append("\n");
            textViewResult.append(editTextPassword.getText().toString());
            textViewResult.append("\n");
            textViewResult.append(editTextPhone.getText().toString());
        });
    }
}