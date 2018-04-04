/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Customers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author duy
 */
public class CustomersModel {

    public boolean dangKy(Customers customers) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankinformation?useUnicode=true&characterEncoding=utf-8", "root", "");
            String sql = "Insert into customers (tenTaiKhoan, matKhau, ngayTao) values (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, customers.getTenTaiKhoan());
            ps.setString(2, customers.getMatKhau());
            ps.setString(3, customers.getNgayTao());
            ps.execute();
            //Statement stm = connection.createStatement();
            //stm.execute("INSERT INTO customers (tenTaiKhoan, matKhau, ngayTao) VALUES ('" + customers.getTenTaiKhoan() + "', '" + customers.getMatKhau() + "', '" + customers.getNgayTao() + "')");
            System.out.println("Insert success!");
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public Customers searchByTen(String tenTaiKhoan) {
        Customers cus = null;
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankinformation?useUnicode=true&characterEncoding=utf-8", "root", "");
            Statement stt = connection.createStatement();
            ResultSet rs = stt.executeQuery("SELECT * FROM customers WHERE tenTaiKhoan = '" + tenTaiKhoan + "'");
            while (rs.next()) {
                int soTaiKhoan = rs.getInt("soTaiKhoan");
                String ten = rs.getString("tenTaiKhoan");
                String matKhau = rs.getString("matKhau");
                int soDu = rs.getInt("soDu");
                cus = new Customers(soTaiKhoan, tenTaiKhoan, matKhau, soDu);
            }
        } catch (SQLException ex) {
        }
        return cus;
    }
}
