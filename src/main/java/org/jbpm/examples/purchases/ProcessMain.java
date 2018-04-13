package org.jbpm.examples.purchases;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class ProcessMain {
	public static void main(String[] args) {
		try {
			// Load the knowledge base:
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer =
			ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession();
			// Go!
			
			kSession.fireAllRules();
			}
			catch (Throwable t) {
			t.printStackTrace();
			}
		
	}

}
