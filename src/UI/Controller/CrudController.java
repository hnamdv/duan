/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Controller;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface CrudController <T,ID> {
    List<T> getAll();
    T findById(ID id);
    void add(T entity);
    void update(T entity);
    void delete(ID id);
}
