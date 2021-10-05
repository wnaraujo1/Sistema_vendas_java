package controller;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.fornecedores;


public class DAOFornecedores {
    private final Connection conexao = new conecta().getConnection();
    private PreparedStatement stmt;
    private ResultSet rs;
            
    
    
    public void Inserir(fornecedores f)
    {
        try {
            String sql = "INSERT INTO clientes (nome, cnpj, telefone, email) VALUES(?,?,?,?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getCnpj());
            stmt.setString(3, f.getTelefone());
            stmt.setString(4, f.getEmail());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso");
            stmt.close();            
        } catch (HeadlessException | SQLException e) {
        }
        }
    public void Update(fornecedores f)
    {
        try {
            String sql = "UPDATE clientes SET nome=?, cpf=?, telefone=?, email=?, limite_credito=? WHWERE id=?";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getCnpj());
            stmt.setString(3, f.getTelefone());
            stmt.setString(4, f.getEmail());
            stmt.setInt(5, f.setId_fornecedor());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso");
            stmt.close();            
        } catch (HeadlessException | SQLException e) {
        }
        }
    
    public void Delete(fornecedores f)
    {
        try {
            String sql = "DELETE FROM cliente WHWERE id=?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, f.setId_fornecedor());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso");
            stmt.close();            
        } catch (HeadlessException | SQLException e) {
        }
        }
    
    public ArrayList<fornecedores> Listar()
    {
        ArrayList<fornecedores> listaDados = new ArrayList<>();
            try {
                String sql = "SELECT * FROM clientes";
                stmt = conexao.prepareStatement(sql);
                rs = stmt.executeQuery();
                while(rs.next())
                {
                    fornecedores f = new fornecedores();
                    f.setId_fornecedor(rs.getInt("id_fornecedor"));
                    f.setNome(rs.getString("nome"));
                    f.setCnpj(rs.getNString("cnpj"));
                    f.setTelefone(rs.getNString("telefone"));
                    f.setEmail(rs.getNString("email"));       
                    listaDados.add(f);
                }
            }catch (SQLException e) {
    }
    return listaDados;
    
    }
}