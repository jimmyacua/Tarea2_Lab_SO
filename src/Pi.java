/*
* Para compilar usar los comandos "javac Pi.java", seguido de esto correr el programa
* usando el comando "java Pi + num", donde num es un número grande.
*/

public class Pi {
    public static void main(String [] args) throws InterruptedException{
        //-----------TAREA 1-------------------------------
        /*double pi = 0.0;
        double den = 1.0;
        int lim = Integer.parseInt(args[0]);
        int div = lim/10;
        for(int i=0; i<lim; i++){
            if(i%2 == 0){
                pi += (1/den);
            } else{
                pi -= (1/den);
            }
            den = den + 2.0;
        }
        pi = pi*4;
        System.out.println(pi);*/
     //---------------------------------------------------

        if(args.length != 0){
            Part hilos[] = new Part[10];
            int lim = Integer.parseInt(args[0]);
            int div = lim/10;
            for(int i=0; i<10; i++){
                hilos[i] = new Part(lim, i*div, (i+1)*div -1);
                hilos[i].start();
            }

            for (int i = 0; i<10; i++) {
                try {
                    hilos[i].join();
                }
                catch (InterruptedException e) {
                }
            }

            double result = 0.0;
            for(int i=0; i< 10; i++){
                result += hilos[i].getPi();
            }

            System.out.println(result);
        }
    }
}