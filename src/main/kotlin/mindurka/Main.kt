package mindurka

import mindustry.mod.Mod

class Main: Mod() {
    override fun init() {
        Injects.load()
    }
}