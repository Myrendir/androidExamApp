package com.nfs.donationApp.beans.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.nfs.donationApp.R;
import com.nfs.donationApp.beans.Tier;

import java.util.List;

public class TierListAdapter extends BaseAdapter {
    private Context context;
    private List<Tier> paliers;

    public TierListAdapter(Context context, List<Tier> paliers) {
        this.context = context;
        this.paliers = paliers;
    }

    @Override
    public int getCount() {
        return paliers.size();
    }

    @Override
    public Object getItem(int position) {
        return paliers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.palier, parent, false);
        }

        Tier palier = (Tier) getItem(position);
        TextView titre = (TextView) convertView.findViewById(R.id.titre);
        TextView description = (TextView) convertView.findViewById(R.id.description);
        TextView price = (TextView) convertView.findViewById(R.id.price);
        TextView date = (TextView) convertView.findViewById(R.id.date);

        titre.setText(palier.getTitle());
        description.setText(palier.getDescription());
        price.setText(palier.getPrice() + " €");
        date.setText(palier.getDateEnvoi().toString());

        return convertView;
    }
}
