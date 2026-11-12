public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int actualMinutes) {
        int expectedMinutes = new Lasagna().expectedMinutesInOven();
        int remainingMinutes = expectedMinutes - actualMinutes;
        return remainingMinutes;
    }

    public int preparationTimeInMinutes(int layers) {
        int preparationTime = layers * 2;
        return preparationTime;
    }

    public int totalTimeInMinutes(int layers, int actualMinutes) {
        int preparationTime = new Lasagna().preparationTimeInMinutes(layers);
        int totalTime = preparationTime + actualMinutes;
        return totalTime;
    }
}
