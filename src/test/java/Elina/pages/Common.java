package Elina.pages;

import Elina.utils.Driver;

public class Common {
    public static void setUpDriver() {
        Driver.setDriver();
    }

    public static void openUrl(String url) {
        Driver.openUrl(url);
    }

    public static void closeDriver() {
        Driver.close();
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }}
