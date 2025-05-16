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
    String createSql = "INSERT INTO NhanVien (MaNhanVien, Ten, SoDT, NgaySinh, ChucVu) VALUES (?, ?, ?, ?, ?)";
    String updateSql = "UPDATE NhanVien SET Ten=?, SoDT=?, NgaySinh=?, ChucVu=? WHERE MaNhanVien=?";
    String deleteSql = "DELETE FROM NhanVien WHERE MaNhanVien=?";
    String findAllSql = "SELECT * FROM NhanVien";
    String findByIdSql = "SELECT * FROM NhanVien WHERE MaNhanVien=?";

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
}

