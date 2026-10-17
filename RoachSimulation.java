public class RoachSimulation {
    private int population;
    
    public RoachSimulation(int initial) {
        this.population = initial;
    }
    
    public void breed() {
        this.population = this.population * 2;
    }
    
    public void spray() {
        this.population = (int)(this.population * 0.9);
    }
    
    public int getRoaches() {
        return (int)this.population;
    }
}