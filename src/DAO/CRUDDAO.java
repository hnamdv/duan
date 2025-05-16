/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;

/**
 *
 * @author Admin
 * @param <Entity>
 * @param <ID>
 */
public interface CRUDDAO<Entity, ID> {
    Entity create(Entity entity);
    void update(Entity entity);
    void deleteById(ID id);
    List<Entity> findAll();
    Entity findById(ID id);
}