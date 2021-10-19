import com.org.PluginManager;

def call() {
println(new PluginManager().getName("Hello"));
    node {
      sh '''
        git version
        docker version
      '''
    }
}
