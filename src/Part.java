public class Part extends Thread {
    public double result;
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
        double d = 1.0/lim;
        for(int i = inicio; i<end; i++){
            result += sumar(i*d);
        }
        result *= d;
    }

    public double sumar(double ag){
        return 4.0 /(1+ag*ag);
    }

    public double getPi(){
        return result;
    }
}
