package com.ssm.evantoadiwibowo.BangunRuang.Kerucut;

import com.ssm.evantoadiwibowo.BangunRuang.Tabung;

public class VolumeKerucut extends Tabung {

    public VolumeKerucut(double r, double t) {
        super(r, t);
    }

    public double hitung_volume() {

        return (1.0 / 3 * super.hitung_volume());

    }
}