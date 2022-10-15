?username=     --- querry parameters

mvn exec:java -Dexec.mainClass="App"   // exec 2_2

Running ./mvnw spring-boot:run and access your browser at http://localhost:8080/ 

Podemos alterar a porta da seguinta maneira:
        - no path src/main/resources/application.properties escrevemos server.port=XXXX sendo XXXX a porta desejada

https://movie-quote-api.herokuapp.com/v1/shows/   -- exemplo de API




Respostas:
A- O servlet container é a parte do server Web que pode ser corrido num processo separado. Este é responsável por: life cycle management, multithreaded support, object pooling e security.

B - Spring Boot usa o MVC fazendo com que a aplicação seja dividida em 4 componentes:
        Model: O modelo contém a informação da aplicação. Pode ser um objeto ou uma coleção de objetos.
        Controller: Um controlador contém a lógica comercial de uma aplicação.
        View: componente que permite que o utilizador veja o seu request processado. 
        Front Controller: No Spring Web MVC, a classe DispatcherServlet funciona como front controller. É responsável por gerir o fluxo da aplicação.

C - Fornece todas as dependências default de maneira a podermos correr a aplicação sem adicionar nenhuma outra dependência.

D - @EnableAutoConfiguration, @ComponentScan e @Configuration.

E - 1 - REST API deve aceitar e responder com JSON 
        É comum uma API aceitar JSON requests e que responda de volta com JSON uma vez que este é um formato muito utilizado para data transfer.
    2 - Usar nomes em vez de verbos nos endpoint paths
        Usar verbos no fim do path não é útil e faz com que o path fique desnecessariamente mais longo. Devemos usar nomes em vez dos verbos que representa a entidade que o endpoint que estamos a manipular como pathname.
    3 - Boas práticas de segurança
        Todas as comunicaçoes entre o cliente e o servidor devem ser privadas. Sendo assim, usar SSL/TLS para segurança é praticamente obrigatório.
    4 - Manter a data em cache
        Podemos adicionar cache para devolver dados da cache de memória local em vez de consultar a base de dados para obter os dados sempre que quisermos recuperar alguns dados que os utilizadores solicitem.
    5 - Permitir filtragens
        As bases de dados por detrás de uma API REST podem ficar muito grandes. Por vezes, há tantos dados que não devem ser devolvidos todos de uma só vez, porque são demasiado lentos ou vão fazer cair os nossos sistemas. Por conseguinte, precisamos de formas de filtrar os itens.


Falta acabar o ex4, o tempo estava a acabar e estava a ter um pouco dificuldades em fazer a API.