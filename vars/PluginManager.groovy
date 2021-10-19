
PluginManager call() {
    return new PluginManagerClazz();
}

private class PluginManagerClazz implements Serializable {
    public String getName (String name) {
        return name;
    }
}
