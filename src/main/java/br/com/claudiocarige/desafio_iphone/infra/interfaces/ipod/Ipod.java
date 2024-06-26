package br.com.claudiocarige.desafio_iphone.infra.interfaces.ipod;

import br.com.claudiocarige.desafio_iphone.infra.config.IphoneConfig;


public interface Ipod extends IphoneConfig {

    void play();
    void pause();
    void stop();
    void selectMusic();
    void nextMusic();
    void volumeUp();
    void volumeDown();
    void volumeMute();
    void volumeUnmute();
    void showMenu();

}
