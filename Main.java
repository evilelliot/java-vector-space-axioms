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
        int[][] mw = {{3,-6},{2,-6}};
        int[][] mz = {{1,7},{2,154}};
        Axioms axioms = new Axioms(mv, mw, mz, 2);

        // Control
        axioms.matrix_printer(axioms.matrix_v);
        axioms.matrix_printer(axioms.matrix_w);
        axioms.matrix_printer(axioms.matrix_z);

        axioms.evaluate(2, 5);
    }
}

