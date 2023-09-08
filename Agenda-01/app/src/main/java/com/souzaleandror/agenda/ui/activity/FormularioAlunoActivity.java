package com.souzaleandror.agenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.souzaleandror.agenda.R;
import com.souzaleandror.agenda.dao.AlunoDAO;
import com.souzaleandror.agenda.model.Aluno;

import java.io.Serializable;

public class FormularioAlunoActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Novo aluno";
    private EditText campoNome;
    private EditText campoTelefone;
    private EditText campoEmail;
    private final AlunoDAO dao = new AlunoDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(TITULO_APPBAR);
        setContentView(R.layout.activity_formulario_aluno);
        inicializacaoDosCampos();
        ConfiguraBotaoSalvar();

        Intent dados = getIntent();
        Aluno aluno = (Aluno) dados.getSerializableExtra("aluno");
        if(aluno != null) {
            campoNome.setText(aluno.getNome());
            campoTelefone.setText(aluno.getTelefone());
            campoEmail.setText(aluno.getEmail());
        }
    }

    private void ConfiguraBotaoSalvar() {
        Button botaoSalvar = findViewById(R.id.activity_formulario_botao_salvar);
        botaoSalvar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(FormularioAlunoActivity.this, "Click no botao", Toast.LENGTH_SHORT).show();
                        Aluno aluno = criaAluno();
                        Toast.makeText(FormularioAlunoActivity.this, aluno.getNome() + " - " + aluno.getTelefone() + " - " + aluno.getEmail(), Toast.LENGTH_LONG).show();
                        SalvaAluno(aluno);
                    }
                }
        );
    }

    private void SalvaAluno(Aluno aluno) {
        dao.salva(aluno);
        //startActivity(new Intent(FormularioAlunoActivity.this, ListaAlunoActivity.class));
        finish();
    }

    private void inicializacaoDosCampos() {
        campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        campoEmail = findViewById(R.id.activity_formulario_aluno_email);
    }

    @NonNull
    private Aluno criaAluno() {
        String nome = campoNome.getText().toString();
        String telefone = campoTelefone.getText().toString();
        String email = campoEmail.getText().toString();

        Aluno aluno = new Aluno(nome, telefone, email);
        return aluno;
    }
}