package civitas;
//Putu Gede Krisna Mahadiputra (2005551035)
//Program Data Civitas dengan penerapan beberapa konsep OOP

public class CivitasUdayana {
    private String civitas;

    public void setKategori(String newCivitas){
        this.civitas = newCivitas;
    }

    public String getCivitas(){
        return this.civitas;
    }

    public void identitas(String nama, String jenisKelamin, int umur){
        System.out.println("Nama                : " +nama);
        System.out.println("Jenis Kelamin       : " +jenisKelamin);
        System.out.println("Umur                : " +umur);
        System.out.println("=========================================================");
    }

    public void quotes(){
        System.out.println("Semoga Hari Anda Menyenangkan !");
    }
}
