Chiamate per aggiungere auto nel DB (HTTP Method: POST):

1: http://localhost:8080/cars?page=0&size=1

    {
        "modelName": "BMW 116D",
        "currentPrice": 10000
    }
Puoi non aggiungere il serialNumber penserà java a farlo

2: http://localhost:8080/cars?page=0&size=2

    {
        "modelName": "Mercedes-Benz Classe A"
    }
Puoi non aggiungere il serialNumber penserà java a farlo

Chiamata per vedere tutte le auto nel DB (HTTP Method: GET):
    http://localhost:8080/cars?page=0
