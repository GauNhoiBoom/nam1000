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
public class SanPham extends LoaiSanPham{
    public String MaSP;
    public String TenSP;
    public String NhaSanXuat;

    public SanPham() {
    }

    public SanPham(String MaSP, String TenSP, String NhaSanXuat, String MaLoaiSP) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.NhaSanXuat = NhaSanXuat;
        this.MaLoaiSP = MaLoaiSP;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getNhaSanXuat() {
        return NhaSanXuat;
    }

    public void setNhaSanXuat(String NhaSanXuat) {
        this.NhaSanXuat = NhaSanXuat;
    }

    
    
}
