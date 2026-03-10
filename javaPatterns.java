public class javaPatterns {
    
    public static void hollowRectangle(int totRow, int totCol){
        for(int i =1 ; i<=totRow; i++){
            for(int j=1; j<=totCol; j++){
                if(i==1 || i==totRow || j==1 || j==totCol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
        System.out.println();
        }    
}

    public static void invertHalfPyramid(int n){
        for(int i =1; i<= n; i++){
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
       public static void invertHalfPyramidupsidedown(int n){
        for(int i =n ; i>= 1; i--){
             for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            for(int j = 1; j<= i; j++){
                System.out.print(" ");
            }
           
            System.out.println();

        }
    }

    //method 2
    public static void invertHalfPyramid2(int n){
        for(int i =1 ; i<= n; i++){
             for(int j=1; j<=n-i+1;j++){
                System.out.print(" "+j);
            }
            for(int j = 1; j<= i; j++){
                System.out.print(" ");
            }
           
            System.out.println();

        }
    }

    public static void triangle(int n){
        int num = 1;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<= i;j++){
                System.out.print(num + " ");
                num ++;

            }
            System.out.println();
        }
    }

      public static void triangle01(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<= i;j++){
                if((i+j) % 2==0){
                    System.out.print(" "+1);
                }else{
                    System.out.print(" "+ 0);
                }
            }
            System.out.println();
        }
        
    }

    public static void butterfly(int n){

        for(int i =0; i<=n;i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =n; i>=1;i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void solid_rhombus(int n){

        for(int i=1; i<=n; i++){
            for(int j =1;j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int row, int col){
        for(int i =1; i<=row; i++){
            for(int j =1;j<=row-i;j++){
                    System.out.print(" ");
            }
            for(int j=1;j<=col;j++){
                if(i == 1 || i == row || j == 1 || j == col ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void daimond(int n){

        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
         for(int i =n;i>=1;i--){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }


    //method 2
    public static void daimond2(int n){

        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=(2*i) - 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i =n;i>=1;i--){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=(2*i) - 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void sandGlass(){
        int n = 5;
         for(int i =n;i>=1;i--){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=(2*i) - 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =2;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=(2*i) - 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void x(){
        int n = 5;

      for(int i =1;i<=n;i++){
        for(int j = 1; j<=n-i;j++){
            System.out.print(" ");
        }
      }
    }

 public static void main(String[] args) {
    // hollowRectangle(5,4);
    // invertHalfPyramid(9);
    // invertHalfPyramidupsidedown(9);
    // invertHalfPyramid2(9);
    // triangle(9);
    // triangle01(9);
    // butterfly(9);
    // solid_rhombus(8);
    // hollow_rhombus(4, 5);
    // daimond2(10);
    // sandGlass();
    x();

        }
    }