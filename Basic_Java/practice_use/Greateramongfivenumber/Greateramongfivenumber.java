//Greater among five number

import java.util.*;

public class Greateramongfivenumber{

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    int e=sc.nextInt();

    if ((a >= b) && (a >= c) && (a >= d) && (a >= e)) { // a >= b,c,d,e
        System.out.println ("a is greater"+a);
    } else if ((b >= c) && (b >= d) && (b >= e)) {      // b >= c,d,e
        System.out.println ( "b is greater"+b);
    } else if ((c >= d) && (c >= e)) {                  // c >= d,e
        System.out.println ( "c is greater"+c);
    } else if (d >= e) {                                // d >= e
        System.out.println ("d is greater"+ d);
    } else {                                            // e > d
        System.out.println ("e is greater"+e);
    }
}
}