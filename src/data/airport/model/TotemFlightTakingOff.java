package data.airport.model;

import data.airport.states.Arriving;
import data.airport.states.TakingOff;

import java.util.LinkedList;
import java.util.List;

public class TotemFlightTakingOff implements TotemFlight {

    private List<FlightData> flightDataList;

    public TotemFlightTakingOff() {
        this.flightDataList = new LinkedList<>();
    }

    @Override
    public void update(FlightData flight) {
        boolean flag = false;

        for (FlightData fd : flightDataList) {
            if (fd.getFlightNumber().equals(flight.getFlightNumber())) {
                flightDataList.remove(fd);
                flag = true;
            }
        }

        if (!flag && flight.getState() instanceof TakingOff) {
            flightDataList.add(flight);
        }
    }

    @Override
    public List<FlightData> getFlightTimes() {
        return flightDataList;
    }
}
