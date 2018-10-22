
/**
 * Chapter 4
 * Programming Challenge 8: Running the Race
 * The Runners class stores data for runners in a race.
 */

public class Runners {

    private String runner1; // First runner's name
    private String runner2; // Second runner's name
    private String runner3; // Third runner's name
    private double time1;   // First runner's time
    private double time2;   // Second runner's time
    private double time3;   // Third runner's time

    /**
     * The setRunner1 method sets the name of the first runner.
     */
    public void setRunner1(String r) {
        runner1 = r;
    }

    /**
     * The setRunner2 method sets the name of the second runner.
     */
    public void setRunner2(String r) {
        runner2 = r;
    }

    /**
     * The setRunner3 method sets the name of the third runner.
     */
    public void setRunner3(String r) {
        runner3 = r;
    }

    /**
     * The setTime1 method sets the time of the first runner.
     */
    public void setTime1(double t) {
        time1 = t;
    }

    /**
     * The setTime2 method sets the time of the second runner.
     */
    public void setTime2(double t) {
        time2 = t;
    }

    /**
     * The setTime3 method sets the time of the third runner.
     */
    public void setTime3(double t) {
        time3 = t;
    }

    /**
     * The getRunner1 method returns the name of the first runner.
     */
    public String getRunner1() {
        return runner1;
    }

    /**
     * The getRunner2 method returns the name of the second runner.
     */
    public String getRunner2() {
        return runner2;
    }

    /**
     * The getRunner3 method returns the name of the third runner.
     */
    public String getRunner3() {
        return runner3;
    }

    /**
     * The getTime1 method returns the time of the first runner.
     */
    public double getTime1() {
        return time1;
    }

    /**
     * The getTime2 method returns the time of the second runner.
     */
    public double getTime2() {
        return time2;
    }

    /**
     * The getTime3 method returns the time of the third runner.
     */
    public double getTime3() {
        return time3;
    }

    /**
     * The getFirstPlace method returns the name of the first place runner.
     * Note: This method does NOT check for ties!
     */
    public String getFirstPlace() {
        String firstPlace = null;

        if (time1 < time2 && time1 < time3) {
            firstPlace = getRunner1();
            return firstPlace;
        } else if (time2 < time1 && time2 < time3) {
            firstPlace = getRunner2();
        } else if (time3 < time1 && time3 < time2) {
            firstPlace = getRunner3();
        }
        return firstPlace;
    }

    /**
     * The getSecondPlace method returns the name of the second place runner.
     * Note: This method does NOT check for ties!
     */
    public String getSecondPlace() {
        String firstPlace = getFirstPlace();
        double firstPlaceTime = 0;

        if (firstPlace.equals(runner1)) {
            firstPlaceTime = time1;
        } else if (firstPlace.equals(runner2)) {
            firstPlaceTime = time2;
        } else if (firstPlace.equals(runner3)) {
            firstPlaceTime = time3;
        }

        String secondPlace = null;

        if (((firstPlaceTime < time1) && (time1 < time3))
                || ((firstPlaceTime < time1)
                && (time1 < time2))) {
            secondPlace = getRunner1();
        } else if (((firstPlaceTime < time2) && (time2 < time3))
                || ((firstPlaceTime < time2)
                && (time2 < time1))) {
            secondPlace = getRunner2();
        } else if (((firstPlaceTime < time3) && (time3 < time2))
                || ((firstPlaceTime < time3)
                && (time3 < time1))) {
            secondPlace = getRunner3();

        }
        return secondPlace;
    }

    /**
     * The getThirdPlace method returns the name of the third place runner.
     * Note: This method does NOT check for ties!
     */
    public String getThirdPlace() {
        String secondPlace = getSecondPlace();
        double secondPlaceTime = 0;

        if (secondPlace.equals(runner1)) {
            secondPlaceTime = time1;
        } else if (secondPlace.equals(runner2)) {
            secondPlaceTime = time2;
        } else if (secondPlace.equals(runner3)) {
            secondPlaceTime = time3;
        }

        if (secondPlaceTime < time1) {
            secondPlace = getRunner1();
        } else if (secondPlaceTime < time2) {
            secondPlace = getRunner2();
        } else if (secondPlaceTime < time3) {
            secondPlace = getRunner3();
        }
        return secondPlace;

    }
}
