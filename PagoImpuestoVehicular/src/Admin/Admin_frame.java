/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import static java.lang.String.valueOf;
import java.util.ArrayList;
import static pagoimpuestovehicular.Principal_frame.lista_vehiculos;
import pagoimpuestovehicular.Vehiculo;


/**
 *
 * @author camil
 */
public class Admin_frame extends javax.swing.JFrame {
    public ArrayList<Vehiculo>vehiculos_comboBox = new ArrayList();
    /**
     * Creates new form Admin_frame
     */
    public Admin_frame() {
        initComponents();
        setSize(850, 600);
        setResizable(false);
        setLocationRelativeTo(this);
        
        rellenar1();
        rellenar2();
        rellenar3();
        mostrarTabla();
        Vehiculo vehiculo_aux = new Vehiculo();vehiculo_aux.setMarca("NISSAN");vehiculo_aux.setLinea("SENTRA");vehiculo_aux.setAgnio("1992");vehiculo_aux.setCodigo(1);vehiculo_aux.setValorI(Float.parseFloat("5000"));vehiculos_comboBox.add(vehiculo_aux);
        vehiculo_aux.setMarca("NISSAN");vehiculo_aux.setLinea("SENTRA");vehiculo_aux.setAgnio("1995");vehiculo_aux.setCodigo(2);vehiculo_aux.setValorI(Float.parseFloat("7000"));vehiculos_comboBox.add(vehiculo_aux);
        vehiculo_aux.setMarca("NISSAN");vehiculo_aux.setLinea("SENTRA");vehiculo_aux.setAgnio("2007");vehiculo_aux.setCodigo(3);vehiculo_aux.setValorI(Float.parseFloat("11000"));vehiculos_comboBox.add(vehiculo_aux);
        vehiculo_aux.setMarca("CHEVROLET");vehiculo_aux.setLinea("SENTRA");vehiculo_aux.setAgnio("1992");vehiculo_aux.setCodigo(1);vehiculo_aux.setValorI(Float.parseFloat("5000"));vehiculos_comboBox.add(vehiculo_aux);
        vehiculo_aux.setMarca("CHEVROLET");vehiculo_aux.setLinea("SENTRA");vehiculo_aux.setAgnio("1992");vehiculo_aux.setCodigo(1);vehiculo_aux.setValorI(Float.parseFloat("5000"));vehiculos_comboBox.add(vehiculo_aux);
        vehiculo_aux.setMarca("RENAULT");vehiculo_aux.setLinea("SENTRA");vehiculo_aux.setAgnio("1992");vehiculo_aux.setCodigo(1);vehiculo_aux.setValorI(Float.parseFloat("5000"));vehiculos_comboBox.add(vehiculo_aux);
        
        mostrarMarcasVehiculosComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_vehiculos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        input_valor = new javax.swing.JTextField();
        input_codigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        input_agnio = new javax.swing.JTextField();
        input_linea = new javax.swing.JTextField();
        input_marca = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_vehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Marca", "Línea", "Año", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_vehiculos.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(table_vehiculos);
        table_vehiculos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Agregar Auto");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(80, 20, 110, 24);

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Valor:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 230, 60, 24);

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Código: ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 70, 60, 24);

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Marca:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 110, 60, 24);

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Línea:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 150, 60, 24);

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Año:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 190, 60, 24);
        jPanel2.add(input_valor);
        input_valor.setBounds(100, 230, 140, 24);
        jPanel2.add(input_codigo);
        input_codigo.setBounds(100, 70, 140, 24);

        jButton1.setText("Agregar auto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(100, 280, 140, 24);
        jPanel2.add(input_agnio);
        input_agnio.setBounds(100, 190, 140, 24);
        jPanel2.add(input_linea);
        input_linea.setBounds(100, 150, 140, 24);

        input_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_marcaActionPerformed(evt);
            }
        });
        jPanel2.add(input_marca);
        input_marca.setBounds(100, 110, 140, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
                .addGap(235, 235, 235))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String marca, linea, agnio;
            int codigo;
            float valor;
            marca = valueOf(input_marca.getSelectedItem());
            linea = input_linea.getText();
            codigo = Integer.parseInt(input_codigo.getText());
            agnio = input_agnio.getText();
            valor = Float.parseFloat(input_valor.getText());

            if(!"".equals(marca)&&!"".equals(linea)&&!"".equals(codigo)&&!"".equals(agnio)&&!"".equals(valor)){
                Vehiculo vehiculo_aux = new Vehiculo();
                vehiculo_aux.setCodigo(codigo);
                vehiculo_aux.setMarca(marca);
                vehiculo_aux.setLinea(linea);
                vehiculo_aux.setValorI(valor);
                vehiculo_aux.setAgnio(agnio);
                
                lista_vehiculos.add(vehiculo_aux);
            }

        }catch(Exception e){}
        mostrarTabla();
        input_linea.setText("");
        input_codigo.setText("");
        input_agnio.setText("");
        input_valor.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void input_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_marcaActionPerformed
        
    }//GEN-LAST:event_input_marcaActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_frame().setVisible(true);
            }
        });
    }
    //Funciones de frame
    
    public void mostrarTabla(){
        String matriz[][] = new String[lista_vehiculos.size()][10];
        for(int i=0; i<lista_vehiculos.size();i++){
            matriz[i][0]=valueOf(lista_vehiculos.get(i).getCodigo());
            matriz[i][1]=lista_vehiculos.get(i).getMarca();
            matriz[i][2]=lista_vehiculos.get(i).getLinea();
            matriz[i][3]=lista_vehiculos.get(i).getAgnio();
            matriz[i][4]=valueOf(lista_vehiculos.get(i).getValorI());

        }
        table_vehiculos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Código", "Marca", "Línea", "Año", "Valor"
            } 
            
        ){
            
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            };
            
        });
    }
    
    public void rellenar1(){
        Vehiculo vehiculo_aux = new Vehiculo();
        vehiculo_aux.setCodigo(Integer.parseInt("1"));
        vehiculo_aux.setMarca("NISSAN");
        vehiculo_aux.setLinea("PATROL");
        vehiculo_aux.setAgnio("2006");
        vehiculo_aux.setValorI(Float.parseFloat("349990"));
        lista_vehiculos.add(vehiculo_aux);
        

    }
    public void rellenar2(){
        Vehiculo vehiculo_aux = new Vehiculo();
        vehiculo_aux.setCodigo(Integer.parseInt("2"));
        vehiculo_aux.setMarca("NISSAN");
        vehiculo_aux.setLinea("MURANO");
        vehiculo_aux.setAgnio("2006");
        vehiculo_aux.setValorI(Float.parseFloat("169990"));
        lista_vehiculos.add(vehiculo_aux);
        
    }
    public void rellenar3(){
        Vehiculo vehiculo_aux = new Vehiculo();
        
        vehiculo_aux.setCodigo(Integer.parseInt("3"));
        vehiculo_aux.setMarca("CHEVROLET");
        vehiculo_aux.setLinea("TRAVERSE");
        vehiculo_aux.setAgnio("2006");
        vehiculo_aux.setValorI(Float.parseFloat("184990"));
        lista_vehiculos.add(vehiculo_aux);
    }
    
    public void mostrarMarcasVehiculosComboBox(){
        String marcaa = "a";
        for(int i=0;i<vehiculos_comboBox.size();i++){
            input_marca.addItem(vehiculos_comboBox.get(i).getMarca());
                
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField input_agnio;
    private javax.swing.JTextField input_codigo;
    private javax.swing.JTextField input_linea;
    private javax.swing.JComboBox<String> input_marca;
    private javax.swing.JTextField input_valor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_vehiculos;
    // End of variables declaration//GEN-END:variables
}
