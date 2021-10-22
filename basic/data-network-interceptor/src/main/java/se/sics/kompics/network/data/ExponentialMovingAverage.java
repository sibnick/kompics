package se.sics.kompics.network.data;

//todo
public class ExponentialMovingAverage {

    private double alpha;
    private double mean;
    private int n;

    public ExponentialMovingAverage(double alpha) {
        this.alpha = alpha;
    }

    public double getMean() {
        return mean;
    }

    public void addValue(double delTD) {
    }
}
