/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author user
 */
public class ProductMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int i) throws SQLException {
        Product p = new Product();
        p.setId(rs.getInt("id"));
        p.setKode(rs.getString("kode"));
        p.setNama(rs.getString("nama"));
        p.setKeterangan(rs.getString("keterangan"));
        p.setHarga(rs.getDouble("harga"));
        return p;
    }
}
