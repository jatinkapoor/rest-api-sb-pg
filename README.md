# rest-api-sb-pg
rest api using spring boot and postgres


###Usage

```
curl GET http://localhost:8080/account?email=roger.federer@email.com

```

####

###Sample Response

```json 
[
    {
        "id":1,
        "name":"roger federer",
        "address":"9823 Util Ave",
        "email_address":"roger.federer@email.com",
        "phone":"3235642345"
    },
    {   "id":2,
        "name":"roger federer",
        "address":"2343 York Street",
        "email_address":"roger.federer@email.com",
        "phone":"3235642345"
    },
    {
        "id":3,
        "name":"roger federer",
        "address":"9823 Hamline Ave",
        "email_address":"roger.federer@email.com",
        "phone":null
    }
]
```