package br.com.claudiocarige.desafio_iphone.infra.interfaces.phone;

import br.com.claudiocarige.desafio_iphone.infra.config.IphoneConfig;


public interface Phone extends IphoneConfig {

        void call();
        void sendSMS();
        void showContacts();
        void showCallHistory();
        void showSMSHistory();
        void showEmailHistory();
}
