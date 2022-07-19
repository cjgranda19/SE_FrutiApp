
package ec.edu.espe.fruitApp.view;

import ec.edu.espe.FruitApp.view.FrmCustomers;
import ec.edu.espe.FruitApp.view.FrmFruits;
import ec.edu.espe.FruitApp.view.FrmHelp;
import ec.edu.espe.FruitApp.view.FrmVegetables;
import ec.edu.espe.FruitApp.view.FrmWorkers;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Carlos Granda,Jose Imbaquinga, Roony Ibarra, DCCO-ESPE, Syntax Error
 */
public class FrmAppMenu extends javax.swing.JFrame {

    /**
     * Creates new form AppMenu
     */
    
    
    public FrmAppMenu() {
        initComponents();
        setTitle("FRUIT APP");
        setIconImage(getIconImage());
    }
    
    @Override
        public Image getIconImage(){
            Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagen/Simbolo.png"));
            return retValue;
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFruitApp = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuApp = new javax.swing.JMenu();
        mnuAbout = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();
        mnuCustomer = new javax.swing.JMenu();
        mnuiCustomer = new javax.swing.JMenuItem();
        mnuShop = new javax.swing.JMenu();
        mnuFruit = new javax.swing.JMenuItem();
        mnuVegetable = new javax.swing.JMenuItem();
        mnuRegister = new javax.swing.JMenu();
        mnuiRegister = new javax.swing.JMenuItem();
        mnuData = new javax.swing.JMenu();
        itmCustomers = new javax.swing.JMenuItem();
        itmVegetables = new javax.swing.JMenuItem();
        itmFruits = new javax.swing.JMenuItem();
        itmWorkers = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mnuiHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFruitApp.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        lblFruitApp.setText("FRUIT APP");

        mnuApp.setText("FRUIT APP");

        mnuAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuAbout.setText("ABOUT");
        mnuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAboutActionPerformed(evt);
            }
        });
        mnuApp.add(mnuAbout);

        mnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuExit.setText("EXIT");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        mnuApp.add(mnuExit);

        jMenuBar1.add(mnuApp);

        mnuCustomer.setText("CUSTOMER");
        mnuCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCustomerActionPerformed(evt);
            }
        });

        mnuiCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuiCustomer.setText("Customer");
        mnuiCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiCustomerActionPerformed(evt);
            }
        });
        mnuCustomer.add(mnuiCustomer);

        jMenuBar1.add(mnuCustomer);

        mnuShop.setText("SHOP");

        mnuFruit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuFruit.setText("FRUIT");
        mnuFruit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFruitActionPerformed(evt);
            }
        });
        mnuShop.add(mnuFruit);

        mnuVegetable.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuVegetable.setText("VEGETABLE");
        mnuVegetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVegetableActionPerformed(evt);
            }
        });
        mnuShop.add(mnuVegetable);

        jMenuBar1.add(mnuShop);

        mnuRegister.setText("REGISTER");

        mnuiRegister.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuiRegister.setText("Register");
        mnuiRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiRegisterActionPerformed(evt);
            }
        });
        mnuRegister.add(mnuiRegister);

        jMenuBar1.add(mnuRegister);

        mnuData.setText("DATA");

        itmCustomers.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmCustomers.setText("Customers");
        itmCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCustomersActionPerformed(evt);
            }
        });
        mnuData.add(itmCustomers);

        itmVegetables.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmVegetables.setText("Vegetables");
        itmVegetables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVegetablesActionPerformed(evt);
            }
        });
        mnuData.add(itmVegetables);

        itmFruits.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmFruits.setText("Fruits");
        itmFruits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFruitsActionPerformed(evt);
            }
        });
        mnuData.add(itmFruits);

        itmWorkers.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmWorkers.setText("Workers");
        itmWorkers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmWorkersActionPerformed(evt);
            }
        });
        mnuData.add(itmWorkers);

        jMenuBar1.add(mnuData);

        mnuHelp.setText("HELP");

        mnuiHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuiHelp.setText("Help");
        mnuiHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiHelpActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuiHelp);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(lblFruitApp)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lblFruitApp)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAboutActionPerformed
    FrmAbout about = new FrmAbout();
    about.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mnuAboutActionPerformed

    private void mnuFruitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFruitActionPerformed
    FrmFruit Fruit = new FrmFruit();
    Fruit.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mnuFruitActionPerformed

    private void mnuVegetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVegetableActionPerformed
    FrmVegetable Vegetable = new FrmVegetable();
    Vegetable.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mnuVegetableActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCustomerActionPerformed
    
    }//GEN-LAST:event_mnuCustomerActionPerformed

    private void mnuiCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiCustomerActionPerformed
    FrmCustomer Customer = new FrmCustomer();
    Customer.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mnuiCustomerActionPerformed

    private void mnuiRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiRegisterActionPerformed
    FrmWorker Register = new FrmWorker();
    Register.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mnuiRegisterActionPerformed

    private void mnuiHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiHelpActionPerformed
    FrmHelp Help = new FrmHelp();
    Help.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mnuiHelpActionPerformed

    private void itmFruitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFruitsActionPerformed
        FrmFruits fruits = new FrmFruits();
        fruits.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itmFruitsActionPerformed

    private void itmVegetablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVegetablesActionPerformed
        FrmVegetables vegetables = new FrmVegetables();
        vegetables.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itmVegetablesActionPerformed

    private void itmCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCustomersActionPerformed
        FrmCustomers customers = new FrmCustomers();
        customers.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itmCustomersActionPerformed

    private void itmWorkersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmWorkersActionPerformed
        FrmWorkers workers = new FrmWorkers();
        workers.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itmWorkersActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAppMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAppMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAppMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAppMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAppMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmCustomers;
    private javax.swing.JMenuItem itmFruits;
    private javax.swing.JMenuItem itmVegetables;
    private javax.swing.JMenuItem itmWorkers;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblFruitApp;
    private javax.swing.JMenuItem mnuAbout;
    private javax.swing.JMenu mnuApp;
    private javax.swing.JMenu mnuCustomer;
    private javax.swing.JMenu mnuData;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuFruit;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuRegister;
    private javax.swing.JMenu mnuShop;
    private javax.swing.JMenuItem mnuVegetable;
    private javax.swing.JMenuItem mnuiCustomer;
    private javax.swing.JMenuItem mnuiHelp;
    private javax.swing.JMenuItem mnuiRegister;
    // End of variables declaration//GEN-END:variables

}

