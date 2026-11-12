public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes) {
        int expectedMinutes = new Lasagna().expectedMinutesInOven();
        int remainingMinutes = expectedMinutes - actualMinutes;
        return remainingMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        int preparationTime = layers * 2;
        return preparationTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int actualMinutes) {
        int preparationTime = new Lasagna().preparationTimeInMinutes(layers);
        int totalTime = preparationTime + actualMinutes;
        return totalTime;
    }
}
