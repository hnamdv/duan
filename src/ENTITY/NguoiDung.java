/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTITY;

/**
 *
 * @author Admin
 */
public class NguoiDung {

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    private int maNhanVien;
    private String tenNguoiDung;
    private String matKhau;

    public NguoiDung() {
    }

    public NguoiDung(int maNhanVien, String tenNguoiDung, String matKhau) {
        this.maNhanVien = maNhanVien;
        this.tenNguoiDung = tenNguoiDung;
        this.matKhau = matKhau;
    }


}
