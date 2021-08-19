package com.ekr.dapurbetawi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ekr.dapurbetawi.GlideHelper;
import com.ekr.dapurbetawi.R;
import com.ekr.dapurbetawi.model.ResepModel;
import com.ekr.dapurbetawi.model.RestoModel;

import java.util.ArrayList;
import java.util.List;

public class RestoAdapter extends RecyclerView.Adapter<RestoAdapter.ViewHolder> implements Filterable {
    private ArrayList<RestoModel> models;
    private List<RestoModel> searchItems;
    private Context context;
    private OnItemClickListener mListener;

    public RestoAdapter(ArrayList<RestoModel> models, Context context) {
        this.models = models;
        this.context = context;
        searchItems = new ArrayList<>(models);
    }
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_resto,parent,false);
        return new ViewHolder(view,mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RestoModel data = models.get(position);
        holder.judul.setText(data.getJudul());
        holder.alamat.setText(data.getAlamat());
        GlideHelper.SetImage(context,data.getImage(),holder.imageView);

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }
    private final Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            ArrayList<RestoModel> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(searchItems);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (RestoModel item : searchItems) {
                    if (item.getJudul().toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            models.clear();
            models.addAll((ArrayList) results.values);
            notifyDataSetChanged();
        }
    };

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private  TextView judul,alamat;
        private  ImageView imageView;
        public ViewHolder(@NonNull View itemView ,final OnItemClickListener listener) {
            super(itemView);
            judul = itemView.findViewById(R.id.rv_judul_resto);
            alamat = itemView.findViewById(R.id.rv_alamat_resto);
            imageView = itemView.findViewById(R.id.rv_img_resto);
            itemView.setOnClickListener(v -> {
                if (listener != null) {
                    int position1 = getAdapterPosition();
                    if (position1 != RecyclerView.NO_POSITION) {
                        listener.onItemClick(position1);
                    }
                }
            });
        }
    }
}
