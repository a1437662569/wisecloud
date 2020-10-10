#yaml
     - id: admin-service
       uri: lb://admin-service
       predicates:
       - Path=/admin/**
       - Weight=service1, 90
       filters:
       - SwaggerHeaderFilter
       - StripPrefix=1
     - id: order-service
       uri: lb://order-service
       predicates:
       - Path=/order-s/**
       filters:
       - SwaggerHeaderFilter
       - StripPrefix=1
     - id: test-service
       uri: lb://test
       predicates:
       - Path=/demo/**
       filters:
       - SwaggerHeaderFilter
       - StripPrefix=1 
       
#JSON

    [{
            "route_id": "admin-service",
            "route_definition": {
                "id": "admin-service",
                "predicates": [{
                        "name": "Path",
                        "args": {
                            "_genkey_0": "/admin/**"
                        }
                    },
                    {
                        "name": "Weight",
                        "args": {
                            "_genkey_0": "service1",
                            "_genkey_1": "90"
                        }
                    }
                ],
                "filters": [{
                        "name": "SwaggerHeaderFilter",
                        "args": {}
                    },
                    {
                        "name": "StripPrefix",
                        "args": {
                            "_genkey_0": "1"
                        }
                    }
                ],
                "uri": "lb://admin-service",
                "order": 0
            },
            "order": 0
        },
        {
            "route_id": "order-service",
            "route_definition": {
                "id": "order-service",
                "predicates": [{
                    "name": "Path",
                    "args": {
                        "_genkey_0": "/order-s/**"
                    }
                }],
                "filters": [{
                        "name": "SwaggerHeaderFilter",
                        "args": {}
                    },
                    {
                        "name": "StripPrefix",
                        "args": {
                            "_genkey_0": "1"
                        }
                    }
                ],
                "uri": "lb://order-service",
                "order": 0
            },
            "order": 0
        },
        {
            "route_id": "test-service",
            "route_definition": {
                "id": "test-service",
                "predicates": [{
                    "name": "Path",
                    "args": {
                        "_genkey_0": "/demo/**"
                    }
                }],
                "filters": [{
                        "name": "SwaggerHeaderFilter",
                        "args": {}
                    },
                    {
                        "name": "StripPrefix",
                        "args": {
                            "_genkey_0": "1"
                        }
                    }
                ],
                "uri": "lb://test",
                "order": 0
            },
            "order": 0
        }
    ]
