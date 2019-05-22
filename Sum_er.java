import java.util.Scanner;
/**
 * Sum_er can return the total of all numbers from 1 to n,
 * n being positive or negative.
 *
 * @author Caleb Powell
 * @version 5.22.19
 */

public class Sum_er{
    
    private Scanner input;
    private int n;
    private int sum = 0;
    
    public Sum_er(){
        input = new Scanner(System.in);
        System.out.println("Choose an integer to sum to");
        n = input.nextInt();
        input.close();
    }
    
    public Sum_er(int sumToThis){
        n = sumToThis;
    }
    
    public int returnSum(){
        if(n > 1){
            for(int i = 1; i <= n; i++){
                sum += i;
            }
        } else {
            for(int i = 1; i >= n; i--){
                sum += i;
            }
        }
        
        return sum;
    }
}