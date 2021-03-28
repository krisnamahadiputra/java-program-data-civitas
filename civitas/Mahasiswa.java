package civitas;
//Putu Gede Krisna Mahadiputra (2005551035)
//Program Data Civitas dengan penerapan beberapa konsep OOP

class Mahasiswa extends CivitasUdayana{
    private double hasilAkhir;

    public void dataMahasiswa(String nim, String prodi, String fakultas){
        System.out.println("==========================================================");
        System.out.println("NIM             : "+nim);
        System.out.println("Program Studi   : "+prodi);
        System.out.println("Fakultas        : "+fakultas);
    }

    public void nilaiMahasiswa(double tugas, double uts, double uas){
        hasilAkhir =(((tugas * 0.2) + (uts * 0.35) + (uas * 0.45)));
        System.out.println("Nilai Akhir     : " +hasilAkhir);
        System.out.println("==========================================================");
    }

    public void quotes(){
        String extra = "Tingkatkan Terus Prestasi Anda !";
        System.out.println(extra + "Semoga Hari Anda Menyenangkan !");
    }
}
