/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Delivery;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BookDonationDepartmentOrganization;
import Business.Organization.DeliveryOrganization;
import Business.Organization.NGOBookOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LibraryTestWorkRequest;
import javax.swing.JPanel;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Lenovo
 */
public class Delivery extends javax.swing.JPanel {

    /**
     * Creates new form Supplier
     */
    
    private JPanel userProcessContainer;
    private DeliveryOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Network networkk;
    
    public Delivery(JPanel userProcessContainer, UserAccount account, DeliveryOrganization organization,Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system=system;
        this.userAccount = account;
        populateRequestTable();
        valueLabel.setText(enterprise.getName());
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            //String message = request.getMessage().toString();
            Object[] row = new Object[7];
            row[0] = request;
            //row[1] = request.getReceiver();
           // row[2] = request.getMessage();
            row[1] = request.getMessage();
            row[2] = request.getStatus();
            String result = ((LibraryTestWorkRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
            row[4] = request.getBookTitle();
            row[5] = request.getAuthor();
            row[6] = request.getQuantity();
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

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshTestJButton = new javax.swing.JButton();
        pickUpButton = new javax.swing.JButton();
        DeliverButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valueLabel.setText("<value>");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Object", "Message", "Status", "Result", "Title", "Author", "Quanity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        refreshTestJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        pickUpButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pickUpButton.setText("Pick Up The Books");
        pickUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickUpButtonActionPerformed(evt);
            }
        });

        DeliverButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeliverButton.setText("Deliver The Books ");
        DeliverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliverButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delivery");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(pickUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeliverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(refreshTestJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeliverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pickUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void pickUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickUpButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        LibraryTestWorkRequest request1 = (LibraryTestWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);

        if(request1.getStatus().equals("Completed")){
        LibraryTestWorkRequest request = new LibraryTestWorkRequest();

        request.setMessage(request1.getMessage());
        request.setReceiver(request1.getReceiver());
        request.setSender(request1.getSender());
        request.setTestResult("Books Picked Up");
        request.setStatus("Books Picked Up");
        request1.setTestResult("Books Picked Up");
        request1.setStatus("Books Picked Up");
        request.setAuthor(request1.getAuthor());
        request.setBookTitle(request1.getBookTitle());
        request.setQuantity(request1.getQuantity());


        Organization org = null;

        for(Network network: system.getNetworkList()){
            for(Enterprise ent:network.getEnterpriseDirectory().getEnterpriseList()){
                if(ent == enterprise){
                    networkk=network;
                }
            }
        }
        for(Enterprise ent:networkk.getEnterpriseDirectory().getEnterpriseList()){
            for(Organization organization: ent.getOrganizationDirectory().getOrganizationList()){
                if(organization instanceof BookDonationDepartmentOrganization){
                    org = organization;
                    break;
                }
            }
        }
        if(org!=null){
            System.out.println(org);
            org.getWorkQueue().getWorkRequestList().add(request);
           // userAccount.getWorkQueue().getWorkRequestList().add(request);
        system.getWorkQueue().getWorkRequestList().add(request);

        }   
        populateRequestTable();


        } 
        JOptionPane.showMessageDialog(null,"Books Picked Up");

    }//GEN-LAST:event_pickUpButtonActionPerformed

    private void DeliverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliverButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        LibraryTestWorkRequest request1 = (LibraryTestWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);

        if(request1.getStatus().equals("Books Picked Up")){

            LibraryTestWorkRequest request = new LibraryTestWorkRequest();
            request.setMessage(request1.getMessage());
            request.setReceiver(request1.getReceiver());
            request.setSender(request1.getSender());
            request.setTestResult("Books Delivered");
            request.setStatus("Books Delivered");
            request1.setTestResult("Books Delivered");
            request1.setStatus("Books Delivered");
            request.setAuthor(request1.getAuthor());
            request.setBookTitle(request1.getBookTitle());
            request.setQuantity(request1.getQuantity());

            Organization org = null;

            for(Network network: system.getNetworkList()){
                for(Enterprise ent:network.getEnterpriseDirectory().getEnterpriseList()){
                    if(ent == enterprise){
                        networkk=network;
                    }
                }
            }
            for(Enterprise ent:networkk.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization organization: ent.getOrganizationDirectory().getOrganizationList()){
                    if(organization instanceof NGOBookOrganization){
                        org = organization;
                        break;
                    }
                }
            }
            if(org!=null){
                System.out.println(org);
                org.getWorkQueue().getWorkRequestList().add(request);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
                //system.getWorkQueue().getWorkRequestList().add(request);

            }
            populateRequestTable();
            JOptionPane.showMessageDialog(null,"Books Delivered");
        }
        else{
            JOptionPane.showMessageDialog(null,"This Book has not been picked up yet.");
        }
    }//GEN-LAST:event_DeliverButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeliverButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pickUpButton;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}