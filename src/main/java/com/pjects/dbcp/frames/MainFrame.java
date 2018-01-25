package com.pjects.dbcp.frames;

import org.springframework.beans.factory.annotation.Autowired;

public class MainFrame extends javax.swing.JFrame {

    private javax.swing.JButton closeBtn;
    private javax.swing.JButton dbBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea welcomeText;
    

	private DemoFrame dbFrame;
    
    /**
     * Creates new form DemoFrame
     */
    public MainFrame() {
        initComponents();
        dbFrame = new DemoFrame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        closeBtn = new javax.swing.JButton();
        dbBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        welcomeText = new javax.swing.JTextArea();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DPCP");
        
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        dbBtn.setText("Set Db");
        dbBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	dbActionPerformed(evt);
            }
        });
    	
        welcomeText.setEditable(false);
        welcomeText.setColumns(20);
        welcomeText.setLineWrap(true);
        welcomeText.setRows(5);
        welcomeText.setText("This is a demonstration on how to write a simple Spring Boot application to display a GUI interface.");
        welcomeText.setWrapStyleWord(true);
        jScrollPane1.setViewportView(welcomeText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dbBtn)
                        .addComponent(closeBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(dbBtn)
                .addComponent(closeBtn)
                .addGap(20, 20, 20))
        );

        pack();
    }
    
    private void dbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    	dbFrame.setVisible(true);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }
    
    
}
