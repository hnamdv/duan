/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.entity;

import DAO.CRUDDAO;
import ENTITY.DoUong;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface DoUongDAO extends CRUDDAO<DoUong, Integer>{
     List<DoUong> findByMaLoaiDoUong(Integer maLoai); 
}
