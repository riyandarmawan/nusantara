/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Riyan
 */
public class Member {
    int province_id, regencies_id, districts_id;
    String member_id, nama, tanggal_lahir, alamat, nomor_telepon, jenis_kelamin, agama;

    public Member() {
    }    

    public Member(int province_id, int regencies_id, int districts_id, String member_id, String nama, String tanggal_lahir, String alamat, String nomor_telepon, String jenis_kelamin, String agama) {
        this.province_id = province_id;
        this.regencies_id = regencies_id;
        this.districts_id = districts_id;
        this.member_id = member_id;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
        this.alamat = alamat;
        this.nomor_telepon = nomor_telepon;
        this.jenis_kelamin = jenis_kelamin;
        this.agama = agama;
    }

    public int getProvince_id() {
        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    public int getRegencies_id() {
        return regencies_id;
    }

    public void setRegencies_id(int regencies_id) {
        this.regencies_id = regencies_id;
    }

    public int getDistricts_id() {
        return districts_id;
    }

    public void setDistricts_id(int districts_id) {
        this.districts_id = districts_id;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }
}
