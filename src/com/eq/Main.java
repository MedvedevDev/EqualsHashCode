package com.eq;

public class Main {

    public static void main(String[] args) {
        Song o1 = new Song("Artem","Monica", "123");
        Song o2 = new Song("Artem","Monica", "123");
        Song o3 = new Song("Arrtem","Mornica", "123");

        System.out.println(o1 == o2);
        System.out.println(o1 == o3);

        System.out.println(o1.equals(o2));
        Song o4 = o1;
        System.out.println(o2.equals(o4));
    }
}

class Song{
    private String title;
    private  String artist;
    private  String nom;

    public Song(String t, String a, String n){
        title= t;
        artist = a ;
        nom = n;
    }

    public boolean equals(Object aSong){
        Song s = (Song) aSong;
        return getTitle().equals(s.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getNom() {
        return nom;
    }
}