//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Control;

import Service.EmployeesService;
import java.util.Scanner;

public class ControlEmployees {
    public static Scanner sc;

    public ControlEmployees() {
    }

    public void ControlEmployees() {
        EmployeesService stds = new EmployeesService();
        boolean cond = true;

        do {
            System.out.println("-----QUẢN LÝ NHÂN VIÊN-----");
            System.out.println("1. Them nhan vien.");
            System.out.println("2. Cap nhat thong tin sinh vien.");
            System.out.println("3. Xoa sinh vien theo ma id.");
            System.out.println("4. In danh sach sinh vien.");
            System.out.println("5. Tim kiem sinh vien theo ma sinh vien.");
            System.out.println("6. Tim kiem sinh vien theo ten sinh vien.");
            System.out.println("7. Tim kiem sinh vien theo SDT sinh vien");
            System.out.println("8. Tim kiem sinh vien theo Email sinh vien");
            System.out.println("9. Nhap ID nhan vien can xoa khoi phong ban");
            System.out.println("10. nhap Id nhan vien can chuyen phong");
            System.out.println(" Nhap lua chon cua bạn: ");
            Integer nhap = Integer.parseInt(sc.nextLine());
            if (nhap >= 1 && nhap <= 11) {
                switch (nhap) {
                    case 1:
                        stds.insert();
                        break;
                    case 2:
                        System.out.println("Lua chon ma nhân vien ban muon cap nhat: ");
                        Integer idcapNhat = Integer.parseInt(sc.nextLine());
                        stds.update(idcapNhat);
                        break;

                    case 3:
                        stds.delete();
                        break;
                    case 4:
                        stds.inDanhSachStd();
                        break;
                    case 5:
                        stds.timNVTheoMa();
                        break;
                    case 6:
                        stds.timNVTheoTen();
                        break;
                    case 7:
                        stds.timNVTheoSDT();
                        break;
                    case 8:
                        stds.timNVTheoEmail();
                    case 9:
                        System.out.println(" nhap ID nhan vien can xoa");
                        Integer id = Integer.parseInt(sc.nextLine());
                        stds.xoaPhongBanChoNV(id);
                        break;
                    case 10:
                        System.out.println(" nhap ID nhan vien can chuyen");
                        Integer chuyenID = Integer.parseInt(sc.nextLine());
                        stds.chuyenPhongBanchoNV(chuyenID);
                }
            } else {
                System.out.println("Lua chon không hop le, vui long chon lai: ");
            }
        } while(cond);

    }

    static {
        sc = new Scanner(System.in);
    }
}
