/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.impl;

import DAO.entity.DoUongDAO;
import ENTITY.DoUong;
import UTIL.XJdbc;
import UTIL.XQuery;
import java.util.List;

/**
 *
 * @author Admin
 */


public class DoUongimpl implements DoUongDAO {
    String createSql = "INSERT INTO DoUong (MaDoUong, TenDoUong, MaLoaiDoUong, DonGia) VALUES (?, ?, ?, ?)";
    String updateSql = "UPDATE DoUong SET TenDoUong=?, MaLoaiDoUong=?, DonGia=? WHERE MaDoUong=?";
    String deleteSql = "DELETE FROM DoUong WHERE MaDoUong=?";
    String findAllSql = "SELECT * FROM DoUong";
    String findByIdSql = "SELECT * FROM DoUong WHERE MaDoUong=?";
    String findByMaLoaiSql = "SELECT * FROM DoUong WHERE MaLoaiDoUong=?";

    @Override
    public DoUong create(DoUong entity) {
        Object[] args = {entity.getMaDoUong(), entity.getTenDoUong(), entity.getMaLoaiDoUong(), entity.getDonGia()};
        XJdbc.executeUpdate(createSql, args);
        return entity;
    }

    @Override
    public void update(DoUong entity) {
        Object[] args = {entity.getTenDoUong(), entity.getMaLoaiDoUong(), entity.getDonGia(), entity.getMaDoUong()};
        XJdbc.executeUpdate(updateSql, args);
    }

    @Override
    public void deleteById(Integer id) {
        XJdbc.executeUpdate(deleteSql, id);
    }

    @Override
    public List<DoUong> findAll() {
        return XQuery.getBeanList(DoUong.class, findAllSql);
    }

    @Override
    public DoUong findById(Integer id) {
        return XQuery.getSingleBean(DoUong.class, findByIdSql, id);
    }

    @Override
    public List<DoUong> findByMaLoaiDoUong(Integer maLoai) {
        return XQuery.getBeanList(DoUong.class, findByMaLoaiSql, maLoai);
    }
}
