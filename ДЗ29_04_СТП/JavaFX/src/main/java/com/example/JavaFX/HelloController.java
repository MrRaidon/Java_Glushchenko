package com.example.JavaFX;

import com.example.JavaFX.schemas.Booking;
import com.example.JavaFX.utils.BookRequests;
import com.mashape.unirest.http.exceptions.UnirestException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.ListView;

import java.util.List;

public class HelloController {
    @FXML
    private ListView<Booking> bookingListView;

    @FXML
    protected void initialize() throws  UnirestException {
        List<Booking> bookings = BookRequests.executeGet();
        bookingListView.setItems(FXCollections.observableArrayList(bookings));
    }


    @FXML
    protected void AddButtonClick() {
    }
}