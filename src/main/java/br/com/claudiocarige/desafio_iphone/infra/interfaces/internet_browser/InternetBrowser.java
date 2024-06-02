package br.com.claudiocarige.desafio_iphone.infra.interfaces.internet_browser;

import br.com.claudiocarige.desafio_iphone.infra.config.IphoneConfig;


public interface InternetBrowser extends IphoneConfig {

        void openBrowser();
        void closeBrowser();
        void search(String query);
        void showHistory();
}
