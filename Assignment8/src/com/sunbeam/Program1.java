package com.sunbeam;

import java.util.Comparator;

public class Program1  {
	
	
	public static <T>void selectionSort (T[] arr,Comparator<? super T> comp)  {
		
		int minIndex;
		for(int i=0; i<arr.length-1; i++) {
			minIndex=i;
		for(int j=i+1; j<arr.length; j++) {
		    
		    int index= (comp.compare(arr[j], arr[i]));
		    if (index>0){
                minIndex = j;
            }
        if (minIndex != i) {
            T temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
		}
	}}
	

	public static void main(String[] args) {
		Integer[] arr = {5,4,6,1,8};
		Comparator<Integer> comp =Integer::compare;
		selectionSort(arr,comp);
		for(Integer num : arr) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		
		Double[] arr1= {5.0,4.5,3.2,9.8};
		Comparator<Double> comp1= Double::compare;
		selectionSort(arr1,comp1);
		for(Double num1 : arr1) {
			System.out.println(num1+" ");
		}
		
			
			}
			
		
	}


