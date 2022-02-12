package com.fbjm.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.fbjm.game.BlocksGameDesktop;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration confi = new LwjglApplicationConfiguration();
		confi.title = "BLocks Game";
		confi.useGL30 = false;
		confi.width = 400;
		confi.height = 500;
		confi.resizable= false;

		new LwjglApplication(new BlocksGameDesktop(),confi);
	}
}
