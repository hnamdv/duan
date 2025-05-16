/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.entity;

import DAO.CRUDDAO;
import ENTITY.TheBan;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface TheBanDAO extends CRUDDAO<TheBan, Integer> {
    List<TheBan> findBanDangTrong();
    List<TheBan> findBanDangSuDung();
}
