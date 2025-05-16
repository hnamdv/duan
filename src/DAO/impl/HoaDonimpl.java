/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.impl;

import DAO.entity.HoaDonDAO;
import ENTITY.HoaDon;
import UTIL.XJdbc;
import UTIL.XQuery;
import java.util.List;

/**
 *
 * @author Admin
 */


public class HoaDonimpl implements HoaDonDAO {
    String createSql = "INSERT INTO HoaDon (MaHoaDon, MaThe, MaNhanVien, NgayTao, TrangThai) VALUES (?, ?, ?, ?, ?)";
    String updateSql = "UPDATE HoaDon SET MaThe=?, MaNhanVien=?, NgayTao=?, TrangThai=? WHERE MaHoaDon=?";
    String deleteSql = "DELETE FROM HoaDon WHERE MaHoaDon=?";
    String findAllSql = "SELECT * FROM HoaDon";
    String findByIdSql = "SELECT * FROM HoaDon WHERE MaHoaDon=?";
    String findByMaTheSql = "SELECT * FROM HoaDon WHERE MaThe=?";
    String findByMaNhanVienSql = "SELECT * FROM HoaDon WHERE MaNhanVien=?";

    @Override
    public HoaDon create(HoaDon entity) {
        Object[] args = {
            entity.getMaHoaDon(), entity.getMaThe(), entity.getMaNhanVien(),
            entity.getNgayTao(), entity.isTrangThai()
        };
        XJdbc.executeUpdate(createSql, args);
        return entity;
    }

    @Override
    public void update(HoaDon entity) {
        Object[] args = {
            entity.getMaThe(), entity.getMaNhanVien(), entity.getNgayTao(),
            entity.isTrangThai(), entity.getMaHoaDon()
        };
        XJdbc.executeUpdate(updateSql, args);
    }

    @Override
    public void deleteById(Integer id) {
        XJdbc.executeUpdate(deleteSql, id);
    }

    @Override
    public List<HoaDon> findAll() {
        return XQuery.getBeanList(HoaDon.class, findAllSql);
    }

    @Override
    public HoaDon findById(Integer id) {
        return XQuery.getSingleBean(HoaDon.class, findByIdSql, id);
    }

    @Override
    public List<HoaDon> findByMaThe(Integer maThe) {
        return XQuery.getBeanList(HoaDon.class, findByMaTheSql, maThe);
    }

    @Override
    public List<HoaDon> findByMaNhanVien(Integer maNhanVien) {
        return XQuery.getBeanList(HoaDon.class, findByMaNhanVienSql, maNhanVien);
    }
}
