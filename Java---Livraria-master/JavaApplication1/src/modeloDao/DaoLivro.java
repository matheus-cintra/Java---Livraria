package modeloDao;

import modeloConnection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansLivro;

public class DaoLivro {
    ConexaoBD conex = new ConexaoBD();
    BeansLivro mod = new BeansLivro();
    
    public void Salvar(BeansLivro mod){
        try {
            conex.conexao();
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO books (title, isbn, publisher_id, price) values (?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getIsbn());
            pst.setString(3, mod.getEditora());
            pst.setFloat(3, mod.getPreco());
            JOptionPane.showMessageDialog(null, "Cadastro Salvo", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar\n" + ex, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        conex.desconecta();
    }
    
    public void Editar(BeansLivro mod) {
        try {
            conex.conexao();
            PreparedStatement pst = conex.con.prepareStatement("UPDATE books SET title=?, isbn=?, publisher_id=?, price=? WHERE isbn=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getIsbn());
            pst.setString(3, mod.getEditora());
            pst.setFloat(4, mod.getPreco());
            pst.setString(5, mod.getIsbn());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados atualizados com Sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar banco." + ex, "Erro!", JOptionPane.ERROR_MESSAGE);
        } 
        conex.desconecta();
    }
    
    public void Excluir(BeansLivro mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("DELETE FROM medicos WHERE isbn =?");
            pst.setString(1, mod.getIsbn());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluídos com Sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir do Banco." + ex, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        conex.desconecta();
    }
    
    public BeansLivro buscaLivro(BeansLivro mod) {
        conex.conexao();
        conex.executaSql("SELECT * FROM books WHERE isbn like '%" + mod.getConsulta() + "%'");
        try {
            conex.rs.first();
            mod.setNome(conex.rs.getString("title"));
            mod.setIsbn(conex.rs.getString("isbn"));
            mod.setEditora(conex.rs.getString("publisher_id"));
            mod.setPreco(conex.rs.getFloat("price"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Livro não cadastrado", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        conex.desconecta();
        return mod;
    }
}