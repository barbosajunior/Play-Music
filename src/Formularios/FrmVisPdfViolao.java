package Formularios;


import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class FrmVisPdfViolao extends javax.swing.JInternalFrame {
    final String caminho = "C://MUSIC PLAY//MusicasPdfViolao//";
    FileInputStream entrada;
    FileOutputStream saida;
    File arquivo;
    JFileChooser seleccionado = new JFileChooser();
    File arq;
    byte[] bytesImg;    

    public FrmVisPdfViolao() {
        initComponents();
         try (Stream<Path> walk = Files.walk(Paths.get(caminho))) {
            List<String> result = walk.filter(Files::isRegularFile)
                    .map(x -> x.getFileName().toString()).collect(Collectors.toList());

            Object[][] dados = new Object[result.size()][1];

            for (int i = 0; i < result.size(); i++) {
                dados[i] = new Object[]{result.get(i).split("\\.")[0]};
            }

            DefaultTableModel table = new DefaultTableModel(dados, new String[]{"Arquivo Pdf"});
            tblmusicas.setModel(table);

         } catch (IOException e) {
            System.out.printf("Erro: %s", e.getMessage());
         }
        
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmusicas = new javax.swing.JTable();
        Btnsair = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmusica = new javax.swing.JTextField();

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(java.awt.Color.red);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/dj_peq.png"))); // NOI18N
        jLabel9.setText("Músicas Cadastradas em PDF :");

        tblmusicas.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        tblmusicas.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblmusicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblmusicas.setRowHeight(26);
        tblmusicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmusicasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblmusicas);

        Btnsair.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Btnsair.setForeground(java.awt.Color.blue);
        Btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Sai_Peq.png"))); // NOI18N
        Btnsair.setText("Sair");
        Btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsairActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setText("Músicas em PDF :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.blue);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/abrir_peq.png"))); // NOI18N
        jLabel6.setText(" Música :");

        txtmusica.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtmusica.setForeground(java.awt.Color.blue);
        txtmusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmusicaActionPerformed(evt);
            }
        });
        txtmusica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmusicaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmusica, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btnsair)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(437, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(420, 420, 420))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel9)
                    .addContainerGap(857, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Btnsair)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel9)
                    .addContainerGap(534, Short.MAX_VALUE)))
        );

        setBounds(0, 0, 1274, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void tblmusicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmusicasMouseClicked
        // clicou na tabela
         int linha=tblmusicas.getSelectedRow();
         txtmusica.setText(tblmusicas.getValueAt(linha,0).toString());
         try {
	File pdfFile = new File("C:\\Music Play\\MusicasPdfViolao\\"+txtmusica.getText()+".pdf");
	if (pdfFile.exists()) {
		if (Desktop.isDesktopSupported()) {
			Desktop.getDesktop().open(pdfFile);
		} else {
			System.out.println("Awt Desktop não disponível");
		}
	} else {
		System.out.println("Arquivo Pdf  inexistente");
	}
	System.out.println("Done");
         } catch (Exception ex) {
            }  
    }//GEN-LAST:event_tblmusicasMouseClicked

    private void BtnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsairActionPerformed

        this.dispose();
    }//GEN-LAST:event_BtnsairActionPerformed

    private void txtmusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmusicaActionPerformed
        // Não é usado.
    }//GEN-LAST:event_txtmusicaActionPerformed

    private void txtmusicaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmusicaKeyReleased

    }//GEN-LAST:event_txtmusicaKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnsair;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblmusicas;
    private javax.swing.JTextField txtmusica;
    // End of variables declaration//GEN-END:variables
}
