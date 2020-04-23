/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import Entidades.Control;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rey
 */
public class FarmaBot extends javax.swing.JFrame implements Control, Inventario{
    //DONE
//FARMACOS CONTROLADOS
//FARMACOS DE RECETA MEDICA
//FARMACOS DE VENTA LIBRE
    ArrayList<Producto> lFarmacosControlados;
    ArrayList<Producto> lFarmacosReceta;
    ArrayList<Producto> lFarmacosVentaLibre;
    ArrayList<Ventas> lFarmacosComprados;
     DefaultTableModel modelo;
     DefaultTableModel modelo2;
     DefaultTableModel ModeloVentas;
     int CantVentas;
     double Total;
    
    
    
    /**
     * Creates new form FarmaBot
     */
    public FarmaBot() {
        
        initComponents();
        this.panerPrincipal.setEnabledAt(1, false);
        this.panerPrincipal.setEnabledAt(2, false);
        this.panerPrincipal.setEnabledAt(3, false);
        lFarmacosComprados = new ArrayList<>();
        lFarmacosControlados = new ArrayList<>();
        lFarmacosReceta = new ArrayList<>();
        lFarmacosVentaLibre = new ArrayList<>();
        
        this.modelo = (DefaultTableModel) this.tabla1.getModel();
        this.modelo2 =(DefaultTableModel) this.tabla2.getModel();
        this.ModeloVentas = (DefaultTableModel)this.TablaVentas.getModel();
        CantVentas = 0;
        Total = 0;
        
        
        
        //LLENANDO LISTA DE FARMACOS CONTROLADOS (CATEGORIA 1)
        lFarmacosControlados.add(new Farmaco("FARMACOS CONTROLADOS", "ACETILFENTANILO", 2.30, 100));
        lFarmacosControlados.add(new Farmaco("FARMACOS CONTROLADOS", "ALFAMEPRODINA", 1.55, 100));
        lFarmacosControlados.add(new Farmaco("FARMACOS CONTROLADOS", "DEXTROMORAMIDA", 5.50, 100));
        lFarmacosControlados.add(new Farmaco("FARMACOS CONTROLADOS", "DIFENOXINA", 1.30, 100));
        lFarmacosControlados.add(new Farmaco("FARMACOS CONTROLADOS", "ETONITACENO ", 4.75, 100));
        lFarmacosControlados.add(new Farmaco("FARMACOS CONTROLADOS", "MIROFINA", 2.90, 100));
        lFarmacosControlados.add(new Farmaco("FARMACOS CONTROLADOS", "CODOXIMA", 0.75, 100));
        
        //LLENANDO LISTA DE FARMACOS DE RECETA MEDICA
        lFarmacosReceta.add(new Farmaco("FARMACOS DE RECETA MEDICA", "OXICODONA", 2.50, 100));
        lFarmacosReceta.add(new Farmaco("FARMACOS DE RECETA MEDICA", "FURETIDINA", 1.00, 100));
        lFarmacosReceta.add(new Farmaco("FARMACOS DE RECETA MEDICA", "NORACIMETADOL", 2.45, 100));
        lFarmacosReceta.add(new Farmaco("FARMACOS DE RECETA MEDICA", "ALFENTANILO", 0.50, 100));
        lFarmacosReceta.add(new Farmaco("FARMACOS DE RECETA MEDICA", "CARFENTANILO", 5.50, 100));
        lFarmacosReceta.add(new Farmaco("FARMACOS DE RECETA MEDICA", " PETIDINA", 2.00, 100));
        lFarmacosReceta.add(new Farmaco("FARMACOS DE RECETA MEDICA", "RACEMORFANO", 0.35, 100));
        
        //LLENANDO LISTA FARMACOS DE VENTA LIBRE
        lFarmacosVentaLibre.add(new Farmaco("FARMACOS DE VENTA LIBRE", "ACETAMINOFEN", 0.15, 100));
        lFarmacosVentaLibre.add(new Farmaco("FARMACOS DE VENTA LIBRE", "ALCOHOL", 1.45, 100));
        lFarmacosVentaLibre.add(new Farmaco("FARMACOS DE VENTA LIBRE", "LORATADINA", 2.35, 100));
        lFarmacosVentaLibre.add(new Farmaco("FARMACOS DE VENTA LIBRE", "JABON YODO", 3.00, 100));
        lFarmacosVentaLibre.add(new Farmaco("FARMACOS DE VENTA LIBRE", "CICATRICURE", 4.10, 100));
        lFarmacosVentaLibre.add(new Farmaco("FARMACOS DE VENTA LIBRE", "POMADA", 4.50, 100));
        lFarmacosVentaLibre.add(new Farmaco("FARMACOS DE VENTA LIBRE", "TIAMINA", 5.00, 100));
        
        
    }
    public double Decimales(double Total){
        Total*=100;
        return Total/100;
    }
    
    @Override
    public void ControlVentas(){
        this.CantVentas++;
        switch(jComboBox2.getSelectedItem().toString().toLowerCase()){
            case "farmacos controlados":
                for (int i = 0; i < this.lFarmacosControlados.size(); i++) {
                    if (this.lblProd.getText().equals(this.lFarmacosControlados.get(i).getNombreProd())) {
                        double Subtotal = (Integer)this.jSpinner1.getValue()*this.lFarmacosControlados.get(i).getPrecio();
                        this.lFarmacosComprados.add(new Ventas("V00"+Integer.toString(this.CantVentas), this.lblProd.getText().toUpperCase(), 
                                                   (Integer)this.jSpinner1.getValue(), this.lFarmacosControlados.get(i).getPrecio() ,Decimales(Subtotal)));
                        String [] Registro = {"V00"+Integer.toString(this.CantVentas),this.lblProd.getText()
                        ,Integer.toString((Integer)this.jSpinner1.getValue()),this.lblPrecio.getText(),Double.toString(Decimales(Subtotal))};
                        ModeloVentas.addRow(Registro);
                        Total+=Subtotal;
                        this.txtTotal.setText(Double.toString(Decimales(Total)));
                }
        }
            case "farmacos de receta medica":
                for (int i = 0; i < this.lFarmacosReceta.size(); i++) {
                    if (this.lblProd.getText().equals(this.lFarmacosReceta.get(i).getNombreProd())) {
                        double Subtotal = (Integer)this.jSpinner1.getValue()*this.lFarmacosReceta.get(i).getPrecio();
                        this.lFarmacosComprados.add(new Ventas("V00"+Integer.toString(this.CantVentas), this.lblProd.getText().toUpperCase(), 
                                                   (Integer)this.jSpinner1.getValue(), this.lFarmacosReceta.get(i).getPrecio() ,Decimales(Subtotal)));
                        String [] Registro = {"V00"+Integer.toString(this.CantVentas),this.lblProd.getText()
                        ,Integer.toString((Integer)this.jSpinner1.getValue()),this.lblPrecio.getText(),Double.toString(Decimales(Subtotal))};
                        ModeloVentas.addRow(Registro);
                        Total+=Subtotal;
                        this.txtTotal.setText(Double.toString(Decimales(Total)));
                }
        }
            case "farmacos de venta libre":
                for (int i = 0; i < this.lFarmacosVentaLibre.size(); i++) {
                    if (this.lblProd.getText().equals(this.lFarmacosVentaLibre.get(i).getNombreProd())) {
                        double Subtotal = (Integer)this.jSpinner1.getValue()*this.lFarmacosVentaLibre.get(i).getPrecio();
                        this.lFarmacosComprados.add(new Ventas("V00"+Integer.toString(this.CantVentas), this.lblProd.getText().toUpperCase(), 
                                                   (Integer)this.jSpinner1.getValue(), this.lFarmacosVentaLibre.get(i).getPrecio() ,Decimales(Subtotal)));
                        String [] Registro = {"V00"+Integer.toString(this.CantVentas),this.lblProd.getText()
                        ,Integer.toString((Integer)this.jSpinner1.getValue()),this.lblPrecio.getText(),Double.toString(Decimales(Subtotal))};
                        ModeloVentas.addRow(Registro);
                        Total+=Subtotal;
                        this.txtTotal.setText(Double.toString(Decimales(Total)));
                }
                }
    }
                
       
    }
    @Override
    public void mostarTablaVenta(){
       switch(jComboBox2.getSelectedItem().toString().toLowerCase()){
           case "farmacos controlados": 
               modelo.setRowCount(0);
               for (int i = 0; i < lFarmacosControlados.size(); i++) {
                   String [] registro = {
                   this.lFarmacosControlados.get(i).getNombreProd(), Double.toString(this.lFarmacosControlados.get(i).getPrecio())
                   
                   };
                   modelo.addRow(registro);
               }
               break;
               
            case "farmacos de receta medica": 
                modelo.setRowCount(0);
                 for (int i = 0; i < lFarmacosReceta.size(); i++) {
                   String [] registro = {
                   this.lFarmacosReceta.get(i).getNombreProd(), Double.toString(this.lFarmacosReceta.get(i).getPrecio())
                   
                   };
                   modelo.addRow(registro);
               }
               break;
               
            case "farmacos de venta libre": 
                modelo.setRowCount(0);
                 for (int i = 0; i < lFarmacosVentaLibre.size(); i++) {
                   String [] registro = {
                   this.lFarmacosVentaLibre.get(i).getNombreProd(), Double.toString(this.lFarmacosVentaLibre.get(i).getPrecio())
                   
                   };
                   modelo.addRow(registro);
               }
               break;
            }
        }
    
    @Override
    public void mostrarTablaInventario(){
    switch(jComboBox1.getSelectedItem().toString().toLowerCase()){
           case "farmacos controlados": 
               modelo2.setRowCount(0);
               for (int i = 0; i < lFarmacosControlados.size(); i++) {
                   String [] registro = {
                   this.lFarmacosControlados.get(i).getNombreProd(), Double.toString(this.lFarmacosControlados.get(i).getPrecio()), Integer.toString(lFarmacosControlados.get(i).ExistenciaProd)
                   
                   };
                   modelo2.addRow(registro);
               }
               break;
               
            case "farmacos de receta medica": 
                modelo2.setRowCount(0);
                 for (int i = 0; i < lFarmacosReceta.size(); i++) {
                   String [] registro = {
                   this.lFarmacosReceta.get(i).getNombreProd(), Double.toString(this.lFarmacosReceta.get(i).getPrecio()), Integer.toString(lFarmacosReceta.get(i).ExistenciaProd)
                   
                   };
                   modelo2.addRow(registro);
               }
               break;
               
            case "farmacos de venta libre": 
                modelo2.setRowCount(0);
                 for (int i = 0; i < lFarmacosVentaLibre.size(); i++) {
                   String [] registro = {
                   this.lFarmacosVentaLibre.get(i).getNombreProd(), Double.toString(this.lFarmacosVentaLibre.get(i).getPrecio()), Integer.toString(lFarmacosVentaLibre.get(i).ExistenciaProd)
                   
                   };
                   modelo2.addRow(registro);
               }
               break;
            }
    
    }
    
    @Override
    public void Existencias(){
    
         switch(jComboBox2.getSelectedItem().toString().toLowerCase()){
           case "farmacos controlados": 
              
               for (int i = 0; i < lFarmacosControlados.size(); i++) {
                   if (this.lblProd.getText().toUpperCase().equals(lFarmacosControlados.get(i).getNombreProd())) {
                      if ((Integer)this.jSpinner1.getValue()> this.lFarmacosControlados.get(i).ExistenciaProd) {
                      JOptionPane.showMessageDialog(rootPane, "LA CANTIDAD QUE DESEA COMPRAR NO ES VÁLIDA");
                      this.lblProd.setText("");
                      this.lblPrecio.setText("");
                      this.jSpinner1.setValue(1);
                  }
                      else lFarmacosControlados.get(i).ExistenciaProd -= (Integer)jSpinner1.getValue();
                      mostrarTablaInventario();
                   }
               }
               break;
               
            case "farmacos de receta medica": 
                
                 for (int i = 0; i < lFarmacosReceta.size(); i++) {
                   if (this.lblProd.getText().toUpperCase().equals(lFarmacosReceta.get(i).getNombreProd())) {
                       if ((Integer)this.jSpinner1.getValue()>this.lFarmacosReceta.get(i).ExistenciaProd) {
                          JOptionPane.showMessageDialog(rootPane, "LA CANTIDAD QUE DESEA COMPRAR NO ES VÁLIDA");
                          this.lblProd.setText("");
                          this.lblPrecio.setText("");
                          this.jSpinner1.setValue(1);
                      }
                       else lFarmacosReceta.get(i).ExistenciaProd -= (Integer)jSpinner1.getValue();
                       mostrarTablaInventario();
                   }
               }
               
            case "farmacos de venta libre": 
                
                for (int i = 0; i < lFarmacosVentaLibre.size(); i++) {
                   if (this.lblProd.getText().toUpperCase().equals(lFarmacosVentaLibre.get(i).getNombreProd())) {
                       if ((Integer)this.jSpinner1.getValue()>this.lFarmacosVentaLibre.get(i).ExistenciaProd) {
                          JOptionPane.showMessageDialog(rootPane, "LA CANTIDAD QUE DESEA COMPRAR NO ES VÁLIDA");
                          this.lblProd.setText("");
                          this.lblPrecio.setText("");
                          this.jSpinner1.setValue(1);
                      }
                       else lFarmacosVentaLibre.get(i).ExistenciaProd -= (Integer)jSpinner1.getValue();
                       mostrarTablaInventario();
                   }
               }
               break;
            }
    
    }
    
    public void seleccionRow(){
        int indexRow = this.tabla1.getSelectedRow();
        lblProd.setText( (String) modelo.getValueAt(indexRow, 0));
        lblPrecio.setText( (String) modelo.getValueAt(indexRow, 1));
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        panerPrincipal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnLoggin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblProd = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGGIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 24), new java.awt.Color(0, 204, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("PASSWORD");

        txtPassword.setForeground(new java.awt.Color(0, 204, 204));

        btnLoggin.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnLoggin.setForeground(new java.awt.Color(0, 204, 204));
        btnLoggin.setText("LOG");
        btnLoggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnLoggin)
                        .addGap(247, 247, 247))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnLoggin)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(383, Short.MAX_VALUE))
        );

        panerPrincipal.addTab("Acceder", jPanel1);

        jPanel5.setBackground(new java.awt.Color(102, 255, 204));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("INVENTARIO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addContainerGap(655, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABLA DE DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 13), new java.awt.Color(0, 153, 153))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("FILTRO DE BUSQUEDA (TIPO) : ");

        jComboBox1.setForeground(new java.awt.Color(0, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FARMACOS CONTROLADOS", "FARMACOS DE RECETA MEDICA", "FARMACOS DE VENTA LIBRE" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        tabla2.setBackground(new java.awt.Color(51, 255, 204));
        tabla2.setForeground(new java.awt.Color(0, 153, 153));
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "PRECIO", "CANTIDAD"
            }
        ));
        jScrollPane1.setViewportView(tabla2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panerPrincipal.addTab("Consultar", jPanel3);

        jPanel8.setBackground(new java.awt.Color(102, 255, 204));
        jPanel8.setForeground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("VENDER");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addContainerGap(644, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORMULARIO VENTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("PRODUCTOS POR TIPO: ");

        jComboBox2.setForeground(new java.awt.Color(0, 153, 153));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FARMACOS CONTROLADOS", "FARMACOS DE RECETA MEDICA", "FARMACOS DE VENTA LIBRE" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "seleccione el producto a comprar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 153, 153))); // NOI18N

        tabla1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 153, 153))); // NOI18N
        tabla1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tabla1.setForeground(new java.awt.Color(0, 153, 153));
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla1);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("COMPRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("PRODUCTO: ");

        jLabel8.setText("PRECIO: ");

        jLabel9.setText("CANT:");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lblProd))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(lblPrecio))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panerPrincipal.addTab("Vender", jPanel2);

        jPanel13.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control de ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 153, 153))); // NOI18N

        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO DE VENTA", "NOMBRE/PRODUCTO", "CANTIDAD", "PRECIO", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaVentas);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("TOTAL EN VENTAS  $");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 121, Short.MAX_VALUE))
        );

        panerPrincipal.addTab("Control", jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panerPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panerPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
       mostarTablaVenta();
       lblProd.setText("");
       lblPrecio.setText("");
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        seleccionRow();
    }//GEN-LAST:event_tabla1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Existencias();
       ControlVentas();
       this.lblProd.setText("");
       this.lblPrecio.setText("");
       this.jComboBox2.setSelectedIndex(0);
       this.modelo.getDataVector().removeAllElements();
       this.jSpinner1.setValue(1);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogginActionPerformed
        if (this.txtPassword.getText().equals("1234")) {
            this.panerPrincipal.setSelectedIndex(1);
            this.panerPrincipal.setEnabledAt(0, false);
            this.panerPrincipal.setEnabledAt(1, true);
            this.panerPrincipal.setEnabledAt(2, true);
            this.panerPrincipal.setEnabledAt(3, true);
        }else{
        JOptionPane.showMessageDialog(this, "LA CONTRASEÑA NO ES LA CORRECTA");
        }
    }//GEN-LAST:event_btnLogginActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        mostrarTablaInventario();
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(FarmaBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FarmaBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FarmaBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FarmaBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FarmaBot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVentas;
    private javax.swing.JButton btnLoggin;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProd;
    private javax.swing.JTabbedPane panerPrincipal;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

   
}
