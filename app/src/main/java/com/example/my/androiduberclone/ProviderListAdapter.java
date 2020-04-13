package com.example.my.androiduberclone;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProviderListAdapter extends RecyclerView.Adapter<ProviderListAdapter.ProviderListViewHolder> {

    //constructor
    //the data to be shown on recycler view is in string array
    //so we are passing it to adapter so that it will adapt it and show inside rec view
//new parameter = string array called data


    //inflater class= return view object in response to all the views in the layout file
    private String[] data; //private field holding the data

    public ProviderListAdapter(String[] data)
    {
        this.data = data;
    }


    @NonNull
    @Override
    public ProviderListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.content_register, viewGroup, false);
        return new ProviderListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProviderListViewHolder providerListViewHolder, int i) {
//binding created views with data
        String title = data[i];
        providerListViewHolder.txtTitle.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length; //passing an item count to be shown inside rec view
    }

    public class ProviderListViewHolder extends RecyclerView.ViewHolder{

        ImageView imgIcon;
        TextView txtTitle;
        public ProviderListViewHolder(@NonNull View itemView) {
            super(itemView);
           // imgIcon = (ImageView) itemView.findViewById(R.id.imgIcon);
           // txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
        }
    }
}
