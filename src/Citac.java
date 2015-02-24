// Třída našeho vlastního čítače
// pomocí timeru budeme zmenšovat velikost privátní proměnné -> tickCounter()

/**
 *
 * @author Administrator
 */
public class Citac {
    private int counter;
    
    Citac(int CountDownFrom) {
        this.counter = CountDownFrom;
    }
    
    public void tickCounter() {
        this.counter-=0.1;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
}
