import com.org;

def call() {
    getName("hello");
    node {
      sh '''
        git version
        docker version
      '''
    }
}
