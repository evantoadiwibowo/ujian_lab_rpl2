package com.ssm.evantoadiwibowo.BangunRuang;

import com.ssm.evantoadiwibowo.BangunDatar.Lingkaran;

public class Tabung extends Lingkaran {

    double tinggi;

    public Tabung(double r, double t) {

        super(r);
        this.tinggi = t;

    }

    public double hitung_volume() {
        return super.hitung_luas() * tinggi;
    }

    public double hitung_luas() {

        return (2 * super.hitung_luas()) + super.hitung_keliling() * tinggi;

    }
}