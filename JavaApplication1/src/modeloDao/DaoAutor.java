package modeloDao;

import modeloConnection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansAutor;

public class DaoAutor {
    ConexaoBD conex = new ConexaoBD();
    BeansAutor mod = new BeansAutor();
    
    public void Salvar(BeansAutor mod) {
        try {
            conex.conexao();
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO authors (name, fname) VALUES (?,?)");
            pst.setString(1, mod.getNome_ator());
            pst.setString(2, mod.getSobrenome_autor());
            JOptionPane.showMessageDialog(null, "Cadastro de autor realizado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar autor no banco.\n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        conex.desconecta();
    }
}
