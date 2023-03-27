//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Control;

import Service.DepartmentsService;
import java.util.Scanner;

public class ControlDepartments {
    public static Scanner sc;

    public ControlDepartments() {
    }

    public void ControlDepartments() {
        DepartmentsService stdd = new DepartmentsService();
        boolean cond = true;

        do {
            System.out.println("-----QUẢN LÝ PHÒNG BAN-----");
            System.out.println("1. Them phong ban.");
            System.out.println("2. Cap nhat thong tin phong ban.");
            System.out.println("3. Xoa phong ban theo ma id.");
            System.out.println("4. In danh sach phong ban.");
            System.out.println("5. Tim kiem phong ban theo ma .");
            System.out.println("6. Tim kiem phong ban theo ten .");
            System.out.println(" Nhap lua chon cua bạn: ");
            Integer nhap = Integer.parseInt(sc.nextLine());
            if (nhap >= 1 && nhap <= 6) {
                switch (nhap) {
                    case 1:
                        stdd.insert();
                        break;
                    case 2:
                        System.out.println("Lua chon ma phong ban muon cap nhat: ");
                        Integer idcapNhat = Integer.parseInt(sc.nextLine());
                        stdd.update(idcapNhat);
                        break;
                    case 3:
                        stdd.delete();
                        break;
                    case 4:
                        stdd.inDanhSachStd();
                        break;
                    case 5:
                        stdd.timPBTheoMa();
                        break;
                    case 6:
                        stdd.timPBTheoTen();
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
