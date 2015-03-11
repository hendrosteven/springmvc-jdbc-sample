/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core.service.dao;

import core.entity.Product;
import core.entity.ProductMapper;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private JdbcTemplate template;
    
    public ProductDAOImpl(){        
    }

    public ProductDAOImpl(JdbcTemplate template) throws SQLException {
        this.template = template;
    }

    @Override
    public void insert(Product product) {
        this.template.update("INSERT INTO tbl_product(kode,nama,keterangan,harga) VALUES(?,?,?,?)",
                product.getKode(), product.getNama(), product.getKeterangan(), product.getHarga());
    }

    @Override
    public void update(Product product) {
        this.template.update("UPDATE tbl_product SET kode=?,nama=?,keterangan=?,harga=? WHERE id=?",
                product.getKode(), product.getNama(), product.getKeterangan(), product.getHarga(),
                product.getId());
    }

    @Override
    public void delete(int id) {
        this.template.update("DELETE FROM tbl_product WHERE id=?", id);
    }

    @Override
    public Product getById(int id) {
        String sql = "SELECT id,kode,nama,keterangan,harga FROM tbl_product WHERE id=?";
        return (Product) this.template.queryForObject(sql, new Object[]{id}, new ProductMapper());
    }

    @Override
    public List<Product> getAll() {
        String sql = "SELECT id,kode,nama,keterangan,harga FROM tbl_product";
        return this.template.query(sql, new ProductMapper());
    }

    @Override
    public List<Product> getByHarga(double hargaBawah, double hargaAtas) {
        String sql = "SELECT id,kode,nama,keterangan,harga FROM tbl_product WHERE harga>=? AND harga<=?";
        return this.template.query(sql, new Object[]{hargaBawah, hargaAtas}, new ProductMapper());
    }
}
