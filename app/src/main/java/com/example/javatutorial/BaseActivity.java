package com.example.javatutorial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class BaseActivity extends AppCompatActivity {
    BottomNavigationView bn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);


        bn=findViewById(R.id.bottomnavigation);

        bn.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();

                if(id==R.id.nav_home){
                    loadfragment(new HomeFragment(),false);
                }
                else if(id==R.id.nav_topic){
                    loadfragment(new TopicFragment(),false);
                }
                else if(id==R.id.nav_code){
                    loadfragment(new CodeFragment(),false);
                }
                else{
                    loadfragment(new ProfileFragment(),false);
                }

                return true;
            }
        });
        bn.setSelectedItemId(R.id.nav_home);
    }
    public void loadfragment(Fragment fg, boolean flag){

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag) {
            ft.add(R.id.container, fg);
        }else{
            ft.replace(R.id.container, fg);
        }
        ft.commit();
    }
}