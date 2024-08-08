package data.airport.model.totem;

import data.airport.listener.FlightDataObserver;

public interface ITotem extends FlightDataObserver {

    void showFlights();
}
