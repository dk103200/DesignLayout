package com.example.designlayout;
import android.app.Activity;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listCourse = (ListView) findViewById(R.id.lvCourse);
        arrayCourse = new ArrayList<Course>();
//        arrayCourse.add(new Course("IOS",5550000,R.drawable.ios));
//        arrayCourse.add(new Course("IOS",5550000,R.drawable.ios));
//        arrayCourse.add(new Course("IOS",5550000,R.drawable.ios));
//        arrayCourse.add(new Course("IOS",5550000,R.drawable.ios));



        arrayCourse.add(new Course("Android",3799000,R.drawable.android));
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
//        ArrayAdapter adapter = new ArrayAdapter(
//                ListActivity.this,
//                android.R.layout.simple_list_item_1,
//                arrayMon
//        );
//        listMon.setAdapter(adapter);
//        listMon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(ListActivity.this, arrayMon.get(position), Toast.LENGTH_SHORT).show();
//            }
//        });


    }
}
