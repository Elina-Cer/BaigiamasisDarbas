package Elina.pages.livin;

import Elina.pages.Common;

public class LoginPage {
    public static void setup() {
        Common.setUp();

    }

    public static void open(String url) {
        Common.openUrl(url);

    }

    public static void close() {
        Common.close();
    }
}
