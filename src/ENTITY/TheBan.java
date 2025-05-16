/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTITY;

/**
 *
 * @author Admin
 */
public class TheBan {

    public int getMaThe() {
        return maThe;
    }

    public void setMaThe(int maThe) {
        this.maThe = maThe;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    private int maThe;
    private boolean trangThai; 

    public TheBan() {
    }

    public TheBan(int maThe, boolean trangThai) {
        this.maThe = maThe;
        this.trangThai = trangThai;
    }

}

