import org.tiendvlp.PluginManager;

def call() {
    node {
      sh '''
        git version
        docker version
      '''
    }
}
