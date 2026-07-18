package pewarisan_sifat; //ini adalah package dan tempat semua fungsi nya

public class kasir extends pegawai{

@Override

public void menampilkan() //ini memanggil fungsi menampilkan

{

System.out.println(“Nama : ”+nama);

System.out.println(“Id Pegawai : ”+id_pegawai);

System.out.println(“Gaji : ”+gaji);

}

public void tugas(){

System.out.println(“Tugas : Melakukan transaksi dengan pembeli”);

System.out.println(“----------------------------------------------”);

}

}
