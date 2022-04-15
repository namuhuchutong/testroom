package me.peppermill.testroom.thread;

import java.util.ArrayList;
import java.util.List;

public class MovieSeat {
    List<Long> seatName = new ArrayList<>();

    void addMe(Long time) {
        seatName.add(time);
    }
}
