/*Este é o package 'DATA', onde estão localizadas as classes 'Filmes' e 'FilmesDao'*/

package data;

/*Abaixo estão todas as importações de bibliotecas necessárias para o funcionamento do código dentro desta classe*/
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import view.TelaCenaFlix;

/*Abaixo está a classe 'FilmesDao' que possui a conexão do projeto com o BD MySQL, também estão suas variáveis e atributos*/
public class FilmesDao {
    /*Variáveis e atributos para a conexão com o BD*/
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
    /*Criação do método 'conectar' que será acionado algumas vezes durante o projeto*/
    public boolean conectar(){
       
        /*Criação de um bloco TRY-CATCH para realização da conexão com o BD*/
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cenaflix_bd", "admin", "04abr1994");
            JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso!");
            return true;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não está disponível na biblioteca");
            return false;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sintaxe de comando invalida " + ex.getMessage());
            return false;
        }
    }
    
    /*Criação do método 'cadastrar' que também será acionado algumas vezes durante o projeto e um bloco TRY-CATCH, que impede do sistema quebrar enquando roda*/
    public int cadastrar(Filmes func){
        int status;
        /*O TRY-CATCH serve, também, para que as mensagens de possíveis quebras de sistemas cheguem até o usuário de forma mais agradável*/
        try{
            
            if (conn == null) {
                if (!conectar()){
                    return -1;
                }
}           /*Abaixo está a função que insere no BD as informações passadas pelo usuário*/
            st = conn.prepareStatement("INSERT INTO filmes (nome, datalancamento, categoria)VALUES (?, ?, ?)");
            st.setString(1, func.getNome());
            st.setString(2, func.getDatalancamento());
            st.setString(3, func.getCategoria());
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex){
            System.out.println("Erro ao salvar : " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
    
    /*Criação do método 'limpar' que será usando algumas vezes durante o projeto*/
     public boolean limpar(String nome){
        try {
             
            /*Abaixo está a função que limpa do BD as informações passadas pelo usuário*/
            st = conn.prepareStatement("DELETE FROM filmes WHERE nome = ?");
            st.setString(1, nome);
            st.executeUpdate();
            return true;
        } catch (SQLException ex){
            return false;
        }
    }
    
     /*Criação do método que será acionado algumas vezes durante o projeto*/
    public Filmes consultar (String nome){
    
          try{
              
              /*Abaixo está a função que consulta no BD as informações passadas pelo usuário*/
              Filmes filme = new Filmes();
              st = conn.prepareStatement("SELECT * FROM filmes WHERE nome = ?");
              st.setString(1, nome);
              rs = st.executeQuery();
              
              if(rs.next()){
                  filme.setNome(rs.getString("nome"));
                  filme.setDatalancamento(rs.getString("datalancamento"));
                  filme.setCategoria(rs.getString("categoria"));
                  return filme;
              } else {
                  return null;
              }
          } catch (SQLException ex){
              System.out.println("Erro ao conectar : " + ex.getMessage());
              return null;
          }
    }
    
    /*Criação do método que atualiza o BD*/
    public int atualizar (Filmes func){
        int status;
        try{ 
            st = conn.prepareStatement("UPDATE funcionarios SET nome = ?, datalancamento = ?, cetegoria = ? WHERE id = ?");
            st.setString(1, func.getNome());
            st.setString(2, func.getDatalancamento());
            st.setString(3, func.getCategoria());
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex){
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }
    
    /*Aqui é a parte da classe 'FilmesDao lista no JTable (tblFilmes) todos os filmes registrados no BD'*/
    public List<Filmes> listarFilmes() throws SQLException {
    List<Filmes> filmes = new ArrayList<>();
    Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cenaflix_bd", "admin", "04abr1994");
    String sql = "SELECT * FROM filmes";
    PreparedStatement stmt = conn.prepareStatement(sql);
    ResultSet rs = stmt.executeQuery();

    while (rs.next()) {
        Filmes filme = new Filmes();
        filme.setNome(rs.getString("nome"));
        filme.setDatalancamento(rs.getString("datalancamento"));
        filme.setCategoria(rs.getString("categoria"));
        filmes.add(filme);
    }

    rs.close();
    stmt.close();
    conn.close();
    return filmes;
}

    /*E por fim, a criação do método que desconecta o BD. Ele será acionado durante o projeto*/
    public void desconectar(){
        try{
            conn.close();
        } catch (SQLException ex){
        
        }
    }
    
    /*Abaixo foi adicionado um método 'main' só para que a classe pudesse funcionar.*/
     public static void main (String[] arsg){
    
    }
}

/*
*@author Evandson Vieira
*@version 1.0
*@since Setembro de 2024

* Esta é a 'Classe FilmesDao' que é a responsável por conter a conexão do projeto com o banco de dados e possuir 
alguns métodos que serão utilizados na classe da interface gráfica do projeto.
*Além das variáveis de conexão, os métodos que aqui estão são; Conectar, Cadastrar, Limpar, Consultar, Atualizar & Desconectar.
*/