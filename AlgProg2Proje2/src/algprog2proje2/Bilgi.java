/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algprog2proje2;

import java.util.ArrayList;

/**
 *
 * @author ozgen
 */
public class Bilgi {
    private String adSoyad;
    private String birthDate;
    ArrayList<String> klupler = new ArrayList<>();

    //Parametresiz constructor
    public Bilgi() {
        adSoyad = null;
        birthDate = null;
        klupler = null;
    }

    //Parametre alan constructor
    public Bilgi(String adSoyad, String birthDate) {
        this.adSoyad = adSoyad;
        this.birthDate = birthDate;
    }

    //toString metodu
    @Override
    public String toString() {
        return adSoyad + ", " + birthDate + ", " + klupler;
    }

    /**
     * @return the adSoyad
     */
    public String getAdSoyad() {
        return adSoyad;
    }

    /**
     * @param adSoyad the adSoyad to set
     */
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    /**
     * @return the klupler
     */
    public ArrayList<String> getKlupler() {
        return klupler;
    }

    /**
     * @param klupler the klupler to set
     */
    public void setKlupler(ArrayList<String> klupler) {
        this.klupler = klupler;
    }
}
