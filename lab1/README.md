# IES_104247
sudo apt install maven   ---- comando usado para instalar maven
Maven archtype é um conjunto de ferramentas que permite criar um template de um projeto em Maven. Existem vários tipos de archtype!!!

mvn dependency:tree  -- ver dependencias das dependencias

$ mvn package       ---- get dependencies, compiles the project and creates the jar
$ mvn exec:java-Dexec.mainClass="weather.WeatherStarter"   -------adapt to matchyour own package and class name 

docker run -dp 3000:3000 getting-started      ---run application


docker compose up 

Respostas:
A) As fases principais do default lifecycle do Maven são: compile, package, install e deploy. O compile como o nome indica, compila o código fonte do projeto; o package usa o código compilado e torna-o num formato mais distribuído; o install instala o package resultante da fase anterior num repositório local; o deploy copia o package final e colocaõ num repositório remoto para outros terem acesso ao mesmo.

B)Não é muito aconselhável usar o maven para correr o projeto mas através do maven install é possível ver se o código faz o que é suposto fazer.

C)git clone <chave ssd ou https>
  alteraões...
  git add *
  git commit -m <"nome para o commit">
  git push

D)A primeira dica para fazer melhores mensagens no commit é fazer dois "-m" sendo o primeiro considerado um título e o segundo a mensagem facilitando o resto da equipa a perceber o que poderá ser aquele commit; escrever que tipo de commit é aquele(Bugfix, update, ...); tentar ser direto com informações concretas e que não sejam mensagens muito longas.

E)Através dos volumes é possível manter os dados nos containers mesmo que estes parem.
