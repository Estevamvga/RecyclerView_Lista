package br.edu.edu.appfilmelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

import br.edu.edu.appfilmelist.data.model.Filme;

public class MainActivity extends AppCompatActivity {

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           RecyclerView recyclerView = findViewById(R.id.recycler_filmes);

           RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this);
           recyclerView.setLayoutManager(linearLayoutManager);
           recyclerView.setAdapter(new ListaFilmesAdapter(criaFilmes()));

       }

    private List<Filme> criaFilmes(){
        return Arrays.asList(
                new Filme("Coração de ferro"),
                new Filme("Homem de Ferro"),
                new Filme("Velozes e Furious 1"),
                new Filme("Velozes e Furiosos 2"),
                new Filme("Velozes e Furiosos 3"),
                new Filme("Cães de Aluguel (1992)"),
                new Filme("Rocky, um Lutador (1976)"),
                new Filme("Senhor dos Anéis: O Retorno do Rei"),
                new Filme("Seven - Os Sete Crimes Capitais "),
                new Filme("Batman: O Cavaleiro das Trevas"),
                new Filme("12 Homens e uma Sentença"),
                new Filme("Pulp Fiction: Tempo de Violência"),
                new Filme("Clube da Luta"),
                new Filme("O Poderoso Chefão II"),
                new Filme("Um Estranho no Ninho"),
                new Filme(" Matrix")
        );
    }
}
