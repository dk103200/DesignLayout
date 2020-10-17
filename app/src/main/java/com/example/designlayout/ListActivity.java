package com.example.designlayout;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import  android.view.View;
import  android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ListView listCourse;
    ArrayList<Course> arrayCourse;
    ImageView home, profile, logout;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listCourse = (ListView) findViewById(R.id.lvCourse);
        arrayCourse = new ArrayList<Course>();



        arrayCourse.add(new Course("IOS",5550000,R.drawable.ios));
        arrayCourse.add(new Course("PHP",2999000,R.drawable.php));
        arrayCourse.add(new Course("Unity",4799000,R.drawable.unity));
        arrayCourse.add(new Course("C/C++",2799000,R.drawable.c));
        arrayCourse.add(new Course("Java",5799000,R.drawable.java));
        arrayCourse.add(new Course("Python",3999000,R.drawable.python));

        Adapter adapter = new Adapter(
                ListActivity.this,
                R.layout.row_course,
                arrayCourse
        );
        listCourse.setAdapter(adapter);
        listCourse.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListActivity.this, arrayCourse.get(position).hoTen, Toast.LENGTH_SHORT).show();
            }
        });


        logout = (ImageView) findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        home = (ImageView) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        profile = (ImageView) findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}
