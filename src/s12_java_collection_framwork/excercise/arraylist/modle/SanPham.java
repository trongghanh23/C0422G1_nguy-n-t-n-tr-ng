package s12_java_collection_framwork.excercise.arraylist.modle;

import java.time.LocalDate;

public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private String ngaySanXuat;
    private String hangSanXuat;
    private double giaSanPham;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, String ngaySanXuat, String hangSanXuat, double giaSanPham) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.ngaySanXuat = ngaySanXuat;
        this.hangSanXuat = hangSanXuat;
        this.giaSanPham = giaSanPham;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", ngaySanXuat='" + ngaySanXuat + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", giaSanPham=" + giaSanPham +
                '}';
    }
}
