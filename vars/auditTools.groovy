evaluate(new File("../src.PluginManager.groovy"))

def call() {
    new PluginManager().getName("hello");
    node {
      sh '''
        git version
        docker version
      '''
    }
}
