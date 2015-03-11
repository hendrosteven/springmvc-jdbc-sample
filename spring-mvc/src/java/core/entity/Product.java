/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core.entity;

/**
 *
 * @author user
 */
public class Product {

    private int id;
    private String kode;
    private String nama;
    private String keterangan;
    private double harga;

    public Product() {
    }

    public Product(int id, String kode, String nama, String keterangan, double harga) {
        this.id = id;
        this.kode = kode;
        this.nama = nama;
        this.keterangan = keterangan;
        this.harga = harga;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the keterangan
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    /**
     * @return the harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}
