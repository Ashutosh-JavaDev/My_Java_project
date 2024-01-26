// // package Loop;

// class Triangle {
//     void printSpaces(int space) {
//         if (space > 0) {
//             System.out.print(" ");
//             printSpaces(space - 1);
//         }
//     }

//     void printStars(int stars) {
//         if (stars > 0) {
//             System.out.print("*");
//             printStars(stars - 1);
//         }
//     }

//     void TrianglePrint(int i, int k) {
//         if (i > 5) {
//             return;
//         } else if (i <= 5) {
//             printSpaces(k);
//             printStars(i * 2 - 1);
//             System.out.println();
//             TrianglePrint(i + 1, k - 1);
//         }
//     }
// }

// public class printTriangle {
//     public static void main(String[] args) {
//         Triangle ob = new Triangle();
//         ob.TrianglePrint(1, 5);
//     }
// }
class Asterik{
    void printSpace(int space){
        if(space>0){
            System.out.print(" ");
            printSpace(space-1);
        }
    }
    void printStar(int star){
        if(star>0){
            System.out.print("*");
            printStar(star-1);
        }
    }
    void asterikPattern(int i,int k){
        if(i>5){
            return;
        }
        else if(i<=5){
                printSpace(k);
                printStar(i*2-1);
                System.out.println();
                asterikPattern(i+1, k-1);

            }
        }

    }
    public class printTriangle{
        public static void main(String[] args) {
            Asterik ob=new Asterik();
            ob.asterikPattern(1, 5);
        }
    }
