/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.impl;

/**
 *
 * @author Admin
 */

import DAO.entity.NguoiDungDAO;
import ENTITY.NguoiDung;
import UTIL.XJdbc;
import UTIL.XQuery;
import java.util.List;

public abstract class NguoiDungimpl implements NguoiDungDAO {
    String createSql = "INSERT INTO NguoiDung (MaNhanVien, TenNguoiDung, MatKhau) VALUES (?, ?, ?)";
    String updateSql = "UPDATE NguoiDung SET TenNguoiDung=?, MatKhau=? WHERE MaNhanVien=?";
    String deleteSql = "DELETE FROM NguoiDung WHERE MaNhanVien=?";
    String findAllSql = "SELECT * FROM NguoiDung";
    String findByIdSql = "SELECT * FROM NguoiDung WHERE MaNhanVien=?";

    @Override
    public NguoiDung create(NguoiDung entity) {
        Object[] args = {entity.getMaNhanVien(), entity.getTenNguoiDung(), entity.getMatKhau()};
        XJdbc.executeUpdate(createSql, args);
        return entity;
    }

    @Override
    public void update(NguoiDung entity) {
        Object[] args = {entity.getTenNguoiDung(), entity.getMatKhau(), entity.getMaNhanVien()};
        XJdbc.executeUpdate(updateSql, args);
    }

    @Override
    public void deleteById(Integer id) {
        XJdbc.executeUpdate(deleteSql, id);
    }

    @Override
    public List<NguoiDung> findAll() {
        return XQuery.getBeanList(NguoiDung.class, findAllSql);
    }

    @Override
    public NguoiDung findById(Integer id) {
        return XQuery.getSingleBean(NguoiDung.class, findByIdSql, id);
    }



}
