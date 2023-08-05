import java.util.*;

public class All_Basic_Shape_Formula {
    // Method to calculate the area and perimeter of a rectangle
    public static void perimeterLengthRectangle(float length, float breadth) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to find the area of rectangle\nPress 2 to find the perimeter of the rectangle");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                float area = length * breadth;
                System.out.println("The area of the rectangle is: " + area);
                break;
            case 2:
                float perimeter = 2 * (length + breadth);
                System.out.println("The perimeter of the rectangle is: " + perimeter);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    // Method to calculate the area and perimeter of a square
    public static void square(float side) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for area of square\nPress 2 for perimeter of the square");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                float area = side * side;
                System.out.println("The area of square is: " + area);
                break;
            case 2:
                float perimeter = 4 * side;
                System.out.println("The perimeter of the square is: " + perimeter);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    // Method to calculate the area and circumference of a circle
    public static void circle(float radius) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to find the area of the circle\nPress 2 to find the circumference of the circle");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                double area = 3.14 * radius * radius;
                System.out.println("The area of circle is: " + area);
                break;
            case 2:
                double circumference = 2 * 3.14 * radius;
                System.out.println("The circumference of the circle is: " + circumference);
                break;
            default:
                System.out.println("Press valid key");
                break;
        }
    }
    
    // Method to calculate the area and hypotenuse of a triangle
    public static void triangle(float base, float height) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to find the area of the triangle\nPress 2 to find the Pythagorean Theorem");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                float area = 0.5f * base * height;
                System.out.println("The area of the triangle is: " + area);
                break;
            case 2:
                double pythagoras = Math.sqrt(base * base + height * height);
                System.out.println("The Hypotenuse of the Pythagorean Theorem is: " + pythagoras);
                break;
            default:
                System.out.println("Press valid key");
                break;
        }
    }

    // Method to calculate the area, perimeter, midsegment, and diagonal of a trapezium
    public static void trapezium(float a, float b, float c, float d) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to find the area of Trapezium\nPress 2 to find the perimeter of the trapezium\nPress 3 to find the Height of the Trapezium\nPress 4 to find the midsegment of the trapezium\nPress 5 to find the diagonal of the trapezium");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Enter the height of the trapezium");
                float height = scanner.nextFloat();
                double area = 0.5 * (a + b) * height;
                System.out.println("The area of trapezium is: " + area);
                break;
            case 2:
                float perimeter = a + b + c + d;
                System.out.println("The perimeter of the trapezium is: " + perimeter);
                break;
            case 3:
                System.out.println("Enter the height of the trapezium");
                float h = scanner.nextFloat();
                double areaHeight = 0.5 * (a + b) * h;
                double calculatedHeight = 2 * areaHeight / (a + b);
                System.out.println("The height of the trapezium is: " + calculatedHeight);
                break;
            case 4:
                float midsegment = (a + b) / 2;
                System.out.println("The midsegment of the trapezium is: " + midsegment);
                break;
            case 5:
                System.out.println("Enter the height of the trapezium");
                float hie = scanner.nextFloat();
                double areaHeights = 0.5 * (a + b) * hie;
                double diagonal = Math.sqrt(hie * hie + ((b - a) * (b - a)) / 2);
                System.out.println("The diagonal of the trapezium is: " + diagonal);
                break;
            default:
                System.out.println("Press valid key");
                break;
        }
    }
		//Meathod for  find the values for pentagon
		
    public static void pentagon(float sides) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1. To find the area of the pentagon\nPress 2. To find the perimeter of the pentagon");
        int lines = scanner.nextInt();
        
        switch (lines) {
            case 1:
                double area = (5.0 / 4.0) * sides * sides * (1.0 / 0.7265);
                System.out.println("The area of pentagon is: " + area);
                break;
            case 2:
                float perimeter = 5 * sides;
                System.out.println("The perimeter of the pentagon: " + perimeter);
                break;
            default:
                System.out.println("Press valid key");
                break;
        }
    }
	
	//Meathod for  find the values for hexagon

    public static void hexagon(float sid) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1. To find the area of the hexagon\nPress 2. To find the perimeter of the hexagon");
        int print = scanner.nextInt();
        
        switch (print) {
            case 1:
                double area = (3 * Math.sqrt(3) / 2) * sid * sid;
                System.out.println("The area of hexagon is: " + area);
                break;
            case 2:
                double perimeter = 6 * sid;
                System.out.println("The perimeter of the Hexagon is: " + perimeter);
                break;
            default:
                System.out.println("Press valid key");
                break;
        }
    }
	
	//Meathod for  find the values for octagon

    public static void octagon(float si) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1. To find the area of the octagon\nPress 2. To find the perimeter of the Octagon");
        int ln = scanner.nextInt();
        
        switch (ln) {
            case 1:
                double area = 2 * (1 + Math.sqrt(2)) * si * si;
                System.out.println("The area of the octagon is: " + area);
                break;
            case 2:
                double perimeter = 8 * si;
                System.out.println("The perimeter of the octagon is: " + perimeter);
                break;
            default:
                System.out.println("Press valid key");
                break;
        }
    }
	
	//Meathod for  find the values for rhombus
	
	public static void rhombus(float rhom1,float rhom2){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Press 1. To find the area of the Rhombus\nPress 2. To find the Perimeter of the Rhombus");
		
		int rh=scanner.nextInt();
		switch(rh){
			case 1:
			float ra=(rhom1*rhom2)/2;
			System.out.println("The Area of rhombus is : "+ra);
			break;
			case 2:
			float re=4*rhom1;
			System.out.println("The perimeter of Rhombus is : "+re);
			break;
			default:
			System.out.println("Press Valid Key");
			break;
		}
	}
	
	//Meathod for  find the values for kite
	
	public static void kite(float ki1,float ki2){
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1. To find the area of the Kite\nPress 2. To find the Perimeter of the Kite");
		int kit=sc.nextInt();
		switch(kit){
			case 1:
			double kiy=(ki1*ki2)/2;
			System.out.println("The area of Kite is : "+kiy);
			break;
			case 2:
			double ks=2*(ki1+ki2);
			System.out.println("The perimeter of the kite is : "+ks);
			break;
			default:
			System.out.println("press valid key");
			break;
		}
	}
	
	
	//Meathod for  find the values for cylinder
	
	public static void cylinder(float ra,float hei){
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1. To find the Lateral surface area of the Cylinder\nPress 2. To find the Total Surface Area of the Cylinder\n Press 3. To find the volume of the cylinder");
		int cyl=sc.nextInt();
		switch(cyl){
			case 1:
			double lsa=2*3.14*ra*hei;
			System.out.println("The Lateral Surface Area of the cylinder is : "+lsa);
			break;
			
			case 2:
			double tsa=2*3.14*ra*(ra+hei);
			System.out.println("The total surface area of the Cylinder is : "+tsa);
			break;
			case 3:
			double vol=3.14*ra*ra*hei;
			System.out.println("The volume of the cylinder is : "+vol);
			break;
			default:
			System.out.println("Press valid key");
			break;
		}
	}
	
	//Meathod for  find the values for cone
	public static void cone(float rd,float sh){
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1. To find the Lateral surface area of the Cone\nPress 2. To find the Total Surface Area of the cone\n Press 3. To find the volume of the Cone");
		int  con=sc.nextInt();
		switch(con)
		{
			case 1:
			double las=3.14*rd*sh;
			System.out.println("The lateral surface area of the cone is : "+las);
			break;
			case 2:
			double tas=3.14*rd*(rd+sh);
			System.out.println("The total suface area of the cone is : "+tas);
			break;
			case 3:
			double volu=1/3*(3.14*rd*rd*sh);
			System.out.println("The volume of the Cone is : "+volu);
			break;
			default:
			System.out.println("press valid key");
			break;
		}
	}
	
	//Meathod for  find the values for sphere
	public static void 	sphere(float radiu){
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1. To find the Surface area of the Sphere\n Press 2. To find the volume of the Sphere");
		int spher=sc.nextInt();
		switch(spher){
			case 1:
			double surface=4*3.14*radiu*radiu;
			System.out.println("The Surface area of the sphere is : "+surface);
			break;
			case 2:
			double volm=4/3*3.14*radiu*radiu*radiu;
			System.out.println("The Volume of Cone is : "+volm);
			break;
			case 3:
			System.out.println("Press valid key");
			break;
		}
	}
	
	//Meathod for  find the values for cuboid
	
	public static void cuboid(float leng,float width,float heig){
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1. To find the surface area of the cuboid\nPress 2. To find the Volume of the  cuboid");
		int cub=sc.nextInt();
		switch(cub){
			case 1:
			double face = 2 * (leng * width + width * heig + heig * leng);
			System.out.println("The Surface area of the cuboid is : "+face);
			break;
			case 2:
			double  vl=leng*width*heig;
			System.out.println("The Volume of the  cuboidis : "+vl);
			break;
			default:
			System.out.println("Press Valid key");
			break;
		}
	}
	
	//Meathod for  find the values for cube
	
	public static void cube(float poin){
			Scanner sc=new Scanner(System.in);
			System.out.println("Press 1. To find the surface area of the cube\nPress 2. To find the Volume of the  cube");
			int cubo=sc.nextInt();
			switch(cubo){
				case 1:
				double sur=6*poin*poin;
				System.out.println("The surface area of the cube is ; "+sur);
				break;
				case 2:
				double vm=poin*poin*poin;
				System.out.println("The volume of the cube is : "+vm);
				break;
				default:
				System.out.println("Press valid key");
				break;
				
			}
	}
	
	//Meathod for  find the values for oval
	
	public static void oval(float base_area,float slh){
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1. To find the area of oval\nPress 2. To find circumfrence of oval");
		int pry=sc.nextInt();
		switch(pry){
			case 1:
			double  ara=3.14*base_area*slh;
			System.out.println("The area of the oval is : "+ara);
			break;
			case 2:
			double circum= 3.14* (3 * (base_area + slh) - Math.sqrt((3*base_area + slh) * (base_area + 3*slh)));
			System.out.println("The circumfrence of the oval is : "+circum);
			break;
			default:
			System.out.println("Press valid key");
			break;
		}
	}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Display the menu for shape selection
        System.out.println("Press 1 to check the value for rectangle");
        System.out.println("Press 2 to check the value for square");
        System.out.println("Press 3 to check the value for circle");
        System.out.println("Press 4 to check the value for Triangle");
        System.out.println("Press 5 to check the value for trapezium");
        System.out.println("Press 6 To find the values for pentagon");
        System.out.println("Press 7 To find the value for Hexagon");
        System.out.println("Press 8 To find the value for octagon");
        System.out.println("Press 9 To find the value for Rhombus");
		System.out.println("Press 10 To find the value for Kite");
		System.out.println("Press 11 To find the value for cylinder");
		System.out.println("Press 12 To find the value for cone");
		System.out.println("Press 13 To find the value for Sphere");
		System.out.println("Press 14 To find the value for cuboid");
		System.out.println("Press 15 To find the value for cube");
		System.out.println("Press 16 To find the value for oval");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Enter the length of the rectangle");
                float length = sc.nextFloat();
                System.out.println("Enter the breadth of the rectangle");
                float breadth = sc.nextFloat();
                perimeterLengthRectangle(length, breadth);
                break;
            case 2:
                System.out.println("Enter the side of the square");
                float side = sc.nextFloat();
                square(side);
                break;
            case 3:
                System.out.println("Enter the radius of the circle");
                float radius = sc.nextFloat();
                circle(radius);
                break;
            case 4:
                System.out.println("Enter the base of the triangle");
                float base = sc.nextFloat();
                System.out.println("Enter the height of the triangle");
                float height = sc.nextFloat();
                triangle(base, height);
                break;
            case 5:
                System.out.println("Enter the size of two parallel lines");
                float parallelA = sc.nextFloat();
                float parallelB = sc.nextFloat();
                System.out.println("Enter the height for the global value of trapezium");
                float heightTrapezium = sc.nextFloat();
                trapezium(parallelA, parallelB, 0, 0); // Last two parameters are placeholders for trapezium sides c and d
                break;
            case 6:
                System.out.println("Enter the sides of the pentagon");
                float sides = sc.nextFloat();
                pentagon(sides);
                break;
            case 7:
                System.out.println("Enter the sides of the hexagon");
                float sid = sc.nextFloat();
                hexagon(sid);
                break;
            case 8:
                System.out.println("Enter the sides for octagon");
                float si = sc.nextFloat();
                octagon(si);
                break;
			case 9:
				System.out.println("Enter the  value of diagonal one");
				float d1=sc.nextFloat();
				System.out.println("Enter the value for diagonal two");
				float d2=sc.nextFloat();
				rhombus(d1,d2);
				break;
			case 10:
				System.out.println("Enter the  value of diagonal one");
				float k1=sc.nextFloat();
				System.out.println("Enter the value for diagonal two");
				float k2=sc.nextFloat();
				kite(k1,k2);
				break;
			case 11:
				System.out.println("Enter the radius of the cylinder");
				float ru=sc.nextFloat();
				System.out.println("Enter the height of the cylinder");
				float  ho=sc.nextFloat();
				cylinder(ru,ho);
				break;
			case 12:
				System.out.println("Enter the radius of the cone");
				float rbf=sc.nextFloat();
				System.out.println("Enter the height of the cone");
				float slj=sc.nextFloat();
				cone(rbf,slj);
				break;
			case 13:
				System.out.println("Enter the Raadius of square");
				float rf=sc.nextFloat();
				sphere(rf);
				break;
			case 14:
				System.out.println("Enter the length  of the cuboid");
				float ln=sc.nextFloat();
				System.out.println("Enter the width of the cuboid ");
				float width=sc.nextInt();
				System.out.println("Enter the breadth of the cuboid");
				float bre=sc.nextFloat();
				cuboid(ln,width,bre);
				break;
			case 15:
				System.out.println("Enter the value of side foe the cube");
				float poin=sc.nextFloat();
				cube(poin);
				break;
			case 16:
				 System.out.println("Enter the Semi_major axes of oval");
				 float base_area=sc.nextFloat();
				 System.out.println("Enter the semi_minor axes of oval");
				 float slhp=sc.nextFloat();
				 oval(base_area,slhp);
				 break;		
            default:
                System.out.println("Press valid key");
                break;
        }
    }
}
