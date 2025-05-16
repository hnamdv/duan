/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.impl;

import DAO.entity.LoaiDoUongDAO;
import ENTITY.LoaiDoUong;
import UTIL.XJdbc;
import UTIL.XQuery;

import java.util.List;
/**
 *
 * @author Admin
 */
public class LoaiDoUongimql implements LoaiDoUongDAO {
    
    String createSql   = "INSERT INTO LoaiDoUong (MaLoaiDoUong, TenLoaiDoUong) VALUES (?, ?)";
    String updateSql   = "UPDATE LoaiDoUong SET TenLoaiDoUong = ? WHERE MaLoaiDoUong = ?";
    String deleteSql   = "DELETE FROM LoaiDoUong WHERE MaLoaiDoUong = ?";
    String findAllSql  = "SELECT * FROM LoaiDoUong";
    String findByIdSql = "SELECT * FROM LoaiDoUong WHERE MaLoaiDoUong = ?";
    String findByTenSql = "SELECT * FROM LoaiDoUong WHERE TenLoaiDoUong = ?";

    @Override
    public LoaiDoUong create(LoaiDoUong entity) {
        Object[] args = {
            entity.getMaLoaiDoUong(),
            entity.getTenLoaiDoUong()
        };
        XJdbc.executeUpdate(createSql, args);
        return entity;
    }

    @Override
    public void update(LoaiDoUong entity) {
        Object[] args = {
            entity.getTenLoaiDoUong(),
            entity.getMaLoaiDoUong()
        };
        XJdbc.executeUpdate(updateSql, args);
    }

    @Override
    public void deleteById(Integer id) {
        XJdbc.executeUpdate(deleteSql, id);
    }

    @Override
    public List<LoaiDoUong> findAll() {
        return XQuery.getBeanList(LoaiDoUong.class, findAllSql);
    }

    @Override
    public LoaiDoUong findById(Integer id) {
        return XQuery.getSingleBean(LoaiDoUong.class, findByIdSql, id);
    }

    @Override
    public LoaiDoUong findByTen(String tenLoai) {
        return XQuery.getSingleBean(LoaiDoUong.class, findByTenSql, tenLoai);
    }

    public boolean existsByTen(String tenLoai) {
        return findByTen(tenLoai) != null;
    }
}
