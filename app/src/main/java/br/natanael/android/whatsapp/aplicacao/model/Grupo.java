package br.natanael.android.whatsapp.aplicacao.model;

import android.provider.ContactsContract;

import com.google.firebase.database.DatabaseReference;

import java.io.Serializable;
import java.util.List;

import br.natanael.android.whatsapp.aplicacao.config.ConfiguracaoFirebase;
import br.natanael.android.whatsapp.aplicacao.model.usuarios.ModeloDeCadastroDeUsuario;

public class Grupo implements Serializable {
    private String id;
    private String nome;
    private String foto;
    private List<ModeloDeCadastroDeUsuario> membros;

    public Grupo() {
        DatabaseReference database = ConfiguracaoFirebase.getDatabaseReference();
        DatabaseReference grupoRef = database.child("grupos");

        String idGrupoFirebase = grupoRef.push().getKey();
        this.setId(idGrupoFirebase);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public List<ModeloDeCadastroDeUsuario> getMembros() {
        return membros;
    }

    public void setMembros(List<ModeloDeCadastroDeUsuario> membros) {
        this.membros = membros;
    }
}