package com.example.localtransportationtrackingsystem.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.localtransportationtrackingsystem.Model.Bus;
import com.example.localtransportationtrackingsystem.R;
import com.example.localtransportationtrackingsystem.RouteDetails;

import java.util.ArrayList;
import java.util.List;

public class BusAdapter extends RecyclerView.Adapter<BusAdapter.BusViewHolder> implements Filterable {

    private List<Bus> buses;
    private List<Bus> filteredbuses;
    private Context mcontext;


    public BusAdapter(Context context, List<Bus> buses) {

        this.buses = buses;
        this.filteredbuses= buses;
        mcontext= context;

    }

    @Override
    public BusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View v =inflater.inflate(R.layout.bus_row, parent,false);
        return new BusViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BusViewHolder holder, int position) {
        holder.busIV.setImageResource(filteredbuses.get(position).getBusImage());
        holder.busnameTV.setText(filteredbuses.get(position).getBusName());
        holder.busRouteTV.setText(filteredbuses.get(position).getRoute());
    }

    @Override
    public int getItemCount() {
        return filteredbuses.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String query = charSequence.toString();
                if (query.isEmpty()) {
                    filteredbuses = buses;
                } else {
                    List<Bus> tempList = new ArrayList<>();
                    for (Bus b: buses){
                        if (b.getRoute().toLowerCase().contains(query.toLowerCase())){
                            tempList.add(b);
                        }
                    }
                    filteredbuses = tempList;
                }
                FilterResults results = new FilterResults();
                results.values= filteredbuses;
                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults filterResults) {
                filteredbuses = (List<Bus>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    public class BusViewHolder extends RecyclerView.ViewHolder {

        ImageView busIV;
        TextView busnameTV;
        TextView busRouteTV;
        public BusViewHolder(@NonNull View itemView) {
            super(itemView);

            busIV = itemView.findViewById(R.id.rowImageView);
            busnameTV = itemView.findViewById(R.id.rowBusName);
            busRouteTV = itemView.findViewById(R.id.rowBusRoute);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position= getAdapterPosition();
                    String clickedbus= filteredbuses.get(position).getBusName();
                    Intent intent= new Intent(mcontext, RouteDetails.class);
                    intent.putExtra("rvbusname",clickedbus);
                    mcontext.startActivity(intent);
                }
            });
        }
    }
}
