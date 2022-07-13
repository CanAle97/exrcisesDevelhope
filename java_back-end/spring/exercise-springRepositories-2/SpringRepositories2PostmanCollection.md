Chiamate per aggiungere linguaggi di programmazione nel DB (HTTP Method: POST):

1: http://localhost:5050/repo-prog-languages?page=0&size=1

    {
        "firstAppearance": "1995-05-23",
        "name": "Java",
        "inventor": "James Gosling"
    }

2: http://localhost:5050/repo-prog-languages?page=0&size=2

    {
        "firstAppearance": "1983-02-12",
        "name": "C++",
        "inventor": "Bjarne Stroustrup"
    }

3: http://localhost:5050/repo-prog-languages?page=1&size=3

    {
        "firstAppearance": "1995-06-25",
        "name": "JavaScript",
        "inventor": "Brendan Eich"
    }

4: http://localhost:5050/repo-prog-languages?page=1&size=4

    {
        "firstAppearance": "2009-03-06",
        "name": "Go",
        "inventor": "Google"
    }

Chiamate per vedere tutte le auto nel DB, con un'impaginazione di 2 risultati per pagina (HTTP Method: GET):

5: http://localhost:5050/repo-prog-languages?page=0&size=2

6: http://localhost:5050/repo-prog-languages?page=1&size=2

Chiamata per modificare il campo "inventor" di un linguaggio di programmazione già presente (HTTP Method: PATCH):

7: http://localhost:5050/repo-prog-languages/1

    {
        "inventor": "Alessandro Canulli"
    }