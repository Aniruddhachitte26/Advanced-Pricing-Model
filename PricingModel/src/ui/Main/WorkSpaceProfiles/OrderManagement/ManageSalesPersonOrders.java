
package ui.Main.WorkSpaceProfiles.OrderManagement;

import model.Business.Business;
import model.ProductManagement.Product;
import model.Supplier.Supplier;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.OrderManagement.Order;
import model.SalesManagement.SalesPersonProfile;

/**
 *
 * @author Aniruddha
 */
public class ManageSalesPersonOrders extends javax.swing.JPanel {


    JPanel CardSequencePanel;
    Business business;
    Supplier selectedsupplier;
    Product selectedproduct;
    SalesPersonProfile salesperson;

    public ManageSalesPersonOrders(Business bz, JPanel jp, SalesPersonProfile salesperson) {
    
    this.CardSequencePanel = jp;
    this.business = bz;
    this.salesperson = salesperson; // Initialize salesperson here
    initComponents();
    populateSupplierCatalogTable(); // Now you can call this method safely
    
    }

    public void populateSupplierCatalogTable() {
    DefaultTableModel model = (DefaultTableModel) SupplierCatalogTable.getModel();
    model.setRowCount(0); // Clear existing rows
    
    for (Order order : salesperson.getSalesOrders()) { // Assuming getSalesOrders() exists in SalesPersonProfile
        Object[] row = new Object[4];
        row[0] = order.getOrderId();
        row[1] = order.getStatus();
        row[2] = order.getOrderTotal();
        row[3] = order.getCustomer().toString(); // Assuming toString() in CustomerProfile returns the desired customer detail
        model.addRow(row);
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

        Back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        SupplierCatalogTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 230, -1));

        SupplierCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order id", "Status", "Sales Volume", "Customer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SupplierCatalogTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SupplierCatalogTableMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SupplierCatalogTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(SupplierCatalogTable);

        jScrollPane2.setViewportView(jScrollPane1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 600, 210));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Browse Orders");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 550, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Orders");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_BackActionPerformed

    private void SupplierCatalogTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierCatalogTableMousePressed
        // TODO add your handling code 
    }//GEN-LAST:event_SupplierCatalogTableMousePressed

    private void SupplierCatalogTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierCatalogTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierCatalogTableMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable SupplierCatalogTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
