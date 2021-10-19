import com.org.PluginManager;

def call() {
    new PluginManager().getName("hello");
    node {
      sh '''
        git version
        docker version
      '''
    }
}
