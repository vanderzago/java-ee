# java-ee

## Baixar Requsitos

- Linux brew e JBoss Forge
```
sudo apt-get update
sudo apt-get install linuxbrew-wrapper
brew install jboss-forge
echo 'export PATH="/home/linuxbrew/.linuxbrew/bin:$PATH"' >> ~/.bash_profile
echo 'export MANPATH="/home/linuxbrew/.linuxbrew/share/man:$MANPATH"' >> ~/.bash_profile
echo 'export INFOPATH="/home/linuxbrew/.linuxbrew/share/info:$INFOPATH"' >> ~/.bash_profile
PATH="/home/linuxbrew/.linuxbrew/bin:$PATH"
```
- Forge

    - Criar projeto:

[vanderz]$ project-new -named jee-project
***INFO*** Required inputs not satisfied, entering interactive mode
* Project name:  jee
? Top level package [org.jee]:  br.com.jee
? Version [1.0.0-SNAPSHOT]:
? Final name:
? Project location [/home/vanderz]:  /mnt/c/opscode/git/personal/java-ee
? Use Target Location Root? (If specified, it won't create a subdirectory inside the specified Project location) [y/N]:

[0] (x) war
[1] ( ) jar
[2] ( ) parent
[3] ( ) forge-addon
[4] ( ) resource-jar
[5] ( ) ear
[6] ( ) from-archetype
[7] ( ) generic

Press <ENTER> to confirm, or <CTRL>+C to cancel.
* Project type: [0-7]

[0] (x) Maven

Press <ENTER> to confirm, or <CTRL>+C to cancel.
* Build system: [0]

[0] ( ) JAVA_EE_7
[1] ( ) JAVA_EE_6
[2] ( ) NONE

Press <ENTER> to confirm, or <CTRL>+C to cancel.
? Stack (The technology stack to be used in this project): [0-2]
***SUCCESS*** Project named 'jee' has been created.

[jee]$ faces-setup --facesVersion 2.2
***SUCCESS*** JavaServer Faces has been installed.
[jee]$ cdi-setup --cdiVersion 1.1
***SUCCESS*** CDI has been installed.

- Abrir Eclipse
    - Importar projeto como Maven Project
    - Configurar o jboss como server
        - Aba Server > Red Hat JBoss Middleware
        - Selecionar O Wildfly
        - Prosseguir com instalação, reiniciar o Eclipse
        - Aba Server > Wildfly 10.x > Escolher o local do diretorio do WildFly
    - Configurar o projeto para usar o server
        - Botão direito no projeto > Build Path > Configure Build Path
        - Aba Library > Add Library > Server Runtime > Wildfly 10.x
    - Na aba server, clicar em Wildfly e subir a instancia
    - Abra o navegador http://localhost:8080