package civitas;
//Putu Gede Krisna Mahadiputra (2005551035)
//Program Data Civitas dengan penerapan beberapa konsep OOP

class Dosen extends CivitasUdayana {
    private int totalPoin;

    public void dataDosen(String nidn, String prodi, String fakultas) {
        System.out.println("==========================================================");
        System.out.println("NIDN            : " + nidn);
        System.out.println("Program Studi   : " + prodi);
        System.out.println("Fakultas        : " + fakultas);
    }

    public void golonganJabatanGolongan(String jabatan) {
        System.out.println("Jabatan         : " + jabatan);
    }

    public void poinDosen(int poinPendidikan, int poingTriDharma, int poinPenunjang) {
        totalPoin = poinPendidikan + poingTriDharma + poinPenunjang;
        System.out.println("Jumlah Poin     : " + totalPoin);
        System.out.println("==========================================================");
    }

    public void quotes() {
        String tambahan = "SEMANGAT ! ";
        System.out.println(tambahan + "Semoga Hari Anda Menyenangkan !");
    }
}