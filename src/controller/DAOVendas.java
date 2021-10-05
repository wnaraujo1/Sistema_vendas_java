package controller;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.vendas;


public class DAOVendas {
    private final Connection conexao = new conecta().getConnection();
    private PreparedStatement stmt;
    private ResultSet rs;
            
    
    
    public void Inserir(vendas v)
    {
        try {
            String sql = "INSERT INTO vendas (id_cliente, id_produto, valor_unitario, total) VALUES(?,?,?,?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, v.getId_cliente());
            stmt.setInt(2, v.getId_produto());
            stmt.setFloat(3, v.getValor_unitario());
            stmt.setFloat(4, v.getTotal());            
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso");
            stmt.close();            
        } catch (HeadlessException | SQLException e) {
        }
        }
    public void Update(vendas v)
    {
        try {
            String sql = "UPDATE vendas SET id_cliente=?, id_produto=?, valor_unitario=?, total=? WHWERE id=?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, v.getId_cliente());
            stmt.setInt(2, v.getId_produto());
            stmt.setFloat(3, v.getValor_unitario());
            stmt.setFloat(4, v.getTotal());
            stmt.setInt(5, v.getId_venda());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso");
            stmt.close();            
        } catch (HeadlessException | SQLException e) {
        }
        }
    
    public void Delete(vendas v)
    {
        try {
            String sql = "DELETE FROM vendas WHWERE id=?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(5, v.getId_venda());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso");
            stmt.close();            
        } catch (HeadlessException | SQLException e) {
        }
        }
    
    public ArrayList<vendas> Listar()
    {
        ArrayList<vendas> listaDados = new ArrayList<>();
            try {
                String sql = "SELECT * FROM vendas";
                stmt = conexao.prepareStatement(sql);
                rs = stmt.executeQuery();
                while(rs.next())
                {
                    vendas v = new vendas();
                    v.setId_venda(rs.getInt("id_venda"));
                    v.setId_cliente(rs.getInt("id_cliente"));
                    v.setId_produto(rs.getInt("id_produto"));
                    v.setValor_unitario(rs.getFloat("valor_unitario"));
                    v.setTotal(rs.getFloat("total"));                    
                    listaDados.add(v);
                }
            }catch (SQLException e) {
    }
    return listaDados;
    
    }
}