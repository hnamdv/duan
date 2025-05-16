/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.entity;

import DAO.CRUDDAO;
import ENTITY.ChiTietHoaDon;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ChiTietHoaDonDAO extends CRUDDAO<ChiTietHoaDon, Integer> {
    List<ChiTietHoaDon> findByMaHoaDon(Integer maHoaDon);
    List<ChiTietHoaDon> findByMaDoUong(Integer maDoUong);
}