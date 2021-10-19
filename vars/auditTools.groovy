evaluate(new File(""))

def call() {
File sourceFile = new File("../src/PluginManager.groovy");
Class groovyClass = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile);
PluginManager myCoolObject = (PluginManager) groovyClass.newInstance();
println(myCoolObject.getName("Hello"));
    node {
      sh '''
        git version
        docker version
      '''
    }
}
