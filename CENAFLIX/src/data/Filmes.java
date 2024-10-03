/*Este é o package 'DATA', onde estão localizadas as classes 'Filmes' e 'FilmesDao'*/

package data;

/* Criação da classe 'Filmes', suas variaveis e atributos*/
public class Filmes {
    
    private String nome;
    private String datalancamento;
    private String categoria;
    
    public Filmes(){
        
    }
    /*Aqui foram criados o Getters & Setters para que outras classes possam acessar as variaveis e seus atributos que estão privadas*/
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getDatalancamento(){
        return datalancamento;
    }
    public void setDatalancamento(String datalancamento){
        this.datalancamento = datalancamento;
    }
    
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
}

/*
*@author Evandson Vieira
*@version 1.0
*@since Setembro de 2024

* Esta é a  'Classe Filmes' que é responsável por conter todas as variáveis, os atributos
e os métodos getters e setters, para que as outras classes consigam acesso
as variáveis, sem os métodos Get & Set, as informações aqui ficariam sem acesso.
As variáveis são; Nome, Datalancamento & Categoria
*Todas as variáveis desta classe são privadas
*/