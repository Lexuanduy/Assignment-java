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
                        System.out.println("Đăng nhập tành công!");
                        System.out.println("Mới quý khách chọn dịch vụ: ");
                        System.out.println("3.Kiểm tra số dư tài khoản.");
                        System.out.println("4.Rút tiền.");
                        System.out.println("5.Chuyển tiền.");
                        switch (choice) {
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                        }
                    }
                    break;
                default:
                    break;

            }
        }
    }

}
