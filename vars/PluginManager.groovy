
PluginManager call() {
    return new PluginManagerClazz();
}

class PluginManagerClazz implements Serializable {
    public String getName (String name) {
        return name;
    }
}
