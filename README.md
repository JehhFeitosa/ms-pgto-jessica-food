# ms-pgto-jessica-food
Microservice Responsible for Payment Service


![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)


## Features 💻

- [x] GET (List of Payments)
   <details><summary>Curl</summary>
        <p>
  
       curl --location --request GET 'http://localhost:8080/pagamentos'
<br>

- [x] POST (Include Payment)
   <details><summary>Curl</summary>
        <p>
  
       curl --location --request POST 'http://localhost:8080/pagamentos' \
       --header 'Content-Type: application/json' \
       --data-raw '{
       "valor": 100,
       "nome": "Amora",
       "numero": "12345678",
       "expiracao": "10/29",
       "codigo": "113",
       "status": "CRIADO",
       "pedidoId": 1,
       "formaDePagamentoId": 1
       }'
<br>

- [x] DELETE (Deleted Payments)
   <details><summary>Curl</summary>
        <p>
  
       curl --location --request DELETE 'http://localhost:8080/pagamentos/1'
<br>

- [x] PUT (Deleted Payments)
   <details><summary>Curl</summary>
        <p>
  
       curl --location --request PUT 'http://localhost:8080/pagamentos/3' \
       --header 'Content-Type: application/json' \
       --data-raw '{
       "valor": 100,
       "nome": "Mel",
       "numero": "12145678",
       "expiracao": "09/29",
       "codigo": "133",
       "status": "CRIADO",
       "pedidoId": 1,
       "formaDePagamentoId": 1
       }'
<br>





<a href="https://github.com/JehhFeitosa">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/58116519?s=400&u=8b96c6759c724308b3cfb9e6a2480fad3f5107c2&v=4" width="100px;" alt=""/>
 <br />
 <sub><b>Jéssica Feitosa</b></sub></a> <a href="https://www.linkedin.com/in/j%C3%A9ssicafeitosa/" title="Rocketseat">🚀</a>
<br><br>

Made in Jessica Feitosa 👋🏽 Get in touch!

[![Linkedin Badge](https://img.shields.io/badge/-Jessica-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/jéssicafeitosa/)](https://www.linkedin.com/in/jéssicafeitosa/)
---

