//figura es abstract porque tiene al menos un metodo abstracto
public class Rectangulo extends Figura implements Comparable<Rectangulo>{
    private double base;
    private double altura;

    public Rectangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }

    //implementacion del metodo abstracto
    public double calcularArea(){
        return base * altura;
    }

    public double numeroLados() {
        return 4;
    }

    @Override
    public int compareTo(Rectangulo rectPorComparar) {
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();
        double ladosPorComparar = rectPorComparar.numeroLados();
        double misLados = this.numeroLados();

        if(miArea==areaPorComparar){
            //se modifica el metodo para que tome en cuenta el numero de lados
            if(misLados == ladosPorComparar){
                return 0;
            }

            else if (misLados > ladosPorComparar){
                return 1;
            }

            else{
                return -1;
            }
        }

        else if (miArea > areaPorComparar){
            return 1;
        }

        else{
            return -1;
        }
    }
}