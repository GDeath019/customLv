package com.example.customlistview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends ArrayAdapter<data> {

    public ListAdapter(Context context, int resource, List<data> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view =  inflater.inflate(R.layout.activity_main2, null);
        }
        data p = getItem(position);
        if (p != null) {
            // Anh xa + Gan gia tri
            TextView txt1 = (TextView) view.findViewById(R.id.tv1);
            TextView txt2 = (TextView) view.findViewById(R.id.tv2);
            ImageView img = (ImageView) view.findViewById(R.id.imageView) ;
            String tg = p.getAnh();
            txt1.setText(p.getName());
            txt2.setText(p.getNS());

            Bitmap bitmap = BitmapFactory.decodeFile(tg);
            img.setImageBitmap(bitmap);
        }
        return view;
    }

}
