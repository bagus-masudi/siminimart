/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siminimart.model;

import javax.swing.Icon;

/**
 *
 * @author Ahmad Bagus Mas'udi
 */
public class Model_Produk {

    /**
     * @return the image
     */
    public Icon getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Icon image) {
        this.image = image;
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
     * @return the harga
     */
    public String getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(String harga) {
        this.harga = harga;
    }
    
    public Model_Produk(Icon image, String nama, String harga) {
        this.image = image;
        this.nama = nama;
        this.harga = harga;
    }

    public Model_Produk() {
    }
    
    private Icon image;
    private String nama;
    private String harga;
    
}
