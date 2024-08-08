package data.airport.model.totem;

import data.airport.model.FlightData;
import data.airport.states.State;

import java.util.LinkedList;
import java.util.List;

import clientcode.TotemView;

public class Totem implements ITotem {

    private List<FlightData> flightDataList;
    private String title;
    private List<State> states;
    private TotemView view;

    public Totem(String title, List<State> states) {
        
        this.title = title;
        this.flightDataList = new LinkedList<>();
        this.states = states;

        view = new TotemView(title);
    }

    @Override
    public void update(FlightData flight) {
        
        view.clearPanel();
 
        if(states.contains(flight.getState())){
            flightDataList.add(flight);
        }

        for (var fd : flightDataList) {
            if(!states.contains(fd.getState()))
                flightDataList.remove(fd);
        }

        showFlights();

    }

    @Override
    public void showFlights() {
        
        List<String> flightsStr = flightDataList.stream()
                .map(fd -> fd.toString())
                .toList();

        view.addFlights(flightsStr);
    }

    public String getTitle() {
        return title;
    }

}
