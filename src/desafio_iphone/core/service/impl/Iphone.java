package desafio_iphone.core.service.impl;

import desafio_iphone.infra.interfaces.internet_browser.InternetBrowser;
import desafio_iphone.infra.interfaces.ipod.Ipod;
import desafio_iphone.infra.interfaces.phone.Phone;


public class Iphone implements Phone, Ipod, InternetBrowser {

    @Override
    public void openBrowser() {
        System.out.println("Browser is open");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Browser is closed");
    }

    @Override
    public void search(String query) {
        System.out.println("Searching...");
    }

    @Override
    public void showHistory() {
        System.out.println("Showing history...");
    }

    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Music paused");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped");
    }

    @Override
    public void selectMusic() {
        System.out.println("Music selected");
    }

    @Override
    public void nextMusic() {
        System.out.println("Next music");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume down");
    }

    @Override
    public void volumeMute() {
        System.out.println("Volume muted");
    }

    @Override
    public void volumeUnmute() {
        System.out.println("Volume unmuted");
    }

    @Override
    public void showMenu() {
        System.out.println("Showing menu...");
    }

    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void sendSMS() {
        System.out.println("Sending SMS...");
    }

    @Override
    public void showContacts() {
        System.out.println("Showing contacts...");
    }

    @Override
    public void showCallHistory() {
        System.out.println("Showing call history...");
    }

    @Override
    public void showSMSHistory() {
        System.out.println("Showing SMS history...");
    }

    @Override
    public void showEmailHistory() {
        System.out.println("Showing email history...");
    }

    @Override
    public void showSettings() {
        System.out.println("Showing settings...");
    }

    @Override
    public void showExit() {
        System.out.println("Exiting...");
    }
}
