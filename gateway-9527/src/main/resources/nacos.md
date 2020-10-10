#nacos配置
Data ID:
    
    gateway-9527-public.yaml

Group:

    DEFAULT_GROUP

配置内容:

    [{
        "id": "template-consumer",
        "order": 0,
        "predicates": [{
            "args": {
                "pattern": "/consumer/**"
            },
            "name": "Path"
        }],  
        "filters":[{
            "name": "StripPrefix",
            "args": {
                "_genkey_0": "1"
            }
        }],
        "uri": "lb://template-consumer"
    },{
        "id": "template-provider",
        "order": 2,
        "predicates": [{
            "args": {
                "pattern": "/provider/**"
            },
            "name": "Path"
        }],
        "filters":[{
            "name": "StripPrefix",
            "args": {
                "_genkey_0": "1"
            }
        }],
        "uri": "lb://template-provider"
    }]