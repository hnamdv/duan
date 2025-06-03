/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.entity;

import DAO.CRUDDAO;
import ENTITY.NhanVien;

/**
 *
 * @author Admin
 */
public interface NhanVienDAO extends CRUDDAO<NhanVien, Integer> {
        NhanVien findById(int id);
    boolean checkLogin(int maNhanVien, String matKhau);
    boolean doiMatKhau(int maNhanVien, String matKhauMoi);
}