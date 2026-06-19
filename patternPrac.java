public class patternPrac {

    public static void lineStar(){
        int n = 4;
        for(int i = 1; i<=n ;i++){
            System.out.println("*");
        }
    }

    public static void square(){
        int n = 4;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }


    public static void triangle(){
        int n = 4;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void invertedTriangle(){
        int n = 4;
        for(int i =n;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void floydTri1toi(){
        int n = 4;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydTriangle(){
        int n = 4;
        int val = 1;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(val);
                val++;
            }
            System.out.println();
        }
    }

    public static void floyd11(){
        int n = 4;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void floydAlphabet(){
       
        for(int i =1;i<=7;i++){
             char n = 'A';
            for(int j =1;j<=i;j++){
                System.out.print(n);
                n++;
            }
            
            System.out.println();
        }
    }

    public static void mirrorTriangle(){
        int n = 4;

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

        public static void mirrorTriangleInverted(){
        int n = 4;

        for(int i = n; i >= 1; i--){

            
            for(int j = 0; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            

            System.out.println();
        }
    }

    public static void  centeredTriangle(){
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j =1;j<=(n-i) ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ;j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void  centeredTriangleInverted(){
        int n = 4;
        for(int i=n;i>=1;i--){
           
            for(int j =1;j<=(n-i) ; j++){
                System.out.print(" ");
            }
             for(int j = 1 ;j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void triangle2(){
        int n = 4;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
         for(int i= n;i>=1;i--){
            for(int j=2;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
       
    }

    public static void floyd01(){
        int n =4;

        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                if((i+j) % 2 ==0){
                    System.out.print(" 1");
                }else{
                    System.out.print(" 0");
                }

            }
            System.out.println();
        }
    }

    public static void hollow_rectangle(){
        int row =10;
        int col = 10;
        for(int i =1;i<=row;i++){
            for(int j =1;j<=col;j++){
               if(i==1 || i==row || j==1 || j==col){
                 System.out.print("*");
               }else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
    }

    public static void triangleCentEven(){
        int n = 4;
        for(int i =1; i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    public static void triangleCentEven2
    
    (){
        int n = 4;
        for(int i =1; i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        triangleCentEven();
     
        
    }
}