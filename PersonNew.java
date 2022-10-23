
public class PersonNew {
    public static void main(String[] args) {
    //Membuat objek
    Person a = new Person();

    //memanggil atribut dan memberi nilai
    a.setNama("Anton");
    a.setJenisKelamin("Laki-Laki");
    a.setUmur(20);
    System.out.println("Nama: "+a.getNama());
    System.out.println("JenisKelamin: "+a.getJenisKelamin());
    System.out.println("Umur: "+a.getUmur());

    System.out.println("-------");

    Person b = new Person();
    b.setNama("Riko");
    b.setJenisKelamin("Laki-Laki");
    b.setUmur(22);
    System.out.println("Nama: "+b.getNama());
    System.out.println("JenisKelamin: "+b.getJenisKelamin());
    System.out.println("Umur: "+b.getUmur());
    }
}
