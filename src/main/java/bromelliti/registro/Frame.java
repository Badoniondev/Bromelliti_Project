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
public class Frame extends javax.swing.JFrame{

    int matricola;
    int classe;
    
    Registro registro = new Registro();
    
    String nome;
    String sesso;
    String var;//variabile ausiliaria usata per i casting
    
    Vector listastudenti;
    
    Studente s; 
    
    public Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnnuovoStudente = new javax.swing.JButton();
        txtfldMatricola = new javax.swing.JTextField();
        txtfldNome = new javax.swing.JTextField();
        txtfldClasse = new javax.swing.JTextField();
        txtfldSesso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaRegistro = new javax.swing.JTextArea();
        btnMostrastudenti = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnAggiungivoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        btnnuovoStudente.setActionCommand("nuovoStudente");
        btnnuovoStudente.setLabel("Nuovo studente");
        btnnuovoStudente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuovoStudenteActionPerformed(evt);
            }
        });

        txtfldMatricola.setText("Matricola");

        txtfldNome.setText("Nome");

        txtfldClasse.setText("Classe");

        txtfldSesso.setText("Sesso");

        areaRegistro.setEditable(false);
        areaRegistro.setColumns(20);
        areaRegistro.setRows(20);
        areaRegistro.setTabSize(4);
        jScrollPane1.setViewportView(areaRegistro);

        btnMostrastudenti.setText("Mostra studenti");
        btnMostrastudenti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrastudentiActionPerformed(evt);
            }
        });

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnAggiungivoto.setText("Aggiungi Voto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtfldMatricola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfldSesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfldClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrastudenti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAggiungivoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnuovoStudente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnC)
                    .addComponent(btnMostrastudenti))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfldMatricola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfldClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfldSesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnAggiungivoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnuovoStudente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuovoStudenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuovoStudenteActionPerformed
        try {
            matricola = Integer.valueOf(txtfldMatricola.getText());
            classe = Integer.valueOf(txtfldClasse.getText());
            nome = txtfldNome.getText();
            sesso = txtfldSesso.getText();
            registro.nuovoStudente(matricola, nome, sesso, classe);
            areaRegistro.append("Nuovo studente aggiunto\n");
        } catch (NumberFormatException numberFormatException) {
            areaRegistro.setText("Errore durante la creazione dello studente.\nControlla che la matricola e la classe siano numeri.\n");
        }
    }//GEN-LAST:event_btnnuovoStudenteActionPerformed

    private void btnMostrastudentiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrastudentiActionPerformed
        
        listastudenti = registro.getStudenti();
        areaRegistro.setText("");
        for (int i = 0; i != listastudenti.size() ; i++) {
            s = (Studente) listastudenti.get(i);
            areaRegistro.append(Integer.toString(i) + "|");
            matricola = s.getMatricola();
            var = Integer.toString(matricola);
            areaRegistro.append(var + "|");
            nome = s.getNome();
            areaRegistro.append(nome + "|");
            sesso = s.getSesso();
            areaRegistro.append(sesso + "|");
            classe = s.getClasse();
            var = Integer.toString(classe);
            areaRegistro.append(var + "\n");
        }
            
    }//GEN-LAST:event_btnMostrastudentiActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        areaRegistro.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaRegistro;
    private javax.swing.JButton btnAggiungivoto;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnMostrastudenti;
    private javax.swing.JButton btnnuovoStudente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtfldClasse;
    private javax.swing.JTextField txtfldMatricola;
    private javax.swing.JTextField txtfldNome;
    private javax.swing.JTextField txtfldSesso;
    // End of variables declaration//GEN-END:variables
}
