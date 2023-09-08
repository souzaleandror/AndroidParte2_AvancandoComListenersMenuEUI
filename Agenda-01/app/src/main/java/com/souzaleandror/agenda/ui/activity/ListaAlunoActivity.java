package com.souzaleandror.agenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.souzaleandror.agenda.R;
import com.souzaleandror.agenda.dao.AlunoDAO;
import com.souzaleandror.agenda.model.Aluno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaAlunoActivity extends AppCompatActivity {

    public static final String LISTA_DE_ALUNOS = "Lista de Alunos";
    private final AlunoDAO dao = new AlunoDAO();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(LISTA_DE_ALUNOS);
        setContentView(R.layout.activity_lista_alunos);
        ConfiguraFabNovoAluno();
        dao.salva(new Aluno("test1", "123123", "test1@gmail.com"));
        dao.salva(new Aluno("test2", "321123", "test2@gmail.com"));

//        AlunoDAO dao = new AlunoDAO();
//
//        List<String> students = new ArrayList<String>(Arrays.asList("Alex", "Fran", "Jose", "Joao", "Maria"));
//        ListView listStudents = findViewById(R.id.activity_lista_alunos_list_view);
//        listStudents.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, dao.todos()));
    }

    private void ConfiguraFabNovoAluno() {
        FloatingActionButton botaoNovoAluno = findViewById(R.id.activity_lista_aluno_fab);

        botaoNovoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreFormularioAlunoActivity();
            }
        });
    }

    private void abreFormularioAlunoActivity() {
        startActivity(new Intent(ListaAlunoActivity.this, FormularioAlunoActivity.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        configuraLista();
    }

    private void configuraLista() {
        ListView listStudents = findViewById(R.id.activity_lista_alunos_list_view);
        final List<Aluno> alunos = dao.todos();
        listStudents.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, dao.todos()));

        listStudents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListaAlunoActivity.this, "Click no botao", Toast.LENGTH_SHORT).show();
                Aluno alunoEscolhido = alunos.get(position);

                Log.i("posicao aluno", "posicao aluno: " + position);
                Log.i("aluno escolhido", "aluno escolhido: " + alunoEscolhido);
                Intent vaiParaFormularioActivity = new Intent(ListaAlunoActivity.this, FormularioAlunoActivity.class);
                vaiParaFormularioActivity.putExtra("aluno", alunoEscolhido);
                startActivity(vaiParaFormularioActivity);
            }
        });
    }
}
