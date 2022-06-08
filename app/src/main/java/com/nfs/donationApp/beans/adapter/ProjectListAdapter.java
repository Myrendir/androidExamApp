package com.nfs.donationApp.beans.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.nfs.donationApp.R;
import com.nfs.donationApp.beans.Project;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProjectListAdapter extends BaseAdapter {

    private Context context; //context
    private ArrayList<Project> items; //data source of the list adapter

    //public constructor
    public ProjectListAdapter(Context context, ArrayList<Project> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size(); //returns total of items in the list
    }

    @Override
    public Object getItem(int position) {
        return items.get(position); //returns list item at the specified position
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // inflate the layout for each list row
        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.project, parent, false);
        }

        // get current item to be displayed
        Project currentItem = (Project) getItem(position);

        // get the TextView for item name and item description
        TextView textViewItemName = (TextView)
                convertView.findViewById(R.id.TitleTextView);
        TextView textViewItemDescription = (TextView)
                convertView.findViewById(R.id.DescriptionTextView);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        ProgressBar progressBar = (ProgressBar) convertView.findViewById(R.id.progressBar);
        TextView textViewPercentage = (TextView) convertView.findViewById(R.id.percentageTextView);

        Picasso.get().load(currentItem.getImage()).into(imageView);

        textViewItemName.setText(currentItem.getTitle());
        textViewItemDescription.setText(currentItem.getDescription());
        String percentage = currentItem.getPercentage() + "%";
        textViewPercentage.setText(percentage);

        progressBar.setProgress(currentItem.getPercentage());

        return convertView;
    }
}
