/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import rmi.ControladorRmi;
import server.ControladorServer;

/**
 * @author Jean Carlo Massami Yamada
 *
 * Aplicação desenvolvida como trabalho final da disiciplina de Computação Distrubuida ministrada 
 * por Dr.Prof. Milton Hirokazu Shimabukuro do curso de Ciências da Computação da 
 * UNESP(Universidade Estadual Paulista) "Júlio Mesquita Filho" - Câmpus de Presidente Prudente.
 * Com o intuito de concretizar o aprendizado da matéria, o bjetivo da aplicação é ter
 * um servidor que irá invocar métodos remotos (RMI (Remote Method Invocation))
 * para atender requisições de seus clientes conectados via TCP.
 */
/**
 *  * @author Jean Carlo Massami Yamada
 *
 * Classe ServerGui, a qual é responsavel pela interface gráfica.
 * Como foi utlizado a IDE NetBeans, vários recursos são construido automaticamente.
 */

public class ServerGui extends javax.swing.JFrame {

    /**
     * Creates new form Server
     */
    public ServerGui() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldBind = new javax.swing.JTextField();
        jLabelBind = new javax.swing.JLabel();
        jButtonStartRmi = new javax.swing.JButton();
        jFormattedTextFieldPortRmi = new javax.swing.JFormattedTextField();
        jLabelPortaRmi = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaRmi = new javax.swing.JTextArea();
        jButtonStartRmiAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelIp = new javax.swing.JLabel();
        jScrollPaneConnection = new javax.swing.JScrollPane();
        jTextAreaConnection = new javax.swing.JTextArea();
        jButtonStop = new javax.swing.JButton();
        jButtonStart = new javax.swing.JButton();
        jTextFieldIp = new javax.swing.JTextField();
        jLabelPort = new javax.swing.JLabel();
        jFormattedTextFieldPort = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jFormattedTextFieldPortSRmi = new javax.swing.JFormattedTextField();
        jLabelPortSRmi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldLookup = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server");

        jLabelBind.setText("Bind");

        jButtonStartRmi.setText("start");
        jButtonStartRmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartRmiActionPerformed(evt);
            }
        });

        jLabelPortaRmi.setText("Porta");

        jTextAreaRmi.setEditable(false);
        jTextAreaRmi.setColumns(20);
        jTextAreaRmi.setRows(5);
        jScrollPane3.setViewportView(jTextAreaRmi);

        jButtonStartRmiAdd.setText("adicionar");
        jButtonStartRmiAdd.setEnabled(false);
        jButtonStartRmiAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartRmiAddActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lupa.jpeg"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lupa.jpeg"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelPortaRmi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldPortRmi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonStartRmi)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelBind)
                                .addGap(19, 19, 19)
                                .addComponent(jTextFieldBind, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonStartRmiAdd)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jFormattedTextFieldPortRmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelPortaRmi)
                        .addComponent(jButtonStartRmi))
                    .addComponent(jLabel4))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBind)
                            .addComponent(jTextFieldBind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonStartRmiAdd))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel2);

        jTabbedPane1.addTab("RMI", jScrollPane2);

        jLabelIp.setText("IP");

        jTextAreaConnection.setEditable(false);
        jTextAreaConnection.setColumns(20);
        jTextAreaConnection.setRows(5);
        jScrollPaneConnection.setViewportView(jTextAreaConnection);

        jButtonStop.setText("stop");
        jButtonStop.setEnabled(false);
        jButtonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStopActionPerformed(evt);
            }
        });

        jButtonStart.setText("start");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });

        jTextFieldIp.setEditable(false);
        jTextFieldIp.setText("127.0.0.1");

        jLabelPort.setText("Porta");

        jFormattedTextFieldPort.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jPanel3.setBackground(new java.awt.Color(178, 209, 216));

        jFormattedTextFieldPortSRmi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabelPortSRmi.setText("Porta");

        jLabel1.setText("Lookup");

        jLabel2.setText("Config. RMI");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabelPortSRmi)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldPortSRmi, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldLookup, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPortSRmi)
                    .addComponent(jFormattedTextFieldPortSRmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldLookup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lupa.jpeg"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lupa.jpeg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneConnection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonStop, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelIp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabelPort))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jFormattedTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel5)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPort)
                            .addComponent(jFormattedTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIp)
                            .addComponent(jTextFieldIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonStart)
                    .addComponent(jButtonStop))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
        );

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Servidor", jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*método invocado pelo widget jButton Start o servidor*/
    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        // TODO add your handling code here:
        
        /*apenas verifica se os campos foram devidamente preenchidos*/
        if (!jTextFieldIp.getText().isEmpty()) {
            ControladorServer.setIp(jTextFieldIp.getText());
        } else {
            return;
        }

        String port = jFormattedTextFieldPort.getText();
        try {
            ControladorServer.setServerPort(Integer.parseInt(port));
        } catch (NumberFormatException ex) {
            System.err.println(ex);
            return;
        }

        String portRmi = jFormattedTextFieldPortSRmi.getText();
        try {
            ControladorServer.setPortRmi(Integer.parseInt(portRmi));
        } catch (NumberFormatException ex) {
            System.err.println(ex);
            return;
        }

        if (!jTextFieldLookup.getText().isEmpty()) {
            ControladorServer.setLookup(jTextFieldLookup.getText());
        } else {
            return;
        }

        /*starta servidor*/
        ControladorServer.start();

        /*verifica se servidor iniciou corretamente*/
        if (ControladorServer.getRuning().get()) {
            jButtonStop.setEnabled(true);
            jButtonStart.setEnabled(false);
            jFormattedTextFieldPort.setEnabled(false);
            jTextFieldIp.setEnabled(false);
            jTextFieldLookup.setEnabled(false);
            jFormattedTextFieldPortSRmi.setEnabled(false);
            jTextAreaConnection.append("Server started ip:"+ControladorServer.getIp()+" port:"+ControladorServer.getServerPort()+"\n");
        }

        
    }//GEN-LAST:event_jButtonStartActionPerformed

     /*método invocado pelo widget jButton Stop o servidor*/
    private void jButtonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStopActionPerformed
        // TODO add your handling code here:
        
        
        String aux = "ip:"+ControladorServer.getIp()+" port:"+ControladorServer.getServerPort();
        
        /*interronpendo servidor*/
        ControladorServer.stop();

        if (!ControladorServer.getRuning().get()) {
            jButtonStop.setEnabled(false);
            jButtonStart.setEnabled(true);
            jFormattedTextFieldPort.setEnabled(true);
            jTextFieldIp.setEnabled(true);
            jTextFieldLookup.setEnabled(true);
            jFormattedTextFieldPortSRmi.setEnabled(true);
            jTextAreaConnection.append("Server stop "+aux+"\n\n");
        }
    }//GEN-LAST:event_jButtonStopActionPerformed

     /*método invocado pelo widget jButton Start o RMI*/
    private void jButtonStartRmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartRmiActionPerformed
        // TODO add your handling code here:

        /*verifica se os campos estão devidamente preenchidos*/
        if (!jFormattedTextFieldPortRmi.getText().isEmpty()) {
            try {
                Integer port = Integer.parseInt(jFormattedTextFieldPortRmi.getText());
                ControladorRmi.setPort(port);
            } catch (NumberFormatException ex) {
                System.err.println(ex);
            }
        } else {
            return;
        }

        /*startando RMI*/
        if (ControladorRmi.start()) {
            jButtonStartRmi.setEnabled(false);
            jButtonStartRmiAdd.setEnabled(true);
            jFormattedTextFieldPortRmi.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonStartRmiActionPerformed

     /*método invocado pelo widget jButton RmiAdd do RMI*/
    private void jButtonStartRmiAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartRmiAddActionPerformed
        // TODO add your handling code here:
        /*faz um novo bind no registro*/
        if (!jTextFieldBind.getText().isEmpty()) {
            if(ControladorRmi.addBind(jTextFieldBind.getText()));
        }

    }//GEN-LAST:event_jButtonStartRmiAddActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"        try {\n" +
"            /*criando registro*/\n" +
"            registry = LocateRegistry.createRegistry(port);\n" +
"            \n" +
"            /*inserindo informações na interface gráfica*/\n" +
"            ControladorServerGui.getTextAreaRmi().append(\"Registry created in port: \"+port+\"\\n\\n\");\n" +
"            return true;\n" +
"        }");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"        try {\n" +
"            /*estanciando objeto*/\n" +
"            Calculator stub = new ImplCalculator();\n" +
"            \n" +
"            /*inserindo objeto no registro*/\n" +
"            registry.rebind(bind, stub);\n" +
"            \n" +
"             /*inserindo informações na interface gráfica*/\n" +
"            ControladorServerGui.getTextAreaRmi().append(\"add in register:\"+bind+\"\\n\\n\");\n" +
"            return true;\n" +
"        } ");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this,"        try {\n" +
"            /*estanciando servidor*/\n" +
"            serverSocket = new ServerSocket(serverPort, 50, InetAddress.getByName(ip));\n" +
"\n" +
"        }"+
                 "\n\n"+ "  /*loop no aguardo de requisições de conexões*/\n" +
"        while (runing.get()) {\n" +
"\n" +
"            try {\n" +
"                /*estanciando uma nova conexão*/\n" +
"                Connection connection = new Connection(serverSocket.accept(), portRmi, lookup);\n" +
"                Thread thread = new Thread(connection);\n" +
"                \n" +
"                /*iniciando troca de dados entre servidor e client em outra thread*/\n" +
"                thread.start();\n" +
"\n" +
"                ControladorServerGui.getjTextAreaConnection().append(\"cliente conectado \" + connection.getSocket().toString() + \"\\n\\n\");\n" +
"\n" +
"            } catch (IOException ex) {\n" +
"                ControladorServerGui.getjTextAreaConnection().append(ex+\"\\n\\n\");\n" +
"            }\n" +
"\n" +
"        }");
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"        runing.set(false);\n" +
"        try {\n" +
"            /*parando o servidor*/\n" +
"            serverSocket.close();\n" +
"        }");
    }//GEN-LAST:event_jLabel5MouseClicked

    public JButton getjButtonStart() {
        return jButtonStart;
    }

    public void setjButtonStart(JButton jButtonStart) {
        this.jButtonStart = jButtonStart;
    }

    public JButton getjButtonStop() {
        return jButtonStop;
    }

    public void setjButtonStop(JButton jButtonStop) {
        this.jButtonStop = jButtonStop;
    }

    public JFormattedTextField getjFormattedTextFieldPort() {
        return jFormattedTextFieldPort;
    }

    public void setjFormattedTextFieldPort(JFormattedTextField jFormattedTextFieldPort) {
        this.jFormattedTextFieldPort = jFormattedTextFieldPort;
    }

    public JLabel getjLabelIp() {
        return jLabelIp;
    }

    public void setjLabelIp(JLabel jLabelIp) {
        this.jLabelIp = jLabelIp;
    }

    public JLabel getjLabelPort() {
        return jLabelPort;
    }

    public void setjLabelPort(JLabel jLabelPort) {
        this.jLabelPort = jLabelPort;
    }

    public JScrollPane getjScrollPaneConnection() {
        return jScrollPaneConnection;
    }

    public void setjScrollPaneConnection(JScrollPane jScrollPaneConnection) {
        this.jScrollPaneConnection = jScrollPaneConnection;
    }

    public JTextArea getjTextAreaConnection() {
        return jTextAreaConnection;
    }

    public void setjTextAreaConnection(JTextArea jTextAreaConnection) {
        this.jTextAreaConnection = jTextAreaConnection;
    }

    public JTextField getjTextFieldIp() {
        return jTextFieldIp;
    }

    public void setjTextFieldIp(JTextField jTextFieldIp) {
        this.jTextFieldIp = jTextFieldIp;
    }

    public JButton getjButtonStartRmi() {
        return jButtonStartRmi;
    }

    public void setjButtonStartRmi(JButton jButtonStartRmi) {
        this.jButtonStartRmi = jButtonStartRmi;
    }

    public JButton getjButtonStartRmiAdd() {
        return jButtonStartRmiAdd;
    }

    public void setjButtonStartRmiAdd(JButton jButtonStartRmiAdd) {
        this.jButtonStartRmiAdd = jButtonStartRmiAdd;
    }

    public JFormattedTextField getjFormattedTextFieldPortRmi() {
        return jFormattedTextFieldPortRmi;
    }

    public void setjFormattedTextFieldPortRmi(JFormattedTextField jFormattedTextFieldPortRmi) {
        this.jFormattedTextFieldPortRmi = jFormattedTextFieldPortRmi;
    }

    public JFormattedTextField getjFormattedTextFieldPortSRmi() {
        return jFormattedTextFieldPortSRmi;
    }

    public void setjFormattedTextFieldPortSRmi(JFormattedTextField jFormattedTextFieldPortSRmi) {
        this.jFormattedTextFieldPortSRmi = jFormattedTextFieldPortSRmi;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabelBind() {
        return jLabelBind;
    }

    public void setjLabelBind(JLabel jLabelBind) {
        this.jLabelBind = jLabelBind;
    }

    public JLabel getjLabelPortSRmi() {
        return jLabelPortSRmi;
    }

    public void setjLabelPortSRmi(JLabel jLabelPortSRmi) {
        this.jLabelPortSRmi = jLabelPortSRmi;
    }

    public JLabel getjLabelPortaRmi() {
        return jLabelPortaRmi;
    }

    public void setjLabelPortaRmi(JLabel jLabelPortaRmi) {
        this.jLabelPortaRmi = jLabelPortaRmi;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public JTextArea getjTextAreaRmi() {
        return jTextAreaRmi;
    }

    public void setjTextAreaRmi(JTextArea jTextAreaRmi) {
        this.jTextAreaRmi = jTextAreaRmi;
    }

    public JTextField getjTextFieldBind() {
        return jTextFieldBind;
    }

    public void setjTextFieldBind(JTextField jTextFieldBind) {
        this.jTextFieldBind = jTextFieldBind;
    }

    public JTextField getjTextFieldLookup() {
        return jTextFieldLookup;
    }

    public void setjTextFieldLookup(JTextField jTextFieldLookup) {
        this.jTextFieldLookup = jTextFieldLookup;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonStart;
    private javax.swing.JButton jButtonStartRmi;
    private javax.swing.JButton jButtonStartRmiAdd;
    private javax.swing.JButton jButtonStop;
    private javax.swing.JFormattedTextField jFormattedTextFieldPort;
    private javax.swing.JFormattedTextField jFormattedTextFieldPortRmi;
    private javax.swing.JFormattedTextField jFormattedTextFieldPortSRmi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBind;
    private javax.swing.JLabel jLabelIp;
    private javax.swing.JLabel jLabelPort;
    private javax.swing.JLabel jLabelPortSRmi;
    private javax.swing.JLabel jLabelPortaRmi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPaneConnection;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaConnection;
    private javax.swing.JTextArea jTextAreaRmi;
    private javax.swing.JTextField jTextFieldBind;
    private javax.swing.JTextField jTextFieldIp;
    private javax.swing.JTextField jTextFieldLookup;
    // End of variables declaration//GEN-END:variables
}