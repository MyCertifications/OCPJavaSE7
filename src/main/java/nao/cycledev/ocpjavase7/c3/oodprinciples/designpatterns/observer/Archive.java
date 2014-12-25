package nao.cycledev.ocpjavase7.c3.oodprinciples.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Archive implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Archive::update");
    }

}
