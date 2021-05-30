package examples.A;
 
import src.Axioms;

public class Custom_Axioms extends Axioms{
    public Custom_Axioms(){
        super();
    }
    public Custom_Axioms(int[][] mv, int[][] mw, int[][] mz, int a){
        super(mv,mw,mz,a);
    }
    @Override
    public boolean ruler(int[][] matrix){
        // Where a > 2
        if(matrix[0][0] > 0){
            return true;
        }else{
            return false;
        }
    }
}
