package vn.edu.topica.model;

/**
 * Created by KIM_MANH_HUNG on 28-Apr-17.
 */
public class Music {
    private String ma;
    private String ten;

    public Music(String ma, String ten, String casi, boolean thich) {
        this.ma = ma;
        this.ten = ten;
        this.casi = casi;
        this.thich = thich;
    }

    public String getCasi() {
        return casi;
    }

    public Music() {
    }

    public void setCasi(String casi) {
        this.casi = casi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isThich() {
        return thich;
    }

    public void setThich(boolean thich) {
        this.thich = thich;
    }

    private String casi;
    private boolean thich;

}
