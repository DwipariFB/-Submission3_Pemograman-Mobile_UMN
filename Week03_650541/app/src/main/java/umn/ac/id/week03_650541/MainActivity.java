package umn.ac.id.week03_650541;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.LinkedList;
public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private DaftarKataAdapter mAdapter;

    private final LinkedList<String> mDaftarKata = new
            LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 1; i < 21; i++) {
            mDaftarKata.add("Kata " + i);

            mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
            mAdapter = new DaftarKataAdapter(this, mDaftarKata);
            mRecyclerView.setAdapter(mAdapter);
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        }
    }
}