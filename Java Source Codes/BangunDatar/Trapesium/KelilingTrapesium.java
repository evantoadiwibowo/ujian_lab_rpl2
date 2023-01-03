package com.ssm.evantoadiwibowo.BangunDatar.Trapesium;

public class KelilingTrapesium {

   double AB, BC, CD, AD;

    public KelilingTrapesium(double ab, double bc, double cd, double ad) {

        AB = ab;
        BC = bc;
        CD = cd;
        AD = ad;

    }

    public double hitung_keliling() {
        return AB + BC + CD + AD;
    }

}