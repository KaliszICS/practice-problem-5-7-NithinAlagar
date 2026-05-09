/**

        * File: Lesson 5.7 - arrayLists

        * Author: Nithin.A

        * Date Created: may 9th, 2026

        * Date Last Modified: May 9th, 2026

        */
import java.util.ArrayList;
public class PracticeProblem {

	public static void main(String args[]) {
	}
	public static void swap(ArrayList<String> arrL, int num1, int num2){
		String temp = arrL.get(num1);
		arrL.set(num1, arrL.get(num2));
		arrL.set(num2, temp);

	}

	public static ArrayList<Double> createArrayList(double[] doub){
		ArrayList<Double> arrL = new ArrayList<Double>();
		for (int i = 0; i < doub.length; i++){
			arrL.add(doub[i]);	
		}
		return arrL;
	}

	public static ArrayList<Integer> mergeLists(ArrayList<Integer> arrL1, ArrayList<Integer> arrL2){
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		for (int i = 0; i < arrL1.size(); i++){
			arrL.add(arrL1.get(i));
		}
		for (int i = 0; i < arrL2.size(); i++){
			arrL.add(arrL2.get(i));
		}
		return arrL;
	}

}
