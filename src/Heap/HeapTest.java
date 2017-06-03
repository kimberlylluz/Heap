package Heap;

import java.util.*;

public class HeapTest {
    public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Start with [0/n]: ");
		String choice = in.nextLine();
		
		if(choice.equals("0")){
			System.out.println("Choose heap order [ma(x) / mi(n)]:");
			String choice2 = in.nextLine();
			
			if(choice2.equals("n")){
		        MinHeap h = new MinHeap();
				System.out.println("Min-heap order selected.");
				String c;
				
				do{
					System.out.println("\nChoose operation [(D)elete/(I)nsert/(E)xit]: ");
					c = in.nextLine();
					
					if(c.equals("i") || c.equals("I")){
						System.out.println("Input key value to insert: ");
						int key = in.nextInt();
						h.add(key);
						System.out.println("Done inserting....\nResulting new heap: " + h.toString());
					}else if(c.equals("d") || c.equals("D")){
						if(h.size() > 0){
							System.out.println("Input key value to delete: ");
							int key = in.nextInt();
							System.out.println(h.remove(key));
						}else{
							System.out.println("Empty heap.");
						}
					}else if(c.equals("e") || c.equals("E"))
						break;
					
				}while(!(c.equals("e")) || !(c.equals("E")));
				
			}else if(choice2.equals("x")){
		        MaxHeap h = new MaxHeap();
				System.out.println("Max-heap order selected.");
				String c;
				
				do{
					System.out.println("\nChoose operation [(D)elete/(I)nsert/(E)xit]: ");
					c = in.nextLine();
					
					if(c.equals("i") || c.equals("I")){
						System.out.println("Input key value to insert: ");
						int key = in.nextInt();
						h.add(key);
						System.out.println("Done inserting....\nResulting new heap: " + h.toString());
					}else if(c.equals("d") || c.equals("D")){
						if(h.size() > 0){
							System.out.println("Input key value to delete: ");
							int key = in.nextInt();
							System.out.println(h.remove(key));
						}else{
							System.out.println("Empty heap.");
						}
					}else if(c.equals("e") || c.equals("E"))
						break;
					
				}while(!(c.equals("e")) || !(c.equals("E")));
				
			}
		}else if(choice.equals("n") || choice.equals("N")){
			System.out.println("Input array of size n: ");
			String inputArray = in.nextLine();
			int j = 0;
				
			String[] string = new String[inputArray.length()];	
			for(int i = 0; i < inputArray.length(); i++)
				string[i] = "";
			
			for(int k = 0; k < inputArray.length(); k++){
				if (inputArray.charAt(k) == ',')
					j++;
				else
					string[j] += inputArray.charAt(k);
			}
			String[] array = new String[j+1];
			
			System.arraycopy(string, 0, array, 0, array.length);
			
			int[] content = new int[array.length];
			for(int k = 0; k < array.length; k++)
				content[k] = Integer.parseInt(array[k]);
			
			System.out.println("Input accepted. Size of n set to " + content.length + " ...");
			System.out.println("Choose heap order [ma(x) / mi(n)]:");
			String choice2 = in.nextLine();
			
			if(choice2.equals("n")){
		        MinHeap h = new MinHeap();
				String c;
				
				for(int i = 0; i < content.length; i++)
					h.add(content[i]);

				System.out.println("Min-heap order selected.... Heapifying.... done.\nResulting Min Heap: " + h.toString());
				
				do{
					System.out.println("\nChoose operation [(D)elete/(I)nsert/(E)xit]: ");
					c = in.nextLine();
					
					if(c.equals("i") || c.equals("I")){
						System.out.println("Input key value to insert: ");
						int key = in.nextInt();
						h.add(key);
						System.out.println("Done inserting....\nResulting new heap: " + h.toString());
					}else if(c.equals("d") || c.equals("D")){
						if(h.size() > 0){
							System.out.println("Input key value to delete: ");
							int key = in.nextInt();
							System.out.println(h.remove(key));
						}else{
							System.out.println("Empty heap.");
						}
					}else if(c.equals("e") || c.equals("E"))
						break;
					
				}while(!(c.equals("e")) || !(c.equals("E")));
				
			}else if(choice2.equals("x")){
		        MaxHeap h = new MaxHeap();
				String c;
				
				for(int i = 0; i < content.length; i++)
					h.add(content[i]);

				System.out.println("Max-heap order selected.... Heapifying.... done.\nResulting Max Heap: " + h.toString());
				
				do{
					System.out.println("\nChoose operation [(D)elete/(I)nsert/(E)xit]: ");
					c = in.nextLine();
					
					if(c.equals("i") || c.equals("I")){
						System.out.println("Input key value to insert: ");
						int key = in.nextInt();
						h.add(key);
						System.out.println("Done inserting....\nResulting new heap: " + h.toString());
					}else if(c.equals("d") || c.equals("D")){
						if(h.size() > 0){
							System.out.println("Input key value to delete: ");
							int key = in.nextInt();
							System.out.println(h.remove(key));
						}else{
							System.out.println("Empty heap.");
						}
					}else if(c.equals("e") || c.equals("E"))
						break;
					
				}while(!(c.equals("e")) || !(c.equals("E")));	
			}
		}
	}
}