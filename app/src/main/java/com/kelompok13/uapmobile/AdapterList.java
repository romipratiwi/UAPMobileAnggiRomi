package com.kelompok13.uapmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.recyclerview.widget.RecyclerView;

import com.kelompok13.uapmobile.R;

import java.util.ArrayList;
import java.util.HashMap;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewHolder> {

    Context context;
    ArrayList<HashMap<String, String>> list_data;

    public AdapterList(Ekbis ekbis, ArrayList<HashMap<String, String>> list_data) {
        this.context = ekbis;
        this.list_data = list_data;
    }

    public AdapterList(BDT_Kebun bdt_kebun, ArrayList<HashMap<String, String>> list_data) {
        this.context = bdt_kebun;
        this.list_data = list_data;
    }

    public AdapterList(BDP_Pangan bdp_pangan, ArrayList<HashMap<String, String>> list_data) {
        this.context = bdp_pangan;
        this.list_data = list_data;
    }

    public AdapterList(Tektan tektan, ArrayList<HashMap<String, String>> list_data) {
        this.context = tektan;
        this.list_data = list_data;
    }

    public AdapterList(Peternakan peternakan, ArrayList<HashMap<String, String>> list_data) {
        this.context = peternakan;
        this.list_data = list_data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_prodi, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txthape.setText(list_data.get(position).get("nm_prodi"));

    }

    @Override
    public int getItemCount() {
        return list_data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CheckBox txthape;

        public ViewHolder(View itemView) {
            super(itemView);


        }
    }
}