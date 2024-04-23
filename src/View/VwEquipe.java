/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ControllerArquivoTextoEquipe;
import Model.Equipe;
import javax.swing.JOptionPane;

/**
 *
 * @author luizg
 */
public class VwEquipe extends javax.swing.JFrame {

    int index = 0;
    ControllerArquivoTextoEquipe ctrl = new ControllerArquivoTextoEquipe();

    /**
     * Creates new form VwEquipe
     */
    public VwEquipe() {
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
        jLabelNome = new javax.swing.JLabel();
        jLabelChefe = new javax.swing.JLabel();
        jLabelSede = new javax.swing.JLabel();
        jLabelCarro = new javax.swing.JLabel();
        jLabelVit = new javax.swing.JLabel();
        jLabelAno = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldChefe = new javax.swing.JTextField();
        jTextFieldSede = new javax.swing.JTextField();
        jTextFieldAno = new javax.swing.JTextField();
        jTextFieldCarro = new javax.swing.JTextField();
        jTextFieldVit = new javax.swing.JTextField();
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
        setTitle("Equipe");
        setResizable(false);

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitle.setText("EQUIPE");

        jLabelNome.setText("Nome da Equipe:");

        jLabelChefe.setText("Chefe da Equipe:");

        jLabelSede.setText("Sede da Equipe:");

        jLabelCarro.setText("Modelo do Carro:");

        jLabelVit.setText("Total de Vitórias:");

        jLabelAno.setText("Ano de Criação:");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jButtonAbrir.setText("Abrir");
        jButtonAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAbrirMouseClicked(evt);
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
        jButtonProx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProxActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelCarro)
                                    .addComponent(jLabelVit)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelChefe)
                                            .addComponent(jLabelNome)
                                            .addComponent(jLabelSede))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(jLabelAno))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldChefe, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(jTextFieldSede)
                                    .addComponent(jTextFieldCarro)
                                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabelTitle))
                                    .addComponent(jTextFieldNome)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jTextFieldVit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButtonAbrir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAnt)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonProx)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButtonEdit)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDel)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBusca))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabelId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelTitle)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelChefe)
                    .addComponent(jTextFieldChefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSede)
                    .addComponent(jTextFieldSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAno)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCarro)
                    .addComponent(jTextFieldCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVit)
                    .addComponent(jTextFieldVit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonDel)
                    .addComponent(jButtonBusca))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonProx))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAnt)
                            .addComponent(jButtonAbrir))
                        .addGap(30, 30, 30))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProxActionPerformed

    private void jButtonSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMouseClicked
        // TODO add your handling code here:
        ctrl.setArquivo("Salvar");
        Equipe equipe = new Equipe();
        equipe.setNome(jTextFieldNome.getText());
        equipe.setChefe(jTextFieldChefe.getText());
        equipe.setSede(jTextFieldSede.getText());
        equipe.setAno(Integer.parseInt(jTextFieldAno.getText()));
        equipe.setCarro(jTextFieldCarro.getText());
        equipe.setVitorias(Integer.parseInt(jTextFieldVit.getText()));
        ctrl.getEquipes().add(equipe);
        ctrl.escreverEquipe(true);
    }//GEN-LAST:event_jButtonSalvarMouseClicked

    private void jButtonAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAbrirMouseClicked
        // TODO add your handling code here:
        ctrl.setArquivo("Abrir");
        ctrl.lerEquipe();
        index = 0;
        Nav(index);
        System.out.println("index inicializado em: " + index);
    }//GEN-LAST:event_jButtonAbrirMouseClicked

    private void jButtonProxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProxMouseClicked
        // TODO add your handling code here:
        System.out.println("tamanho do array: " + ctrl.getEquipes().size());
        while (this.isActive()) {
            try {
                if (index <= ctrl.getEquipes().size() - 1) {
                    Nav(++index);
                    System.out.println("index atual = " + index);
                    break;
                } else {
                    JOptionPane.showMessageDialog(this, "Não há mais equipes cadastradas.");
                    break;
                }
            } catch (IndexOutOfBoundsException erro) {
                JOptionPane.showMessageDialog(this, "Ocorreu um erro ao acessar a equipe.");
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
                    JOptionPane.showMessageDialog(this, "Não há mais circuitos cadastrados.");
                    break;
                }
            } catch (IndexOutOfBoundsException erro) {
                JOptionPane.showMessageDialog(this, "Ocorreu um erro ao acessar o circuito.");
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
        ctrl.deletarEquipePorId(aux);
        Buscar(aux -1);
        jTextFieldId.setText(String.valueOf(aux-1));
        JOptionPane.showMessageDialog(this, "Equipe deletada do arquivo.");
    }//GEN-LAST:event_jButtonDelMouseClicked

    private void jButtonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditMouseClicked
        // TODO add your handling code here:
        int aux = Integer.parseInt(jTextFieldId.getText());
        boolean er = false;
        Equipe equipe = new Equipe();
        equipe.setNome(jTextFieldNome.getText());
        equipe.setChefe(jTextFieldChefe.getText());
        equipe.setSede(jTextFieldSede.getText());
        equipe.setAno(Integer.parseInt(jTextFieldAno.getText()));
        equipe.setCarro(jTextFieldCarro.getText());
        equipe.setVitorias(Integer.parseInt(jTextFieldVit.getText()));
        er = ctrl.editarEquipePorId(aux, equipe);
        if (er = true) {
            Buscar(aux);
            JOptionPane.showMessageDialog(this, "Equipe editada.");
        } else {
            JOptionPane.showMessageDialog(this, "Falha ao editar equipe");
        }
    }//GEN-LAST:event_jButtonEditMouseClicked

    public void Nav(int index) {
        Equipe equipe = ctrl.getEquipes().get(index);
        jTextFieldNome.setText(equipe.getNome());
        jTextFieldChefe.setText(equipe.getChefe());
        jTextFieldSede.setText(equipe.getSede());
        jTextFieldAno.setText(String.valueOf(equipe.getAno()));
        jTextFieldCarro.setText(equipe.getCarro());
        jTextFieldVit.setText(String.valueOf(equipe.getVitorias()));
        jTextFieldId.setText(String.valueOf(equipe.getId()));
    }
    
    public void Buscar(int index) {
        Equipe equipe = ctrl.getEquipePorId(index);
        jTextFieldNome.setText(equipe.getNome());
        jTextFieldChefe.setText(equipe.getChefe());
        jTextFieldSede.setText(equipe.getSede());
        jTextFieldAno.setText(String.valueOf(equipe.getAno()));
        jTextFieldCarro.setText(equipe.getCarro());
        jTextFieldVit.setText(String.valueOf(equipe.getVitorias()));
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
            java.util.logging.Logger.getLogger(VwEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VwEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VwEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VwEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VwEquipe().setVisible(true);
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
    private javax.swing.JLabel jLabelAno;
    private javax.swing.JLabel jLabelCarro;
    private javax.swing.JLabel jLabelChefe;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSede;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelVit;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldCarro;
    private javax.swing.JTextField jTextFieldChefe;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSede;
    private javax.swing.JTextField jTextFieldVit;
    // End of variables declaration//GEN-END:variables
}
