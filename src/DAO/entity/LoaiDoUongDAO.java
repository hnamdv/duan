/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.entity;

import DAO.CRUDDAO;
import ENTITY.LoaiDoUong;

/**
 *
 * @author Admin
 */

  public interface LoaiDoUongDAO extends CRUDDAO<LoaiDoUong, Integer> {
         LoaiDoUong findByTen(String tenLoai);
}
