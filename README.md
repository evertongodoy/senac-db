# senac-db
Projeto modelo para apresentação de aplicação RESTFUL conectando com banco de dados relacional MySQL e não relacional MongoDB


### Insercao de massa de dados local para MonmgoDB

1. Conecte-se ao MongoDB shell:
 - mongo

2. Selecione o banco de dados (ou crie um novo):
 - use library

3. Crie a colecao e insira os documentos:
 - db.book.insertMany([
{ id: "1", title: "Book One", isbn: "123-4567890123", published_at: new Date("2022-01-01"), price: 29.99 },
{ id: "2", title: "Book Two", isbn: "123-4567890124", published_at: new Date("2022-02-01"), price: 19.99 },
{ id: "3", title: "Book Three", isbn: "123-4567890125", published_at: new Date("2022-03-01"), price: 39.99 },
{ id: "4", title: "Book Four", isbn: "123-4567890126", published_at: new Date("2022-04-01"), price: 25.99 },
{ id: "5", title: "Book Five", isbn: "123-4567890127", published_at: new Date("2022-05-01"), price: 15.99 },
{ id: "6", title: "Book Six", isbn: "123-4567890128", published_at: new Date("2022-06-01"), price: 45.99 },
{ id: "7", title: "Book Seven", isbn: "123-4567890129", published_at: new Date("2022-07-01"), price: 22.99 },
{ id: "8", title: "Book Eight", isbn: "123-4567890130", published_at: new Date("2022-08-01"), price: 17.99 },
{ id: "9", title: "Book Nine", isbn: "123-4567890131", published_at: new Date("2022-09-01"), price: 32.99 },
{ id: "10", title: "Book Ten", isbn: "123-4567890132", published_at: new Date("2022-10-01"), price: 27.99 },
{ id: "11", title: "Book Eleven", isbn: "123-4567890133", published_at: new Date("2022-11-01"), price: 37.99 },
{ id: "12", title: "Book Twelve", isbn: "123-4567890134", published_at: new Date("2022-12-01"), price: 47.99 },
{ id: "13", title: "Book Thirteen", isbn: "123-4567890135", published_at: new Date("2023-01-01"), price: 29.49 },
{ id: "14", title: "Book Fourteen", isbn: "123-4567890136", published_at: new Date("2023-02-01"), price: 19.49 },
{ id: "15", title: "Book Fifteen", isbn: "123-4567890137", published_at: new Date("2023-03-01"), price: 39.49 },
{ id: "16", title: "Book Sixteen", isbn: "123-4567890138", published_at: new Date("2023-04-01"), price: 25.49 },
{ id: "17", title: "Book Seventeen", isbn: "123-4567890139", published_at: new Date("2023-05-01"), price: 15.49 },
{ id: "18", title: "Book Eighteen", isbn: "123-4567890140", published_at: new Date("2023-06-01"), price: 45.49 },
{ id: "19", title: "Book Nineteen", isbn: "123-4567890141", published_at: new Date("2023-07-01"), price: 22.49 },
{ id: "20", title: "Book Twenty", isbn: "123-4567890142", published_at: new Date("2023-08-01"), price: 17.49 }
])




### Links de consulta utilizados no desenvolvimento

#### Configuracao de Flyway
https://www.gasparbarancelli.com/post/flyway-e-spring-boot-como-gerenciar-a-evolucao-do-banco-de-dados-de-forma-automatizada-e-integrada

#### Inserts em massa para MySQL
https://www.mockaroo.com/

#### Inserts em massa para MongoDB
https://chatgpt.com/c/dfacbc72-4981-4141-aede-75018c1151bc

#### Dependencia Flyway com Dialect 8 MySQL
https://stackoverflow.com/questions/72711770/flyway-unsupported-database-mysql-8-0

#### Configuracao MongoDB no applcation.yml
https://medium.com/@bectorhimanshu/configuring-spring-boot-application-to-connect-with-mongodb-via-application-yml-7d131e0c436b

#### Nome da tabela no campo @Table(name = Article.TABLE_NAME)
https://www.baeldung.com/jpa-entity-table-names

#### Resolvendo problema do collation com a Collection no MongoDB
https://stackoverflow.com/questions/59532821/springboot-with-mongodb-error-while-using-find-query


