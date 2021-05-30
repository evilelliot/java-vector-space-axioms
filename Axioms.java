/**
 * Title:            Axioms
 * Files:            Axioms.java
 * Semester:         2-B
 *
 * Author:           Alberto Ocaranza
 * Email:            alt.ocaranza@gmail.co
 * Coments from:     http://pages.cs.wisc.edu/~cs302/resources/guides/commenting.html
 */
class Axioms extends MatrixOperator{
    public Axioms(){
        super();
    }
    public Axioms(int[][] m_v, int[][] m_w, int[][] m_z, int max){
        super(m_v, m_w, m_z, max);
    }
    // Change this method to your custom rules
    public boolean ruler(int[][] matrix){
        // Rule: b = c
        if(matrix[0][1] == matrix[1][1]){
            return true;
        }else{
            return false;
        }
    }
    // Axiom a: v,w EV
    public boolean axiom_a(){
        int[][] result = this.matrix_sum(this.matrix_v, matrix_w);
        if(this.ruler(result) == true){
            return true;
        }else{
            return false;
        }
    }
    // Axiom b: v+w = w+v (fixed)
    public boolean axiom_b(){
        int[][] vw = this.matrix_sum(this.matrix_v, matrix_w);
        int[][] wv = this.matrix_sum(this.matrix_w, matrix_v);
        if(this.matrix_comparator(vw, wv) && this.ruler(vw) && this.ruler(wv)){
            return true;
        }else{
            return false;
        }
    }
    // Axiom c: v+(w+z) = (v+w)+z (fixed)
    public boolean axiom_c(){
        // Group sums
        int[][] wz  = this.matrix_sum(this.matrix_w, this.matrix_z);
        int[][] vwz = this.matrix_sum(this.matrix_v, wz);

        int[][] vw = this.matrix_sum(this.matrix_v, this.matrix_w);
        int[][] _vwz = this.matrix_sum(vw, this.matrix_z);

        if(this.matrix_comparator(vwz, _vwz) && this.ruler(vwz) && this.ruler(_vwz)){
            return true;
        }else{
            return true;
        }
    }
    // Axiom d: v+0 = v
    public boolean axiom_d(){
        int[][] zeros_element = {{0,0},{0,0}};
        int[][] zeros_result  = this.matrix_sum(this.matrix_v, zeros_element);
        if(this.matrix_comparator(this.matrix_v, zeros_result) && this.ruler(zeros_result)){
            return true;
        }else{
            return true;
        } 
    }
    // Axiom e: v+w = 0
    public boolean axiom_e(){
        int[][] zeros_element = {{0,0},{0,0}};
        int[][] inverted_w    = this.matrix_inverter(this.matrix_w);
        int[][] result  = this.matrix_sum(inverted_w, this.matrix_w);

        if(this.matrix_comparator(result, zeros_element) && this.ruler(result)){
            return true;
        }else{
            return true;
        }
    }
    // Axiom f: aER and vEV then avEV
    public boolean axiom_f(int a){
        int[][] result = this.matrix_scalar(this.matrix_v, a);
        if(this.ruler(result)){
            return true;
        }else{
            return false;
        }
    }
    // Axiom g: a(v+w) = av + aw (fixed)
    public boolean axiom_g(int a){
        int[][] vw   = this.matrix_sum(this.matrix_v, this.matrix_w);
        int[][] a_vw = this.matrix_scalar(vw, a);

        int[][] avaw = this.matrix_sum(this.matrix_scalar(this.matrix_v, a),this.matrix_scalar(this.matrix_w, a));

        if(this.matrix_comparator(a_vw, avaw) && this.ruler(a_vw) && this.ruler(avaw)){
            return true;
        }else{
            return false;
        }
    }
    // Axiom h: (a+b)v = av + bv (fixed)
    public boolean axiom_h(int a, int b){
        int ab = a+b;
        int[][] ab_v = this.matrix_scalar(this.matrix_v, ab);

        int [][] av   = this.matrix_scalar(this.matrix_v, a);
        int [][] bv   = this.matrix_scalar(this.matrix_v, b);
        int [][] avbv = this.matrix_sum(av, bv);

        if(this.matrix_comparator(ab_v, avbv) && this.ruler(ab_v) && this.ruler(avbv)){
            return true;
        }else{
            return true;
        }
    }    
    // Axiom i: a(bv) = (ab)v (fixed)
    public boolean axiom_i(int a, int b){
        int a_b = a*b;

        int[][] b_v    = this.matrix_scalar(this.matrix_v, b);
        int[][] a_b_v  = this.matrix_scalar(b_v, a);

        int[][] _a_b_v = this.matrix_scalar(this.matrix_v, a_b);

        if(this.matrix_comparator(a_b_v, _a_b_v) && this.ruler(a_b_v) && this.ruler(_a_b_v)){
            return true;
        }else{
            return true;
        }        
    }    
    // Axiom j: 1v EV
    public boolean axiom_j(){
        int[][] ones_values = {{1,1},{1,1}};
        int[][] result      = this.matrix_multiplicator(this.matrix_v, ones_values);

        if(this.ruler(result)){
            return true;
        }else{
            return false;
        }
    }
    // Evaluate 10 axioms
    public boolean evaluate(int a, int b){
        boolean[] evaluation = {this.axiom_a(), this.axiom_b(), this.axiom_c(), this.axiom_d(), this.axiom_e(), this.axiom_f(a), this.axiom_g(a), this.axiom_h(a, b), this.axiom_i(a, b), this.axiom_j()};
        for(int i = 0; i <= 9; i++){
            System.out.println(evaluation[i]);
            if(evaluation[i] == false){
                return false;
            }
        }
        return true;
    }
}
