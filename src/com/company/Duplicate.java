package com.company;

import java.util.Objects;

/**
 *
 */
public class Duplicate {

    private int id;
    private String center;

    
    public Duplicate(int id, String center) {
        this.id = id;
        this.center = center;
    }

    public static void main(String[] args) {
        System.out.println("Hi");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getCenter() {
        return center;
    }

    /**
     * @param center
     */
    public void setCenter(String center) {
        this.center = center;
    }

    @Override
    public boolean equals(Object o) {
        return testing(o);
    }

    /**
     * @param o
     * @return
     */
    private boolean testing(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duplicate test = (Duplicate) o;
        return id == test.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", center='" + center + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
