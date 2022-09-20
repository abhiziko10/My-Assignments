package com.bean;

//package com.bean;
//
//public class Triangle {
//    private int height,base;
//    private  String name;
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public int getBase() {
//        return base;
//    }
//
//    public void setBase(int base) {
//        this.base = base;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Triangle{" +
//                "height=" + height +
//                ", base=" + base +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}
public class Address{
    private String name,city,state;

        Address(String name,String city,String state){
        this.name=name;
        this.city=city;
        this.state=state;

    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Address----->" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'';
    }

    public Address() {
    }
}

