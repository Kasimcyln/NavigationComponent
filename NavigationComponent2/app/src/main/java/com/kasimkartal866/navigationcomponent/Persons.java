package com.kasimkartal866.navigationcomponent;

import java.io.Serializable;

public class Persons  implements Serializable {
    private int no;
    private String name;

    public Persons() {

    }

    public Persons(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
