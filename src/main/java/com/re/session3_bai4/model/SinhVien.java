package com.re.session3_bai4.model;


public class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
}
