package latihan3;
public class EncapSiswa {
    //membuat variabel instance
    private String name;
    private String address;
    private int absen;
    
    //membuat method getAbsen untuk menampilkan absen
    public int getAbsen(){
        return absen;
    }
    //membuat method getName untuk menampilkan nama
    public String getname(){
        return name;
    }
    //membuat method getAddress untuk menampilkan alamat
    public String getAddress(){
        return address;
    }
    //membuat method setAbsen untuk mengisi absen
    public void setAbsen(int newAbsen){
        absen = newAbsen;
    }
    //membuat method setName untuk mengisi nama
    public void setName(String newName){
        name = newName;
    }
    //membuat method setAddress untuk mengisi alamat
    public void setAddress(String newAddress){
        address = newAddress;
    }
}