package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Guitar myGuitar = new Guitar(6, "classic");
        Guitar otherGuitar = new Guitar(6, "electric");
        SmartSpeaker googleHome = new SmartSpeaker(true, 3, "Google");
        MusicalInstrament yetAnotherGuitar = new Guitar(6, "classic");

        System.out.println(myGuitar.getType());
        System.out.println(otherGuitar.getType());
        //System.out.println(googleHome.isSmart());
    }
}
