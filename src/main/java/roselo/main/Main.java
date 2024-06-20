import roselo.framework.Start;
import roselo.model.AccionDos;
import roselo.model.AccionUno;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var start = new Start("/config.json");
        start.init();
    }
}
