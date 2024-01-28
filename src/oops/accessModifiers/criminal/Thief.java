package src.oops.accessModifiers.criminal;

import src.oops.accessModifiers.police.Cop;

public class Thief {
    public static void main(String[] args) {

        Cop cop = new Cop(10);
        System.out.println(cop.gun);
        //cop.canIShoot();
        //He is not in the Protect Police folder


    }
}
