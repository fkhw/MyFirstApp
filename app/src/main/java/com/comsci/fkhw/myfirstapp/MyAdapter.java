package com.comsci.fkhw.myfirstapp;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jom on 23/2/2560.
 */
//Activity นี้สร้างเพื่อทำ Layout เสมือนเพื่อนำไปแสดงผลบนหน้า Main Activity
public class MyAdapter extends BaseAdapter {
    //Explicit
    private Context context;
    private int[] ints;
    private String[] titleStrings, detailStrings;
//กด Alt+Insert เลือก constucture เลือกหมดแล้วกด OK จากนั้นเอาเม้าส์วางไว้หลัง class
    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() { //นับจำนวนข้อมูลว่ามีกี่ข้อมูลแล้วส่งค่าต่อไปยัง method getView
        return ints.length;
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

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //cast to คือการแปลงชนิดตัวแปล
        View view = layoutInflater.inflate(R.layout.my_listview, parent, false);

        //Initial View ผูก ID ของ View กับตัวแปล
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imvIcon);
        TextView  titleTextView = (TextView) view.findViewById(R.id.txtTitleLiv);
        TextView detailTextView = (TextView) view.findViewById(R.id.txtDetailLiv);

        //Show View เอาข้อมูลไปแสดงผลบนหน้า App
        imageView.setImageResource(ints[position]);
        titleTextView.setText(titleStrings[position]);
        detailTextView.setText(detailStrings[position]);


        return view;
    }
} //Main Class
