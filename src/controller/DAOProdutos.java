package controller;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.produtos;


public class DAOProdutos {
    private final Connection conexao = new conecta().getConnection();
    private PreparedStatement stmt;
    private ResultSet rs;
            
    
    
    public void Inserir(produtos p)
    {
        try {
            String sql = "INSERT INTO produtos (estoque, id_fornecedor, descricao, preco_unitario) VALUES(?,?,?,?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, p.getEstoque());
            stmt.setInt(2, p.getId_fornecedor());
            stmt.setString(3, p.getDescricao());
            stmt.setFloat(4, p.getPreco_unitario());            
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso");
            stmt.close();            
        } catch (HeadlessException | SQLException e) {
        }
        }
    public void Update(produtos p)
    {
        try {
            String sql = "UPDATE produtos SET estoque=?, id_fornecedor=?, descricao=?, preco_unitario=? WHWERE id=?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, p.getEstoque());
            stmt.setInt(2, p.getId_fornecedor());
            stmt.setString(3, p.getDescricao());
            stmt.setFloat(4, p.getPreco_unitario());  
            stmt.setInt(5, p.getId_produto());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso");
            stmt.close();            
        } catch (HeadlessException | SQLException e) {
        }
        }
    
    public void Delete(produtos p)
    {
        try {
            String sql = "DELETE FROM produtos WHWERE id=?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, p.getId_produto());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso");
            stmt.close();            
        } catch (HeadlessException | SQLException e) {
        }
        }
    
    public ArrayList<produtos> Listar()
    {
        ArrayList<produtos> listaDados = new ArrayList<>();
            try {
                String sql = "SELECT * FROM produtos";
                stmt = conexao.prepareStatement(sql);
                rs = stmt.executeQuery();
                while(rs.next())
                {
                    produtos p = new produtos();
                    p.setId_produto(rs.getInt("id_produto"));
                    p.setEstoque(rs.getInt("estoque"));
                    p.setId_fornecedor(rs.getInt("id_fornecedor"));
                    p.setDescricao(rs.getString("descricao"));
                    p.setPreco_unitario(rs.getInt("preco_unitario"));                           
                    listaDados.add(p);
                }
            }catch (SQLException e) {
    }
    return listaDados;
    
    }
}
