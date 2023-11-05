package com.example.javatutorial;

import static android.content.Context.MODE_PRIVATE;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import org.checkerframework.checker.nullness.qual.NonNull;

public class
ProfileFragment extends Fragment {
    public static final String SHARED_PERFS = "sharedPrefs";
    TextView Logout_Btn,Email,User,Phone,Id;
    FirebaseAuth mAuth;
    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_profile, container, false);
        Email = view.findViewById(R.id.email);
        Phone = view.findViewById(R.id.phone);
        User = view.findViewById(R.id.user);
        Id=view.findViewById(R.id.userid);
        mAuth = FirebaseAuth.getInstance();
        String Uid =  mAuth.getCurrentUser().getUid();

        FirebaseApp.initializeApp(requireContext());
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        CollectionReference citiesRef = db.collection("User");
        DocumentReference df=citiesRef.document(Uid);
        df.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if (documentSnapshot.exists()) {
                    // User document exists, and you can access the data
                    String username = documentSnapshot.getString("username");
                    String email = documentSnapshot.getString("email");
                    String phone = documentSnapshot.getString("phone_no");
                    Email.setText(email);
                    User.setText(username);
                    Phone.setText(phone);
                    Id.setText("ID:"+Uid);
                    // Do something with the user data
//                    Log.d("FirestoreData", "Username: " + username);
//                    Log.d("FirestoreData", "Email: " + email);
                } else {
                    Log.d("FirestoreData", "User document doesn't exist");
                }
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        // Handle errors
                        Log.e("FirestoreData", "Error fetching user data: " + e.getMessage());

                    }
                });



        Logout_Btn = view.findViewById(R.id.logbtn);
        Logout_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();
                SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PERFS,MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("name","");
                editor.apply();
                startActivity(new Intent(getActivity(),LoginActivity.class));
                getActivity().finish();


            }
        });



        return view;

    }
}