package com.example.service;

import com.example.model.Message;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
public class DroolsService {

    private final KieContainer kieContainer;

    public DroolsService() {
        KieServices ks = KieServices.Factory.get();
        this.kieContainer = ks.getKieClasspathContainer();
    }

    public Message processMessage(Message message) {
        KieSession kSession = kieContainer.newKieSession("ksession-rule");

        kSession.insert(message);
        kSession.fireAllRules();
        kSession.dispose();

        return message;
    }
}
