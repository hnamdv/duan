/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.entity;

import DAO.CRUDDAO;
import ENTITY.NguoiDung;

/**
 *
 * @author Admin
 */
  public interface NguoiDungDAO extends CRUDDAO<NguoiDung, Integer> {
    boolean checkLogin(String maNhanvien, String matKhau);
    boolean doiMatKhau(int maNhanVien, String matKhauMoi);
        NguoiDung findByTenNguoiDung(String tenNguoiDung);

}
