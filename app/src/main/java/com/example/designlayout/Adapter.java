package com.example.designlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    ArrayList<Course> arrayCourse;

    public Adapter(Context context, int layout, ArrayList<Course> courseList){
        myContext = context;
        myLayout = layout;
        arrayCourse = courseList;
    }

    @Override
    public int getCount() {
        return arrayCourse.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout,null,true);

        TextView txtName = (TextView) convertView.findViewById(R.id.txtName);
        txtName.setText(arrayCourse.get(position).hoTen);

        TextView txtDetail = (TextView) convertView.findViewById(R.id.txtdetail);
        txtDetail.setText(String.valueOf(arrayCourse.get(position).gia));

//        ImageView img = (ImageView) convertView.findViewById(R.id.img);
//        img.setImageResource(arrayCourse.get(position).hinh);

        return convertView;
    }
}
