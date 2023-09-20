package javasortAthos;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormSistemaAthos extends javax.swing.JFrame {
    ArrayList<Dados> lista = new ArrayList<>();
   
   
    Comparator<Dados>comparaClubes =(Dados d1,Dados d2)->d1.getClubes().compareTo(d2.getClubes());
    Comparator<Dados>comparaPosicao=(Dados d1,Dados d2)-> d1.getPos()- d2.getPos();
    Comparator<Dados>comparaAno=(Dados d1,Dados d2)-> d1.getAno()- d2.getAno();
    Comparator<Dados>comparaVitorias=(Dados d1,Dados d2)-> d1.getVitorias()- d2.getVitorias();
    Comparator<Dados>comparaDerrotas=(Dados d1,Dados d2)-> d1.getDerrotas()- d2.getDerrotas();
    Comparator<Dados>comparaEmpates=(Dados d1,Dados d2)-> d1.getEmpates()- d2.getEmpates();
    
    public FormSistemaAthos() { 
        initComponents();
        carregaArquivo();
        mostra();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblProx = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnOrdNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        cbOrdena = new javax.swing.JComboBox<>();
        txtBusca = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        rbLinear = new javax.swing.JRadioButton();
        rbBinaria = new javax.swing.JRadioButton();
        txtBuscaPos = new javax.swing.JTextField();
        btnBuscaPos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));

        lblProx.setBackground(new java.awt.Color(255, 255, 153));
        lblProx.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblProx.setForeground(new java.awt.Color(0, 255, 0));
        lblProx.setText("Dados dos clubes brasileiros");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Athos\\Downloads\\camisa-de-futebol.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        btnOrdNome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOrdNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasortAthos/check-list (1).png"))); // NOI18N
        btnOrdNome.setText("Ordenar");
        btnOrdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNomeActionPerformed(evt);
            }
        });

        tabelaDados.setAutoCreateRowSorter(true);
        tabelaDados.setBackground(new java.awt.Color(153, 255, 153));
        tabelaDados.setForeground(new java.awt.Color(0, 0, 255));
        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ano", "Posicao", "Clube", "Vitoria", "Derrota", "Empate", "Vento Min", "Vento Max", "Direção Vento"
            }
        ));
        tabelaDados.setGridColor(new java.awt.Color(0, 102, 0));
        jScrollPane1.setViewportView(tabelaDados);

        cbOrdena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ano", "Posição", "Clube", "Vitoria", "Derrota", "Empate", " " }));
        cbOrdena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdenaActionPerformed(evt);
            }
        });

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });

        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasortAthos/task.png"))); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbLinear);
        rbLinear.setText("Linear");

        buttonGroup2.add(rbBinaria);
        rbBinaria.setText("Binaria");
        rbBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBinariaActionPerformed(evt);
            }
        });

        txtBuscaPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaPosActionPerformed(evt);
            }
        });

        btnBuscaPos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasortAthos/task.png"))); // NOI18N
        btnBuscaPos.setText("Buscar");
        btnBuscaPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaPosActionPerformed(evt);
            }
        });

        jLabel3.setText("Digite a posição");

        jLabel4.setText("Digite o clube");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOrdNome, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(cbOrdena, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(txtBuscaPos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBuscaPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rbLinear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbBinaria)
                                    .addComponent(btnBusca))))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscaPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscaPos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbLinear)
                            .addComponent(rbBinaria))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void carregaArquivo(){
     String csvFile = "Cópia de Tabela_Clubes .csv";
        String line = "";
        String[] leitura = null; 
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) { 
                Dados times = new Dados();
                leitura = line.split(",");
                times.setAno (Integer.parseInt(leitura[0]));
                times.setPos(Integer.parseInt(leitura[1]));
                times.setClubes(leitura[2]);
                times.setVitorias (Integer.parseInt(leitura[3]));
                times.setDerrotas(Integer.parseInt(leitura[4]));
                times.setEmpates(Integer.parseInt(leitura[5]));
                
                lista.add(times); 
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
    void mostra(){
        
        tabelaDados.setModel(new DefaultTableModel(null,new String[]{"Ano","Posição","Clubes","Vitorias","Derrotas","Empate"}));
       
        DefaultTableModel model = (DefaultTableModel)tabelaDados.getModel();
        Object rowData[] = new Object[6];
        for(Dados d: lista)
        {
            rowData[0] = d.getAno(); 
            rowData[1] = d.getPos();
            rowData[2] = d.getClubes();
            rowData[3] = d.getVitorias();
            rowData[4] = d.getDerrotas();
            rowData[5] = d.getEmpates();
            
            
            model.addRow(rowData);
        }
    }
   
    
   
    
    
    private void btnOrdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNomeActionPerformed
      
       switch(cbOrdena.getSelectedIndex()){
           case 0:lista.sort(comparaAno); 
           break;
           
           case 1:lista.sort(comparaPosicao);
          break;
          
          case 2: Collections.sort(lista);
          break;
          
          case 3: lista.sort(comparaVitorias);
          break;
          
          case 4: lista.sort(comparaDerrotas);
          break;
          
          case 5: lista.sort(comparaEmpates);;
          break;
          
          
       } 
       mostra();
    }//GEN-LAST:event_btnOrdNomeActionPerformed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        
        Dados dadoBusca = new Dados();
        dadoBusca.setClubes(txtBusca.getText());
        
        int r=0;
        int comparacoes = 0;
        if(rbLinear.isSelected()){
            for (Dados d : lista) {
            comparacoes++; 
            if (d.equals(dadoBusca)) {
                r = lista.indexOf(dadoBusca);
                break; 
              }
            }   
            
        }
        else if(rbBinaria.isSelected()){
        
        r=Collections.binarySearch(lista, dadoBusca);
        comparacoes++;
    }
        if (r == -1) {
        JOptionPane.showMessageDialog(null, "Não encontrado: "+ r );
        JOptionPane.showMessageDialog(null, "Comparações: " + comparacoes);
    } else {
        JOptionPane.showMessageDialog(null, "Encontrado, index: " + r );
        JOptionPane.showMessageDialog(null,"Comparações: " + comparacoes);
    }
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void cbOrdenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrdenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrdenaActionPerformed

    private void rbBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBinariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBinariaActionPerformed

    private void txtBuscaPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaPosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaPosActionPerformed

    private void btnBuscaPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaPosActionPerformed
    Dados dadoBusca = new Dados();
    int posicao = Integer.parseInt(txtBuscaPos.getText());
    dadoBusca.setPos(posicao);
    int r = -1;
    int comparacoes = 0;

    if(rbLinear.isSelected()) {
        for (int i = 0; i < lista.size(); i++) {
            comparacoes++;
            if (lista.get(i).getPos() == posicao) {
                r = i;
                break;
            }
        }
    } else if(rbBinaria.isSelected()) {
       
        Collections.sort(lista, comparaPosicao);
        r = Collections.binarySearch(lista, dadoBusca, comparaPosicao);
        comparacoes++;
    }

    if (r == -1) {
        JOptionPane.showMessageDialog(null, "Não encontrado "+ r);
        JOptionPane.showMessageDialog(null, "Comparações: " + comparacoes);
    } else {
        JOptionPane.showMessageDialog(null, "Encontrado, index: " + r ); 
        JOptionPane.showMessageDialog(null, "Comparações: " + comparacoes);
    }
    }//GEN-LAST:event_btnBuscaPosActionPerformed

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
            java.util.logging.Logger.getLogger(FormSistemaAthos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistemaAthos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistemaAthos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistemaAthos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistemaAthos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnBuscaPos;
    private javax.swing.JButton btnOrdNome;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProx;
    private javax.swing.JRadioButton rbBinaria;
    private javax.swing.JRadioButton rbLinear;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtBuscaPos;
    // End of variables declaration//GEN-END:variables
}
