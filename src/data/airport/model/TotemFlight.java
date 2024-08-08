package data.airport.model;

import data.airport.listener.FlightDataObserver;

import java.util.List;

public interface TotemFlight extends FlightDataObserver {

    List<FlightData> getFlightTimes();
}
