package com.example.main;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.example.model.Message;

public class DroolTest {

    public static final void main(String[] args) {
        try {
            System.out.println("Performing Drool Test: ");
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("ksession-rule");

            // Create an example message
            Message message = new Message("Hello", "NEW");

            // Insert message into the session and fire the rules
            kSession.insert(message);
            kSession.fireAllRules();

            // Output the processed message
            System.out.println("Message status: " + message.getStatus());
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}