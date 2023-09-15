package org.arthycode.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class NashApp {

    private ScriptEngineManager m;
    private ScriptEngine e;
    public NashApp() {
        m = new ScriptEngineManager();
        e = m.getEngineByName("nashorn");
    }

    public void llamarFunciones() throws Exception {
        e.eval(new FileReader("src/main/java/archivo.js"));
    }
    public void implementarInterfaz() throws Exception {

    }

    public static void main(String[] args) throws Exception {
        NashApp app = new NashApp();
        app.llamarFunciones();
    }
}
