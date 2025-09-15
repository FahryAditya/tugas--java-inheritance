package pewarisan_sifat;


class Pegawai {
    String nama;
    int idPegawai;
    String gaji;

    void menampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("ID Pegawai: " + idPegawai);
        System.out.println("Gaji: " + gaji);
    }
}


class Manager extends Pegawai {
    void tugas() {
        System.out.println("Tugas: Mengelola tim");
    }
}

class Kasir extends Pegawai {
    void tugas() {
        System.out.println("Tugas: Mengelola transaksi");
    }
}

class Koki extends Pegawai {
    void tugas() {
        System.out.println("Tugas: Mengolah makanan");
    }
}

class Pelayan extends Pegawai {
    void tugas() {
        System.out.println("Tugas: Melayani pelanggan");
    }
}

class Satpam extends Pegawai {
    void tugas() {
        System.out.println("Tugas: Mengamankan lingkungan");
    }
}

public class MainProject {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.nama = "Sifa";
        manager.idPegawai = 1;
        manager.gaji = "7 Juta";

        Kasir kasir = new Kasir();
        kasir.nama = "Aldi";
        kasir.idPegawai = 2;
        kasir.gaji = "1,2 Juta";

        Koki koki = new Koki();
        koki.nama = "Reza";
        koki.idPegawai = 3;
        koki.gaji = "2 Juta";

        Pelayan pelayan = new Pelayan();
        pelayan.nama = "Dean";
        pelayan.idPegawai = 4;
        pelayan.gaji = "1,2 Juta";

        Satpam satpam = new Satpam();
        satpam.nama = "Aldi";
        satpam.idPegawai = 5;
        satpam.gaji = "1 Juta";

        System.out.println("Manager:");
        manager.menampilkan();
        manager.tugas();

        System.out.println("\nKasir:");
        kasir.menampilkan();
        kasir.tugas();

        System.out.println("\nKoki:");
        koki.menampilkan();
        koki.tugas();

        System.out.println("\nPelayan:");
        pelayan.menampilkan();
        pelayan.tugas();

        System.out.println("\nSatpam:");
        satpam.menampilkan();
        satpam.tugas();
    }
}
