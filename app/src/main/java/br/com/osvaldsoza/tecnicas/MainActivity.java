package br.com.osvaldsoza.tecnicas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setTheme(R.style.Theme_Tecnicas);

        setContentView(R.layout.activity_main);

        List<String> graduacoes = new ArrayList<>();
        graduacoes.add("1° Gub");
        graduacoes.add("2° Gub");
        graduacoes.add("3° Gub");
        graduacoes.add("4° Gub");
        graduacoes.add("5° Gub");
        graduacoes.add("6° Gub");
        graduacoes.add("7° Gub");
        graduacoes.add("8° Gub");
        graduacoes.add("9° Gub");
        graduacoes.add("10° Gub");
        graduacoes.add("1° Dan");
        graduacoes.add("2° Dan");
        graduacoes.add("3° Dan");
        graduacoes.add("4° Dan");
        graduacoes.add("5° Dan");
        graduacoes.add("6° Dan");
        graduacoes.add("7° Dan");
        graduacoes.add("8° Dan");
        graduacoes.add("9° Dan");
        graduacoes.add("10° Dan");
        ListView listView = findViewById(R.id.list_item);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,
                graduacoes);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, position, l) -> {
            switch (position) {
                case (0):
                case (1):
                case (2):
                case (3):
                case (4):
                case (5):
                case (6):
                case (7):
                case (8):
                case (9):
                    startActivity(new Intent(MainActivity.this,
                            FaixaBrancaActivity.class));
                    break;
                default:
                    Toast.makeText(getApplicationContext(), "Sem conteúdo no momento",
                            Toast.LENGTH_LONG).show();
                    break;
            }
        });
    }
}