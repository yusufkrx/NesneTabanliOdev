public class Main {
    public static void main(String[] args) {
        Kisi kisi = new Kisi();
        int [] bitirmeSureleri = {341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};
        int [] siraliSureler = siralama(bitirmeSureleri);
        System.out.println("Birinci: "+kisi.isim(siraliSureler[0]) + " " + siraliSureler[0]+"'");
        System.out.println("İkinci: "+kisi.isim(siraliSureler[1]) + " " + siraliSureler[1]+"'");
        System.out.println("Üçüncü: "+kisi.isim(siraliSureler[2]) + " " + siraliSureler[2]+"'");
        siniflandirma(bitirmeSureleri);


    }
    public static int [] siralama (int [] dizi){
        boolean sonrakiBuyukMu = true;
        while (sonrakiBuyukMu==true) {
            sonrakiBuyukMu=false;
            for (int i = 0; i < dizi.length - 1; i++) {
                if (dizi[i] > dizi[i + 1]) {
                    sonrakiBuyukMu=true;
                    int temp = dizi[i];
                    dizi[i] = dizi[i + 1];
                    dizi[i + 1] = temp;

                }
            }
        }
        return dizi;
    }
    public static void siniflandirma (int[] dizi){
        int a =0, b = 0, c =0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]>=200 && dizi[i]<=299)
                a++;
            else if (dizi[i]>=300 && dizi[i]<=399)
                b++;
            else if (dizi[i]>=400)
                c++;
        }
        System.out.println("A -> "+a +"\n" + "B -> "+ b + "\n"+ "C -> "+c);
    }
}