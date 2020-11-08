# ecommerce-spring-cloud-app
Pour tester le ws add costomer 

curl -X POST -H 'Content-Type: application/json' -i 'http://127.0.0.1:7777/CUSTOMER-SERVICE/add' --data '{
  "customerId": "simpleId3",
  "name": "test3",
  "email": "email3@email.com"
}'


Pour lister les costomers

curl -X GET -H 'Content-Type: application/json' -i 'http://127.0.0.1:7777/CUSTOMER-SERVICE/all' --data '{
  "customerId": "simpleId3",
  "name": "test3",
  "email": "email3@email.com"
}'
