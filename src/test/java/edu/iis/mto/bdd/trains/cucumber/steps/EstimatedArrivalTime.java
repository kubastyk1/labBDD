package edu.iis.mto.bdd.trains.cucumber.steps;

import java.time.LocalTime;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;

public class EstimatedArrivalTime {

	@Zakładając("^chcę się dostać z \"(.*)\" do \"(.*)\"")
    public void setupFromAndWhere(String departure, String destination) {
        throw new PendingException();
    }

    @I("^nastepny pociąg na linii \"(.*)\" odjeżdża o (.*)$")
    public void setupLineAndTime(String line,
                                 @Transform(JodaLocalTimeConverter.class) LocalTime startTime){
        throw new PendingException();
    }

    @Gdy("^zapytam o godzinę przyjazdu")
    public void askForArrivalTime() {
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu o (.*)$")
    public void shouldBeInformedAbout(@Transform(JodaLocalTimeConverter.class) LocalTime expectedTime) {
        throw new PendingException();
    }
}
