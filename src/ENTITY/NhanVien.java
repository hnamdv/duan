/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTITY;
 import java.util.Date;
/**
 *
 * @author Admin
 */
public class NhanVien {

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isChucVu() {
        return chucVu;
    }

    public void setChucVu(boolean chucVu) {
        this.chucVu = chucVu;
    }
   
    private int maNhanVien;
    private String ten;
    private String soDT;
    private Date ngaySinh;
    private boolean chucVu;

    public NhanVien() {
    }

    public NhanVien(int maNhanVien, String ten, String soDT, Date ngaySinh, boolean chucVu) {
        this.maNhanVien = maNhanVien;
        this.ten = ten;
        this.soDT = soDT;
        this.ngaySinh = ngaySinh;
        this.chucVu = chucVu;
    }


}


