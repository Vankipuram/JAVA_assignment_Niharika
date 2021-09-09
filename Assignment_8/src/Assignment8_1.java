import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.*;



public class Assignment8_1 {
	public static void main(String[] args) {
	BiFunction <Integer, Integer, Integer> funcAddObj = (i1, i2) -> i1 + i2;
	 
   
    BiFunction <Integer, Integer, Integer> funcSubtractObj = (i1, i2) -> i1 - i2;

    
    BiFunction <Integer, Integer, Integer> funcMuliplyObj = (i1, i2) -> i1 * i2;

 
    BiFunction <Integer, Integer, Integer> funcDivideObj = (i1, i2) -> i1 / i2;

    
    

    System.out.println("Addition of 10 and 5: " + funcAddObj.apply(10, 5));

    System.out.println("Subtract of 10 and 5: " + funcSubtractObj.apply(10, 5));

    System.out.println("Multiply of 10 and 5: " + funcMuliplyObj.apply(10, 5));

    System.out.println("Division of 10 and 5: " + funcDivideObj.apply(10, 5));

    
	}

}
