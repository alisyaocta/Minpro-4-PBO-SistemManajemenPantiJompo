
package view;

import controller.PantiService;
import java.util.Scanner;
import utility.InputValidasi;

public final class PantiView {
    
    private final PantiService service;
    private final Scanner scanner;
    
    public PantiView(PantiService service, Scanner scanner) {
        this.service = service;
        this.scanner = scanner;
    }
    
    public final void tampilkanMenuUtama() {
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n====================================================");
            System.out.println("======= PENGELOLAAN DATA PENGHUNI RUMAH SENJA ======");
            System.out.println("====================================================");
            System.out.println("| 1. Tambah Data Penghuni                          |");
            System.out.println("| 2. Tampilkan Data Penghuni                       |");
            System.out.println("| 3. Hapus Data Penghuni                           |");
            System.out.println("| 4. Update Data Penghuni                          |");
            System.out.println("| 5. Cari Data Penghuni                            |");
            System.out.println("| 6. Jadwal Kunjungan Keluarga                     |");
            System.out.println("| 7. Keluar                                        |");
            System.out.println("====================================================");

            int pilihan = InputValidasi.bacaInt(scanner, "\nPilih Menu (1-7): ");

            if (!InputValidasi.validasiPilihanMenu(pilihan, 7)) {
                continue;
            }

            switch (pilihan) {
                case 1 -> service.tambahPenghuni();
                
                case 2 -> service.tampilkanPenghuni();
                
                case 3 -> service.hapusPenghuni();
                
                case 4 -> service.updatePenghuni();
                
                case 5 -> service.cariPenghuni();
                
                case 6 -> service.kunjungiPenghuni();
                
                case 7 ->{
                    System.out.println("\n====================================================");
                    System.out.println("======== SELAMAT MENIKMATI MASA SENJA ANDA =========");
                    System.out.println("====================================================\n");
                    berjalan = false;
                }
            }
        }
    }
}