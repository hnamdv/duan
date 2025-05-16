/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTITY;

/**
 *
 * @author Admin
 */
public class LoaiDoUong {
    private int maLoaiDoUong;
    private String tenLoaiDoUong;

  
    public LoaiDoUong() {
    }

    public LoaiDoUong(int maLoaiDoUong, String tenLoaiDoUong) {
        this.maLoaiDoUong = maLoaiDoUong;
        this.tenLoaiDoUong = tenLoaiDoUong;
    }

    public int getMaLoaiDoUong() {
        return maLoaiDoUong;
    }

    public void setMaLoaiDoUong(int maLoaiDoUong) {
        this.maLoaiDoUong = maLoaiDoUong;
    }

    public String getTenLoaiDoUong() {
        return tenLoaiDoUong;
    }

    public void setTenLoaiDoUong(String tenLoaiDoUong) {
        this.tenLoaiDoUong = tenLoaiDoUong;
    }
}

