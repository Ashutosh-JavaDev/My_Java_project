package Basic_Java.Asterikprymid;

import java.util.Scanner;

class GetterSetter {
    String name;

    public String getname() {
       return name;
    }
    public void setname(String name){
        this.name=name;
    }
}

public class Project {
    public static void main(String[] args) {
        Animal ani=new Animal();
        ani.values();
    }
}
