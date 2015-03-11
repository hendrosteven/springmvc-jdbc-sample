/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core.service.dao;

import core.entity.Product;
import java.util.List;


/**
 *
 * @author user
 */
public interface ProductDAO {

    public void insert(Product product);

    public void update(Product product);

    public void delete(int id);

    public Product getById(int id);

    public List<Product> getAll();

    public List<Product> getByHarga(double hargaBawah, double hargaAtas);
}
