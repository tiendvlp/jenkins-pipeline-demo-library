import com.tiendvlp.groovylib.PluginManager;

def call() {
  def script = loadScript('com/tiendvlp/groovylib/PluginManager.groovy');
  println(new PluginManager().getName("Hello"));
    node {
      sh '''
        git version
        docker version
      '''
    }
}
