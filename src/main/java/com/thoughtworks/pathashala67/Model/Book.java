package com.thoughtworks.pathashala67.Model;

class Book {
    private String name;
    private String author;
    private int publishedYear;

    Book( String name,String author,int publishedYear ) {
        this.name = name;
        this.author= author;
        this.publishedYear=publishedYear;
    }


    String printBook(int index)
    {
        return String.format("%3s|%-35s| %-17s| %-4s|\n",index,name,author,publishedYear);
    }


}
