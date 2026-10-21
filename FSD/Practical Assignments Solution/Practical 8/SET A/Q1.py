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
@app.route('/createtable')
def createtable():
    conn=dbconnect()
    cur=conn.cursor()
    cur.execute('''
        CREATE TABLE IF NOT EXISTS student(id serial primary key,name varchar(100),
        age int);
                ''')
    conn.commit()
    cur.close()
    conn.close()
    return "Table Created Successfully"
app.run(debug=True)