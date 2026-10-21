from flask import Flask
import psycopg2
app=Flask(__name__)
def dbconnect():
    return psycopg2.connect(
        dbname='fsd',
        user='postgres',
        password='vedz',
        host='localhost',
        port=5432
    )
@app.route('/insertrec')
def insertrec():
    data=[('ved',21),
          ('kunya',21),
          ('datta',20),
          ('mayur',21),
          ('vaibhya',20)]
    conn=dbconnect()
    cur=conn.cursor()
    cur.executemany("INSERT INTO student(name,age) VALUES(%s,%s);",data)
    conn.commit()
    cur.close()
    conn.close()
    return "Records Inserted Successfully!"
app.run(debug=True)
                