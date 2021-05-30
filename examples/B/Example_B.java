package examples.B;

import examples.B.Axioms_B;

public class Example_B {
    public static void main(String[] args) {
        // Every 2*2 matrix where a = 2b
        int[][] v = {{4,2},{3,4}};
        int[][] w = {{6,3},{3,4}};
        int[][] z = {{12,6},{3,4}};
        // New custom axioms obj with custom matrix
        Axioms_B custom = new Axioms_B(v,w,z,2);
        // Evalualte axioms
        custom.evaluate(2,3);
    }

}
