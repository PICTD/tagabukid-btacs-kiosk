/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagabukid.btacs.views;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author rufino
 */
@Template({FormPage.class})
public class BTACSKioskPage extends javax.swing.JPanel {

    /**
     * Creates new form BTACSKioskPage
     */
    public BTACSKioskPage() {
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

        xScrollPane1 = new com.rameses.rcp.control.XScrollPane();
        xTileView1 = new com.rameses.rcp.control.XTileView();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setLayout(new java.awt.BorderLayout());

        xTileView1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xTileView1.setCellSize(new java.awt.Dimension(75, 90));
        xTileView1.setCellSpacing(10);
        xTileView1.setDynamic(true);
        xTileView1.setName("listModel"); // NOI18N
        xTileView1.setOpaque(false);
        xTileView1.setPadding(new java.awt.Insets(10, 20, 10, 0));
        add(xTileView1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XScrollPane xScrollPane1;
    private com.rameses.rcp.control.XTileView xTileView1;
    // End of variables declaration//GEN-END:variables
}
