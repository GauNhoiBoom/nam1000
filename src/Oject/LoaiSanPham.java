/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oject;

/**
 *
 * @author nam
 */
public class LoaiSanPham {
    public String MaLoaiSP;
    public String TenLoaiSP;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String MaLoaiSP, String TenLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
        this.TenLoaiSP = TenLoaiSP;
    }

    public String getMaLoaiSP() {
        return MaLoaiSP;
    }

    public void setMaLoaiSP(String MaLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
    }

    public String getTenLoaiSP() {
        return TenLoaiSP;
    }

    public void setTenLoaiSP(String TenLoaiSP) {
        this.TenLoaiSP = TenLoaiSP;
    }
    
    
}
