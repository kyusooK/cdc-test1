package contracts.rest

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'PUT'
        url ('/inventories/1/decreasestock')
        headers {
            contentType(applicationJsonUtf8())
        }
        body(
                id: 1,
                qty: 5,
        )
    }
    response {
        status 200
        body(
                id: 1,
                stock: 5,
        )
        bodyMatchers {
            jsonPath('$.id', byRegex(nonEmpty()).asLong())
            jsonPath('$.stock', byRegex(nonEmpty()).asInteger())
        }
        headers {
            contentType(applicationJsonUtf8())
        }
    }
}

