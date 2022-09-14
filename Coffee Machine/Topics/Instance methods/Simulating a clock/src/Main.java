class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (minutes + 1 < 60) {
            minutes++;
        } else {
            minutes = 0;
            if (hours + 1 > 12) {
                hours = 1;
            } else {
                hours++;
            }
        }
    }
}