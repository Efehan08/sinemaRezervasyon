import java.util.Scanner;

class sinemaBilet15 {
    public static void main(String[] args) {
        double kasa = 0;
        double fiyat = 0;

        String salon[][] = new String[10][10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < salon.length; i++) {
            for (int j = 0; j < salon.length; j++) {
                salon[i][j] = "[ ]";
            }
        }
        while (true) {
            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz:\n1-Salonu Gör\n2-Bilet Al\n3-İptal Et\n4-Bileti Değiştir\n5-Kasa\n6-Çıkış");
            int secim = scan.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("  ");
                    for (int k = 0; k < 10; k++) {
                        System.out.print(" "+k+"  ");
                    }
                    System.out.println();
                    for (int i = 0; i < salon.length; i++) {
                        System.out.print(i+" ");
                        for (int j = 0; j < salon.length; j++) {
                            System.out.print(salon[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Satın Almak İstediğiniz Satır Numarasını Giriniz");
                    int satirNo = scan.nextInt();
                    System.out.println("Satın Almak İstediğiniz Sütün Numarasını Giriniz");
                    int sutunNo = scan.nextInt();

                    if (satirNo >9||satirNo<0||sutunNo >9||sutunNo<0) {
                        System.out.println("Hatalı Bilet Numarası!");
                        break;
                    }

                    if (salon[satirNo][sutunNo].equals("[ ]")) {
                        salon[satirNo][sutunNo] = "Dolu";

                        if (satirNo ==8 || satirNo ==9) {
                            fiyat = 50;
                            kasa += fiyat;
                        }else {
                            fiyat = 30;
                            kasa += fiyat;
                        }
                    }else {
                        System.out.println();
                    }

                    break;
                case 3:
                    System.out.println("İptal Etmek İstedsiğiniz Biletin Satır Numarasını Giriniz:");
                    int iptalSatirNo = scan.nextInt();
                    System.out.println("İptal Etmek İstedsiğiniz Biletin Sütün Numarasını Giriniz");
                    int iptalSutunNo = scan.nextInt();

                    if (iptalSatirNo>9||iptalSatirNo<0||iptalSutunNo>9||iptalSutunNo<0) {
                        System.out.println("Bu Numaralarda Koltuk Bulunmamaktadır!");
                        break;
                    }

                    if (salon[iptalSatirNo][iptalSutunNo].equals("[ ]")) {
                        System.out.println("Koltuk Zaten Boş Durumda. İptal Gerçekleştirilemedi!");
                    }else {
                        System.out.println("İptal Başarı İle Gerçekleştirildi.");
                        if (iptalSatirNo ==9 || iptalSatirNo == 8) {
                            fiyat = 50;
                            kasa -= fiyat;

                        }else  {
                            fiyat = 30;
                            kasa -= fiyat;
                        }
                        salon[iptalSatirNo][iptalSutunNo] = "[ ]";
                    }
                    break;
                case 4:
                    System.out.println("Sahip Olduğunuz Biletin Satır Numarasını Giriniz:");
                    int sahipSatirNo = scan.nextInt();
                    System.out.println("Sahip Olduğunuz Biletin Sütun Numarasını Giriniz:");
                    int sahipSutunNo = scan.nextInt();

                    if (sahipSatirNo > 9 || sahipSutunNo > 9||sahipSutunNo<0||sahipSatirNo<0) {
                        System.out.println("Hatalı Koltuk Numarası");
                        break;
                    }

                    if (salon[sahipSatirNo][sahipSutunNo].equals("[ ]")) {
                        System.out.println("Sahip Olduğunuz Bilet Satın Alınmamış. İşlem Gerçekleştirilemedi!");
                    }else {
                        salon[sahipSatirNo][sahipSutunNo] = "[ ]";
                        if (sahipSatirNo ==9 || sahipSatirNo == 8) {
                            fiyat = 50;
                            kasa -= fiyat;
                        }else {
                            fiyat = 30;
                            kasa -= fiyat;
                        }
                        System.out.println("Değiştirmek istediğiniz Biletin Satır Numarasını Giriniz:");
                        int degisimSatirNo = scan.nextInt();
                        System.out.println("Değiştirmek istediğiniz Biletin Sütun Numarasını Giriniz:");
                        int degisimSutunNo = scan.nextInt();

                        if (degisimSatirNo > 9 || degisimSutunNo > 9|| degisimSutunNo<0||degisimSatirNo<0) {
                            System.out.println("Hatalı Koltuk Numarası!");
                            break;
                        }

                        if (salon[degisimSatirNo][degisimSutunNo].equals("[ ]")) {
                            System.out.println("Biletiniz Başarı İle Değiştirilmiştir.");
                            salon[degisimSatirNo][degisimSutunNo] = "Dolu";
                            if (degisimSatirNo == 9 || degisimSatirNo == 8) {
                                fiyat = 50;
                                kasa += fiyat;
                            } else {
                                fiyat = 30;
                                kasa += fiyat;
                            }
                        } else {
                            System.out.println("Değiştirmeye Çalıştığınız Koltuk Dolu!");
                            System.out.println("Değiştirmek istediğiniz Biletin Satır Numarasını Giriniz:");
                            int degisimSatirNo2 = scan.nextInt();
                            System.out.println("Değiştirmek istediğiniz Biletin Sütun Numarasını Giriniz:");
                            int degisimSutunNo2 = scan.nextInt();

                            if (degisimSatirNo2 > 9 || degisimSutunNo2 > 9||degisimSatirNo2<0||degisimSutunNo2<0) {
                                System.out.println("Hatalı Koltuk Numarası!");
                                break;
                            }

                            if (salon[degisimSatirNo2][degisimSutunNo2].equals("[ ]")) {
                                salon[degisimSatirNo2][degisimSutunNo2] = "Dolu";
                                System.out.println("Biletiniz Başarı İle Değiştirilmiştir.");
                                if (degisimSatirNo2 == 9 || degisimSatirNo2 == 8) {
                                    fiyat = 50;
                                    kasa += fiyat;
                                } else {
                                    fiyat = 30;
                                    kasa += fiyat;
                                }
                            }
                        }
                    }
                    break;
                case 5:System.out.println("GüncelKasa:"+kasa);
                    break;
                case 6:
                    System.out.println("Programdan Çıkılıyor!");
                    System.exit(0);
            }
        }
    }
}