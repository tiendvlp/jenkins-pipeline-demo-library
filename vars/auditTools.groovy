import org.tiendvlp.PluginManager;

def call() {
  def manager = new PluginManager();
  println(manager.getName("Tiendangne"))
    node {
      sh '''
        git version
        docker version
      '''
    }
}
