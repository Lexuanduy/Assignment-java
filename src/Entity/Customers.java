/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author duy
 */
public class Customers {
    
    private int soTaiKhoan;
    private String tenTaiKhoan;
    private String matKhau;
    private int soDu;
    private String ngayTao;
    private int trangThai;

    public Customers() {
    }

    public Customers(int soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }
    
    public Customers(String tenTaiKhoan, String matKhau) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        Date resultdate = new Date(System.currentTimeMillis());
        this.ngayTao = sdf.format(resultdate);
    }

    public Customers(int soTaiKhoan, String tenTaiKhoan, int soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soDu = soDu;
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        Date resultdate = new Date(System.currentTimeMillis());
        this.ngayTao = sdf.format(resultdate);
    }

    public int getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(int soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getSoDu() {
        return soDu;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public boolean isValid() {
        if (tenTaiKhoan == null || tenTaiKhoan.length() > 25) {
            return false;
        }
        if (matKhau == null || matKhau.length() < 6) {
            return false;
        }
        return true;
    }
}
