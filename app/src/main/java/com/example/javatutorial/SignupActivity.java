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

public class SignupActivity extends AppCompatActivity {
    TextView textView;
    EditText InputE,InputP;
    AppCompatButton Signupbtn;
    FirebaseAuth mFirebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        textView=findViewById(R.id.signuptext);
        mFirebaseAuth = FirebaseAuth.getInstance();
        InputE=findViewById(R.id.inputemail);
        InputP=findViewById(R.id.inputpass);
        Signupbtn=findViewById(R.id.signupbtn);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignupActivity.this,SignupActivity.class));
            }
        });
        Signupbtn.setOnClickListener(new View.OnClickListener() {
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
                    Toast.makeText(SignupActivity.this, "Fields Are Empty", Toast.LENGTH_SHORT).show();
                } else if (!(email.isEmpty() && password.isEmpty())) {
                    mFirebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(SignupActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(SignupActivity.this, "SignUp Unsuccessful", Toast.LENGTH_SHORT).show();

                            }
                            else {
//                                uid =  task.getResult().getUser().getUid();
                                Toast.makeText(SignupActivity.this, "SignUp Successfully", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(SignupActivity.this,MainActivity.class));
                            }
                        }
                    });
                } else {
                    Toast.makeText(SignupActivity.this, "Error Occured", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}