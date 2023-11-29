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
|-- pdaniel
|   |-- springbootcapitolechallenge
|       |-- prices
|           |-- adapters
|               |-- in.rest
|                   |-- PriceRestController   (Adapter IN)
|               |-- out.persistence
|                   |-- PriceEntity
|                   |-- PriceMapper
|                   |-- PricePersistence      (Adapter OUT)
|                   |-- SpringPriceRepository (Interface) 
|           |-- application
|               |-- ports
|                   |-- in.
|                       |-- LoadPriceCommand 
|                       |-- LoadPricePort     (Interface)
|                   |-- out
|                       |-- DataResponse
|                    	|-- DataResponsePort  (Interface)
|               | -- service
|                   |--PriceService           (implements PriceRestPort)
|           |-- domain
|               |-- dto
|                   |--PriceDTO               (Entity Of Domain)
|               |-- exceptions
|                   |--DateException
|                   |--PriceRepositoryException
|                   |--InvalidDataAccessResourceUsageException
|               |-- utils
|                   |--ConstantsUtils
|                   |--LocalDateFormatter
```