package br.edu.edu.appfilmelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.edu.edu.appfilmelist.data.model.Filme;

public class MainActivity extends AppCompatActivity {

    private List<Filme> filmes = new ArrayList<>();

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Adicionar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

           RecyclerView recyclerView = findViewById(R.id.recycler_filmes);
           recyclerView.setLayoutManager(new LinearLayoutManager(this));
           recyclerView.setAdapter(new ListaFilmesAdapter(criaFilmes()));

       }

    private List<Filme> criaFilmes(){
        return Arrays.asList(
                new Filme("",""),
                new Filme("", "")

        );
    }

}
