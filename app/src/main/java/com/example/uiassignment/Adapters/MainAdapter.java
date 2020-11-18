package com.example.uiassignment.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.uiassignment.R;

public class MainAdapter extends BaseAdapter {


    private Context context;
    private LayoutInflater inflater;
    private int[] imageids;

    public MainAdapter(Context context,int[] imageids)
    {
        this.context = context;
        this.imageids = imageids;
    }

    @Override
    public int getCount() {
        return imageids.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(inflater==null){
            inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(view==null){
            view = inflater.inflate(R.layout.row_item,null);
        }

        ImageView imageView = view.findViewById(R.id.imageview);
        imageView.setImageResource(imageids[i]);

        return view;
    }
}
