package com.example.nestedrecycle;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {
    public ArrayList<DataItem> mDataList;
    Context mContext;

    public static class DataViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public ImageView mImageView;
        public TextView mTextView1;
        ItemClickListener itemClickListener;

        public DataViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.daytxt);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            this.itemClickListener.onItemClickListener(v ,getLayoutPosition());

        }
        public void setItemClickListener(ItemClickListener ic){

            this.itemClickListener = ic;
        }
    }

    public DataAdapter(ArrayList<DataItem> dataList,Context mContext) {
        this.mContext = mContext;
        this.mDataList = dataList;
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chid_rowlayout, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        DataItem currentItem = mDataList.get(position);
        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public Void onItemClickListener(View v, int position) {
                if (mDataList.get(position).getText1().equals("Ms Word")){
                    Intent intent = new Intent(mContext, Word.class);
                    mContext.startActivity(intent);
                }
                if (mDataList.get(position).getText1().equals("Ms Excel")){
                    Intent intent = new Intent(mContext, Excel.class);
                    mContext.startActivity(intent);
                }
                if (mDataList.get(position).getText1().equals("Ms Powerpoint")){
                    Intent intent = new Intent(mContext, Powerpoint.class);
                    mContext.startActivity(intent);
                }
                if (mDataList.get(position).getText1().equals("C Tutorials")){
                    Intent intent = new Intent(mContext, Clanguage.class);
                    mContext.startActivity(intent);
                }
                if (mDataList.get(position).getText1().equals("C++ Tutorials")){
                    Intent intent = new Intent(mContext, Cplus.class);
                    mContext.startActivity(intent);
                }
                if (mDataList.get(position).getText1().equals("Java Tutorials")){
                    Intent intent = new Intent(mContext,Java.class);
                    mContext.startActivity(intent);
                }
                if (mDataList.get(position).getText1().equals("PHP Tutorials")){
                    Intent intent = new Intent(mContext, Php.class);
                    mContext.startActivity(intent);
                }
                if (mDataList.get(position).getText1().equals("Python Tutorials")){
                    Intent intent = new Intent(mContext, Python.class);
                    mContext.startActivity(intent);
                }
                if (mDataList.get(position).getText1().equals("HTML Tutorials")){
                    Intent intent = new Intent(mContext, Html.class);
                    mContext.startActivity(intent);
                }
                if (mDataList.get(position).getText1().equals("CSS Tutorials")){
                    Intent intent = new Intent(mContext, Css.class);
                    mContext.startActivity(intent);
                }
                if (mDataList.get(position).getText1().equals("JavaScript Tutorials")){
                    Intent intent = new Intent(mContext, JavaScript.class);
                    mContext.startActivity(intent);
                }
                if (mDataList.get(position).getText1().equals("JQuery Tutorials")){
                    Intent intent = new Intent(mContext, Jquery.class);
                    mContext.startActivity(intent);
                }
                if (mDataList.get(position).getText1().equals("Bootstrap Tutorials")){
                    Intent intent = new Intent(mContext, Bootstrap.class);
                    mContext.startActivity(intent);
                }
                if (mDataList.get(position).getText1().equals("Android Tutorials")){
                    Intent intent = new Intent(mContext, Android.class);
                    mContext.startActivity(intent);
                }
                if (mDataList.get(position).getText1().equals("SQLite Tutorials")){
                    Intent intent = new Intent(mContext, Sqlite.class);
                    mContext.startActivity(intent);
                }
                if (mDataList.get(position).getText1().equals("Json Tutorials")){
                    Intent intent = new Intent(mContext, Json.class);
                    mContext.startActivity(intent);
                }

                return null;
            }
        });
    }


    @Override
    public int getItemCount() {
        return mDataList.size();
    }
}