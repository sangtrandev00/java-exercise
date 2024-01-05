package lab6bai3;

public class SinhVien {
    private String hoTen;
    private String email;
    private String soDienThoai;
    private String cmnd;

    public SinhVien(String hoTen, String email, String soDienThoai, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.cmnd = cmnd;
    }

    public SinhVien() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void xuatSinhVien() {
        System.out.printf("ho ten: %s, email: %s, so dien thoai: %s, cmnd: %s\n", this.hoTen, this.email,
                this.soDienThoai, this.cmnd);
    }

}
