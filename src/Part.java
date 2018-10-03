public class Part extends Thread {
    private double result;
    private int inicio;
    private int end;
    private int lim;

    public Part(int l,int i, int f) {
        inicio = i;
        end = f;
        result = 0.0;
        lim = l;
    }

    @Override
    public void run() {
        for(int i = inicio; i<end; i++){
            result += sumar(i);
        }
        result *= 4;
    }

    public double sumar(double ag){
        double d = (Math.pow(-1,ag))/(2*ag+1);
        return d;
    }

    public double getPi(){

        return result;
    }
}
