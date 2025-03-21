package Map.EnumMap;

import java.util.EnumMap;

public class MyEnumMap {
    public static void main(String[] args) {
        // array of size same as enum
        // [ "Bieceps" _ _ _ _ "Cheat-Day" _ ]
        // ordinal/index is used
        // faster than hashMap
        // Memory efficient
        EnumMap<Day, String> weekPlan = new EnumMap<>(Day.class);
        weekPlan.put(Day.MONDAY, "Bieceps");
        weekPlan.put(Day.SATURDAY, "Cheat-Day");
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY
}
