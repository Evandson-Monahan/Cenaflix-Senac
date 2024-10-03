/*Este é o package 'view' que contém a classe JFrame Form 'TelaCenaFlix' onde está a inteface gráfica do projeto*/

package view;

/*Abaixo estão todas as importações de bibliotecas e de outras classes que são necessárias para o funcionamento desta classe*/
import data.Filmes;
import data.FilmesDao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*Abaixo está a classe que contém todas as variáveis/atributos e todos os botões e ações da interface gráfica do projeto*/
public class TelaCenaFlix extends javax.swing.JFrame {
    
    private final String [] tableColumns = {"Nome", "Data de Lançamento", "Categoria"};
  
    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);
          
    private List<Filmes> filmesList = new ArrayList<>(); 

    public TelaCenaFlix() {
        initComponents();
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtDatalancamento = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFilmes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel1.setText("CADASTRO DE FILME");

        jLabel2.setFont(new java.awt.Font("Poppins ExtraBold", 0, 36)); // NOI18N
        jLabel2.setText("CENAFLIX");

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel3.setText("Categoria:");

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel4.setText("Nome do Filme:");

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel5.setText("Data de Lançamento:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        tblFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Data de Lançamento", "Categoria"
            }
        )
        {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        }
    );
    jScrollPane1.setViewportView(tblFilmes);

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
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNome))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDatalancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnConsultar)
                                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnCadastrar))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtualizar)
                    .addGap(37, 37, 37)
                    .addComponent(btnExcluir)
                    .addGap(16, 16, 16))))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(154, 154, 154)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(183, 183, 183)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)))
            .addGap(16, 16, 16))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel1)
            .addGap(19, 19, 19)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(txtDatalancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(35, 35, 35)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnCadastrar)
                .addComponent(btnConsultar)
                .addComponent(btnAtualizar)
                .addComponent(btnExcluir))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Criação do Action Performed do botão 'Cadastrar'. Aqui está tudo o que é necessário para que o botão funcione e cadastre os filmes no BD e na tabela de filmes da interface*/
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Filmes filme = new Filmes();
            FilmesDao dao = new FilmesDao();
            boolean status;
            int resposta;
            
            filme.setNome(txtNome.getText());
            filme.setDatalancamento(txtDatalancamento.getText());
            filme.setCategoria(txtCategoria.getText());
            
            dao = new FilmesDao();
            
            status = dao.conectar();
            if(status == false){
                JOptionPane.showMessageDialog(null, "Erro de conexão");
            } else {
                resposta = dao.cadastrar(filme);
                if(resposta == 1){
                    JOptionPane.showMessageDialog(null, "Dados incluidos com suscesso");
                    
                    emptyFields();
                    getFilmes();
        
                    if (!emptyFields()){
                    inserirFilme(getFilmes());
                    
                    txtNome.setText("");
                    txtDatalancamento.setText("");
                    txtCategoria.setText("");
                    
                    txtNome.requestFocus();
                } else if (resposta == 1062){
                    JOptionPane.showMessageDialog(null, "Este filme já foi cadastrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar filme");
                }
                atualizarTabela();
                dao.desconectar();
            }
}
    }//GEN-LAST:event_btnCadastrarActionPerformed

    /*Criação do Action Performed do botão 'Excluir'. Aqui está tudo o que é necessário para que o botão funcione e exclua os filmes no BD e na tabela de filmes da interface*/
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        FilmesDao dao = new FilmesDao();
                boolean status = dao.conectar();
                if (status == false){
                    JOptionPane.showMessageDialog(null, "erro de conexão");
                } else {
                    status = dao.limpar(txtNome.getText());
                    if (status == true){
                        JOptionPane.showMessageDialog(null, "Filme excluído com sucesso");
                        
                        txtNome.requestFocus();
                        txtNome.setText("");
                        txtDatalancamento.setText("");
                        txtCategoria.setText("");
                        
                        btnExcluir.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro na exclusão do filme");
                    }
                    getPosicaoFilme();
                    excluirFilme(getPosicaoFilme());
                    atualizarTabela();
                    dao.desconectar();
                }
    }//GEN-LAST:event_btnExcluirActionPerformed

     /*Criação do Action Performed do botão 'Consultar'. Aqui está tudo o que é necessário para que o botão funcione e consulte os filmes no BD e na tabela de filmes da interface*/
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String filmes;
                filmes = txtNome.getText();
                FilmesDao dao = new FilmesDao();
                boolean status = dao.conectar();
                if (status == true){
                    Filmes filme = dao.consultar(filmes);
                    System.out.println(dao.consultar(filmes));
                    if (filme == null){
                        JOptionPane.showMessageDialog(null, "Filme não localizado");
                    } else {
                        txtNome.setText(filme.getNome());
                        txtDatalancamento.setText(filme.getDatalancamento());
                        txtCategoria.setText(String.valueOf(filme.getCategoria()));
                        
                        btnExcluir.setEnabled(true);
                    }
                    dao.desconectar();
                } else {
                    JOptionPane.showMessageDialog(null, "erro de conexão");
                }
    }//GEN-LAST:event_btnConsultarActionPerformed

     /*Criação do Action Performed do botão 'Atualizar'. Aqui está tudo o que é necessário para que o botão funcione e atualize os filmes no BD e na tabela de filmes da interface*/
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Filmes filmes = new Filmes();
                FilmesDao dao;
                boolean status;
                int resposta;
                
                filmes.setNome(txtNome.getText());
                filmes.setDatalancamento(txtDatalancamento.getText());
                filmes.setCategoria(txtCategoria.getText());
                dao = new FilmesDao();
                status = dao.conectar();
                if (status == false){
                    JOptionPane.showMessageDialog(null, "Erro de conexão");
                } else {
                    resposta = dao.atualizar(filmes);
                    System.out.println(filmes.getNome());
                    if (resposta == 1){
                        JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso");
                        
                        txtNome.setText("");
                        txtDatalancamento.setText("");
                        txtCategoria.setText("");
                        
                        txtNome.requestFocus();
                    } else if (resposta == 1060) {
                        JOptionPane.showMessageDialog(null, "Filme já foi cadastrado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao tentar inserir dados");
                    }
                    //atualizarTabela();
                    carregarFilmes();
                    dao.desconectar();
                }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    /*Criação do método que avalia se os campos de inserção de informações estão vazios ou não, disparando exceptions caso estejam vazios*/
private boolean emptyFields(){
    
    boolean empty = false;
    
    if(txtNome.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(null, "ATENÇÃO! Nome não pode ser vazio.");
        empty = true;
    }
    else if (txtDatalancamento.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "ATENÇÃO! Data de Lançamento não pode ser vazio.");
            empty = true;
    } else if (txtCategoria.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Atenção! Categoria não pode ser vazio.");
            empty = true;
    }
      return empty;
    }
    
    /*Este método pega os filmes que foram cadastrados*/
    private Filmes getFilmes(){
    
        Filmes filme = new Filmes();
        
        filme.setNome(txtNome.getText().toUpperCase());
        filme.setDatalancamento(txtDatalancamento.getText().toLowerCase());
        filme.setCategoria(txtCategoria.getText());
        
        return filme;
    }
    
    /*Este método é chamado no botão de 'cadastrar' ele coloca os filmes na JTable*/
    private void inserirFilme(Filmes filme){
    
    filmesList.add(filme);
    atualizarTabela();
    }
    
    /*Este método é chamado no botão 'atualizar' e atuzalia o JTable*/
    private void atualizarTabela(){
    
    if(!filmesList.isEmpty()){
        
        Filmes filme;
        
        tableModel = new DefaultTableModel(tableColumns, 0);
        
        for(int i = 0; i < filmesList.size(); i++){
        filme = filmesList.get(i);
        
        String[] rowData = {filme.getNome(), filme.getDatalancamento(), filme.getCategoria()};
        
        tableModel.addRow(rowData);
        }
        
        tblFilmes.setModel(tableModel);
    } else {
        
        tableModel = new DefaultTableModel (tableColumns, 0);
        tblFilmes.setModel(tableModel);
    }
  
}
    
    /*Este método seleciona a posição do filme na JTable e aguarda o que o usuário vai decidir fazer com o que foi selecionado*/
    private int getPosicaoFilme(){
    
    int posFilme = tblFilmes.getSelectedRow();
    
    if(posFilme == -1){
        JOptionPane.showMessageDialog(null, "Selecione um Filme.");
    }
    return posFilme;
    }
    
    /*Este método é chamado no botão 'excluir e exclui o filme da JTable'*/
     private void excluirFilme(int posFilme){
    
    if(posFilme >= 0){
        String[] options = {"Sim", "Não"};
        
        int deletar = JOptionPane.showOptionDialog(rootPane, "Tem certeza que deseja excluir?", "Exclusão de Filme.", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    
    if(deletar == 0){
        filmesList.remove(posFilme);
        
        atualizarTabela();
    } else{
        tblFilmes.clearSelection();
    }
    }
    }
     
     /*Este método pega todos os filmes que foram adicionados no BD e coloca-os amostra na JTable da interface gráfica*/
     private void carregarFilmes() {
    try {
        List<Filmes> filmes = new FilmesDao().listarFilmes();
        DefaultTableModel model = (DefaultTableModel) tblFilmes.getModel();
        model.setRowCount(0);

        for (Filmes filme : filmes) {
            Object[] row = new Object[]{filme.getNome(), filme.getDatalancamento(), filme.getCategoria()};
            model.addRow(row);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao carregar filmes: " + ex.getMessage());
    }
}


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
            java.util.logging.Logger.getLogger(TelaCenaFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCenaFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCenaFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCenaFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCenaFlix().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFilmes;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtDatalancamento;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

}

/*
*@author Evandson Vieira
*@version 1.0
*@since Setembro de 2024

* Esta é a 'Classe TelaCenaflix' que é a responsável por conter todos os action performerd dos botões da interface gráfica do projeto e,
também, utiliza os métodos criados em outras classes, sendo os métodos acionados quando o usuário clica nos botões da interface gráfica.
*Os action performed dos botões que cosntam nesta classe são; btnCadastrar, btnExcluir, btnConsultar, btnAtualizar, btnExcluir.
*Esta classe também possui três métodos com código próprio. São eles ; EmptyField, AtualizarTabela & CarregarFilmes.
*Os demais métodos apenas acionam métodos criados em outras classes.
*/