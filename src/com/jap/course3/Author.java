package com.jap.course3;

public class Author {
    private String authorName;
    private String authorPenName;
    Author(){
        this("","");
    }
    Author(String name,String penname){
        authorName=name;
        authorPenName=penname;
    }
    public void setName(String name) {
        authorName=name;
    }
    public void setPenName(String penname) {
        authorPenName=penname;
    }
    public String getName() {
        return authorName;
    }
    public String getPenName() {
        return authorPenName;
    }

    public String toString() {
        return "Author Name : "+authorName+"\n"+"Author PenName : "+authorPenName;
    }
}



