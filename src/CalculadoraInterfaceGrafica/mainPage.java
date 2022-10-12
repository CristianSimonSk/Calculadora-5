
package CalculadoraInterfaceGrafica;


public class mainPage extends javax.swing.JFrame {
    
    double x, y, result;
    String op;
    String tmp;
    Main Calc = new Main();
    
    public mainPage() {
        initComponents();
    }
    
    private void getInputIns(String aux) {
        tmp = inputText.getText();
        tmp = tmp + aux;
        inputText.setText(tmp);
    }
    
    private void getOperation(String aux) {
        x = Double.parseDouble(inputText.getText());
        op = aux;
        inputText.setText("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        input7 = new javax.swing.JButton();
        inputResult = new javax.swing.JButton();
        input8 = new javax.swing.JButton();
        input0 = new javax.swing.JButton();
        input9 = new javax.swing.JButton();
        inputPoint = new javax.swing.JButton();
        input5 = new javax.swing.JButton();
        inputSom = new javax.swing.JButton();
        inputMult = new javax.swing.JButton();
        input6 = new javax.swing.JButton();
        input4 = new javax.swing.JButton();
        input3 = new javax.swing.JButton();
        input1 = new javax.swing.JButton();
        inputText = new javax.swing.JTextField();
        inputDel = new javax.swing.JButton();
        inputDelPart = new javax.swing.JButton();
        inputDelete = new javax.swing.JButton();
        inputExt = new javax.swing.JButton();
        input2 = new javax.swing.JButton();
        inputDiv = new javax.swing.JButton();
        inputSub = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        input7.setText("7");
        input7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input7ActionPerformed(evt);
            }
        });

        inputResult.setText("=");
        inputResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputResultActionPerformed(evt);
            }
        });

        input8.setText("8");
        input8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input8ActionPerformed(evt);
            }
        });

        input0.setText("0");
        input0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input0ActionPerformed(evt);
            }
        });

        input9.setText("9");
        input9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input9ActionPerformed(evt);
            }
        });

        inputPoint.setText(".");

        input5.setText("5");
        input5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input5ActionPerformed(evt);
            }
        });

        inputSom.setText("+");
        inputSom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSomActionPerformed(evt);
            }
        });

        inputMult.setText("*");
        inputMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMultActionPerformed(evt);
            }
        });

        input6.setText("6");
        input6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input6ActionPerformed(evt);
            }
        });

        input4.setText("4");
        input4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input4ActionPerformed(evt);
            }
        });

        input3.setText("3");
        input3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input3ActionPerformed(evt);
            }
        });

        input1.setText("1");
        input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input1ActionPerformed(evt);
            }
        });

        inputDel.setText("Back");
        inputDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDelActionPerformed(evt);
            }
        });

        inputDelPart.setText("CE");
        inputDelPart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDelPartActionPerformed(evt);
            }
        });

        inputDelete.setText("C");
        inputDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDeleteActionPerformed(evt);
            }
        });

        inputExt.setText("+/-");
        inputExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputExtActionPerformed(evt);
            }
        });

        input2.setText("2");
        input2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input2ActionPerformed(evt);
            }
        });

        inputDiv.setText("/");
        inputDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDivActionPerformed(evt);
            }
        });

        inputSub.setText("-");
        inputSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(input0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inputResult, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(inputSom, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(input3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputSub, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(input4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(input5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(input6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(inputMult, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(input7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(input8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(input9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(inputDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputDel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputDelPart, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(inputExt, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDel)
                    .addComponent(inputDelPart)
                    .addComponent(inputDelete)
                    .addComponent(inputExt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input7)
                    .addComponent(input8)
                    .addComponent(input9)
                    .addComponent(inputDiv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input4)
                    .addComponent(input5)
                    .addComponent(input6)
                    .addComponent(inputMult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input1)
                    .addComponent(input2)
                    .addComponent(input3)
                    .addComponent(inputSub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input0)
                    .addComponent(inputPoint)
                    .addComponent(inputResult)
                    .addComponent(inputSom))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input7ActionPerformed
        getInputIns("7");
    }//GEN-LAST:event_input7ActionPerformed

    private void inputResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputResultActionPerformed
        if(op != ""){
            y = Double.parseDouble(inputText.getText());
            inputText.setText(String.valueOf(Calc.calc(x,op,y)));
        }
    }//GEN-LAST:event_inputResultActionPerformed

    private void input8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input8ActionPerformed
        getInputIns("8");
    }//GEN-LAST:event_input8ActionPerformed

    private void input0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input0ActionPerformed
        getInputIns("0");
    }//GEN-LAST:event_input0ActionPerformed

    private void input9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input9ActionPerformed
        getInputIns("9");
    }//GEN-LAST:event_input9ActionPerformed

    private void input5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input5ActionPerformed
        getInputIns("5");
    }//GEN-LAST:event_input5ActionPerformed

    private void inputSomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSomActionPerformed
        getOperation("+");
    }//GEN-LAST:event_inputSomActionPerformed

    private void inputMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMultActionPerformed
        getOperation("*");
    }//GEN-LAST:event_inputMultActionPerformed

    private void input6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input6ActionPerformed
        getInputIns("6");
    }//GEN-LAST:event_input6ActionPerformed

    private void input4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input4ActionPerformed
        getInputIns("4");
    }//GEN-LAST:event_input4ActionPerformed

    private void input3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input3ActionPerformed
        getInputIns("3");
    }//GEN-LAST:event_input3ActionPerformed

    private void input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input1ActionPerformed
        getInputIns("1");
    }//GEN-LAST:event_input1ActionPerformed

    private void inputDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDelActionPerformed
        if(tmp.isEmpty()){
        }else{
            tmp = tmp.substring(0, tmp.length()-1);           
        }
        inputText.setText(tmp); 
    }//GEN-LAST:event_inputDelActionPerformed

    private void inputDelPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDelPartActionPerformed
        y = 0;
        inputText.setText(String.valueOf(x));
    }//GEN-LAST:event_inputDelPartActionPerformed

    private void inputDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDeleteActionPerformed
        x = 0;
        y = 0;
        op = "";
        inputText.setText("");
    }//GEN-LAST:event_inputDeleteActionPerformed

    private void inputExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputExtActionPerformed
        if(tmp.startsWith("+")){
            tmp = tmp.replace("+","-");
        }else if(tmp.startsWith("-")){
            tmp = tmp.replace("-","+");
        }else{
            tmp = "-" + tmp;
        }
        inputText.setText(tmp);
    }//GEN-LAST:event_inputExtActionPerformed

    private void input2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input2ActionPerformed
        getInputIns("2");
    }//GEN-LAST:event_input2ActionPerformed

    private void inputDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDivActionPerformed
        getOperation("/");
    }//GEN-LAST:event_inputDivActionPerformed

    private void inputSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSubActionPerformed
        getOperation("-");
    }//GEN-LAST:event_inputSubActionPerformed

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
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton input0;
    private javax.swing.JButton input1;
    private javax.swing.JButton input2;
    private javax.swing.JButton input3;
    private javax.swing.JButton input4;
    private javax.swing.JButton input5;
    private javax.swing.JButton input6;
    private javax.swing.JButton input7;
    private javax.swing.JButton input8;
    private javax.swing.JButton input9;
    private javax.swing.JButton inputDel;
    private javax.swing.JButton inputDelPart;
    private javax.swing.JButton inputDelete;
    private javax.swing.JButton inputDiv;
    private javax.swing.JButton inputExt;
    private javax.swing.JButton inputMult;
    private javax.swing.JButton inputPoint;
    private javax.swing.JButton inputResult;
    private javax.swing.JButton inputSom;
    private javax.swing.JButton inputSub;
    private javax.swing.JTextField inputText;
    // End of variables declaration//GEN-END:variables
}
