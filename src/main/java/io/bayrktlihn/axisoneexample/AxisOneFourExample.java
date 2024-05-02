package io.bayrktlihn.axisoneexample;

import io.bayrktlihn.soap.sicilservisi.ISicil;
import io.bayrktlihn.soap.sicilservisi.ISicilServiceLocator;
import io.bayrktlihn.soap.sicilservisi.WSInfo;

import java.net.URL;

public class AxisOneFourExample {
    public static void main(String[] args) {
        try {
            String urlString = "";

            URL url = new URL(urlString);

            ISicilServiceLocator serviceLocator = new ISicilServiceLocator();
            ISicil sicilService = serviceLocator.getsicil(url);

            String kurumAd = "kurumAd";
            String kullaniciKod = "kullaniciKod";

            WSInfo kullaniciBilgi = new WSInfo();
            kullaniciBilgi.setKurumAd(kurumAd);
            kullaniciBilgi.setKullaniciKod(kullaniciKod);

            String vergiNo = "vergiNo";
            sicilService.merkezBilgileri(vergiNo, kullaniciBilgi);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}