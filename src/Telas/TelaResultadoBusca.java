/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;
import Fonte.jFrameAddingFont;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Arthur
 */
public class TelaResultadoBusca extends javax.swing.JFrame {
    
    
    Font font = jFrameAddingFont.Adding_font().deriveFont(24f);
    Font font_ID = jFrameAddingFont.Adding_font().deriveFont(36f);
    Font font_Rarity = jFrameAddingFont.Adding_font().deriveFont(28f);
    Font font_name = jFrameAddingFont.Adding_font().deriveFont(56f);
    Font font_type = jFrameAddingFont.Adding_font().deriveFont(30f);
    Font font_info = jFrameAddingFont.Adding_font().deriveFont(26f);
    
    Color hp_colorBar = new Color(82,246,126,1);
    Color atack_colorBar = new Color(225,4,92,1);
    Color defense_colorBar = new Color(38,255,255,1);
    Color speed_colorBar = new Color(255,255,38,1);
    Color total_colorBar = new Color(71,10,162,1);
    
    
    public TelaResultadoBusca(float altura, int ataque, String classificacao, int defesa, int geração, int id,boolean isLegendary ,String nome, float peso, String tipo1, String tipo2, int velocidade, int vida, byte[] img) {
        initComponents();
        
        //Criando o icone da imagem do pokemon e inserindo na label
        ImageIcon icon = new ImageIcon(img);
        Image scaleImagePokemon = icon.getImage().getScaledInstance(230,220,Image.SCALE_DEFAULT);
        
        ImageIcon final_icon = new ImageIcon(scaleImagePokemon);
        PokemonIcon.setIcon(final_icon);
        PokemonIcon.setHorizontalAlignment(SwingConstants.CENTER);
        PokemonIcon.setVerticalAlignment(SwingConstants.CENTER);
        
        //;abel Text para colocar o id do pokemon
        ID.setText("#" + String.valueOf(id));
        ID.setHorizontalAlignment(SwingConstants.CENTER);
        
        //Text para mostrar a raridade do pokemon
        if(isLegendary){
            Rarity.setText("Raridade: Lendário");
        } else{
            Rarity.setText("Raridade: Comum");
        }
        Rarity.setHorizontalAlignment(SwingConstants.CENTER);
        
        //Label Text Nome
        Nome_Pokemon.setText(nome);
        Nome_Pokemon.setHorizontalAlignment(SwingConstants.CENTER);
        
        //Inicializando e chamando a função AssignTypePokemon que indica o tipo do pokemon
//        String tipo1Final = AssignTypePokemon.assignType(tipo1);
//        String tipo2Final = AssignTypePokemon.assignType(tipo2);
        
        //Plotando em label os icons para cada tipo do pokemon
        ImageIcon icon_symbol1 = new ImageIcon("src\\Simbolos_Icon\\"+tipo1+".png");
        Image scaleImageType1 = icon_symbol1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon final_iconSymbol1 = new ImageIcon(scaleImageType1);
        IconSymbol1.setIcon(final_iconSymbol1);
        
        //Label Text para os tipos do pokemon
        tipo1_name.setText(tipo1);
        tipo2_name.setText(tipo2);
        
        if("".equals(tipo2)){
        } else {
            ImageIcon icon_symbol2 = new ImageIcon("src\\Simbolos_Icon\\"+tipo2+".png");
            Image scaleImageType2 = icon_symbol2.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
            ImageIcon final_iconSymbol2 = new ImageIcon(scaleImageType2);
            IconSymbol2.setIcon(final_iconSymbol2);
        }
        
        //Label Text para as infos do pokemon
        Nome_info.setText("NOME: "+nome.toUpperCase());
        altura_info.setText("ALTURA: "+altura/10 + " M");
        peso_info.setText("PESO: " + peso/10 + " KG");
        geracao_info.setText("GERAÇÃO: "+geração + " GEN");
        classificacao_info.setText("CLASSIFICAÇÃO: "+classificacao.toUpperCase());
        
        hp.setHorizontalAlignment(SwingConstants.RIGHT);
        ataque_label.setHorizontalAlignment(SwingConstants.RIGHT);
        defesa_label.setHorizontalAlignment(SwingConstants.RIGHT);
        velocidade_label.setHorizontalAlignment(SwingConstants.RIGHT);
        total.setHorizontalAlignment(SwingConstants.RIGHT);
        
        //Progress bar para atk, def, hp and spd
        int hp_value = (100*vida)/255;
        int ataque_value = (100*ataque)/185;
        int defesa_value = (100*defesa)/230;
        int speed_value = (100*velocidade)/180;
        int total_value = (100*(vida+ataque+defesa+velocidade)/530);
               
        hpBar.setBackground(Color.WHITE);
        hpBar.setForeground(hp_colorBar);
        hpBar.setValue(hp_value);
        
        atackBar.setBackground(Color.WHITE);
        atackBar.setForeground(atack_colorBar);
        atackBar.setValue(ataque_value);
        
        defenseBar.setBackground(Color.WHITE);
        defenseBar.setForeground(defense_colorBar);
        defenseBar.setValue(defesa_value);
        
        speedBar.setBackground(Color.WHITE);
        speedBar.setForeground(speed_colorBar);
        speedBar.setValue(speed_value);
        
        totalBar.setBackground(Color.WHITE);
        totalBar.setForeground(total_colorBar);
        totalBar.setValue(total_value);
        
        //Label Text para atk, def,hp and spd
        
        hpLabelValue.setText(String.valueOf(vida));
        hpLabelValue.setHorizontalAlignment(SwingConstants.CENTER);
        atackLabelValue.setText(String.valueOf(ataque));
        atackLabelValue.setHorizontalAlignment(SwingConstants.CENTER);
        defenseLabelValue.setText(String.valueOf(defesa));
        defenseLabelValue.setHorizontalAlignment(SwingConstants.CENTER);
        SpeedLabelValue.setText(String.valueOf(velocidade));
        SpeedLabelValue.setHorizontalAlignment(SwingConstants.CENTER);
        TotalLabelValue.setText(String.valueOf(vida+ataque+defesa+velocidade));
        TotalLabelValue.setHorizontalAlignment(SwingConstants.CENTER);

        //Parte para as fraquezas do pokemon
        
        if(tipo1.equals("fire") || tipo2.equals("fire")){
            ImageIcon icon_weakness1 = new ImageIcon("src\\Simbolos_Icon\\water.png");
            Image scaleImageweakness1 = icon_weakness1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
            ImageIcon final_iconweakness1 = new ImageIcon(scaleImageweakness1);
            weakness1.setIcon(final_iconweakness1);
            
            ImageIcon icon_weakness2 = new ImageIcon("src\\Simbolos_Icon\\ground.png");
            Image scaleImageweakness2 = icon_weakness2.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
            ImageIcon final_iconweakness2 = new ImageIcon(scaleImageweakness2);
            weakness2.setIcon(final_iconweakness2);
            
            ImageIcon icon_weakness3 = new ImageIcon("src\\Simbolos_Icon\\rock.png");
            Image scaleImageweakness3 = icon_weakness3.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
            ImageIcon final_iconweakness3 = new ImageIcon(scaleImageweakness3);
            weakness3.setIcon(final_iconweakness3);
        }
        
    }

    private TelaResultadoBusca() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PokemonIcon = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ID = new javax.swing.JLabel();
        Rarity = new javax.swing.JLabel();
        Nome_Pokemon = new javax.swing.JLabel();
        Nome_info = new javax.swing.JLabel();
        altura_info = new javax.swing.JLabel();
        geracao_info = new javax.swing.JLabel();
        peso_info = new javax.swing.JLabel();
        IconSymbol1 = new javax.swing.JLabel();
        IconSymbol2 = new javax.swing.JLabel();
        tipo1_name = new javax.swing.JLabel();
        tipo2_name = new javax.swing.JLabel();
        classificacao_info = new javax.swing.JLabel();
        hp = new javax.swing.JLabel();
        ataque_label = new javax.swing.JLabel();
        defesa_label = new javax.swing.JLabel();
        velocidade_label = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        hpBar = new javax.swing.JProgressBar();
        atackBar = new javax.swing.JProgressBar();
        defenseBar = new javax.swing.JProgressBar();
        speedBar = new javax.swing.JProgressBar();
        totalBar = new javax.swing.JProgressBar();
        hpLabelValue = new javax.swing.JLabel();
        atackLabelValue = new javax.swing.JLabel();
        defenseLabelValue = new javax.swing.JLabel();
        SpeedLabelValue = new javax.swing.JLabel();
        TotalLabelValue = new javax.swing.JLabel();
        LabelFraqueza = new javax.swing.JLabel();
        weakness1 = new javax.swing.JLabel();
        weakness2 = new javax.swing.JLabel();
        weakness3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 825));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(PokemonIcon);
        PokemonIcon.setBounds(210, 180, 290, 300);

        jButton1.setBackground(new java.awt.Color(56, 232, 238));
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
        jButton1.setBounds(60, 740, 90, 50);

        ID.setFont(font_ID);
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(ID);
        ID.setBounds(290, 570, 130, 60);

        Rarity.setFont(font_Rarity);
        Rarity.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Rarity);
        Rarity.setBounds(210, 630, 290, 50);

        Nome_Pokemon.setFont(font_name);
        Nome_Pokemon.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Nome_Pokemon);
        Nome_Pokemon.setBounds(790, 50, 400, 90);

        Nome_info.setBackground(new java.awt.Color(255, 255, 255));
        Nome_info.setFont(font_info);
        Nome_info.setToolTipText("");
        Nome_info.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Nome_info);
        Nome_info.setBounds(810, 340, 230, 40);

        altura_info.setFont(font_info);
        getContentPane().add(altura_info);
        altura_info.setBounds(810, 380, 230, 40);

        geracao_info.setFont(font_info);
        getContentPane().add(geracao_info);
        geracao_info.setBounds(810, 420, 230, 40);

        peso_info.setFont(font_info);
        getContentPane().add(peso_info);
        peso_info.setBounds(810, 460, 230, 40);
        getContentPane().add(IconSymbol1);
        IconSymbol1.setBounds(700, 150, 110, 100);
        getContentPane().add(IconSymbol2);
        IconSymbol2.setBounds(1050, 150, 100, 100);

        tipo1_name.setFont(font_type);
        tipo1_name.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tipo1_name);
        tipo1_name.setBounds(840, 180, 140, 40);

        tipo2_name.setFont(font_type);
        tipo2_name.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tipo2_name);
        tipo2_name.setBounds(1190, 180, 140, 40);

        classificacao_info.setFont(font_info);
        classificacao_info.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(classificacao_info);
        classificacao_info.setBounds(810, 260, 560, 40);

        hp.setFont(font_info);
        hp.setText("HP:");
        getContentPane().add(hp);
        hp.setBounds(790, 580, 120, 30);

        ataque_label.setFont(font_info);
        ataque_label.setText("ATAQUE:");
        getContentPane().add(ataque_label);
        ataque_label.setBounds(790, 620, 120, 30);

        defesa_label.setFont(font_info);
        defesa_label.setText("DEFESA:");
        getContentPane().add(defesa_label);
        defesa_label.setBounds(790, 660, 120, 30);

        velocidade_label.setFont(font_info);
        velocidade_label.setText("VELOCIDADE:");
        getContentPane().add(velocidade_label);
        velocidade_label.setBounds(790, 700, 120, 30);

        total.setFont(font_info);
        total.setText("TOTAL:");
        getContentPane().add(total);
        total.setBounds(790, 740, 120, 30);

        hpBar.setBackground(new java.awt.Color(255, 255, 255));
        hpBar.setForeground(new java.awt.Color(102, 255, 102));
        hpBar.setBorderPainted(false);
        getContentPane().add(hpBar);
        hpBar.setBounds(980, 590, 400, 10);

        atackBar.setBackground(new java.awt.Color(255, 255, 255));
        atackBar.setBorder(null);
        getContentPane().add(atackBar);
        atackBar.setBounds(980, 630, 400, 10);

        defenseBar.setBackground(new java.awt.Color(255, 255, 255));
        defenseBar.setBorder(null);
        getContentPane().add(defenseBar);
        defenseBar.setBounds(980, 670, 400, 10);

        speedBar.setBackground(new java.awt.Color(255, 255, 255));
        speedBar.setBorder(null);
        getContentPane().add(speedBar);
        speedBar.setBounds(980, 710, 400, 10);

        totalBar.setBackground(new java.awt.Color(255, 255, 255));
        totalBar.setBorder(null);
        getContentPane().add(totalBar);
        totalBar.setBounds(980, 750, 400, 10);

        hpLabelValue.setFont(font_info);
        getContentPane().add(hpLabelValue);
        hpLabelValue.setBounds(910, 580, 60, 30);

        atackLabelValue.setFont(font_info);
        getContentPane().add(atackLabelValue);
        atackLabelValue.setBounds(910, 620, 60, 30);

        defenseLabelValue.setFont(font_info);
        getContentPane().add(defenseLabelValue);
        defenseLabelValue.setBounds(910, 660, 60, 30);

        SpeedLabelValue.setFont(font_info);
        getContentPane().add(SpeedLabelValue);
        SpeedLabelValue.setBounds(910, 700, 60, 30);

        TotalLabelValue.setFont(font_info);
        getContentPane().add(TotalLabelValue);
        TotalLabelValue.setBounds(910, 740, 60, 30);

        LabelFraqueza.setFont(font_info);
        LabelFraqueza.setText("Fraquezas:");
        getContentPane().add(LabelFraqueza);
        LabelFraqueza.setBounds(1060, 360, 120, 40);
        getContentPane().add(weakness1);
        weakness1.setBounds(1190, 350, 70, 70);
        getContentPane().add(weakness2);
        weakness2.setBounds(1290, 350, 70, 70);
        getContentPane().add(weakness3);
        weakness3.setBounds(1400, 350, 70, 70);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1190, 430, 70, 70);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1290, 430, 70, 70);

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1400, 430, 70, 70);

        Background.setFont(font_ID);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Resultado Busca.png"))); // NOI18N
        Background.setText("Background");
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1600, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TelaBuscaPokemon tbp = new TelaBuscaPokemon();
        tbp.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaResultadoBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaResultadoBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaResultadoBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaResultadoBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaResultadoBusca().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel IconSymbol1;
    private javax.swing.JLabel IconSymbol2;
    private javax.swing.JLabel LabelFraqueza;
    private javax.swing.JLabel Nome_Pokemon;
    private javax.swing.JLabel Nome_info;
    private javax.swing.JLabel PokemonIcon;
    private javax.swing.JLabel Rarity;
    private javax.swing.JLabel SpeedLabelValue;
    private javax.swing.JLabel TotalLabelValue;
    private javax.swing.JLabel altura_info;
    private javax.swing.JProgressBar atackBar;
    private javax.swing.JLabel atackLabelValue;
    private javax.swing.JLabel ataque_label;
    private javax.swing.JLabel classificacao_info;
    private javax.swing.JProgressBar defenseBar;
    private javax.swing.JLabel defenseLabelValue;
    private javax.swing.JLabel defesa_label;
    private javax.swing.JLabel geracao_info;
    private javax.swing.JLabel hp;
    private javax.swing.JProgressBar hpBar;
    private javax.swing.JLabel hpLabelValue;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel peso_info;
    private javax.swing.JProgressBar speedBar;
    private javax.swing.JLabel tipo1_name;
    private javax.swing.JLabel tipo2_name;
    private javax.swing.JLabel total;
    private javax.swing.JProgressBar totalBar;
    private javax.swing.JLabel velocidade_label;
    private javax.swing.JLabel weakness1;
    private javax.swing.JLabel weakness2;
    private javax.swing.JLabel weakness3;
    // End of variables declaration//GEN-END:variables
}
