//figura es abstract porque tiene al menos un metodo abstracto
public class Triangulo extends Figura implements Comparable<Triangulo>{
    private double base;
    private double altura;

    public Triangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }

    //implementacion del metodo abstracto
    public double calcularArea(){
        return (base * altura) / 2;
    }

    public double numeroLados() {
        return 3;
    }

    @Override
    public int compareTo(Triangulo triPorComparar) {
        double areaPorComparar = triPorComparar.calcularArea();
        double miArea = this.calcularArea();
        double ladosPorComparar = triPorComparar.numeroLados();
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