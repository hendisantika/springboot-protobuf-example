# springboot-protobuf-example
# Things to do:
1. Clone the repository: `git clone https://github.com/hendisantika/springboot-protobuf-example.git`
2. Go to the folder: `cd springboot-protobuf-example`

# Usage

./gradlew clean bootRun

curl http://localhost:8080/person/json
curl http://localhost:8080/person/protoBuf

JSON response
```
{
    "emailAddress": "uzumaki_naruto@konohagakure.co.jp",
    "firstName": "Uzumaki",
    "homeAddress": "123 Konohagakure",
    "lastName": "Naruto",
    "phoneNumbers": [
        {
            "areaCode": 123,
            "phoneNumber": 1234567
        }
    ]
}
```