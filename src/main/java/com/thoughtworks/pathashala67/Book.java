package com.thoughtworks.pathashala67;

class Book {
    private String name;
    private String author;
    private int publishedYear;

    Book( String name,String author,int publishedYear ) {
        this.name = name;
        this.author= author;
        this.publishedYear=publishedYear;
    }

    String getBookName() {
        return name;
    }

    String printBook(int index)
    {
        return String.format("%s  %s  %s  %s\n",index,name,author,publishedYear);
    }


}
