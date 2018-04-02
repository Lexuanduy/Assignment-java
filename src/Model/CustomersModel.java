/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Customers;
import java.sql.Connection;
import java.sql.DriverManager;
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
            Statement stm = connection.createStatement();
            stm.execute("INSERT INTO customers (tenTaiKhoan, matKhau, ngayTao) VALUES ('" + customers.getTenTaiKhoan() + "', '" + customers.getMatKhau() + "', '" + customers.getNgayTao() + "')");
            System.out.println("Insert success!");
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public Customers searchByUsername(String tenTaiKhoan) {
        Customers cus = null;
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankinformation?useUnicode=true&characterEncoding=utf-8", "root", "");
            Statement stt = connection.createStatement();
            ResultSet rs = stt.executeQuery("SELECT * FROM customers WHERE tenTaiKhoan = '" + tenTaiKhoan + "'");
            while (rs.next()) {
                String ten = rs.getString("tenTaiKhoan");
                String matKhau = rs.getString("matKhau");
                cus = new Customers(tenTaiKhoan, matKhau);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cus;
    }
    
    public boolean update(Customers cus) {
        Customers cus1 = new Customers();
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankinformation?useUnicode=true&characterEncoding=utf-8", "root", "");
            Statement stt = connection.createStatement();
            stt.execute("UPDATE customers SET soTaiKhoan =" + cus.getSoTaiKhoan()+ " WHERE tenTaiKhoan = '" + cus.getTenTaiKhoan()+ "'");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
}
