package umn.ac.id.week03_650541;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class KataViewHolder extends RecyclerView.ViewHolder
        implements View.OnClickListener {
    public final TextView kataItemView;
    final DaftarKataAdapter mAdapter;


    public KataViewHolder(@NonNull View itemView, DaftarKataAdapter adapter) {
        super(itemView);
        kataItemView = itemView.findViewById(R.id.kata);
        this.mAdapter = adapter;
    }

    @Override
    public void onClick(View v) {

    }
}

