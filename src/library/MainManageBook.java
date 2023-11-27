/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

        
public class MainManageBook extends javax.swing.JFrame {
    DB_MAN DBM = new DB_MAN();
    String SQL_SELECT_book = "SELECT * FROM book "; 
    String SQL_SELECT_user = "SELECT * FROM user ";
    String SQL_SELECT_loan = "SELECT * FROM loan ";
    
            
    public MainManageBook() {
        initComponents();
        setTitle("관리자용 도서 관리 시스템 (메인화면)");
        
        try {
            DBM.dbOpen();
            GetBookInfoData_Basic(SQL_SELECT_book);
            GetLoanInfoData_Basic(SQL_SELECT_loan);
            GetUserInfoData_Basic(SQL_SELECT_user);`
            DBM.dbClose();
        } catch(Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        } 
    }
    
    // where절을 만드는 함수
    public String MakeBookSQL_WHERE(String strQuery) {
        switch(cboBookSearch.getSelectedIndex()) { 
            case 0:
                strQuery = SQL_SELECT_book;
                break;
            case 1:
                strQuery += "WHERE bNo = '" + txtSearch.getText() + "'";
                break;
            case 2: 
                strQuery += "WHERE bTitle = '" + txtSearch.getText() + "'";
                break;
            case 3:
                strQuery += "WHERE bAuthor = '" + txtSearch.getText() + "'"; 
                break;
            case 4:
                strQuery += "WHERE bPub = '" + txtSearch.getText() + "'";
                break;
            default:
                strQuery = SQL_SELECT_book;
                break;
        }
        return strQuery;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDiaAdd = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        add_txtTitle = new javax.swing.JTextField();
        add_txtAuthor = new javax.swing.JTextField();
        add_txtPublisher = new javax.swing.JTextField();
        jDiaAdd_btnAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jDiaEdit = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        edit_txtTitle = new javax.swing.JTextField();
        edit_txtAuthor = new javax.swing.JTextField();
        edit_txtPublisher = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        edit_txtBNo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        baseTab = new javax.swing.JTabbedPane();
        tabSearch = new javax.swing.JPanel();
        tabBorrow = new javax.swing.JPanel();
        cboBookSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        btnLoanSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_LoanSearch = new javax.swing.JTable();
        lblID = new javax.swing.JLabel();
        lblBNo = new javax.swing.JLabel();
        btnBorrow = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtBNo = new javax.swing.JTextField();
        tabUser = new javax.swing.JPanel();
        tabBookManagement = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_bookManagement = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstPopular = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstNotPopular = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jDiaAdd.setTitle("도서 추가");

        jLabel1.setText("제목");

        jLabel2.setText("저자");

        jLabel5.setText("출판사");

        jDiaAdd_btnAdd.setText("추가");
        jDiaAdd_btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDiaAdd_btnAddActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel6.setText("도서 추가 ");

        javax.swing.GroupLayout jDiaAddLayout = new javax.swing.GroupLayout(jDiaAdd.getContentPane());
        jDiaAdd.getContentPane().setLayout(jDiaAddLayout);
        jDiaAddLayout.setHorizontalGroup(
            jDiaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDiaAddLayout.createSequentialGroup()
                .addGroup(jDiaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDiaAddLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jDiaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDiaAdd_btnAdd)
                            .addGroup(jDiaAddLayout.createSequentialGroup()
                                .addGroup(jDiaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(28, 28, 28)
                                .addGroup(jDiaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(add_txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add_txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add_txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jDiaAddLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jDiaAddLayout.setVerticalGroup(
            jDiaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDiaAddLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDiaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(add_txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jDiaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(add_txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jDiaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(add_txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jDiaAdd_btnAdd)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jDiaEdit.setTitle("도서 수정");

        jLabel9.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("도서 수정 ");

        jLabel10.setText("제목");

        jLabel11.setText("저자");

        jLabel12.setText("출판사");

        jLabel13.setText("도서 번호");

        jButton2.setText("검색");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("수정");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDiaEditLayout = new javax.swing.GroupLayout(jDiaEdit.getContentPane());
        jDiaEdit.getContentPane().setLayout(jDiaEditLayout);
        jDiaEditLayout.setHorizontalGroup(
            jDiaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDiaEditLayout.createSequentialGroup()
                .addGroup(jDiaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDiaEditLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jDiaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDiaEditLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(28, 28, 28)
                                .addComponent(edit_txtBNo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDiaEditLayout.createSequentialGroup()
                                .addGroup(jDiaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(28, 28, 28)
                                .addGroup(jDiaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(edit_txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edit_txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edit_txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jDiaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton4)))
                    .addGroup(jDiaEditLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jDiaEditLayout.setVerticalGroup(
            jDiaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDiaEditLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDiaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(edit_txtBNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(27, 27, 27)
                .addGroup(jDiaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(edit_txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jDiaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(edit_txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jDiaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(edit_txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setBackground(new java.awt.Color(153, 153, 153));
        title.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("book management system");
        title.setOpaque(true);

        baseTab.setBackground(java.awt.Color.lightGray);
        baseTab.setOpaque(true);

        tabSearch.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout tabSearchLayout = new javax.swing.GroupLayout(tabSearch);
        tabSearch.setLayout(tabSearchLayout);
        tabSearchLayout.setHorizontalGroup(
            tabSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        tabSearchLayout.setVerticalGroup(
            tabSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        baseTab.addTab("도서 검색", tabSearch);

        tabBorrow.setBackground(new java.awt.Color(255, 255, 255));

        cboBookSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "전체", "도서 번호", "제목", "작가", "출판사" }));

        btnLoanSearch.setText("검색");
        btnLoanSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoanSearchActionPerformed(evt);
            }
        });

        table_LoanSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "도서 번호", "제목", "작가", "출판사", "대출 여부"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_LoanSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_LoanSearchMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_LoanSearch);

        lblID.setText("아이디");

        lblBNo.setText("대출도서번호");

        btnBorrow.setText("대출");
        btnBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowActionPerformed(evt);
            }
        });

        btnReturn.setText("반납");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        txtBNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabBorrowLayout = new javax.swing.GroupLayout(tabBorrow);
        tabBorrow.setLayout(tabBorrowLayout);
        tabBorrowLayout.setHorizontalGroup(
            tabBorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabBorrowLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(tabBorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(tabBorrowLayout.createSequentialGroup()
                        .addGroup(tabBorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tabBorrowLayout.createSequentialGroup()
                                .addComponent(cboBookSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabBorrowLayout.createSequentialGroup()
                                .addComponent(lblID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblBNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBNo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(btnBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabBorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLoanSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReturn, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
        );
        tabBorrowLayout.setVerticalGroup(
            tabBorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBorrowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabBorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cboBookSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLoanSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(tabBorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabBorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtID)
                        .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBNo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabBorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBNo)
                        .addComponent(btnBorrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnReturn, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        baseTab.addTab("대출 / 반납", tabBorrow);

        tabUser.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout tabUserLayout = new javax.swing.GroupLayout(tabUser);
        tabUser.setLayout(tabUserLayout);
        tabUserLayout.setHorizontalGroup(
            tabUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        tabUserLayout.setVerticalGroup(
            tabUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        baseTab.addTab("유저 관리", tabUser);

        tabBookManagement.setBackground(new java.awt.Color(255, 255, 255));

        btnAdd.setText("추가");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("수정");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jButton6.setText("삭제");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        table_bookManagement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "도서 번호", "제목", "작가", "출판사", "대출 여부"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_bookManagement);

        jScrollPane3.setViewportView(lstPopular);

        jScrollPane4.setViewportView(lstNotPopular);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("인기도서 TOP5");

        jLabel4.setText("비인기도서 TOP5");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("(재주문 후보)");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("(폐기 후보)");

        javax.swing.GroupLayout tabBookManagementLayout = new javax.swing.GroupLayout(tabBookManagement);
        tabBookManagement.setLayout(tabBookManagementLayout);
        tabBookManagementLayout.setHorizontalGroup(
            tabBookManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabBookManagementLayout.createSequentialGroup()
                .addGroup(tabBookManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabBookManagementLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabBookManagementLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(tabBookManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(tabBookManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
            .addGroup(tabBookManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabBookManagementLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jScrollPane2)
                    .addGap(16, 16, 16)))
        );
        tabBookManagementLayout.setVerticalGroup(
            tabBookManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabBookManagementLayout.createSequentialGroup()
                .addGroup(tabBookManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabBookManagementLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tabBookManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(tabBookManagementLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(tabBookManagementLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                .addGroup(tabBookManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(tabBookManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabBookManagementLayout.createSequentialGroup()
                    .addGap(116, 116, 116)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(63, Short.MAX_VALUE)))
        );

        baseTab.addTab("도서 관리", tabBookManagement);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseTab, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(baseTab))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBNoActionPerformed

    private void btnBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowActionPerformed
        // "대출/반납" 탭 : 대출 버튼

        // 아이디와 도서 번호 입력
        String userID = txtID.getText().trim();
        String bookNum = txtBNo.getText().trim();

        // 대출 가능 여부 검사 (아이디 있는지, 도서넘버 있는지, 연체 됐는지, 남이 빌렸는지)
        boolean userIDCheck = GetUser(userID);
        boolean bNoCheck = GetBookNumber(bookNum);
        boolean userIDOdueCheck = GetUserOdue(userID);
        boolean availableCheck = GetBookLoan(bookNum);

        if(!userID.equals("") && !bookNum.equals("")) {
            if(userIDCheck && bNoCheck) {
                if(availableCheck && userIDOdueCheck) {
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(new Date());
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    java.sql.Date SQLlDate = java.sql.Date.valueOf(df.format(cal.getTime()));
                    cal.add(Calendar.DATE, 14);
                    java.sql.Date SQLlRDate = java.sql.Date.valueOf(df.format(cal.getTime()));

                    // 대출 정보 입력
                    String strSQL = "INSERT INTO loan ('bNo', 'userID', 'loanDate', 'returnDate', 'overdue') VALUES (";
                    strSQL += "'" + bookNum + "', '" + userID + "', '" + SQLlDate + "', '" + SQLlRDate + "', '0');";
                    SQL_UPDATE_loan(strSQL);

                    strSQL = "UPDATE book SET available = '0' WHERE bNo = '" + bookNum + "';";
                    SQL_UPDATE_book(strSQL);

                    txtID.setText("");
                    txtBNo.setText("");
                    showMessageDialog(null, "대출이 완료되었습니다.");
                } else if(!availableCheck) {
                    showMessageDialog(null, "해당 도서가 대출 중입니다.");
                } else {
                    showMessageDialog(null, "연체된 유저입니다. \n 대출이 불가능합니다.");
                }
            } else if(!userIDCheck) {
                showMessageDialog(null, "입력한 유저가 존재하지 않습니다.");
            } else {
                showMessageDialog(null, "입력한 도서가 존재하지 않습니다.");
            }
        } else {
            showMessageDialog(null, "입력을 완료해주십시오.");
        }
    }//GEN-LAST:event_btnBorrowActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        jDiaAdd.setSize(550, 400);
        jDiaAdd.show();
    }//GEN-LAST:event_btnAddActionPerformed

    private void jDiaAdd_btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDiaAdd_btnAddActionPerformed
        // 도서 관리 > 추가 버튼 > 정보 입력 다이얼로그 속 추가 버튼
        String strSQL = "INSERT INTO book ('bNo', 'bTitle', 'bAuthor', 'bPub', 'availavle', 'loanCount') VALUES (";
        String txtTitle = add_txtTitle.getText();
        String txtAuthor = add_txtAuthor.getText();
        String txtPublisher = add_txtPublisher.getText();
        
        if(txtTitle != null && txtAuthor != null && txtPublisher != null &&
                !txtTitle.equals("") && !txtAuthor.equals("") && !txtPublisher.equals("")) {
            String bNum = SetBookNumber();
            strSQL += "'" + bNum + "',";
            strSQL += "'" + txtTitle + "',";
            strSQL += "'" + txtAuthor + "',";
            strSQL += "'" + txtPublisher + "',";
            strSQL += "'1');"; 
            strSQL += "'0');"; // 빌린 횟수 추가
            SQL_UPDATE_book(strSQL);
            
            add_txtTitle.setText(""); 
            add_txtAuthor.setText(""); 
            add_txtPublisher.setText(""); 
            showMessageDialog(null, "추가가 완료되었습니다.");
        } else {
            showMessageDialog(null, "입력을 완료하고 추가하십시오."); 
        } 
    }//GEN-LAST:event_jDiaAdd_btnAddActionPerformed

    private void btnLoanSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoanSearchActionPerformed
        boolean lUidCheck;
        boolean bNoCheck; 
        String loanSearch = txtLoanSearch.getText().trim(); 
        if(!loanSearch.equals("")) { 
            switch(cboLoanSearch.getSelectedIndex()) { 
                case 0: 
                    String strQuery = SQL_SELECT_loan; 
                    GetLoanInfoData_Serach(strQuery); 
                    break;
                case 1: 
                    bNoCheck = GetBookNumber(loanSearch); 
                    if(bNoCheck) { 
                        strQuery = SQL_SELECT_loan + "WHERE bNo = '" + loanSearch + "';"; 
                        GetLoanInfoData_Serach(strQuery); 
                    } else { 
                        showMessageDialog(null, "검색한 도서가 존재하지 않습니다.");
                    }
                    break; 
                case 2: 
                    lUidCheck = GetUser(loanSearch);
                    if(lUidCheck) { 
                        strQuery = SQL_SELECT_loan + "WHERE userID = '" + loanSearch + "';"; 
                        GetLoanInfoData_Serach(strQuery); 
                    } else {
                        showMessageDialog(null, "검색한 아이디가 존재하지 않습니다.");
                    }
                    break; 
                default: 
                    break; 
                } 
            } else { 
                showMessageDialog(null, "입력을 완료해주십시오.");    
            }
    }//GEN-LAST:event_btnLoanSearchActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        jDiaEdit.setSize(550, 400);
        jDiaEdit.show();
    }//GEN-LAST:event_btnEditActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // 반납 버튼
        String userID = txtID.getText().trim(); 
        String bookNum = txtBNo.getText().trim(); 
        boolean userIOdueCheck = GetUserOdue(userID);
        boolean bLoanCheck = GetBookLoan(bookNum);
        boolean loanCurrectCheck = GetLoanCurrect(bookNum, userID);
        
        if(!userID.equals("") && !bookNum.equals("")) { 
            if(!bLoanCheck && loanCurrectCheck) {
                String strSQL = "DELETE FROM loan_db WHERE bNo = '" + bookNum + "'AND userID = '" + userID + "';";
                SQL_UPDATE_loan(strSQL);
                
                strSQL = "UPDATE book SET available = '1' WHERE bNo = '" + bookNum + "';";
                SQL_UPDATE_book(strSQL);
                txtID.setText("");
            }
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void table_LoanSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_LoanSearchMouseClicked
        // 대출/반납 : 테이블 클릭서 선택됨
        int iCntRow;
        String iCntRow_bNo;
        String iCntRow_userID;
        iCntRow = table_LoanSearch.getSelectedRow();
        iCntRow_bNo = table_LoanSearch.getValueAt(iCntRow, 0).toString();
        iCntRow_userID = table_LoanSearch.getValueAt(iCntRow, 1).toString();
        txtID.setText(iCntRow_userID);
        txtBNo.setText(iCntRow_bNo);
    }//GEN-LAST:event_table_LoanSearchMouseClicked
    
    public void GetBookInfoData_Basic(String strQuery) {
        String strSQL = "SELECT COUNT(bNO) as count FROM book;"; 
        int iCntRow = 0; 
        try { 
            DefaultTableModel bookInfoSearch = (DefaultTableModel)table_bookSearch.getModel();
            DefaultTableModel bookInfoModelManagement = (DefaultTableModel)table_bookManagement.getModel(); 
            ResultSet DB_CntRow = DBM.DB_stmt.executeQuery(strSQL);
            while(DB_CntRow.next()) { 
                int CntRow = DB_CntRow.getInt("count");
                bookInfoSearch.setNumRows(CntRow++);
                bookInfoModelManagement.setRowCount(CntRow);
            }
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery); 
            while(DBM.DB_rs.next()) { 
                table_bookSearch.setValueAt(DBM.DB_rs.getString("bNo"), iCntRow, 0);
                table_bookManagement.setValueAt(DBM.DB_rs.getString("bNo"), iCntRow, 0);
                table_bookSearch.setValueAt(DBM.DB_rs.getString("bTitle"), iCntRow, 1); 
                table_bookManagement.setValueAt(DBM.DB_rs.getString("bTitle"), iCntRow, 1); 
                table_bookSearch.setValueAt(DBM.DB_rs.getString("bAuthor"), iCntRow, 2);
                table_bookManagement.setValueAt(DBM.DB_rs.getString("bAuthor"), iCntRow, 2);
                table_bookSearch.setValueAt(DBM.DB_rs.getString("bPub"), iCntRow, 3);
                table_bookManagement.setValueAt(DBM.DB_rs.getString("bPub"), iCntRow, 3);
                if(DBM.DB_rs.getString("available").equals("1")) 
                    table_bookSearch.setValueAt("대출 가능", iCntRow, 4);
                else 
                    table_bookSearch.setValueAt("대출 불가", iCntRow, 4); 
                if(DBM.DB_rs.getString("available").equals("1"))
                    table_bookManagement.setValueAt("대출 가능", iCntRow, 4);
                else
                    table_bookManagement.setValueAt("대출 불가", iCntRow, 4);
                iCntRow++;
            }
            DBM.DB_rs.close(); 
        }catch(Exception e) {
            System.out.println("SQLException : " + e.getMessage()); 
            System.out.println("GetBookInfoData_Basic");
        }
    }
    public boolean GetUser(String userID) {
        // "대출/반납" 탭 : 입력한 아이디가 DB에 있는지 확인하는 메소드 -> true/false
        String strSQL = SQL_SELECT_user;
        try {
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
            while(DBM.DB_rs.next()) {
                if(userID.equals(DBM.DB_rs.getString("userID"))) {
                    return true;
                }
            }
            DBM.DB_rs.close();
            DBM.dbClose();
        } catch(Exception e) {
            System.out.println("SQLException : " + e.getMessage());
            System.out.println("GetUser");
        }
        return false;
    }    
    
    public boolean GetBookNumber(String bookNum) { 
        // "대출/반납" 탭 : 입력한 도서 번호가 DB에 있는지 확인하는 메소드 -> true/false
        String strSQL = SQL_SELECT_book; 
        try { 
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
            while(DBM.DB_rs.next()) { 
                if(bookNum.equals(DBM.DB_rs.getString("bNo"))) { 
                    return true;
                } 
            } 
            DBM.DB_rs.close(); 
            DBM.dbClose(); 
        } catch(Exception e) {
            System.out.println("SQLException : " + e.getMessage());
            System.out.println("GetBookNumber"); 
        } 
        return false; 
    }
    
    public boolean GetUserOdue(String userID) {
        // "대출/반납" 탭 : 입력한 아이디에 따른 연체 여부를 확인하는 메소드 -> true/false (1인 경우)
        String strSQL = SQL_SELECT_loan + "WHERE userID = '" + userID + "';";
        try {
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
            while(DBM.DB_rs.next()) {
                if((DBM.DB_rs.getString("lOdue").equals("1"))) {
                    return false;
                }
            }
            DBM.DB_rs.close();
            DBM.dbClose();
        } catch(Exception e) {
            System.out.println("SQLException : " + e.getMessage());
            System.out.println("GetUser");
        }
        return true;
    }
    
    public boolean GetUserLoan(String userID) {
        // "대출/반납" 탭
        String strSQL = "SELECT COUNT(CASE WHEN userID = '" + userID + "' THEN 1 END) AS 'count' FROM loan;";
        try {
            DBM.dbOpen();
            ResultSet DB_CntRow = DBM.DB_stmt.executeQuery(strSQL);
            while(DB_CntRow.next()) {
                int CntRow = DB_CntRow.getInt("count");
                return CntRow > 0;
            }
            DBM.DB_rs.close();
            DBM.dbClose();
        } catch(Exception e) {
            System.out.println("SQLException : " + e.getMessage());
            System.out.println("GetUserLoan");
        }
        return true;
    }

    
    
    private boolean GetBookLoan(String bookNum) {
        // 도서 번호를 통해 대출 여부가 있는지 검색 ㅇ
        String strSQL = "SELECT available FROM book WHERE bNo = '" + bookNum + "';";
            try {
                DBM.dbOpen();
                DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
                while(DBM.DB_rs.next()) { 
                    if(DBM.DB_rs.getString("available").equals("1")) { 
                        return true;
                    } 
                } 
            } catch(Exception e) {
                System.out.println("SQLException : " + e.getMessage());
                System.out.println("GetBookLoan");
            }
        return false;
    }
    
    private void SQL_UPDATE_book(String strSQL) {
        // book 테이블에 DB에 업데이트 진행 
        try {
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strQuery);
            InitTableBookSearch();
            InitTableBookManagement(); // 검색 결과 출력을 위해 도서 관리 테이블을 비움
            GetBookInfoData_Basic(SQL_SELECT_book);
            DBM.dbClose();
        } catch(Exception e) {
            System.out.println("SQLException : " + e.getMessage());
            System.out.println("SQL_UPDATE_book");
        } 
    }
    
    private void SQL_UPDATE_loan(String strSQL) {
        // 대출 반납 탭에서의 업데이트 
        try {
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strQuery);
            InitTableLoanSearch();
            GetLoanInfoData_Basic(SQL_SELECT_loan);
            DBM.dbClose();
        } catch(Exception e) {
            System.out.println("SQLException : " + e.getMessage());
            System.out.println("SQL_UPDATE_loan"); 
        }
    }
    
    
    public void InitTableBookSearch() {
        // 검색 결과 출력을 위해 도서 관리 테이블을 비움
        DefaultTableModel bookInfoModel = (DefaultTableModel)table_bookSearch.getModel();
        bookInfoModel.setNumRows(0);
    }
    public void  InitTableBookManagement() {
        // 검색 결과 출력을 위해 도서 관리 테이블을 비움 
        DefaultTableModel bookInfoModel = (DefaultTableModel)table_bookManagement.getModel();
        bookInfoModel.setNumRows(0);
    }
    
    public void InitTableLoanSearch() {
        DefaultTableModel bookInfoModel = (DefaultTableModel)table_LoanSearch.getModel();
        bookInfoModel.setNumRows(0);
    }

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
            java.util.logging.Logger.getLogger(MainManageBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainManageBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainManageBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainManageBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainManageBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add_txtAuthor;
    private javax.swing.JTextField add_txtPublisher;
    private javax.swing.JTextField add_txtTitle;
    private javax.swing.JTabbedPane baseTab;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBorrow;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLoanSearch;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> cboBookSearch;
    private javax.swing.JTextField edit_txtAuthor;
    private javax.swing.JTextField edit_txtBNo;
    private javax.swing.JTextField edit_txtPublisher;
    private javax.swing.JTextField edit_txtTitle;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDiaAdd;
    private javax.swing.JButton jDiaAdd_btnAdd;
    private javax.swing.JDialog jDiaEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblBNo;
    private javax.swing.JLabel lblID;
    private javax.swing.JList<String> lstNotPopular;
    private javax.swing.JList<String> lstPopular;
    private javax.swing.JPanel tabBookManagement;
    private javax.swing.JPanel tabBorrow;
    private javax.swing.JPanel tabSearch;
    private javax.swing.JPanel tabUser;
    private javax.swing.JTable table_LoanSearch;
    private javax.swing.JTable table_bookManagement;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtBNo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables


    


}
