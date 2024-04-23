/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ControllerArquivoTextoPiloto;
import Model.Piloto;
import javax.swing.JOptionPane;

/**
 *
 * @author luizg
 */
public class VwPiloto extends javax.swing.JFrame {

    
    int index = 0;
    ControllerArquivoTextoPiloto ctrl = new ControllerArquivoTextoPiloto();
    /**
     * Creates new form VwPiloto
     */
    public VwPiloto() {
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

        jLabelTitle = new javax.swing.JLabel();
        jLabelPiloto = new javax.swing.JLabel();
        jLabelNac = new javax.swing.JLabel();
        jLabelEquipe = new javax.swing.JLabel();
        jLabelNum = new javax.swing.JLabel();
        jLabelPts = new javax.swing.JLabel();
        jTextFieldPiloto = new javax.swing.JTextField();
        jTextFieldNac = new javax.swing.JTextField();
        jTextFieldEquipe = new javax.swing.JTextField();
        jTextFieldNum = new javax.swing.JTextField();
        jTextFieldPts = new javax.swing.JTextField();
        jButtonAbrir = new javax.swing.JButton();
        jButtonAnt = new javax.swing.JButton();
        jButtonProx = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jButtonBusca = new javax.swing.JButton();
        jButtonDel = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Piloto");

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitle.setText("PILOTO");

        jLabelPiloto.setText("Nome do Piloto:");

        jLabelNac.setText("Nacionalidade:");

        jLabelEquipe.setText("Equipe:");

        jLabelNum.setText("Número:");

        jLabelPts.setText("Pontos:");

        jTextFieldPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPilotoActionPerformed(evt);
            }
        });

        jButtonAbrir.setText("Abrir");
        jButtonAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAbrirMouseClicked(evt);
            }
        });
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });

        jButtonAnt.setText("Anterior");
        jButtonAnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAntMouseClicked(evt);
            }
        });

        jButtonProx.setText("Próximo");
        jButtonProx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonProxMouseClicked(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalvarMouseClicked(evt);
            }
        });

        jLabelId.setText("Id:");

        jButtonBusca.setText("Buscar por Id");
        jButtonBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBuscaMouseClicked(evt);
            }
        });

        jButtonDel.setText("Deletar por Id");
        jButtonDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDelMouseClicked(evt);
            }
        });

        jButtonEdit.setText("Editar por Id");
        jButtonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditMouseClicked(evt);
            }
        });
        jButtonEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonEditKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonAbrir)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonAnt)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonProx)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonSalvar))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButtonEdit)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonDel)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonBusca)
                                    .addGap(8, 8, 8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelNac)
                                    .addComponent(jLabelPiloto)
                                    .addComponent(jLabelEquipe)
                                    .addComponent(jLabelNum)
                                    .addComponent(jLabelPts)
                                    .addComponent(jLabelId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldPiloto)
                                    .addComponent(jTextFieldNac)
                                    .addComponent(jTextFieldEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPts, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabelTitle)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPiloto)
                    .addComponent(jTextFieldPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNac)
                    .addComponent(jTextFieldNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEquipe)
                    .addComponent(jTextFieldEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNum)
                    .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPts)
                    .addComponent(jTextFieldPts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonDel)
                    .addComponent(jButtonBusca))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAbrir)
                    .addComponent(jButtonAnt)
                    .addComponent(jButtonProx)
                    .addComponent(jButtonSalvar))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPilotoActionPerformed

    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAbrirActionPerformed

    private void jButtonSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMouseClicked
        // TODO add your handling code here:
        ctrl.setArquivo("Salvar");
        Piloto piloto = new Piloto();
        piloto.setNome(jTextFieldPiloto.getText());
        piloto.setNacionalidade(jTextFieldNac.getText());
        piloto.setEquipe(jTextFieldEquipe.getText());
        piloto.setNumero(Integer.parseInt(jTextFieldNum.getText()));
        piloto.setPontos(Integer.parseInt(jTextFieldPts.getText()));
        ctrl.getPilotos().add(piloto);
        ctrl.escreverPiloto(true);
    }//GEN-LAST:event_jButtonSalvarMouseClicked

    private void jButtonAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAbrirMouseClicked
        // TODO add your handling code here:
        ctrl.setArquivo("Abrir");
        ctrl.lerPiloto();
        index = 0;
        Nav(index);
        System.out.println("index inicializado em: " + index);
    }//GEN-LAST:event_jButtonAbrirMouseClicked

    private void jButtonProxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProxMouseClicked
        // TODO add your handling code here:
        System.out.println("tamanho do array: " + ctrl.getPilotos().size());
        while (this.isActive()) {
            try {
                if (index <= ctrl.getPilotos().size() - 1) {
                    Nav(++index);
                    System.out.println("index atual = " + index);
                    break;
                } else {
                    JOptionPane.showMessageDialog(this, "Não há mais pilotos cadastrados.");
                    break;
                }
            } catch (IndexOutOfBoundsException erro) {
                JOptionPane.showMessageDialog(this, "Ocorreu um erro ao acessar o piloto.");
                break;
            }
        }
    }//GEN-LAST:event_jButtonProxMouseClicked

    private void jButtonAntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAntMouseClicked
        // TODO add your handling code here:
        while (this.isActive()) {
            try {
                if (index >= 0) {
                    Nav(--index);
                    System.out.println("index atual = " + index);
                    break;
                } else {
                    JOptionPane.showMessageDialog(this, "Não há mais pilotos cadastrados.");
                    break;
                }
            } catch (IndexOutOfBoundsException erro) {
                JOptionPane.showMessageDialog(this, "Ocorreu um erro ao acessar o piloto.");
                break;
            }
        }
    }//GEN-LAST:event_jButtonAntMouseClicked

    private void jButtonBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscaMouseClicked
        // TODO add your handling code here:
        int aux = Integer.parseInt(jTextFieldId.getText());
        Buscar(aux);
    }//GEN-LAST:event_jButtonBuscaMouseClicked

    private void jButtonDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDelMouseClicked
        // TODO add your handling code here:
        int aux = Integer.parseInt(jTextFieldId.getText());
        ctrl.deletarPilotoPorId(aux);
        Buscar(aux -1);
        jTextFieldId.setText(String.valueOf(aux-1));
        JOptionPane.showMessageDialog(this, "Piloto deletado do arquivo.");
    }//GEN-LAST:event_jButtonDelMouseClicked

    private void jButtonEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEditKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditKeyPressed

    private void jButtonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditMouseClicked
        // TODO add your handling code here:
        int aux = Integer.parseInt(jTextFieldId.getText());
        boolean er = false;
        Piloto piloto = new Piloto();
        piloto.setNome(jTextFieldPiloto.getText());
        piloto.setNacionalidade(jTextFieldNac.getText());
        piloto.setEquipe(jTextFieldEquipe.getText());
        piloto.setNumero(Integer.parseInt(jTextFieldNum.getText()));
        piloto.setPontos(Integer.parseInt(jTextFieldPts.getText()));
        er = ctrl.editarCircuitoPorId(aux, piloto);
        if (er = true) {
            Buscar(aux);
            JOptionPane.showMessageDialog(this, "Piloto editado.");
        } else {
            JOptionPane.showMessageDialog(this, "Falha ao editar piloto.");
        }
    }//GEN-LAST:event_jButtonEditMouseClicked

    
    public void Nav(int index){
        Piloto piloto = ctrl.getPilotos().get(index);
        jTextFieldPiloto.setText(piloto.getNome());
        jTextFieldNac.setText(piloto.getNacionalidade());
        jTextFieldEquipe.setText(piloto.getEquipe());
        jTextFieldNum.setText(String.valueOf(piloto.getNumero()));
        jTextFieldPts.setText(String.valueOf(piloto.getPontos()));
        jTextFieldId.setText(String.valueOf(piloto.getId()));
    }
    
    public void Buscar(int index) {
        Piloto piloto = ctrl.getPilotoPorId(index);
        jTextFieldPiloto.setText(piloto.getNome());
        jTextFieldNac.setText(piloto.getNacionalidade());
        jTextFieldEquipe.setText(piloto.getEquipe());
        jTextFieldNum.setText(String.valueOf(piloto.getNumero()));
        jTextFieldPts.setText(String.valueOf(piloto.getPontos()));
    }
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
            java.util.logging.Logger.getLogger(VwPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VwPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VwPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VwPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VwPiloto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonAnt;
    private javax.swing.JButton jButtonBusca;
    private javax.swing.JButton jButtonDel;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonProx;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelEquipe;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNac;
    private javax.swing.JLabel jLabelNum;
    private javax.swing.JLabel jLabelPiloto;
    private javax.swing.JLabel jLabelPts;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JTextField jTextFieldEquipe;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNac;
    private javax.swing.JTextField jTextFieldNum;
    private javax.swing.JTextField jTextFieldPiloto;
    private javax.swing.JTextField jTextFieldPts;
    // End of variables declaration//GEN-END:variables
}
