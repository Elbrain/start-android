package uk.org.websolution.starterpack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nameField;
    private Button submitBtn;
    protected static final String USER_NAME = MainActivity.class.getCanonicalName() + ".userName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        nameField = findViewById(R.id.editTextTextPersonName);
        submitBtn = findViewById(R.id.buttonComplete);
        submitBtn.setOnClickListener(v -> {
            String strName = nameField.getText().toString().trim();
            if (!strName.isEmpty()){
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra(USER_NAME, strName);
                startActivity(intent);
            } else if (strName.isEmpty()){
                Toast.makeText(this, "Please enter the name first",Toast.LENGTH_SHORT).show();
            }
        });
    }
}