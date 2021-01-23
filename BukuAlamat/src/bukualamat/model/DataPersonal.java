/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Another
 */
public class DataPersonal {

    private StringProperty NamaDepan = new SimpleStringProperty();
    private StringProperty NamaBelakang = new SimpleStringProperty();
    private StringProperty Alamat = new SimpleStringProperty();
    private StringProperty KotaKabupaten = new SimpleStringProperty();
    private StringProperty NoHP = new SimpleStringProperty();

    public DataPersonal() {
    }
    
    public DataPersonal(String NamaDepan, String NamaBelakang) {
        this.NamaDepan = new SimpleStringProperty(NamaDepan);
        this.NamaBelakang = new SimpleStringProperty(NamaBelakang);
        
        this.Alamat = new SimpleStringProperty("Suatu Alamat");
        this.KotaKabupaten = new SimpleStringProperty("Suatu Kota");
        this.NoHP = new SimpleStringProperty("Nomor HP");
    }
    

    public String getNoHP() {
        return NoHP.get();
    }

    public void setNoHP(String value) {
        NoHP.set(value);
    }

    public StringProperty NoHPProperty() {
        return NoHP;
    }
    

    public String getKotaKabupaten() {
        return KotaKabupaten.get();
    }

    public void setKotaKabupaten(String value) {
        KotaKabupaten.set(value);
    }

    public StringProperty KotaKabupatenProperty() {
        return KotaKabupaten;
    }
    

    public String getAlamat() {
        return Alamat.get();
    }

    public void setAlamat(String value) {
        Alamat.set(value);
    }

    public StringProperty AlamatProperty() {
        return Alamat;
    }
    

    public String getNamaBelakang() {
        return NamaBelakang.get();
    }

    public void setNamaBelakang(String value) {
        NamaBelakang.set(value);
    }

    public StringProperty NamaBelakangProperty() {
        return NamaBelakang;
    }
    

    public String getNamaDepan() {
        return NamaDepan.get();
    }

    public void setNamaDepan(String value) {
        NamaDepan.set(value);
    }

    public StringProperty NamaDepanProperty() {
        return NamaDepan;
    }
    
}
