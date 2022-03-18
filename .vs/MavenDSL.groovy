job('First maven using DSL')
{
    description("First attempt to built a Maven using DSL on ${New Date()}")
scm
{
    git("https://github.com/Murugesh22/jenkins.git",master)
}
triggers
{
    scm('* * * * *')
}
steps
{
    maven('clean package', 'maven-sample/single-module/pom.xml')
}
publishers
{
    archiveArtifacts '**/*.jar'
}
}