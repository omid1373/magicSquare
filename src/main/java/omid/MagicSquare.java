package omid;

public class MagicSquare {
    private Integer n;
    private Integer[][] sq;

    public MagicSquare(Integer squareSize){
        this.n = squareSize;
        this.sq = new Integer[squareSize][squareSize];
        initialize();
    }

    private void initialize(){
        for(int i=0; i<n ; i++)
            for(int j=0; j<n ; j++)
                sq[i][j] = 0;
        sq[0][(n-1)/2] = 1;
    }

    private void generate(){
        if(n % 2 == 0) {
            sq = null;
            return;
        }
        int j = (n-1)/2 ,i = 0 , k , l;
        for(int key=2 ; key<=n*n ;key++){
           if(i-1 < 0) k = n-1; else  k = i-1;
           if(j-1 < 0) l = n-1; else  l = j-1;
           if(sq[k][l] > 0) i = (i+1)%n;
           else{
               i=k;
               j=l;
           }
           sq[i][j] = key;
        }
    }
    private void generateOmid(){
        if(n % 2 == 0) {
            sq = null;
            return;
        }
        int j = (n-1)/2 ,i = 0;
        for(int key=2 ; key<=n*n ;key++){
            i = (i-1) < 0 ? n-1 : i-1;
            j = (j-1) < 0 ? n-1 : j-1;
            if(sq[i][j] > 0){ i = (i+2)%n; j = (j+1)%n;}
            sq[i][j] = key;
        }
    }
    public void show(){
//        generate();
        generateOmid();
        if(sq == null){
            System.out.println("Problem generating Magic Square !!!");
            return;
        }
        for(int i=0 ; i<n ; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(sq[i][j] + "   ");
            System.out.print('\n');
        }
    }
}
