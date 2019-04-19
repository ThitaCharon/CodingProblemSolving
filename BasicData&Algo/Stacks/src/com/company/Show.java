package com.company;

import java.time.Year;

public class Show {

    private String tittle ;

    public Show(String tittle){
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String toString(){
        return tittle ;
    }
}
