evaluate(new File(""))

def call() {
    def tools = new GroovyScriptEngine( '.' ).with {
      loadScriptByName( '../src/PluginManager.groovy' )
    }
    new PluginManager().getName("Hello");
    node {
      sh '''
        git version
        docker version
      '''
    }
}
