package com.company.gitoverview;

public class BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
