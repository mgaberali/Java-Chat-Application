/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JLabel;

/**
 *
 * @author Mohamed
 */
public class FriendElement extends javax.swing.JPanel {

    /**
     * Creates new form FriendElement
     */
    public FriendElement() {
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

        displayPhoto = new javax.swing.JLabel();
        displayName = new javax.swing.JLabel();
        displayStatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        displayPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Penguins.jpg"))); // NOI18N

        displayName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        displayName.setForeground(new java.awt.Color(102, 102, 102));
        displayName.setText("Mohamed");

        displayStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lunchbreak-girl-icon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayPhoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayName, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(displayStatus)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayPhoto)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(displayName)
                            .addComponent(displayStatus))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel displayName;
    private javax.swing.JLabel displayPhoto;
    private javax.swing.JLabel displayStatus;
    // End of variables declaration//GEN-END:variables

    public JLabel getDisplayName() {
        return displayName;
    }

    public JLabel getDisplayPhoto() {
        return displayPhoto;
    }

    public JLabel getDisplayStatus() {
        return displayStatus;
    }

    
    
}
