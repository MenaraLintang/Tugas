import java.util.Scanner;

class Truk {
    double muatan;
    double muatanMaks;

    double Truk(final double beratMax) {
        this.muatanMaks = beratMax;
        return muatanMaks;
    }

    double getMuatan() {
        System.out.println("Muatan Sekarang : " + muatan);
        return muatan;
    }

    double getMuatanMax() {
        System.out.println("Muatan Maksimal : " + muatanMaks);
        return muatan;
    }

    double tambah(final double berat) {
        return this.muatan += berat;
    }
}

class Hitung {
    public static void main(final String[] args) {

        Scanner input = new Scanner(System.in);
        Truk truk = new Truk();
        truk.Truk(1000.0);
        double muatan = truk.muatan;
        double muatanMaks = truk.muatanMaks;

        truk.getMuatanMax();

        for (int i = 0; i < 4; i++) {
            if (muatan < muatanMaks) {
                System.out.print("Tambah muatan : ");
                muatan = input.nextDouble();
                muatan = truk.tambah(muatan);
            }
        }
        if (muatan > muatanMaks) {
            System.out.println("Muatan Overload!!");
        } else if (muatan == muatanMaks) {
            System.out.println("Muatan sudah Max");
        }

        System.out.println("-----------------");
        truk.getMuatan();

        //Validasi

        if (muatan < muatanMaks) {
            double sisa;
            sisa = muatanMaks - muatan;
            System.out.println("Sisa Space : " + sisa);
        }
        if (muatan > muatanMaks) {
            double lebih;
            lebih = muatan - muatanMaks;
            System.out.println("Kelebihan Muatan : " + lebih);
        }

    }
}