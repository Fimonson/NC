package com.netcracker.homeworkOOP1.enterprise;

import com.netcracker.homeworkOOP1.figure.Circle;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(){
        name = "";
        email = "";
    }
    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(this.getClass().equals(obj.getClass()))) return false;
        Author author = (Author) obj;
        return name == author.name && email == author.email && gender == author.gender;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) gender;
        for (int i = 0; i < name.length(); i++)
            result = 31 * result + (int) name.charAt(i);
        for (int i = 0; i < email.length(); i++)
            result = 31 * result + (int) email.charAt(i);
        return result;
    }

    @Override
    public String toString(){
        return "Author[name = " + name + ", email = " + email + ", gender = " + gender + ']';
    }

}