import javax.swing.JOptionPane;

public class Crypto2Crypto extends javax.swing.JFrame {

    public Crypto2Crypto() {
        initComponents();
    }

    double input = 0;
    double result = 0;
    // ****************************Netbeans*************************************
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    public void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        convertFrom = new javax.swing.JComboBox<>();
        convertTo = new javax.swing.JComboBox<>();
        txtFrom = new javax.swing.JTextField();
        convertBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        currencyConverterBTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        crpyto2USDbtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtTo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 11, 22));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(207, 207, 229));
        jLabel1.setText("Crypto Converter");

        convertFrom.setBackground(new java.awt.Color(0, 11, 22));
        convertFrom.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        convertFrom.setForeground(new java.awt.Color(255, 255, 255));
        convertFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bitcoin", "Ethereum", "LiteCoin", "Cardano", "Binance Coin" }));
        convertFrom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        convertTo.setBackground(new java.awt.Color(0, 11, 22));
        convertTo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        convertTo.setForeground(new java.awt.Color(255, 255, 255));
        convertTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bitcoin", "Ethereum", "LiteCoin", "Cardano", "Binance Coin" }));
        convertTo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtFrom.setBackground(new java.awt.Color(0, 11, 22));
        txtFrom.setForeground(new java.awt.Color(255, 255, 255));
        txtFrom.setBorder(null);
        txtFrom.setCaretColor(new java.awt.Color(255, 255, 255));

        convertBtn.setBackground(new java.awt.Color(19, 30, 53));
        convertBtn.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        convertBtn.setForeground(new java.awt.Color(255, 255, 255));
        convertBtn.setText("Convert");
        convertBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        convertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertBtnActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("From:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("To:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Amount to Convert:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Amount Converted:");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(19, 30, 53));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("x");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(19, 30, 53));
        logoutBtn.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        currencyConverterBTN.setBackground(new java.awt.Color(19, 30, 53));
        currencyConverterBTN.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        currencyConverterBTN.setForeground(new java.awt.Color(255, 255, 255));
        currencyConverterBTN.setText("Currency Converter");
        currencyConverterBTN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        currencyConverterBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currencyConverterBTNMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Welcome! \"name\"");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Wallet Balance:");

        crpyto2USDbtn.setBackground(new java.awt.Color(19, 30, 53));
        crpyto2USDbtn.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        crpyto2USDbtn.setForeground(new java.awt.Color(255, 255, 255));
        crpyto2USDbtn.setText("Crypto to USD");
        crpyto2USDbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        crpyto2USDbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crpyto2USDbtnMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" $108.97");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 30, 53)));

        txtTo.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(239, 239, 239))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(currencyConverterBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFrom)
                                    .addComponent(jLabel2)
                                    .addComponent(convertFrom, 0, 150, Short.MAX_VALUE)
                                    .addComponent(jSeparator2)
                                    .addComponent(jLabel4)))
                            .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(convertTo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jSeparator3)
                                    .addComponent(convertBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTo, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(crpyto2USDbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertTo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(currencyConverterBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(crpyto2USDbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(convertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // *************************************************************************
    
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        Login2 jf2 = new Login2();
        jf2.show();
        dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void currencyConverterBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currencyConverterBTNMouseClicked
        CurrencyConverter jf2 = new CurrencyConverter();
        jf2.show();
        dispose();
    }//GEN-LAST:event_currencyConverterBTNMouseClicked

    private void crpyto2USDbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crpyto2USDbtnMouseClicked
        Crypto2Usd jf2 = new Crypto2Usd();
        jf2.show();
        dispose();
    }//GEN-LAST:event_crpyto2USDbtnMouseClicked

    private void convertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertBtnActionPerformed
        input = Double.parseDouble(txtFrom.getText());

        if(evt.getSource()==convertBtn)
        {
            if(convertFrom.getSelectedItem()=="Bitcoin")
            {
                BTCConvert();                
            }
            else if(convertFrom.getSelectedItem()=="Ethereum")
            {
                ETHConvert();
            }
            else if(convertFrom.getSelectedItem()=="LiteCoin")
            {
                LTCConvert();
            }
            else if(convertFrom.getSelectedItem()=="Cardano")
            {
                ADAConvert();
            }
            else
            {
                BNBConvert();
            }
        }
    }//GEN-LAST:event_convertBtnActionPerformed


    //Conversion Stuff
    public void BTCConvert() {
        if(convertTo.getSelectedItem()=="Bitcoin")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Ethereum")
        {
            result = (input * 14.22);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="LiteCoin")
        {
            result = (input * 76.7);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Cardano")
        {
            result = (input * 40067.79);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input * 109.09);
            txtTo.setText(""+result);
        }
    }

    public void ETHConvert() {
        if(convertTo.getSelectedItem()=="Bitcoin")
        {
            result = (input * 0.070);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Ethereum")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="LiteCoin")
        {
            result = (input * 25.34);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Cardano")
        {
            result = (input * 2818);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input * 7.68);
            txtTo.setText(""+result);
        }
    }

    public void LTCConvert() {
        if(convertTo.getSelectedItem()=="Bitcoin")
        {
            result = (input * 0.0028);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Ethereum")
        {
            result = (input * 0.04);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="LiteCoin")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Cardano")
        {
            result = (input * 110.84);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input * 0.301937);
            txtTo.setText(""+result);
        }
    }

    public void ADAConvert() {
        if(convertTo.getSelectedItem()=="Bitcoin")
        {
            result = (input * 0.0000025);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Ethereum")
        {
            result = (input * 0.000355);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="LiteCoin")
        {
            result = (input * 0.301937);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Cardano")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input * 0.002729);
            txtTo.setText(""+result);
        }
    }

    public void BNBConvert() {
        if(convertTo.getSelectedItem()=="Bitcoin")
        {
            result = (input * 0.009162);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Ethereum")
        {
            result = (input * 0.130174);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="LiteCoin")
        {
            result = (input * 3.30966);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Cardano")
        {
            result = (input * 366.194908);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input);
            txtTo.setText(""+result);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crypto2Crypto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertBtn;
    private javax.swing.JComboBox<String> convertFrom;
    private javax.swing.JComboBox<String> convertTo;
    private javax.swing.JButton crpyto2USDbtn;
    private javax.swing.JButton currencyConverterBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JLabel txtTo;
    // End of variables declaration//GEN-END:variables
}
