import java.util.ArrayList;
import java.util.Scanner;
public class exC
{
    
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//create scanner object
        //inputs

        int N1 = sc.nextInt();//create variable N1
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < N1; i++) {//create input array with length N1
            numbers.add(sc.nextInt());
        }
        

        int N2 = sc.nextInt()+1; //create var N2
        ArrayList<String> characters = new ArrayList<String>(); //create array list for characters
        for (int i = 0; i < N2; i++) { //input characters
            characters.add(sc.nextLine());
        }
        characters.remove(0);//le quito el primer valor pq me aparecia un espacio por la carisima
        

        int N3= sc.nextInt()+1;//variable N3
        ArrayList <String> strings = new ArrayList<String>();//create array for list of strings
        for (int i = 0; i < N3; i++) {
            strings.add(sc.nextLine());
        }
        strings.remove(0);
        

       

        //ahora empiezo con los outputs
        for (int i = 0; i < N1; i++) {
            
            numbers.set(i, numbers.get(i)*2);//output 1
            System.out.print(numbers.get(i)+" ");
        }
        System.out.println("");

        for (int i = 0; i < N2-1; i++) {
            characters.set(i, characters.get(i).toUpperCase());//lo cambias a mayuscula
            
            System.out.print(characters.get(i)+" ");
        }
        
        System.out.println(" ");
        for (int i = 0; i < N3-1; i++) {
            strings.set(i, strings.get(i).replace("a", "0"));
            strings.set(i, strings.get(i).replace("e", "0"));
            strings.set(i, strings.get(i).replace("i", "0"));
            strings.set(i, strings.get(i).replace("o", "0"));
            strings.set(i, strings.get(i).replace("u", "0"));
            System.out.print(strings.get(i)+" ");
        }

       
   }
    
}