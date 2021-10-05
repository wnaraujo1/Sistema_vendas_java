package controller;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.clientes;


public class DAOClientes {
    private final Connection conexao = new conecta().getConnection();
    private PreparedStatement stmt;
    private ResultSet rs;
            
    
    
    public void Inserir(clientes c)
    {
        try {
            String sql = "INSERT INTO clientes (nome, cpf, telefone, email, limite_credito) VALUES(?,?,?,?,?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCpf());
            stmt.setString(3, c.getEmail());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.setLimite_credito());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso");
            stmt.close();            
        } catch (HeadlessException | SQLException e) {
        }
        }
    public void Update(clientes c)
    {
        try {
            String sql = "UPDATE clientes SET nome=?, cpf=?, telefone=?, email=?, limite_credito=? WHWERE id=?";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCpf());
            stmt.setString(3, c.getEmail());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.setLimite_credito());
            stmt.setInt(6, c.getId_cliente());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso");
            stmt.close();            
        } catch (HeadlessException | SQLException e) {
        }
        }
    
    public void Delete(clientes c)
    {
        try {
            String sql = "DELETE FROM cliente WHWERE id=?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, c.getId_cliente());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso");
            stmt.close();            
        } catch (HeadlessException | SQLException e) {
        }
        }
    
    public ArrayList<clientes> Listar()
    {
        ArrayList<clientes> listaDados = new ArrayList<>();
            try {
                String sql = "SELECT * FROM clientes";
                stmt = conexao.prepareStatement(sql);
                rs = stmt.executeQuery();
                while(rs.next())
                {
                    clientes c = new clientes();
                    c.setId_cliente(rs.getInt("id_cliente"));
                    c.setNome(rs.getString("nome"));
                    c.setCpf(rs.getString("cpf"));
                    c.setEmail(rs.getString("email"));
                    c.setTelefone(rs.getString("telefone"));                    
                    c.setLimite_credito(rs.getFloat("limite_credito"));
                    listaDados.add(c);
                }
            }catch (SQLException e) {
    }
    return listaDados;
    
    }
}