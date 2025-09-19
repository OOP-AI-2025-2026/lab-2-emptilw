package ua.opnu;


public class TimeSpan {

    // TODO: add class fields
    private int hours;
    private int minutes;

    TimeSpan(int hours, int minutes) {
        // TODO: write constructor body
        if (hours < 0 || minutes < 0 || minutes > 59) {
            this.hours = 0;
            this.minutes = 0;
            return;
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    int getHours() {
        return hours;
    }

    int getMinutes() {
        // TODO: write method body
        return minutes;
    }

    void add(int hours, int minutes) {
        // TODO: write method body
        if (hours < 0 || minutes < 0 || minutes > 59) {
            return; // некоректні дані → нічого не робимо
        }

        this.hours += hours;
        this.minutes += minutes;

        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes = this.minutes % 60;
        }
    }

    void addTimeSpan(TimeSpan timespan) {
        // TODO: write method body
        add(timespan.getHours(), timespan.getMinutes());
    }

    double getTotalHours() {
        // TODO: write method body
        return hours + minutes / 60.0;
    }

    int getTotalMinutes() {
        // TODO: write method body
        return hours * 60 + minutes;
    }

    void subtract(TimeSpan span) {
        // TODO: write method body
        int totalCurrent = this.getTotalMinutes();
        int totalSubtract = span.getTotalMinutes();

        if (totalSubtract > totalCurrent) {
            return; // нічого не змінюємо
        }

        int newTotal = totalCurrent - totalSubtract;
        this.hours = newTotal / 60;
        this.minutes = newTotal % 60;
    }

    void scale(int factor) {
        // TODO: write method body
        if (factor <= 0) {
            return; // некоректний множник → нічого не робимо
        }

        int total = this.getTotalMinutes() * factor;
        this.hours = total / 60;
        this.minutes = total % 60;
    }
}