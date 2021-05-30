import src.Axioms;

/**
 * Title:            Main class
 * Files:            Main.java
 * Semester:         2-B
 *
 * Author:           Alberto Ocaranza
 * Email:            alt.ocaranza@gmail.co
 * Coments from:     http://pages.cs.wisc.edu/~cs302/resources/guides/commenting.html
**/
public class Main {
    public static void main(String[] args) {
        int[][] mv = {{2,2},{3,2}};
        int[][] mw = {{3,-2},{2,-2}};
        int[][] mz = {{1,7},{2,7}};
        Axioms axioms = new Axioms(mv, mw, mz, 2);
        // Basic example
        if(axioms.evaluate(2, 5) == false){
            System.out.println("No es un espacio vectorial.");
        }
    }
}

