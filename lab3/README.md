Respostas 3.1 b)

1 - O UserRepository é inicializado na classe UserController através do @Autowired fazendo com seja "criada" uma instacia do userRepository.

2 - Os métodos usados pelo userRepository são: save(), findAll(), findById() e delete(). Estes métodos são definidos no CrudRepository a qual o UserRepository faz extend.

3 - As informaçoes estão a ser guardadas na h2database, que adicionamos quando criamos o projeto no Spring initializr (dependência).

4 - A regra de "not empty" é definida na classe User com a anotação @NotBlank quando criamos o atributo e-mail.


Respostas gerais:

A) As componentes Controller e RestController diferem principalmente na forma como crostroem a resposta. No @Controller temos de definir a view mas no @RestController apenas retorna a informação num formato JSON/XML sem termos de adicionar um @RequestBody a cada handler.

C) @Tabel - Esta anotação serve para informar qual é a tabela primária para aquela entidade. Além disso, permite especificar detalhes tais como colunas, que vão ser usados na base de dados para esta entidade.

@Column - Serve para especificar que coluna da tabela em questão("employees") se está a aceder. Ao fazer por exemplo @Column(name = "email_address", nullable = false) está se a especificar que estamos a aceder à coluna "email_address" da tabela "employees".

@Id - Como cada entidade da base de dados tem uma chave primária, esta anotação serve para especificar um campo como chave primária de um objeto.

D) Nesta situação usamos o @Autowired para evitar fazer métodos setter no employeeRepository.