/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.entity;

import DAO.CRUDDAO;
import ENTITY.HoaDon;
import java.util.List;

/**
 *
 * @author Admin
 */

public interface HoaDonDAO extends CRUDDAO<HoaDon, Integer> {
    List<HoaDon> findByMaNhanVien(Integer maNhanVien);
    List<HoaDon> findByMaThe(Integer maThe);
}