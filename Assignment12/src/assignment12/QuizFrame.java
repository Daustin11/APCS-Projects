/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment12;

import java.util.Scanner;

public class QuizFrame extends javax.swing.JFrame {

    public String question;
    public String answer;
    public String response;
    public String a;
    public String b;
    public String c;
    public String d;
    public String first;
    public String second;
    public String third;
    public boolean isFirst = false;
    public boolean isSecond = false;
    public boolean isThird = false;
    public boolean isFourth = false;
    public boolean isFifth = false;
    
    public int i = 0;
    Scanner input = new Scanner(System.in);
    MultipleChoiceQuestion m;
    FillInQuestion f;
    PutInOrderQuestion p;
    int score = 0;
    
    
    public void Start(){
        isFirst = true;
        question = "The _______ River is the Longest River on Earth";
        answer = "Nile";
        f = new FillInQuestion(question, answer);        
    }
    
    public QuizFrame() {
        initComponents();
        Start();
    }
    
    public void upScore(){
        score = score + 1;
        ScoreLabel.setText("Score: "+score+"/5");
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        ScoreLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AnsField = new javax.swing.JTextField();
        QLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ResultLabel = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ScoreLabel.setBackground(new java.awt.Color(0, 0, 0));
        ScoreLabel.setText("Score: 0/5");
        getContentPane().add(ScoreLabel);
        ScoreLabel.setBounds(20, 70, 70, 16);

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel5.setText("Big D's QUiz");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(12, 23, 273, 27);

        AnsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnsFieldActionPerformed(evt);
            }
        });
        getContentPane().add(AnsField);
        AnsField.setBounds(20, 250, 215, 33);

        QLabel.setText("1. The ______ River is the Longest river in the world");
        getContentPane().add(QLabel);
        QLabel.setBounds(22, 108, 426, 25);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 270, 86);
        getContentPane().add(ResultLabel);
        ResultLabel.setBounds(130, 70, 70, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
         
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    private void AnsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnsFieldActionPerformed
        response = AnsField.getText();
        if(isFirst){ //Identifies that we just answered q1 and need to set up q2
            question = "Which of these is not a country"; //Set up Question
            a = "Taiwan";
            b = "Bahrain";
            c = "Puerto Rico";
            d = "San Marino";
            answer = c; //Identifies c as the correct answer
            m = new MultipleChoiceQuestion(question, answer, a,b,c,d); //create MC object
            QLabel.setText(question);
            jTextArea1.setText("a. "+a+"\n"+"b. "+b+"\n"+"c. "+c+"\n"+"d. "+d); //Show mc options
            isFirst = false;
            isSecond = true;
            if(f.evaluateAnswer(response)){ //Checks if response to q1 was right
                upScore();
                ResultLabel.setText("Correct");
            }
            else
                ResultLabel.setText("Incorrect");
        }
        else if (isSecond){  //Identifies that we just answered q2 and need to set up q3
            jTextArea1.setText(""); //Clears mc options
            question = "Put in order of smallest to largest, atom, cell, electron";
            first = "electron";
            second = "atom";
            third = "cell";
            p = new PutInOrderQuestion(question, first, second, third);
            QLabel.setText(question);
            isThird = true; //move on ton next q
            isSecond = false;
           if(m.evaluateAnswer(response)){
            upScore();
            ResultLabel.setText("Correct");
            }
           else
               ResultLabel.setText("Incorrect");
        }
        else if (isThird){
            question = "________ Has the largest Population of any country";
            answer = "China";
            f = new FillInQuestion(question, answer);
            QLabel.setText(question);
            isThird = false;
            isFourth = true;
            if(p.evaluateAnswer(response)){
              upScore();
              ResultLabel.setText("Correct");
            }
            else
                ResultLabel.setText("Incorrect");
        }
        else if (isFourth){
            question = "What does HP stand for";
            a = "Howard Paul";
            b = "Henry Prince";
            c = "Hinkleton Poob";
            d = "Hewlett Packard";
            answer = d;
            m = new MultipleChoiceQuestion(question, answer, a,b,c,d);
            QLabel.setText(question);
            jTextArea1.setText("a. "+a+"\n"+"b. "+b+"\n"+"c. "+c+"\n"+"d. "+d);     
            isFourth  = false;
            isFifth = true;
            if(f.evaluateAnswer(response)){
                upScore();
                ResultLabel.setText("Correct");
            }
            else
                ResultLabel.setText("Incorrect");
        }
        else{
            if(m.evaluateAnswer(response)){
                upScore();
                ResultLabel.setText("Correct");
            }
            else
                ResultLabel.setText("Incorrect");
        }
        AnsField.setText("");
    }//GEN-LAST:event_AnsFieldActionPerformed

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
            java.util.logging.Logger.getLogger(QuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnsField;
    private javax.swing.JLabel QLabel;
    private javax.swing.JLabel ResultLabel;
    private javax.swing.JLabel ScoreLabel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
