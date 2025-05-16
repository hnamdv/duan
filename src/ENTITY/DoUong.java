/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTITY;

/**
 *
 * @author Admin
 */
public class DoUong {
    private int maDoUong;
    private String tenDoUong;
    private int maLoaiDoUong;
    private double donGia;

    public DoUong() {
    }

    public DoUong(int maDoUong, String tenDoUong, int maLoaiDoUong, double donGia) {
        this.maDoUong = maDoUong;
        this.tenDoUong = tenDoUong;
        this.maLoaiDoUong = maLoaiDoUong;
        this.donGia = donGia;
    }
    public int getMaDoUong() {
        return maDoUong;
    }

    public void setMaDoUong(int maDoUong) {
        this.maDoUong = maDoUong;
    }

    public String getTenDoUong() {
        return tenDoUong;
    }

    public void setTenDoUong(String tenDoUong) {
        this.tenDoUong = tenDoUong;
    }

    public int getMaLoaiDoUong() {
        return maLoaiDoUong;
    }

    public void setMaLoaiDoUong(int maLoaiDoUong) {
        this.maLoaiDoUong = maLoaiDoUong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}


