# JVSA
![](https://img.shields.io/github/issues/evilelliot/java-vector-space-axioms) ![](https://img.shields.io/github/license/evilelliot/java-vector-space-axioms?color=g)

JVSA determina la validez de espacio vectorial en un conjunto de 3 matrices de *n* tamaño, considerando como reglas los 10 axiomas del espacio vectorial a continuación listados:

------------


1. <img src="https://latex.codecogs.com/svg.image?vw&space;\in&space;V" title="v,w \in\nu"/> 
2.   <img src="https://latex.codecogs.com/svg.image?v&plus;w&space;=&space;w&plus;v,&space;\;\forall&space;vw\in&space;V" title="v+w = w+v, \;\forall v,w\in V
"/> 

3. <img src="https://latex.codecogs.com/svg.image?v&plus;(w&plus;z)&space;=&space;(v&plus;w)&plus;z,&space;\;&space;\forall&space;vwz&space;\in&space;V" title="v+(w+z) = (v+w)+z, \; \forall v,w,z \in V"/> 

4. <img src="https://latex.codecogs.com/svg.image?v&plus;0=v,&space;\;&space;\forall\;&space;v\in&space;V" title="v+0=v, \; \forall\; v\in V"/> 

5. <img src="https://latex.codecogs.com/svg.image?v&plus;w&space;=&space;0&space;\;\;\forall&space;v&space;\in&space;V" title="v+w = 0 \;\;\forall v \in V" />

6. <img src="https://latex.codecogs.com/svg.image?a\in&space;\mathbb{R}\mbox{~and~}&space;v\in&space;V\Rightarrow&space;av\in&space;V" title="a\in \mathbb{R}\mbox{~and~} v\in V\Rightarrow av\in V" />

7. <img src="https://latex.codecogs.com/svg.image?a(v&plus;w)=av&plus;aw&space;\;&space;\forall&space;\;&space;a\in\mathbb{R}\mbox{~and~}vw\in&space;V" title="a(v+w)=av+aw \; \forall \; a\in\mathbb{R}\mbox{~and~}vw\in V" />

8. <img src="https://latex.codecogs.com/svg.image?(a&plus;b)v&space;=&space;av&plus;bv&space;\;\forall&space;\;&space;a&space;\in&space;\mathbb{R}&space;\mbox{~and~}&space;v&space;\in&space;V" title="(a+b)v = av+bv \;\forall \; a \in \mathbb{R} \mbox{~and~} v \in V" />

9. <img src="https://latex.codecogs.com/svg.image?a(bv)=(ab)v&space;\;\forall&space;a,b&space;\in&space;\mathbb{R}&space;\mbox{~and~}&space;v&space;\in&space;V" title="a(bv)=(ab)v \;\forall a,b \in \mathbb{R} \mbox{~and~} v \in V" />

10. <img src="https://latex.codecogs.com/svg.image?1v&space;=&space;v&space;\;\forall&space;v&space;\in&space;V" title="1v = v \;\forall v \in V" />


------------


Haciendo uso del método ruler determinado por el usuario, se realiza la comparación de cada axioma con los datos determinados, encontrando la evaluación final como valida en el caso donde todos los axiomas son verdaderos.

------------


## Extender la clase y generar un *custom ruler*.
Para crear una sentencia de reglas a considerar para determinar la validez dela axioma simplemente extiende la clase Axioms en tu clase con el custom ruler, a continuación añade la lógica de tu axioma.

------------

*Ejemplo B en la carpeta Examples.*
```java
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

```

------------

## Formas de inicializar el evaluador.

Generar 3 matrices de valores aleatorios de tamaño 2*2.
```java
Axioms axioms = new Axioms();
```
Generar manualmente las 3 matrices de evaluación e incluirlas en el constructor de Axioms permite configurar manualmente las matrices y su tamaño.

```java
int[][] mv = {{2,2},{3,2}};
int[][] mw = {{3,-2},{2,-2}};
int[][] mz = {{1,7},{2,7}};
Axioms axioms = new Axioms(mv, mw, mz, 2);
```
