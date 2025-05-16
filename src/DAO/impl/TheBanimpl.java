/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.impl;

import DAO.entity.TheBanDAO;
import ENTITY.TheBan;
import UTIL.XJdbc;
import UTIL.XQuery;
import java.util.List;

/**
 *
 * @author Admin
 */


public abstract class TheBanimpl implements TheBanDAO {
    String createSql = "INSERT INTO TheBan (MaThe, TrangThai) VALUES (?, ?)";
    String updateSql = "UPDATE TheBan SET TrangThai=? WHERE MaThe=?";
    String deleteSql = "DELETE FROM TheBan WHERE MaThe=?";
    String findAllSql = "SELECT * FROM TheBan";
    String findByIdSql = "SELECT * FROM TheBan WHERE MaThe=?";

    @Override
    public TheBan create(TheBan entity) {
        Object[] args = {entity.getMaThe(), entity.isTrangThai()};
        XJdbc.executeUpdate(createSql, args);
        return entity;
    }

    @Override
    public void update(TheBan entity) {
        Object[] args = {entity.isTrangThai(), entity.getMaThe()};
        XJdbc.executeUpdate(updateSql, args);
    }

    @Override
    public void deleteById(Integer id) {
        XJdbc.executeUpdate(deleteSql, id);
    }

    @Override
    public List<TheBan> findAll() {
        return XQuery.getBeanList(TheBan.class, findAllSql);
    }

    @Override
    public TheBan findById(Integer id) {
        return XQuery.getSingleBean(TheBan.class, findByIdSql, id);
    }



}

