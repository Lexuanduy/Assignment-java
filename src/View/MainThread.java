/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CustomersController;
import Entity.Customers;
import Model.CustomersModel;
import java.util.Scanner;

/**
 *
 * @author duy
 */
public class MainThread {

    public static void main(String[] args) {
        generateMenu();
    }

    public static void generateMenu() {
        CustomersController customersController = new CustomersController();
        CustomersModel csmodel = new CustomersModel();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chào mừng quý khách!");
            System.out.println("1.Đăng ký tài khoản.");
            System.out.println("2.Đăng nhập.");
            System.out.println("Mời quý khách chọn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Đăng ký tài khoản ngân hàng.");
                    Customers customers = customersController.getCustomerInfomation();
                    if (customers.isValid()) {
                        csmodel.dangKy(customers);
                    }
                    break;
                case 2:
                    System.out.println("Đăng nhập.");
                    Customers cus = customersController.getInfo();
                    if (customersController.dangNhap(cus)) {
                        
                    }
                    break;
                default:
                    break;

            }
        }
    }

    
}
