package com.netcracker.HW3.ch3;

public class Person {
    private String name;
    private String namesFriends="";

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void befriend(Person p) {
        namesFriends += p.getName() + " ";
    }

    public void unfriend(Person p) {
        if (namesFriends.contains(p.getName())) {
            namesFriends.indexOf(p.getName());
            namesFriends=namesFriends.replaceFirst(p.getName(), "");
            namesFriends=namesFriends.substring(0,namesFriends.length()-1);
        }
    }
    public int getfieldcount(){
        return namesFriends.length()-namesFriends.replace(" ", "").length();
    }
    public String getFriendNames() {
        return namesFriends;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Igor");
        p1.befriend(new Person("Dima"));
        p1.befriend(new Person("Alexei"));
        p1.befriend(new Person("Nikita"));
        p1.unfriend(new Person("Nikita"));
        System.out.println("Person " + p1.getName() + " has friends "+ p1.getFriendNames());
        System.out.println("Person " + p1.getName() + " has "+p1.getfieldcount()+" friends");

    }
}
