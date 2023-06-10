public class task2 {

    // public static String compressLine(String line){

    
    // StringBuilder sb = new StringBuilder();
    // char sbl = line.charAt(0);
    
    // for (int i = 1; i < line.length(); i++){

    //     }
    // }
}


// String input = "aaaaaaaaaaaaaaaaaabbbcdd";
//         String compressed = compressString(input);
//         System.out.println(compressed);
//     }

//     public static String compressString(String input) {
//         if (input.isEmpty()) {
//             return input;
//         }

//         StringBuilder sb = new StringBuilder();
//         char sbl = input.charAt(0);
//         int count = 1;

//         for (int i = 1; i < input.length(); i++) {
//             char nextChar = input.charAt(i);

//             if (nextChar == sbl) {
//                 count++;
//             } else {
//                 sb.append(sbl);
//                 sb.append(count);
//                 sbl = nextChar;
//                 count = 1;
//             }
//         }

//         sb.append(sbl);
//         sb.append(count);

//         return sb.toString();
//     }