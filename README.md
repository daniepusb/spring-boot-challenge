# springboot-capitole-challenge
Java Springboot API challenge


| Developer      |    Date    | Version |
|:---------------|:----------:| ------: |
| Daniel Pedroza | 27/11/2023 | 1.0     |

# Instructions

```bash
$ mvn clean install
$ mvn spring-boot:run
```


Use this URL Example:
```bash
http://localhost:8080/api/prices/35455/1?applicationDate=2023-12-01T12:00:00
```

# Hexagonal Structure
```bash
com
com
|-- pdaniel
|   |-- springbootcapitolechallenge
|       |-- prices
|           |-- application
|               |-- ports
|                   |-- in.
|                       |-- PriceRestPort.java (interface)
|                       |-- PriceRestCommand.java (constructor)
|                   |-- out
|                       |-- DataResponsePort.java	(interface)
|                    	|-- DataResponse.java		(constructor of response element)
|               | -- service
|                   |--SearchPriceService.java		(implements PriceRestPort)
|           |-- domain
|               |-- model
|                   |--Price.java                       (Entity Of Domain)
|               |-- exceptions
|                   |--DateException.java
|                   |--PriceRepositoryException.java
|                   |--InvalidDataAccessResourceUsageException.java
|           |-- adapters
|               |-- in.rest
|                   |-- PriceRestController.java	(Adapter IN)
|               |-- out.persistence
|                   |-- PriceRepository.java		(Adapter OUT)
```