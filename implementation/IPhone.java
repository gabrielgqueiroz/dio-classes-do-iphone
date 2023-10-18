package implementation;

import interfaces.base.browser.InternetBrowser;
import interfaces.base.music.MusicDevice;
import interfaces.base.phone.PhoneDevice;

public class IPhone implements PhoneDevice, InternetBrowser, MusicDevice{

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Call method 'play'");
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        System.out.println("Call method 'pause'");
    }

    @Override
    public void selectMusic(String music) {
        // TODO Auto-generated method stub
        System.out.println("Call method 'selectMusic'");
    }

    @Override
    public void showPage() {
        // TODO Auto-generated method stub
        System.out.println("Call method 'showPage'");
    }

    @Override
    public void addNewTab() {
        // TODO Auto-generated method stub
        System.out.println("Call method 'addNewTab'");
    }

    @Override
    public void refreshPage() {
        // TODO Auto-generated method stub
        System.out.println("Call method 'refreshPage'");
    }

    @Override
    public void call(int number) {
        // TODO Auto-generated method stub
        System.out.println("Call method 'call'");
    }

    @Override
    public void answer(int number) {
        // TODO Auto-generated method stub
        System.out.println("Call method 'answer'");
    }

    @Override
    public void startVoiceMail() {
        // TODO Auto-generated method stub
        System.out.println("Call method 'startVoiceMail'");
    }
    
}
