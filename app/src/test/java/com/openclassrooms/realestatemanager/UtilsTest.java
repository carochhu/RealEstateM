package com.openclassrooms.realestatemanager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilsTest {
    @Test
    public void convertEuroToDollarsWithSuccess(){
        int priceInEuro = 1000;
        assertEquals(979,Utils.convertEuroToDollars(priceInEuro));
    }

    @Test
    public void convertDollarsToEuroWithSuccess(){
        int priceInDollars = 1000;
        assertEquals(812,Utils.convertDollarToEuro(priceInDollars));
    }

    @Test
    public void getTodayDateOkFormatTest() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String actualDate = Utils.getTodayDateOKFormat();
        assertEquals(dateFormat.format(new Date()), actualDate);
    }


}
