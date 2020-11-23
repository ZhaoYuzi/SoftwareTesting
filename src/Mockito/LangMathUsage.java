package Mockito;
import org.apache.commons.lang3.ArrayUtils;

import org.apache.commons.lang3.BooleanUtils;

import org.apache.commons.lang3.StringUtils;

import org.apache.commons.lang3.math.Fraction;

import org.apache.commons.lang3.math.NumberUtils;


public class LangMathUsage {
	public double max;
	public double min;

    public void  main(String[] args) {
   	
    	double [] array = { 1.0, 3.4, 0.8, 7.1, 4.6 };
    	
        demoFraction();

        demoNumberUtils();

        JudgeNumberYesNo(null);       
        
        MaxSubMin(array);

    }

    public void demoFraction() {

        System.out.println(StringUtils.center( " demoFraction " , 30, "=" ));

        Fraction myFraction = Fraction.getFraction(144,90);

        System.out.println( "144/90 as fraction: " + myFraction);

        System.out.println( "144/90 to proper: " +myFraction.toProperString());

        System.out.println( "144/90 as double: " +myFraction.doubleValue());

        System.out.println( "144/90 reduced: " + myFraction.reduce());

        System.out.println( "144/90 reduced proper: "

                +myFraction.reduce().toProperString());

        System.out.println();

    }

    public boolean JudgeNumberYesNo(String args) {
    	if(NumberUtils.isNumber(args))
    		return true;
    	return false;
    }
    
    public boolean demoNumberUtils() {

        System.out.println(StringUtils.center( " demoNumberUtils " , 30, "=" ));

        System.out.println( "Is 0x3F a number? ");
        
        if(JudgeNumberYesNo("0x3F")) {
        	System.out.println("Yes.");
        	return true;
        }else {
        	System.out.println("No.");
        	return false;
        }
    }
        
    public double Maximum(double array[]) {

        double max = NumberUtils.max(array);

        String arrayStr =ArrayUtils.toString(array);
        
        if(max == 7.1) {        
        	System.out.println( "Max of " + arrayStr + " is: " + max);     
        	return max;
        }
        return 0;
    } 
    
    public double MaxAddTo3(double array[]) {
    	//double sum=0;
    	int sum=0;//注入错误			
    	int i=0;
    	double max = Maximum(array);
    	while(i<3) {
    		sum += max;
    		i++;
    	}
    	System.out.println("MaxAddTo3="+sum);
    	return sum;
    }
    
    public  double Minimum(double array[]) {
    	
    	double min = NumberUtils.min(array);
    
    	String arrayStr =ArrayUtils.toString(array);
    	
    	if(min == 0.8) {
    		System.out.println( "Min of " + arrayStr + " is: " + min); 
    		return min;
    	}
    	return 0;
    }
    
    public  double MaxSubMin(double array[]) {
    	
    	double result;
    	
    	double max = MaxAddTo3(array);
    	
    	double min = Minimum(array);
    	
    	result = max - min;
    	
    	System.out.println("max - min ="+result);
    	
    	return result;
     }
    
}