
public class Program {

    public static void main(String[] args) {
       int[][] matrix = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };

        System.out.println(arrayAsString(matrix));
    }
    
    public static String arrayAsString(int[][] array) {
        String answer = "";
        int charCount = 0;
        for(int x = 0; x<array.length; x++) {
            for(int y = 0; y<array[x].length; y++) {
                answer = answer + String.valueOf(array[x][y]);
                charCount++;
//                Whenever the character count reaches the length of the row (in this case, 4), print an empty line and reset the character count again.
                if(charCount==array[x].length) {
                    answer = answer + "\n";
                    charCount = 0;
                }
            }
        }
        return answer;
    }

}
