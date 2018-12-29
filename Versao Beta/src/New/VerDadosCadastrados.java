/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;


import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Cidade;
import model.bean.Cliente;
import model.bean.Passagem;
import model.dao.CidadeDAO;
import model.dao.ClienteDAO;
import model.dao.PassagemDAO;

/**
 *
 * @author Lukas Souza
 */
public class VerDadosCadastrados extends javax.swing.JFrame {

    private Menu veioDoMenor;
   
    /*
    public VerDadosCadastrados() {
        initComponents();
    }
    */

    public void enviarNome(Menu veioDo1, String nome){
        jLabelNome.setText(nome);
        this.veioDoMenor = veioDo1;
    }
    public void enviarCpf(Menu veioDo1, String cpf) {
        jLabelCPF.setText(cpf);
        this.veioDoMenor =  veioDo1;
    }
    public void enviarRg(Menu veioDo1, String rg){
        jLabelRg.setText(rg);
        this.veioDoMenor = veioDo1;
    }
    public void enviarCidadeAtual(Menu veioDo1, String cidadeAtual){
       jLabelCidadeAtual.setText(cidadeAtual);
       this.veioDoMenor = veioDo1;
    }
    public void enviarDestino(Menu veioDo1, String destino){
        jLabelDestino.setText(destino);
        this.veioDoMenor = veioDo1;
    }
    public void enviarQtPassagens(Menu veioDo1, String qtPassagens){
        jLabelPQtPassagens.setText(qtPassagens);
        this.veioDoMenor = veioDo1;
    }
      public void enviarDataViagem(Menu veioDo1, String data){
        jLabelDataViagem.setText(data);
        this.veioDoMenor = veioDo1;
    }
    public void enviarValorDaViagem(Menu veioDol,String preco){
        jLabelPreco.setText(preco);
        this.veioDoMenor = veioDol;
    }
    //OBS - Inteiro 
    /*
    public void enviarQuantidadeDePassagem(Menor veioDo1 ,String quantidadeDePassagem){
        jLabePassagem.setText(quantidadeDePassagem);
    }
   */ 
    
    public VerDadosCadastrados(){
        initComponents();
        Conferirdados();
        DefaultTableModel modelo = (DefaultTableModel) jTableTabela.getModel();
        jTableTabela.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTableTabela.getModel();
        modelo.setNumRows(0);
        
        ClienteDAO cdao = new ClienteDAO();

        for (Cliente cliente : cdao.read()) {

            modelo.addRow(new Object[]{
                cliente.getIdCliente(),
                cliente.getNome(),
                cliente.getCpf(),
                cliente.getRg(),
                cliente.getCidadeAtual(),
                cliente.getCidadeDestino(),
                cliente.getData(),
                cliente.getQuantidade(),
                cliente.getPreco()
            });
        }
    }
    public void readJTableDados(String dados){
        
        DefaultTableModel modelo = (DefaultTableModel) jTableTabela.getModel();
        modelo.setNumRows(0);
        
        ClienteDAO cdao = new ClienteDAO();

        for (Cliente cliente : cdao.readDados(dados)) {

            modelo.addRow(new Object[]{
                cliente.getIdCliente(),
                cliente.getNome(),
                cliente.getCpf(),
                cliente.getRg(),
                cliente.getCidadeAtual(),
                cliente.getCidadeDestino(),
                cliente.getData(),
                cliente.getQuantidade(),
                cliente.getPreco()
            });
        }
        
    }
    //Conferi dados(
    public void Conferirdados(){
        ClienteDAO clienteDAO = new ClienteDAO();
        for(Cliente cliente : clienteDAO.read()){
            jComboBox.addItem(cliente);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        BttonCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelRg = new javax.swing.JLabel();
        jLabelCidadeAtual = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabelDestino = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabelPQtPassagens = new javax.swing.JLabel();
        jButtonConfirm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelPreco = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelDataViagem = new javax.swing.JLabel();
        jTextField1Bucas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Dados do Cadastro");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        BttonCancelar.setBackground(java.awt.Color.red);
        BttonCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BttonCancelar.setText("Cancelar");
        BttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttonCancelarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CPF:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("RG:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Cidade Atual:");

        jLabelCPF.setBackground(java.awt.Color.white);
        jLabelCPF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabelRg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabelCidadeAtual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Destino:");

        jLabelDestino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Passagem:");

        jLabelPQtPassagens.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButtonConfirm.setBackground(java.awt.Color.green);
        jButtonConfirm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonConfirm.setText("Confirm");
        jButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmActionPerformed(evt);
            }
        });

        jTableTabela.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTableTabela.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTableTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CPF", "RG", "ORIGEM", "DESTINO", "DATA", "QUANTIDADE", "PREÇO"
            }
        ));
        jTableTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabela);

        jButtonExcluir.setBackground(java.awt.Color.cyan);
        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonAtualizar.setBackground(new java.awt.Color(153, 102, 255));
        jButtonAtualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Valor:");

        jLabelPreco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPreco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Data da Viagem:");

        jLabelDataViagem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelDataViagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTextField1Bucas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1Bucas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1Bucas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setBackground(java.awt.Color.blue);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Conferir Dados :");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setBackground(new java.awt.Color(240, 124, 16));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDataViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButtonConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(BttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1Bucas, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jButton1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(26, 26, 26)
                                .addComponent(jLabelRg, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelPQtPassagens, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCidadeAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(530, 530, 530)
                                .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(106, 106, 106))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)
                                        .addContainerGap())))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelRg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCidadeAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPQtPassagens, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelDataViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabelPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtualizar)
                    .addComponent(BttonCancelar)
                    .addComponent(jButtonConfirm)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButton1)
                    .addComponent(jTextField1Bucas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198)
                .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jLabel1)
                .addContainerGap(526, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttonCancelarActionPerformed
        if(veioDoMenor != null){
            veioDoMenor.retornarNome(jLabelNome.getText());
            veioDoMenor.retornarCPF(jLabelCPF.getText());
            veioDoMenor.retornarRg(jLabelRg.getText());
            veioDoMenor.retornarCidadeAtual(jLabelCidadeAtual.getText());
            veioDoMenor.retornarDestino(jLabelDestino.getText());
            veioDoMenor.retornarQtPassagens(jLabelPQtPassagens.getText());
            veioDoMenor.retornarDataViagem(jLabelDataViagem.getText());
            this.dispose();
        } 
    }//GEN-LAST:event_BttonCancelarActionPerformed

    private void jButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmActionPerformed
        //Cliente
        Cliente cliente = new Cliente();
        ClienteDAO clientedao =  new ClienteDAO();
        cliente.setNome(jLabelNome.getText());
        cliente.setCpf(jLabelCPF.getText());
        cliente.setRg(jLabelRg.getText());
        
        //Cidade
        cliente.setCidadeAtual(jLabelCidadeAtual.getText());
        cliente.setCidadeDestino(jLabelDestino.getText());
        
        //Passagem
        cliente.setQuantidade(Integer.parseInt(jLabelPQtPassagens.getText()));
        cliente.setPreco(Double.parseDouble(jLabelPreco.getText()));
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(jLabelDataViagem.getText(), formatoData);
        cliente.setData(new Date(data.getYear(),data.getMonth().getValue(),data.getDayOfMonth()));
        clientedao.create(cliente);
        
        //Limpar campo de texto
        jLabelNome.setText("");
        jLabelCPF.setText("");
        jLabelRg.setText("");
        jLabelCidadeAtual.setText("");
        jLabelDestino.setText("");
        jLabelDataViagem.setText("");
        jLabelPQtPassagens.setText("");
        jLabelPreco.setText("");
        
        readJTable();
    }//GEN-LAST:event_jButtonConfirmActionPerformed

    private void jTableTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableTabelaMouseClicked

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
            if (jTableTabela.getSelectedRow() != -1) {
            Cliente cliente = new Cliente();
            ClienteDAO clientedao = new ClienteDAO();
            cliente.setIdCliente((int) jTableTabela.getValueAt(jTableTabela.getSelectedRow(), 0));
            clientedao.delete(cliente);
            
            //Limpar campo de texto
            jLabelNome.setText("");
            jLabelCPF.setText("");
            jLabelRg.setText("");
            jLabelCidadeAtual.setText("");
            jLabelDestino.setText("");
            jLabelDataViagem.setText("");
            jLabelPQtPassagens.setText("");
            jLabelPreco.setText("");
            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
         if (jTableTabela.getSelectedRow() != -1) {

            Cliente cliente = new Cliente();
            ClienteDAO clientedao = new ClienteDAO();
            //Cliente
            cliente.setNome(jLabelNome.getText());
            cliente.setCpf(jLabelCPF.getText());
            cliente.setRg(jLabelRg.getText());
            //Cidade
            cliente.setCidadeAtual(jLabelCidadeAtual.getText());
            cliente.setCidadeDestino(jLabelDestino.getText());
            
            cliente.setQuantidade(Integer.parseInt(jLabelPQtPassagens.getText()));
            cliente.setPreco(Double.parseDouble(jLabelPreco.getText()));
            DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(jLabelDataViagem.getText(), formatoData);
            cliente.setData(new Date(data.getYear(),data.getMonth().getValue(),data.getDayOfMonth()));
            cliente.setIdCliente((int) jTableTabela.getValueAt(jTableTabela.getSelectedRow(), 0));
            clientedao.update(cliente);

                //Limpar campo de texto
            jLabelNome.setText("");
            jLabelCPF.setText("");
            jLabelRg.setText("");
            jLabelCidadeAtual.setText("");
            jLabelDestino.setText("");
            jLabelDataViagem.setText("");
            jLabelPQtPassagens.setText("");
            jLabelPreco.setText("");
            readJTable();

        } 
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                  readJTableDados(jTextField1Bucas.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Cliente cleinte = (Cliente) jComboBox.getSelectedItem();
        JOptionPane.showMessageDialog(null,
                "ID: "+cleinte.getIdCliente()+
                "\nNome: "+cleinte.getNome()+
                "\nCPF: "+cleinte.getCpf()+
                "\nRG: "+cleinte.getRg()+
                "\nORIGEM: "+cleinte.getCidadeAtual()+
                "\nDESTINO: "+cleinte.getCidadeDestino()+
                "\nDATA da VIAGEM: "+cleinte.getData()+
                "\nQUANTIDADE: "+cleinte.getQuantidade()+
                "\nPREÇO: "+cleinte.getPreco()+" R$");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VerDadosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerDadosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerDadosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerDadosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerDadosCadastrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttonCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonConfirm;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JComboBox<Object> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCidadeAtual;
    private javax.swing.JLabel jLabelDataViagem;
    private javax.swing.JLabel jLabelDestino;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPQtPassagens;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextField jTextField1Bucas;
    // End of variables declaration//GEN-END:variables

 
}
