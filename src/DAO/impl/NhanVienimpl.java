/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.impl;

import DAO.entity.NhanVienDAO;
import ENTITY.NhanVien;
import UTIL.XJdbc;
import UTIL.XQuery;
import java.util.List;

/**
 *
 * @author Admin
 */

public class NhanVienimpl implements NhanVienDAO {
 String createSql = "INSERT INTO NhanVien (Ten, SoDT, NgaySinh, ChucVu, TenDangNhap, MatKhau) VALUES (?, ?, ?, ?, ?, ?)";
String updateSql = "UPDATE NhanVien SET Ten=?, SoDT=?, NgaySinh=?, ChucVu=?, TenDangNhap=?, MatKhau=? WHERE MaNhanVien=?";
String findByUsernameSql = "SELECT * FROM NhanVien WHERE TenDangNhap = ?";
    String deleteSql = "DELETE FROM NhanVien WHERE MaNhanVien=?";
    String findAllSql = "SELECT * FROM NhanVien";
    String findByIdSql = "SELECT * FROM NhanVien WHERE MaNhanVien=?";
      String checkLoginSql = "SELECT * FROM NhanVien WHERE MaNhanVien=? AND MatKhau=?";
        String updateMatKhauSql = "UPDATE NhanVien SET MatKhau=? WHERE MaNhanVien=?";

    @Override
    public NhanVien create(NhanVien entity) {
        Object[] args = {
            entity.getMaNhanVien(), entity.getTen(), entity.getSoDT(),
            entity.getNgaySinh(), entity.isChucVu()
        };
        XJdbc.executeUpdate(createSql, args);
        return entity;
    }

    @Override
    public void update(NhanVien entity) {
        Object[] args = {
            entity.getTen(), entity.getSoDT(),
            entity.getNgaySinh(), entity.isChucVu(), entity.getMaNhanVien()
        };
        XJdbc.executeUpdate(updateSql, args);
    }

    @Override
    public void deleteById(Integer id) {
        XJdbc.executeUpdate(deleteSql, id);
    }

    @Override
    public List<NhanVien> findAll() {
        return XQuery.getBeanList(NhanVien.class, findAllSql);
    }

    @Override
    public NhanVien findById(Integer id) {
        return XQuery.getSingleBean(NhanVien.class, findByIdSql, id);
    }
    public NhanVien findByTenDangNhap(String tenDangNhap) {
    String sql = "SELECT * FROM NhanVien WHERE TenDangNhap = ?";
    return XQuery.getSingleBean(NhanVien.class, sql, tenDangNhap);
}

public boolean checkLogin(String tenDangNhap, String matKhau) {
    String sql = "SELECT * FROM NhanVien WHERE TenDangNhap = ? AND MatKhau = ?";
    NhanVien nv = XQuery.getSingleBean(NhanVien.class, sql, tenDangNhap, matKhau);
    return nv != null;
}
 @Override
 public NhanVien findById(int maNhanVien) {
    String sql = "SELECT * FROM NhanVien WHERE MaNhanVien = ?";
    return XQuery.getSingleBean(NhanVien.class, sql, maNhanVien);
}

    @Override
    public boolean checkLogin(int maNhanVien, String matKhau) {
              NhanVien nv = XQuery.getSingleBean(NhanVien.class, checkLoginSql, maNhanVien, matKhau);
        return nv != null;
    }

    @Override
    public boolean doiMatKhau(int maNhanVien, String matKhauMoi) {
        int rows = XJdbc.executeUpdate(updateMatKhauSql, matKhauMoi, maNhanVien);
        return rows > 0;
    }
}

