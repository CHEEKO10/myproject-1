public class TwoDexone {
    public static void main(String[] args){
        String[] movies = {" Maze runner ","Avengers "," Micheal"};
        String[] Books = {" Tell No lies "," After "," Wind breaker "};
        String[] Songs ={" Company "," Hate that I Made you love me "," Beauty and the beat"};

        String[][] Mytaste={movies, Books,Songs};

        for(String[] Firstarray:Mytaste){
            for(String Secondarray:Firstarray){
                System.out.print(Secondarray);
            }
            System.out.println();
        }
    }
}