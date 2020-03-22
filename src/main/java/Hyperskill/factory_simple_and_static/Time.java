/*
noon() returns an instance initialized with 12 hours, 0 minutes, and 0 seconds.

midnight() returns an instance initialized with 0 hours, 0 minutes, and 0 seconds.

of(int hour, int minute, int second) returns an instance initialized with passed hour, minute and second
 if the passed arguments are correct (hour: 0-23, minute: 0-59, seconds: 0-59), otherwise, null.

ofSeconds(long seconds) returns an instance initialized with seconds passed since midnight; as an example,
 the invocation Time.ofSeconds(500000) must create an instance with 18 hours, 53 minutes and 20 seconds (days are skipped);
*/
package Hyperskill.factory_simple_and_static;

class Time {

    int hour;
    int minute;
    int second;

    public static Time noon() {
        // write your code here
        Time time = new Time();
        time.hour = 12;
        time.minute = 0;
        time.second = 0;
        return time;
    }

    public static Time midnight() {
        Time time = new Time();
        time.hour = 0;
        time.minute = 0;
        time.second = 0;
        return time;
    }

    public static Time ofSeconds(long seconds) {
        Time time = new Time();
        int doWeHaveDays = (int) seconds / 3600;
        if (doWeHaveDays > 23) {
            time.hour = doWeHaveDays % 24;
        } else {
            time.hour = doWeHaveDays;
        }
        time.minute = (int) ((seconds % 3600) / 60);
        time.second = (int) seconds % 60 ;
        return time;
    }

    public static Time of(int hour, int minute, int second) {
        Time time = new Time();

        if (hour > 23 || hour < 0 || minute > 59 || minute < 0 || second > 59 || second < 0) {
            return null;
        } else {
            time.hour = hour;
            time.minute = minute;
            time.second = second;
            return time;
        }
    }
}
