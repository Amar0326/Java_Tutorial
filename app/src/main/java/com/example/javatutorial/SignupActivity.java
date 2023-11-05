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
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class SignupActivity extends AppCompatActivity {
    public static final String SHARED_PERFS = "sharedPrefs";
 TextView Naviagtelogin;
    TextView Naviagtesignup;
    EditText Inputemail,Inputpass,Inputname,Inputm_no;
    FirebaseAuth mFirebaseAuth;
    LinearProgressIndicator progressIndicator;
    FirebaseFirestore firebaseFirestore;
    AppCompatButton SignupBtn;
    public String userid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        checkState();
        mFirebaseAuth = FirebaseAuth.getInstance();
        firebaseFirestore=FirebaseFirestore.getInstance();
        Naviagtelogin=findViewById(R.id.naviagtelogin);
        Inputemail=findViewById(R.id.inputemail);
        Inputpass=findViewById(R.id.inputpass);
        SignupBtn=findViewById(R.id.signupbtn);
        Inputm_no=findViewById(R.id.inputm_no);
        Inputname=findViewById(R.id.inputname);
        progressIndicator = findViewById(R.id.progress_bar);
        changeInProgress(false);

        SignupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = Inputemail.getText().toString().trim();
                String password = Inputpass.getText().toString().trim();
                String username= Inputname.getText().toString();
                String phone_no = Inputm_no.getText().toString();


                if (email.isEmpty() && password.isEmpty()&&username.isEmpty()&&phone_no.isEmpty()) {
                    Toast.makeText(SignupActivity.this, "Fields Are Empty", Toast.LENGTH_SHORT).show();
                }
                else if(email.isEmpty()){
                    Inputemail.setError("Please Enter Email Address");
                    Inputemail.requestFocus();
                }
                else if (password.isEmpty()) {
                    Inputpass.setError("Please Enter Password");
                    Inputpass.requestFocus();
                }
                else if (!password.isEmpty() && password.length()<6)  {

                    Inputpass.setError("6 Digit Password");
                    Inputpass.requestFocus();
                }
                else if(username.isEmpty()){
                    Inputname.setError("Please Enter username");
                    Inputname.requestFocus();
                }
                else if (phone_no.isEmpty()) {
                    Inputm_no.setError("Please Enter Phone.No");
                    Inputm_no.requestFocus();
                }
                else if (!(email.isEmpty() && password.isEmpty() && username.isEmpty() && phone_no.isEmpty())) {
                    mFirebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful())
                            {
                                Toast.makeText(SignupActivity.this, "enter valid credentials", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                userid =task.getResult().getUser().getUid();
                                firebaseFirestore.collection("User")
                                        .document(FirebaseAuth.getInstance().getUid())
                                        .set(new UserModel (phone_no,username,email))
                                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                changeInProgress(true);
                                                Toast.makeText(SignupActivity.this, "Account Created Succesfully", Toast.LENGTH_SHORT).show();
                                                startActivity(new Intent(SignupActivity.this,BaseActivity.class));
                                                finish();
                                                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PERFS,MODE_PRIVATE);
                                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                                editor.putString("name","true");
                                                editor.apply();
                                            }
                                        }).addOnFailureListener(new OnFailureListener() {
                                            @Override
                                            public void onFailure(@NonNull Exception e) {
                                                changeInProgress(false);
                                                Toast.makeText(SignupActivity.this, "Account Created unsuccesfully", Toast.LENGTH_SHORT).show();
                                            }
                                        });
                            }

                        }
                    });
                }
                else {
                    Toast.makeText(SignupActivity.this, "Something Went Wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });

        Naviagtelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this , LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
    void changeInProgress(boolean show) {
        if (show)
            progressIndicator.setVisibility(View.VISIBLE);
        else
            progressIndicator.setVisibility(View.INVISIBLE);
    }
    private void checkState() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PERFS,MODE_PRIVATE);
        String check = sharedPreferences.getString("name","");
        if (check.equals("true")){
            startActivity(new Intent(SignupActivity.this,BaseActivity.class));
            finish();
        }
    }
}