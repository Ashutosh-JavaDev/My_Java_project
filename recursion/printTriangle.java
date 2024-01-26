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
