/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.impl;

/**
 *
 * @author Admin
 */


import DAO.entity.ChiTietHoaDonDAO;
import ENTITY.ChiTietHoaDon;
import UTIL.XJdbc;
import UTIL.XQuery;
import java.util.List;

public class ChiTietHoaDonimpl implements ChiTietHoaDonDAO {
  // Thêm chi tiết hóa đơn
String createSql = "INSERT INTO ChiTietHoaDon (Id, MaHoaDon, MaDoUong, SoLuong, DonGia) VALUES (?, ?, ?, ?, ?)";

// Cập nhật chi tiết hóa đơn theo Id
String updateSql = "UPDATE ChiTietHoaDon SET MaHoaDon = ?, MaDoUong = ?, SoLuong = ?, DonGia = ? WHERE Id = ?";

// Xóa chi tiết hóa đơn theo Id
String deleteSql = "DELETE FROM ChiTietHoaDon WHERE Id = ?";

// Lấy tất cả chi tiết hóa đơn
String findAllSql = "SELECT * FROM ChiTietHoaDon";

// Tìm chi tiết hóa đơn theo Id
String findByIdSql = "SELECT * FROM ChiTietHoaDon WHERE Id = ?";

// Tìm chi tiết hóa đơn theo mã hóa đơn
String findByHoaDonSql = "SELECT * FROM ChiTietHoaDon WHERE MaHoaDon = ?";

// Tìm chi tiết hóa đơn theo mã đồ uống
String findByDoUongSql = "SELECT * FROM ChiTietHoaDon WHERE MaDoUong = ?";

    @Override
    public ChiTietHoaDon create(ChiTietHoaDon entity) {
        Object[] args = {
            entity.getId(), entity.getMaHoaDon(), entity.getMaDoUong(),
            entity.getSoLuong(), entity.getDonGia()
        };
        XJdbc.executeUpdate(createSql, args);
        return entity;
    }

    @Override
    public void update(ChiTietHoaDon entity) {
        Object[] args = {
            entity.getMaHoaDon(), entity.getMaDoUong(), entity.getSoLuong(),
            entity.getDonGia(), entity.getId()
        };
        XJdbc.executeUpdate(updateSql, args);
    }

    @Override
    public void deleteById(Integer id) {
        XJdbc.executeUpdate(deleteSql, id);
    }

    @Override
    public List<ChiTietHoaDon> findAll() {
        return XQuery.getBeanList(ChiTietHoaDon.class, findAllSql);
    }

    @Override
    public ChiTietHoaDon findById(Integer id) {
        return XQuery.getSingleBean(ChiTietHoaDon.class, findByIdSql, id);
    }

    @Override
    public List<ChiTietHoaDon> findByMaHoaDon(Integer maHoaDon) {
        return XQuery.getBeanList(ChiTietHoaDon.class, findByHoaDonSql, maHoaDon);
    }

    @Override
    public List<ChiTietHoaDon> findByMaDoUong(Integer maDoUong) {
        return XQuery.getBeanList(ChiTietHoaDon.class, findByDoUongSql, maDoUong);
    }
}
