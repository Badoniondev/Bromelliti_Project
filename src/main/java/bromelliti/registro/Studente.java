/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bromelliti.registro;

import java.util.Vector;

/**
 *
 * @author 4D
 */
public class Studente {
    int matricola;
    String nome;
    String sesso;
    int classe;
    Vector voti;
    boolean promosso;
    

    public Studente(int matricola, String nome, String sesso, int classe) {
        this.matricola = matricola;
        this.nome = nome;
        this.sesso = sesso;
        this.classe = classe;
        voti = new Vector(0);
    }
    
    public void addVoto(int voto){
        voti.add(voto);
    }
    
    public Vector getVoti(){
        return voti;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }
    
    
    
    
}
