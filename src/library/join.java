package library;

import java.awt.Color;
import static javax.swing.JOptionPane.showMessageDialog;


import nl.captcha.Captcha;
import nl.captcha.text.renderer.DefaultWordRenderer;
import nl.captcha.backgrounds.GradiatedBackgroundProducer;
import nl.captcha.noise.CurvedLineNoiseProducer;
import nl.captcha.noise.StraightLineNoiseProducer;

import javax.swing.ImageIcon;

public class join extends javax.swing.JFrame {
    DB_MAN DBM = new DB_MAN();
    private String captchaAnswer;

    public join() {
        initComponents();
        generateCaptcha();
    }

    public boolean GetAdminID(String adminID) {
        try {
            String strSQL = "SELECT * FROM admin WHERE adminId = '" + adminID + "';";
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
            while(DBM.DB_rs.next()) {
                return adminID.equals(DBM.DB_rs.getString("adminId"));
            }
            DBM.DB_rs.close();
            DBM.dbClose();
            } catch(Exception e) {
                System.out.println("SQLException : " + e.getMessage());
                System.out.println("GetBookNumber");
            }
        return false;
    }
    
    private void generateCaptcha() {
        Captcha.Builder builder = new Captcha.Builder(150, 50);
        
        builder.addText();
        builder.addBackground(new GradiatedBackgroundProducer());
        builder.addNoise(new CurvedLineNoiseProducer(Color.BLACK, 2));
        builder.addNoise(new StraightLineNoiseProducer(Color.BLACK, 2));
        
        
        Captcha captcha = builder.build();
        
        ImageIcon icon = new ImageIcon(captcha.getImage());
        captchaLabel.setIcon(icon);
        
        this.captchaAnswer = captcha.getAnswer();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID = new javax.swing.JTextField();
        lblPW1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        lblSignup = new javax.swing.JLabel();
        lblID1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPWCheck = new javax.swing.JLabel();
        txtIDCheck = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnJoin = new javax.swing.JButton();
        btnOverlap = new javax.swing.JButton();
        captchaLabel = new javax.swing.JLabel();
        captchaTxt = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtPasswordCheck = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPW1.setText("PASSWORD");

        title1.setBackground(new java.awt.Color(153, 153, 153));
        title1.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("book management system");
        title1.setOpaque(true);

        lblSignup.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        lblSignup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignup.setText("SIGN UP");

        lblID1.setText("ID");

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/booooook.jpeg"))); // NOI18N
        jLabel2.setOpaque(true);

        txtPWCheck.setText("비밀번호 확인을 위해 한 번 더 입력하세요");

        txtIDCheck.setText("아이디 중복확인을 해주세요");

        btnBack.setText("돌아가기");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnJoin.setText("회원가입");
        btnJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinActionPerformed(evt);
            }
        });

        btnOverlap.setText("중복확인");
        btnOverlap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOverlapActionPerformed(evt);
            }
        });

        captchaLabel.setText("캡챠 이미지 자리");

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

        txtPasswordCheck.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordCheckKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addComponent(lblSignup)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(btnBack)
                            .addGap(18, 18, 18)
                            .addComponent(btnJoin))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblID1)
                                .addComponent(lblPW1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIDCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPWCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(captchaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(captchaTxt))
                                .addComponent(txtPassword)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnOverlap)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txtPasswordCheck))))
                    .addGap(6, 6, 6)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(title1)
                            .addGap(18, 18, 18)
                            .addComponent(lblSignup))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblID1)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOverlap))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtIDCheck)
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPW1)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)
                    .addComponent(txtPasswordCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtPWCheck)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(captchaLabel)
                        .addComponent(captchaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack)
                        .addComponent(btnJoin))
                    .addGap(16, 16, 16)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinActionPerformed
        String adminID = txtID.getText().trim();
        char[] adminPWArray = txtPassword.getPassword();
        char[] adminPWCheckArray = txtPasswordCheck.getPassword();

        String adminPW = new String(adminPWArray).trim();
        String adminPWCheck = new String(adminPWCheckArray).trim();

        if(!adminID.equals("") && !adminPW.equals("") && !adminPWCheck.equals("")) {
            boolean adminIDCheck = GetAdminID(adminID);
            if(!adminIDCheck) {
                txtIDCheck.setText("사용 가능한 아이디입니다.");
                if(adminPW.equals(adminPWCheck)) {
                    try {
                        String enteredCaptcha = captchaTxt.getText().trim();
                        if (!enteredCaptcha.equals(captchaAnswer)) {
                            showMessageDialog(this, "보안문자가 올바르지 않습니다.");
                            generateCaptcha();
                            return;
                        }
                        String strQuery = "INSERT INTO admin ('adminId', 'adminPw') VALUES ('" + adminID + "', '" + adminPW + "');";
                        DBM.dbOpen();
                        DBM.DB_stmt.executeUpdate(strQuery);
                        DBM.dbClose();

                        showMessageDialog(null, "회원가입이 완료되었습니다.");

                        txtID.setText("");
                        txtPassword.setText("");
                        txtPasswordCheck.setText("");
                    } catch(Exception e) {
                        System.out.println("SQLException : " + e.getMessage());
                        System.out.println("btnOverlapActionPerformed");
                    }
                } else {
                    txtPasswordCheck.setText("비밀번호가 일치하지 않습니다.");
                }
            } else {
                txtIDCheck.setText("중복된 아이디입니다.");
            }
        } else {
            showMessageDialog(null, "사용하실 아이디와 비밀번호를 입력하세요.");
        }
    }//GEN-LAST:event_btnJoinActionPerformed

    private void btnOverlapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOverlapActionPerformed
        // 중복확인 버튼
        String adminID = txtID.getText().trim();
        boolean adminIDCheck = GetAdminID(adminID);
    
        if(!adminIDCheck) {
            txtIDCheck.setText("사용 가능한 아이디입니다.");
        } else {
            txtIDCheck.setText("중복된 아이디입니다.");
        }
    }//GEN-LAST:event_btnOverlapActionPerformed

    private void txtPasswordCheckKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordCheckKeyReleased
        // 비밀번호 확인 입력 시 
        char[] adminPWArray = txtPassword.getPassword();
        char[] adminPWCheckArray = txtPasswordCheck.getPassword();

        String adminPW = new String(adminPWArray).trim();
        String adminPWCheck = new String(adminPWCheckArray).trim();

        if(adminPW.equals(adminPWCheck)) {
            txtPWCheck.setText("비밀번호가 일치합니다.");
        } else if(adminPW.equals("") || adminPWCheck.equals("")) {
            txtPWCheck.setText("제대로 입력해주세요.");
        } else {
            txtPWCheck.setText("비밀번호가 일치하지 않습니다.");
        }
    }//GEN-LAST:event_txtPasswordCheckKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased

    }//GEN-LAST:event_txtPasswordKeyReleased

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
            java.util.logging.Logger.getLogger(join.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(join.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(join.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(join.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new join().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnJoin;
    private javax.swing.JButton btnOverlap;
    private javax.swing.JLabel captchaLabel;
    private javax.swing.JTextField captchaTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblPW1;
    private javax.swing.JLabel lblSignup;
    private javax.swing.JLabel title1;
    private javax.swing.JTextField txtID;
    private javax.swing.JLabel txtIDCheck;
    private javax.swing.JLabel txtPWCheck;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordCheck;
    // End of variables declaration//GEN-END:variables
}
