package civitas;
//Putu Gede Krisna Mahadiputra (2005551035)
//Program Data Civitas dengan penerapan beberapa konsep OOP

class Staff extends CivitasUdayana{
    private int gajiPokok, tunjangan, uangMakan, totalGaji;

    public void dataStaff(String nip){
        System.out.println("==========================================================");
        System.out.println("NIP                : "+nip);
    }

    public void hitungGajiStaff(int posisi, int kehadiran){
        if(posisi == 1){
            gajiPokok = 1900000;
            tunjangan = 500000;
            uangMakan = kehadiran * 50000;
            totalGaji = gajiPokok + tunjangan + uangMakan;
            System.out.println("Posisi              : Front Office");
            System.out.println("Gaji Pokok          : Rp.  "+gajiPokok);
            System.out.println("Tunjangan           : Rp. "+tunjangan);
            System.out.println("Uang Makan          : Rp. "+uangMakan);
            System.out.println("Total Gaji          : Rp. "+totalGaji);
            System.out.println("==========================================================");
        }

        else if (posisi == 2){
            gajiPokok = 2100000;
            tunjangan = 750000;
            uangMakan = kehadiran * 50000;
            totalGaji = gajiPokok + tunjangan + uangMakan;
            System.out.println("Posisi              : Sekretaris");
            System.out.println("Gaji Pokok          : Rp.  "+gajiPokok);
            System.out.println("Tunjangan           : Rp. "+tunjangan);
            System.out.println("Uang Makan          : Rp. "+uangMakan);
            System.out.println("Total Gaji          : Rp. "+totalGaji);
            System.out.println("==========================================================");
        }

        else if (posisi == 3){
            gajiPokok = 2900000;
            tunjangan = 850000;
            uangMakan = kehadiran * 50000;
            totalGaji = gajiPokok + tunjangan + uangMakan;
            System.out.println("Posisi              : Bendahara");
            System.out.println("Gaji Pokok          : Rp. "+gajiPokok);
            System.out.println("Tunjangan           : Rp. "+tunjangan);
            System.out.println("Uang Makan          : Rp. "+uangMakan);
            System.out.println("Total Gaji          : Rp. "+totalGaji);
            System.out.println("==========================================================");
        }

        else {
            System.out.println("============== Mohon Masukkan Golongan 1 - 3 =============");
        }
    }
}
