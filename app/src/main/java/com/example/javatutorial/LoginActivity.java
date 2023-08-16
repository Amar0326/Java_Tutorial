package com.example.javatutorial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    TextView textView;
    EditText InputE,InputP;
    AppCompatButton Loginbtn;
    FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textView=findViewById(R.id.text);
        mFirebaseAuth = FirebaseAuth.getInstance();
        InputE=findViewById(R.id.inputemail);
        InputP=findViewById(R.id.inputpass);
        Loginbtn=findViewById(R.id.loginbtn);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,SignupActivity.class));
            }
        });
        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = InputE.getText().toString().trim();
                String password = InputP.getText().toString();

                if (email.isEmpty()){
                    InputE.setError("Please Enter Email Address");
                    InputE.requestFocus();
                } else if (password.isEmpty()) {
                    InputP.setError("Please Enter Password");
                    InputP.requestFocus();
                } else if (email.isEmpty() && password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Fields Are Empty", Toast.LENGTH_SHORT).show();
                } else if (!(email.isEmpty() && password.isEmpty())) {
                    mFirebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(LoginActivity.this, "SignUp Unsuccessful", Toast.LENGTH_SHORT).show();

                            }
                            else {
//                                uid =  task.getResult().getUser().getUid();
                                Toast.makeText(LoginActivity.this, "SignUp Successfully", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(LoginActivity.this,MainActivity.class));
                            }
                        }
                    });
                } else {
                    Toast.makeText(LoginActivity.this, "Error Occured", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}