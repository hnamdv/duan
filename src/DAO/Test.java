/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ENTITY.LoaiDoUong;
import UTIL.XJdbc;
import UTIL.XQuery;
import java.sql.*;
import java.util.List;
/**
 *
 * @author Admin
 */

public class Test{

    public static void main(String[] args) {
        themMoi();
        truyVanNhieuBanGhi();
        layListBean();
        layMotBean();
        layMotGiaTri();
    }


    private static void themMoi() {
        String sql = "INSERT INTO NguoiDung (MaNhanVien, TenNguoiDung) VALUES (123, Nam Dep Trai)";
       
    }

    private static void truyVanNhieuBanGhi() {
        try {
            String sql = "SELECT * FROM LoaiDoUong WHERE TenLoaiDoUong LIKE ?";
            ResultSet rs = XJdbc.executeQuery(sql, "%Cà%");
            while (rs.next()) {
                System.out.println("Mã: " + rs.getInt("MaLoaiDoUong") + ", Tên: " + rs.getString("TenLoaiDoUong"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void layListBean() {
        String sql = "SELECT * FROM LoaiDoUong WHERE TenLoaiDoUong LIKE ?";
        List<LoaiDoUong> list = XQuery.getBeanList(LoaiDoUong.class, sql, "%tố%");
        for (LoaiDoUong loai : list) {
            System.out.println("Bean: " + loai.getMaLoaiDoUong() + " - " + loai.getTenLoaiDoUong());
        }
    }

    private static void layMotBean() {
        String sql = "SELECT * FROM LoaiDoUong WHERE MaLoaiDoUong=?";
        LoaiDoUong loai = XQuery.getSingleBean(LoaiDoUong.class, sql, 1);
        if (loai != null) {
            System.out.println("Tìm thấy: " + loai.getMaLoaiDoUong() + " - " + loai.getTenLoaiDoUong());
        } else {
            System.out.println("Không tìm thấy!");
        }
    }

    private static void layMotGiaTri() {
        String sql = "SELECT MAX(MaLoaiDoUong) FROM LoaiDoUong WHERE TenLoaiDoUong LIKE ?";
        Integer maxId = (Integer) XJdbc.getValue(sql, "%tố%");
        System.out.println("MAX ID: " + maxId);
    }
}
