/*public class HelloWorld {
 *   public static void main(String[] args) {
 *       System.out.println("Hello world!");
 *   }
}*/

public class Walrus {
	public int weight;
	public double tuskSize;
 
	public Walrus(int w, double ts) {
   	   weight = w;
   	   tuskSize = ts;
	}


    public static void main(String[] args){
        Walrus walrus = new Walrus(3500, 10.5);
        int x = 9;
        System.out.println(walrus);
        doStuff(walrus, x);
        System.out.println(walrus);
        System.out.println(x);
    }

    public static void doStuff(Walrus W, int x){
        W.weight = W.weight - 100;
        x = x - 5;
    }
}

