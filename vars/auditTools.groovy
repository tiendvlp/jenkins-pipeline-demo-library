import com.org.Test;

def call() {
    getName("hello");
    node {
      sh '''
        git version
        docker version
      '''
    }
}
