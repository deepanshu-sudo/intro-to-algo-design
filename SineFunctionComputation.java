// Java Program to Implement the sine() Function(approximately)
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class SineFunctionComputation {
    // Function to calculate and display sine of an angle
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double x = Math.PI/6;
        y = x*Math.PI/180;
        int n = 10;
        int i,j,fac;
        double sine = 0;
        for(i=0; i<=n; i++){
            fac = 1;
            for(j=2; j<=2*i+1; j++){
                fac*=j;
            }
            sine+=Math.pow(-1.0,i)*Math.pow(y,2*i+1)/fac;
        }
        System.out.format("The sine of " + x + " is %f",sine);
    }
}