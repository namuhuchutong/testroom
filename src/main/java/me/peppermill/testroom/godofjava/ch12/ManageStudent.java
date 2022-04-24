package me.peppermill.testroom.godofjava.ch12;


public class ManageStudent {

    public static void main(String[] args) {
        Student a = new Student("Min", "Seuol", "010xsafasfd", "dsafdsafd@.asdfas");
        Student b = new Student("Min", "Seuol", "010xsafasfd", "dsafdsafd@.asdfas");

        System.out.println(a.equals(b));
    }

}
