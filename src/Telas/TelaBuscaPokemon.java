/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Entities.Pokemon;
import Fonte.jFrameAddingFont;
import database.PokemonDAO;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 *
 * @author Arthur
 */
public class TelaBuscaPokemon extends javax.swing.JFrame {
    
    Font font = jFrameAddingFont.Adding_font().deriveFont(34f);
    Font font_option = jFrameAddingFont.Adding_font().deriveFont(16f);
    
    /**
     * Creates new form TelaBuscaPokemon
     */
    
    
    private static class RoundedBorder implements Border {

        private final int radius;


        RoundedBorder(int radius) {
            this.radius = radius;
        }


        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(150, 150, 300, 300);
        }


        @Override
        public boolean isBorderOpaque() {
            return true;
        }


        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawOval(x, y, width-10, height-10);
        }

    }
    public TelaBuscaPokemon() {
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

        panelRound1 = new Swing.PanelRound();
        InputNomeId = new javax.swing.JTextField();
        ComboBoxIdNome = new javax.swing.JComboBox<>();
        BtnBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Imagem_Busca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 825));
        setResizable(false);
        setSize(new java.awt.Dimension(1600, 800));
        getContentPane().setLayout(null);

        panelRound1.setBackground(new java.awt.Color(56, 182, 255));
        panelRound1.setRoundBottomLeft(60);
        panelRound1.setRoundBottomRight(60);
        panelRound1.setRoundTopLeft(60);
        panelRound1.setRoundTopRight(60);

        InputNomeId.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        InputNomeId.setBorder(null);
        InputNomeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNomeIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(InputNomeId, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(InputNomeId, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(panelRound1);
        panelRound1.setBounds(500, 250, 620, 120);

        ComboBoxIdNome.setBackground(new java.awt.Color(204, 255, 255));
        ComboBoxIdNome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ComboBoxIdNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Numero do Pokemon", "Nome" }));
        ComboBoxIdNome.setBorder(null);
        ComboBoxIdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxIdNomeActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxIdNome);
        ComboBoxIdNome.setBounds(680, 430, 240, 40);

        BtnBuscar.setBackground(new java.awt.Color(56, 182, 255));
        BtnBuscar.setFont(font);
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setText("Buscar");
        BtnBuscar.setFocusPainted(false);
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBuscar);
        BtnBuscar.setBounds(680, 520, 240, 70);

        jButton1.setBackground(new java.awt.Color(56, 182, 255));
        jButton1.setFont(font);
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<<");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 690, 120, 60);

        Imagem_Busca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Busca Pokemon.png"))); // NOI18N
        Imagem_Busca.setText("ImagemBuscaPokemon");
        Imagem_Busca.setMaximumSize(new java.awt.Dimension(1600, 800));
        Imagem_Busca.setMinimumSize(new java.awt.Dimension(1600, 800));
        Imagem_Busca.setPreferredSize(new java.awt.Dimension(1600, 800));
        getContentPane().add(Imagem_Busca);
        Imagem_Busca.setBounds(0, 0, 1600, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxIdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxIdNomeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ComboBoxIdNomeActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
        Boolean match = true;
        
        if(ComboBoxIdNome.getSelectedItem().toString().equals("Numero do Pokemon")){
            
            if(InputNomeId.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Digite o ID do pokémon");
            }else{
                Pokemon pokemon = new Pokemon();
                try{
                    pokemon.setId(Integer.parseInt(InputNomeId.getText()));
                }catch(NumberFormatException e){
                    System.out.println(e);
                }
                
                PokemonDAO pDAO = new PokemonDAO();
                pokemon = pDAO.BuscaPokemonPorId(pokemon);
                match = pDAO.ResultadoBuscaId(pokemon);
                
                if(match == true){
                    TelaResultadoBusca telaResBusca = new TelaResultadoBusca(pokemon.getAltura(), pokemon.getAtaque(), pokemon.getClassificacao(), pokemon.getDefesa(), pokemon.getGeração(), pokemon.getId(),pokemon.isIs_legendary(), pokemon.getNome(), pokemon.getPeso(), pokemon.getTipo1(),pokemon.getTipo2(), pokemon.getVelocidade(), pokemon.getVida(), pokemon.getimg());
                    telaResBusca.setVisible(true);
                    this.dispose();
                }
            }
        } else if(ComboBoxIdNome.getSelectedItem().equals("Nome")){
            
            if(InputNomeId.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Digite o nome do pokémon");
            }else {
                Pokemon pokemon = new Pokemon();
                try{
                    pokemon.setNome(InputNomeId.getText());
                }catch(Exception e){
                    System.out.println(e);
                }
                
                PokemonDAO pDAO = new PokemonDAO();
                pokemon = pDAO.BuscaPokemonporNome(pokemon);
                match = pDAO.ResultadoBuscaNome(pokemon);
                
                if(match == true){
                    TelaResultadoBusca telaResBusca = new TelaResultadoBusca(pokemon.getAltura(), pokemon.getAtaque(), pokemon.getClassificacao(), pokemon.getDefesa(), pokemon.getGeração(), pokemon.getId(),pokemon.isIs_legendary(), pokemon.getNome(), pokemon.getPeso(), pokemon.getTipo1(),pokemon.getTipo2(), pokemon.getVelocidade(), pokemon.getVida(), pokemon.getimg());
                    telaResBusca.setVisible(true);
                    this.dispose();
                }
            }
        }
        
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void InputNomeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNomeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputNomeIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TelaMenu tm = new TelaMenu();
        tm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(TelaBuscaPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        }catch(Exception e){
            System.out.println(e);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscaPokemon().setVisible(true);
                
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JComboBox<String> ComboBoxIdNome;
    private javax.swing.JLabel Imagem_Busca;
    private javax.swing.JTextField InputNomeId;
    private javax.swing.JButton jButton1;
    private Swing.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
