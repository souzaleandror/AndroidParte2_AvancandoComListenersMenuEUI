package com.souzaleandror.agenda.dao;

import com.souzaleandror.agenda.model.Aluno;

import java.util.ArrayList;

public class AlunoDAO {
    private final static ArrayList<Aluno> alunos = new ArrayList<>();
    public void salva(Aluno aluno) {
        alunos.add(aluno);
    }
    public ArrayList<Aluno> todos() {
        return new ArrayList<>(alunos);
    }
}
