package se.sics.kompics.network.data;

public class ExponentialMovingAverage {
    private final double alpha;
    private double mean;

    public ExponentialMovingAverage(double alpha) {
        this.alpha = alpha;
    }

    public double getMean() {
        return mean;
    }

    public void addValue(double delTD) {
        mean = mean * (1 - alpha) + alpha * delTD;
    }
}
