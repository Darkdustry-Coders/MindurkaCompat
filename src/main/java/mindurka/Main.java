package mindurka;

import mindustry.mod.Plugin;

public class Main extends Plugin {
    @Override
    public void init() {
        Injects.load();
    }
}
