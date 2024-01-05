package lab5bai3;

public class MainSanPham {
    public static void main(String[] args) {
        AppQuanLySanPham sanPham = new AppQuanLySanPham();

        sanPham.nhapSanPham();
        sanPham.xuatSanPham();

        // sap xep san pham giam dan
        System.out.println("Danh sach san pham sau khi sap xep giam dan la: ");
        sanPham.sapXepSanPhamV2();
        sanPham.xuatSanPham();
        // gia trung binh cua cac san pham la:
        sanPham.xuatGiaTrungBinh();

        // tim va xoa sau do xuat cac san pham con lai ra man hinh
        sanPham.timVaXoaSanPham();

    }
}
