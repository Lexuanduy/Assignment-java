/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Customers;
import Model.CustomersModel;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author duy
 */
public class CustomersController {

     CustomersModel ctmodel = new CustomersModel();
    
    public Customers getCustomerInfomation() {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên khách hàng: ");
        String tenTaiKhoan = sc1.nextLine();
        System.out.println("Vui lòng nhập mật khẩu: ");
        String matKhau = sc1.nextLine();
        Customers customers = new Customers(tenTaiKhoan, matKhau);
        return customers;
    }

    public Customers getInfo() {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên khách hàng: ");
        String tenTaiKhoan = sc1.nextLine();
        System.out.println("Vui lòng nhập mật khẩu: ");
        String matKhau = sc1.nextLine();
        Customers customers = new Customers(tenTaiKhoan, matKhau);
        return customers;
    }
    
    public boolean dangNhap(Customers cus) {
        Customers cus2 = ctmodel.searchByUsername(cus.getTenTaiKhoan());

        if (cus2 == null) {
            System.err.println("Tên tài khoản không tồn tại hoặc đã bị xóa!");
            return false;
        } else {
            if (cus.getMatKhau().equals (cus2.getMatKhau())) {
                System.out.println("Đăng nhập thành công!");
                return true;
            } else {
                System.out.println("Sai mật khẩu. Vui lòng đăng nhập lại!");
                return false;
            }
        }
    }
}
