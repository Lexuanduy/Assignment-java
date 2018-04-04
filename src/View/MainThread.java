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
                        System.out.println("Mới quý khách chọn dịch vụ: ");
                        System.out.println("3.Kiểm tra số dư tài khoản.");
                        System.out.println("4.Rút tiền.");
                        System.out.println("5.Chuyển tiền.");
                        dichVu(cus);
                    }
                default:
                    break;
            }
        }
    }

    public static void dichVu(Customers cus) {
        CustomersModel ctmmd = new CustomersModel();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 3:
                    System.out.println("Số dư tài khoản của quý khách là: " + ctmmd.searchByTen(cus.getTenTaiKhoan()).getSoDu());
                    break;
                case 4:
                    System.out.println("Nhập số tiền quý khách muốn rút từ tài khoản: ");
                    int tienRut = sc.nextInt();
                    if (tienRut <= (cus.getSoDu() - 50000)) {
                        
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Lựa chọn sai.");
                    break;
            }
        }
    }

}
