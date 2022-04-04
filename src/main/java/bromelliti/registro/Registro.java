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
public class Registro {
    Vector studenti = new Vector(0);
    Studente studente;
    
    public void nuovoStudente(int matricola, String nome, String sesso, int classe){
        studente = new Studente(matricola, nome, sesso, classe);
        studenti.add(studente);
    }
    
    
    
    public Vector getStudenti(){
        return studenti;
    }
    
}
