package com.example.Dictionary.models;

import javax.persistence.*;

@Entity
public class Dictionary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String word;
    private String meaning1;
    private String meaning2;    
    private String meaning3;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getWord() {
        return word;
    }
    
    public void setWord(String word) {
        this.word = word;
    }
    
    public String getMeaning1() {
        return meaning1;
    }
    
    public void setMeaning1(String meaning1) {
        this.meaning1 = meaning1;
    }
    public String getMeaning2() {
        return meaning2;
    }
    
    public void setMeaning2(String meaning2) {
        this.meaning2 = meaning2;
    }

    public String getMeaning3() {
        return meaning3;
    }
    
    public void setMeaning3(String meaning3) {
        this.meaning3 = meaning3;
    }
}
