package core;

import agents.RandomAgent;
import environments.base.OneDimenEnviro;

public class DesktopLauncher {

	public static void main(String[] args) {
		OneDimenEnviro o = new OneDimenEnviro();
		o.setAgent(new RandomAgent());
		o.run(true);
	}

}
