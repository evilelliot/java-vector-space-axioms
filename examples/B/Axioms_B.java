package examples.B;
 
import src.Axioms;

public class Axioms_B extends Axioms{
    public Axioms_B(){
        super();
    }
    public Axioms_B(int[][] mv, int[][] mw, int[][] mz, int a){
        super(mv,mw,mz,a);
    }
    @Override
    public boolean ruler(int[][] matrix){
        // Where a > 2
        if(matrix[0][0] == (2 * matrix[0][1])){
            return true;
        }else{
            return false;
        }
    }
}
