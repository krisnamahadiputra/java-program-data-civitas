package civitas;
//Putu Gede Krisna Mahadiputra (2005551035)
//Program Data Civitas dengan penerapan beberapa konsep OOP

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	char jenisCivitas;
	    String nama, jenisKelamin;
	    int umur;
	    String prodi, fakultas;

	   	Scanner scn = new Scanner(System.in);
	   	Mahasiswa mhs = new Mahasiswa();
		Dosen dsn = new Dosen();
		Staff stf = new Staff();


		System.out.print("Masukkan Nama Anda				: ");
		nama = scn.nextLine();
		System.out.print("Masukkan Jenis Kelamin Anda 	: ");
		jenisKelamin = scn.nextLine();
		System.out.print("Masukkan Umur Anda				: ");
		umur = scn.nextInt();

		System.out.println("======================== PROFESI ========================");
		System.out.println("Dosen					: d");
		System.out.println("Mahasiswa				: m");
		System.out.println("Staff					: s");
		System.out.println("=========================================================");

		System.out.print("Silahkah Masukkan Profesi Anda	: ");
		jenisCivitas = scn.next().charAt(0);

		switch (jenisCivitas) {
			case 'd':
				String nidn;
				String jabatan;
				int poinPendidikan, poinTriDharma, poinPenunjang;

				dsn.setKategori("========================= DOSEN =========================");
				System.out.println(dsn.getCivitas());

				dsn.identitas(nama, jenisKelamin, umur);
				scn.nextLine();
				System.out.print("Masukkan NIDN Anda				: ");
				nidn = scn.nextLine();
				System.out.print("Masukkan Program Studi Anda		: ");
				prodi = scn.nextLine();
				System.out.print("Masukkan Fakultas Anda			: ");
				fakultas = scn.nextLine();

				System.out.print("Masukkan Jabatan Anda			: ");
				jabatan = scn.nextLine();
				System.out.print("Masukkan Poin Pendidikan		: ");
				poinPendidikan = scn.nextInt();
				System.out.print("Masukkan Poin Tri Dharma		: ");
				poinTriDharma = scn.nextInt();
				System.out.print("Masukkan Poin Penunjang			: ");
				poinPenunjang = scn.nextInt();

				dsn.dataDosen(nidn, prodi, fakultas);
				dsn.golonganJabatanGolongan(jabatan);
				dsn.poinDosen(poinPendidikan, poinTriDharma, poinPenunjang);
				dsn.quotes();
				break;

			case 'm':
				String nim;
				double tugas, uts, uas;

				mhs.setKategori("======================= MAHASISWA =======================");
				System.out.println(mhs.getCivitas());

				mhs.identitas(nama, jenisKelamin, umur);
				scn.nextLine();
				System.out.print("Masukkan NIM Anda				: ");
				nim = scn.nextLine();
				System.out.print("Masukkan Program Studi Anda		: ");
				prodi = scn.nextLine();
				System.out.print("Masukkan Fakultas Anda			: ");
				fakultas = scn.nextLine();

				System.out.print("Masukkan Nilai Tugas			: ");
				tugas = scn.nextDouble();
				System.out.print("Masukkan Nilai UTS				: ");
				uts = scn.nextDouble();
				System.out.print("Masukkan Nilai UAS				: ");
				uas = scn.nextDouble();

				mhs.dataMahasiswa(nim, prodi, fakultas);
				mhs.nilaiMahasiswa(tugas, uts, uas);
				mhs.quotes();
				break;

			case 's':
				String nip;
				int posisi, kehadiran;

				dsn.setKategori("========================= STAFF =========================");
				System.out.println(dsn.getCivitas());

				stf.identitas(nama, jenisKelamin, umur);
				scn.nextLine();
				System.out.print("Masukkan NIP Anda					: ");
				nip = scn.nextLine();

				System.out.print("Masukkan Posisi Anda	(1-3)		: ");
				posisi = scn.nextInt();
				System.out.print("Masukkan Jumlah Kehadiran Anda		: ");
				kehadiran = scn.nextInt();

				stf.dataStaff(nip);
				stf.hitungGajiStaff(posisi, kehadiran);
				stf.quotes();
				break;

			default:
				System.out.println("=========================================================");
				System.out.println("! Masukkan Kode Civitas Yang Sesuai !");
				break;
		}
    }
}

