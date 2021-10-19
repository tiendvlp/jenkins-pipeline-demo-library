import com.tiendvlp.groovylib.PluginManager;

def call() {
  println(new PluginManager().getName("Hello"));
    node {
      sh '''
        git version
        docker version
      '''
    }
}
