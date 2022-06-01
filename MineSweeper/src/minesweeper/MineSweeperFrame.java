/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package minesweeper;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Timer;
import java.awt.Font;
import java.awt.event.MouseEvent;

/**
 *
 * @author Flash
 */
public class MineSweeperFrame extends javax.swing.JFrame implements ActionListener {

    MineSweeperModel se;
    ;
    JButton[][] Sweep;
    int scale;
    int y = 10;
    int x = 10;
    int mines;
    Timer t;
    int k = 1;
    int numclicks = 0;
    int font = 10;
    boolean fg = false;
    int flags;
    int level = 0;
    public boolean timerStarted = false;
    /**
     * Creates new form MineSweeperFrame
     */
    public MineSweeperFrame() {
        initComponents();
    }

    private void initialize() {
        se = new MineSweeperModel(y, x); //create model object
        Sweep = new JButton[y][x]; //set jbutton array size
        SPan.setSize(x * scale, y * scale); //set dimenstions of JPanel
        SPan.setLayout(new GridLayout(y, x)); //set layout
        for (int f = 0; f < y; f++) { //Nested for loop to instantiate each button in array
            for (int s = 0; s < x; s++) {
                Sweep[f][s] = new JButton();
                Sweep[f][s].setBackground(Color.DARK_GRAY);
                Sweep[f][s].setFont(new Font("Consolas", Font.PLAIN, font));;
                Sweep[f][s].addActionListener(this);
                Sweep[f][s].setSize(scale,scale);
                SPan.add(Sweep[f][s]);

            }

            validate();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int f = 0; f < y; f++) { //identify which button is clicked
            for (int s = 0; s < x; s++) {
                if (e.getSource() == Sweep[f][s]) {
                    if (fg && flags > 0) { //if in flag mode flag clicked button
                        Sweep[f][s].setBackground(Color.RED);
                        Sweep[f][s].setText("F");
                        flags--;
                        FlagLabel.setText(String.valueOf(flags));
                    } else {
                        if (se.getValue(f, s) == 10) { //if you click a mine you lose
                            ResultLabel.setText("You Lose, Click Continue to Try gain"); //display loss message
                            for (int r = 0; r < y; r++){
                                for (int c = 0; c < x; c++){
                                    int check = se.getValue(r, c);
                                    if (check == 10){
                                        Sweep[r][c].setBackground(Color.yellow);
                                    }
                                }
                            }
                            
                            
                            t.stop();
                        }
                        if (Sweep[f][s].getText() == "F") { //if you click on a flag you remove the flag
                            flags++; //add back to ramaining flags
                            FlagLabel.setText(String.valueOf(flags));//display remaining flags
                            Sweep[f][s].setBackground(Color.DARK_GRAY); 
                            Sweep[f][s].setText("");
                        }
                        if (numclicks >= 1) { //CHecks if user is on first click
                            se.revealSpaces(f, s); //clear space/spaces
                            for (int i = 0; i < y; i++) { //for loop to check for newly revealed spaces
                                for (int j = 0; j < x; j++) {
                                    if (se.isRevealed(i, j)) { //if a space is revealed in model uncover in frame
                                        int ps = se.getValue(i, j); 
                                        Sweep[i][j].setBackground(Color.gray);
                                        String tempb = Integer.toString(ps);
                                        Sweep[i][j].setText(tempb);
                                    }
                                }
                            }
                        }

                    }
                    if (numclicks < 1) { //instantiate board
                        t.start();
                        se.PlantMines(mines, f, s); //plant mines
                        se.revealSpaces(f, s);
                        for (int i = 0; i < y; i++) { //uncover revealed spaces
                            for (int j = 0; j < x; j++) {
                                if (se.isRevealed(i, j)) {
                                    Sweep[i][j].setBackground(Color.gray);
                                    int p = se.getValue(i, j);
                                    String tempb = Integer.toString(p);
                                    Sweep[i][j].setText(tempb);

                                }

                            }

                        }

                        numclicks++; //add to number of clicks
                    }
                }
            }
        }
        checkWin(); //checks if you have won
    }

    private void clear() { //clears array
        SPan.removeAll();
        numclicks = 0;
    }

    private void easy() { //sets parameters for easy mode
        k = 0;
        x = 10;
        y = 10;
        mines = 10;
        flags = 10;
        scale = 50;
        font = 15;
        clear();
        initialize();
    }

    private void intermediate() { //sets parameters for intermediate mode
        k = 0;
        y = 13;
        x = 15;
        mines = 25;
        scale = 40;
        flags = 30;
        font = 12;
        clear();
        initialize();
    }

    private void hard() { //sets parameters for hard mode
        k = 0;
        x = 30;
        y = 16;
        mines = 40;
        flags = 40;
        scale = 35;
        font = 5;
        clear();
        initialize();
    }

    private void checkWin() { //check wining condition
        int num = 0;
        for (int i = 0; i < y; i++) { //cound num of reveled spots
            for (int j = 0; j < x; j++) {
                if (se.isRevealed(i, j)) {
                    num++;
                }
            }
        }
        int total = x * y; //find total spaces in array
        int open = total - mines; //find totals spots excluding mines
        if (num == open){ //you win if all spaces except mines have been uncovered
            ResultLabel.setText("You Win Click Continue to move to next level");
            level++; //increase level
            t.stop();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        SPan = new javax.swing.JPanel();
        easy = new javax.swing.JRadioButton();
        intermediate = new javax.swing.JRadioButton();
        hard = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FlagLabel = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        FlagToggle = new javax.swing.JToggleButton();
        ContinueBtn = new javax.swing.JButton();
        QuitBtn = new javax.swing.JButton();
        ResultLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        javax.swing.GroupLayout SPanLayout = new javax.swing.GroupLayout(SPan);
        SPan.setLayout(SPanLayout);
        SPanLayout.setHorizontalGroup(
            SPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        SPanLayout.setVerticalGroup(
            SPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        getContentPane().add(SPan);
        SPan.setBounds(50, 150, 590, 460);

        easy.setText("Easy");
        easy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyActionPerformed(evt);
            }
        });
        getContentPane().add(easy);
        easy.setBounds(30, 10, 90, 25);

        intermediate.setText("Intermediate");
        intermediate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intermediateActionPerformed(evt);
            }
        });
        getContentPane().add(intermediate);
        intermediate.setBounds(30, 40, 93, 25);

        hard.setText("Hard");
        hard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardActionPerformed(evt);
            }
        });
        getContentPane().add(hard);
        hard.setBounds(30, 70, 101, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/flag.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 20, 60, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SW.png"))); // NOI18N
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 20, 60, 60);

        FlagLabel.setFont(new java.awt.Font("Consolas", 0, 28)); // NOI18N
        FlagLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FlagLabel.setText("0");
        FlagLabel.setToolTipText("");
        getContentPane().add(FlagLabel);
        FlagLabel.setBounds(240, 30, 50, 50);

        TimeLabel.setFont(new java.awt.Font("Consolas", 0, 28)); // NOI18N
        TimeLabel.setText("0");
        getContentPane().add(TimeLabel);
        TimeLabel.setBounds(410, 30, 60, 50);

        FlagToggle.setText("Flag Mode");
        FlagToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlagToggleActionPerformed(evt);
            }
        });
        getContentPane().add(FlagToggle);
        FlagToggle.setBounds(480, 30, 130, 40);

        ContinueBtn.setText("Continue");
        ContinueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ContinueBtn);
        ContinueBtn.setBounds(640, 20, 90, 25);

        QuitBtn.setText("Quit");
        QuitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(QuitBtn);
        QuitBtn.setBounds(640, 60, 90, 25);

        ResultLabel.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        getContentPane().add(ResultLabel);
        ResultLabel.setBounds(60, 110, 540, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void easyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyActionPerformed
        level = 1;
        easy();
        if (timerStarted == false){
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TimeLabel.setText(String.valueOf(k));
                k++;
            }
        });
        timerStarted = true;   
        }

    }//GEN-LAST:event_easyActionPerformed

    private void intermediateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intermediateActionPerformed
        level = 2;
        intermediate();
        if (timerStarted == false){
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TimeLabel.setText(String.valueOf(k));
                k++;
            }
        });
        timerStarted = true;
        }

    }//GEN-LAST:event_intermediateActionPerformed

    private void hardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardActionPerformed
        level = 3;
        hard();
        if (timerStarted == false){
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TimeLabel.setText(String.valueOf(k));
                k++;
            }
        });
        timerStarted = true;
        }
    }//GEN-LAST:event_hardActionPerformed

    private void FlagToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlagToggleActionPerformed
        if (fg == false)
            fg = true;
        else
            fg = false;
    }//GEN-LAST:event_FlagToggleActionPerformed

    private void ContinueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueBtnActionPerformed
        clear(); //Reset Board
        if (level == 1) {
            easy();
        }
        if (level == 2) {
            intermediate();
        }
        if (level == 3)
            hard();
        else
            ResultLabel.setText("No More Levels");
    }//GEN-LAST:event_ContinueBtnActionPerformed

    private void QuitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_QuitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MineSweeperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MineSweeperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MineSweeperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MineSweeperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MineSweeperFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ContinueBtn;
    private javax.swing.JLabel FlagLabel;
    private javax.swing.JToggleButton FlagToggle;
    private javax.swing.JButton QuitBtn;
    private javax.swing.JLabel ResultLabel;
    private javax.swing.JPanel SPan;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton easy;
    private javax.swing.JRadioButton hard;
    private javax.swing.JRadioButton intermediate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
