
// import java.io.BufferedReader;  
// import java.io.FileReader;  
// import java.io.IOException;

// public class TaskNo2 {  
//     public static void main(String[] args) {
//         // File path
//         String filePath = "data.txt";
//         try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//             String line;
//             int count = 0;
            
//             System.out.println("Content of the file:");
//             while ((line = br.readLine()) != null) {
//                 System.out.println(line);
                
//                 String words[] = line.split(" ");
//                 count = count + words.length;
//             }

//             System.out.println("Number of words present in the given file: " + count);
//         } catch (IOException e) {
//             System.out.println("An error occurred: " + e.getMessage());
//         }
// 		System.out.println("\nTask 1 Done!");
//     }
// }

















// Task No 2
// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Paths;

// public class TaskNo2 {

// 	private static String method(String file_path)
// 	{

// 		String str = " ";
// 		try {

// 			str = new String(
// 				Files.readAllBytes(Paths.get(file_path)));
// 		}
// 		catch (IOException e) {

// 			e.printStackTrace();
// 		}

// 		return str;
// 	}
// 	public static void main(String[] args)
// 	{
// System.out.println("Reading the input file = (data.txt)");
// 		String filePath = "data.txt";

// 		System.out.println(method(filePath));
// 		System.out.println("Task 2 Done!");
// 	}
// }













  



// Task no 3
// public class TaskNo2 {
//     public static void main(String[] args) {

//         String str = "I love Java.";
//         String[] words = str.split(" ");
//         for (String word : words) {
//             System.out.println(word);  
//         }
//         System.out.println("Task 3 Done!");
//     }
//     public static String[] splitString(String input) {
//         String regex = "\\s+|(?=[.,!?])|(?<=[.,!?])";
//         return input.split(regex);   
//     }

//    }














// Task no 4
// import java.util.Scanner;
// public class TaskNo2 {

//    public static void main(String[]args) {
// Scanner sc = new Scanner(System.in);

// String input;

// System.out.println("Enter your Sentence");
// input = sc.nextLine();

// int count = 0;

// for(int i=0; i<input.length(); i++){

// ++count;

// }
// System.out.println("<<Numbers of Words are>>" +  count);


// System.out.println("Task 4 Done!");
//    }
// }















// Task NO 5
import java.util.Scanner;

public class TaskNo2 {
    public static void main(String[] args) {
     
        Scanner s= new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = s.nextLine();

        String[] words = sentence.split("[\\s,.;:!?]+");

        int wordCount = words.length;

        System.out.println("Words: " + String.join(", ", words));
        System.out.println("Number of words: " + wordCount);

System.out.println("Task 5 Done!");
        s.close();
    }
}






















// Task No 6
// import java.util.Scanner;

// class GFG {
//     public static int countWords(String str) {
//         if (str == null || str.isEmpty())
//             return 0;
         
//         String[] words = str.split("\\s+");
        
//         return words.length;
//     }
//     public static void main(String args[]) {
//         System.out.println("Task No 6");
       
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter a string: ");
//         String str = scanner.nextLine();

//         scanner.close();

//         System.out.println("Number of words: " + countWords(str));

// System.out.println("Task Done!");
//     }
// }



