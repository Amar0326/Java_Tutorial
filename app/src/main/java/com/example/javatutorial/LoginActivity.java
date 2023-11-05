package com.example.javatutorial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    public static final String SHARED_PERFS = "sharedPrefs";
TextView Naviagtesignup;
EditText Inputemail,Inputpass;
    LinearProgressIndicator progressIndicator;
FirebaseAuth mFirebaseAuth;
AppCompatButton LoginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        checkState();
        mFirebaseAuth = FirebaseAuth.getInstance();
        Naviagtesignup=findViewById(R.id.naviagtesignup);
        Inputemail=findViewById(R.id.inputemail);
        Inputpass=findViewById(R.id.inputpass);
        LoginBtn=findViewById(R.id.loginbtn);

        progressIndicator = findViewById(R.id.progress_bar);
        changeInProgress(false);



        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = Inputemail.getText().toString().trim();
                String password = Inputpass.getText().toString().trim();

                if (email.isEmpty() && password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Fields Are Empty", Toast.LENGTH_SHORT).show();
                }
                else if(email.isEmpty()){
                    Inputemail.setError("Please Enter Email Address");
                    Inputemail.requestFocus();
                }
                else if (password.isEmpty()) {
                    Inputpass.setError("Please Enter Password");
                    Inputpass.requestFocus();
                }
                else if (!(email.isEmpty() && password.isEmpty())) {
                    mFirebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                changeInProgress(true);
                                Toast.makeText(LoginActivity.this, "enter valid credentials", Toast.LENGTH_SHORT).show();
                                changeInProgress(false);

                            }
                            else {
                                changeInProgress(true);

                                startActivity(new Intent(LoginActivity.this,BaseActivity.class));
                                finish();
                                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PERFS,MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("name","true");
                                editor.apply();
                            }
                        }
                    });

                 }
                 else {
                     Toast.makeText(LoginActivity.this, "Something Went Wrong", Toast.LENGTH_SHORT).show();
                 }

            }
        });


        Naviagtesignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this , SignupActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void checkState() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PERFS,MODE_PRIVATE);
        String check = sharedPreferences.getString("name","");
        if (check.equals("true")){
            startActivity(new Intent(LoginActivity.this,BaseActivity.class));
            finish();
        }
    }
    void changeInProgress(boolean show) {
        if (show)
            progressIndicator.setVisibility(View.VISIBLE);
        else
            progressIndicator.setVisibility(View.INVISIBLE);
    }
}