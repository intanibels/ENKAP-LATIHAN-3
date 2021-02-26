package latihan3;
public class TestSiswa {
    public static void main(String[] args) {
        //membuat objek siswa dari class EncapSiswa
        EncapSiswa siswa = new EncapSiswa();
        
        //memanggil method setName, setAbsen, dan setAddress 
        siswa.setName("Julian");
        siswa.setAbsen(23);
        siswa.setAddress("Malang");
        
        //menampilkan hasil output
        System.out.println("Name : "+siswa.getname()
        +" Absen : "+siswa.getAbsen()+" Address : "+siswa.getAddress());
    }
}