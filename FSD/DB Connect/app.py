from flask import Flask
import psycopg2
app=Flask(__name__)
@app.route ('/')
def home():
    return "This is Home Page"
@app.route('/dbconnect')
def dbconnect():
    return psycopg2.connect(
        dbname='library',
        user='postgres',
        password='root',
        host='localhost',
        port='5432'
            )
@app.route('/createtable')
def createtable():
    conn=dbconnect()
    cur=conn.cursor()
    cur.execute('''CREATE TABLE IF NOT EXISTS books(
        id SERIAL PRIMARY KEY,
        bname VARCHAR(100),
        author VARCHAR(100),
        price INT);''')
    conn.commit()
    cur.close()
    conn.close()
    return "table created Successfully"
@app.route('/insertrec')
def insertrec():
    conn=dbconnect()
    cur=conn.cursor()
    data=[
        ('JAVA','Thorat mam',500),
        ('Python','Gauri mam',600),
        ('C++','Rachana mam',700),
        ('JavaScript','Borate mam',800),
        ('Ruby','Gawari Sir',900)
         ]
    cur.executemany("INSERT INTO books(bname,author,price) VALUES(%s,%s,%s);",data)
    conn.commit()
    cur.close()
    conn.close()
    return "Records inserted Successfully"
@app.route('/getrec')
def getrec():
    conn=dbconnect()
    cur=conn.cursor()
    cur.execute("select bname,author,price from books;")
    return cur.fetchall()
app.run(debug=True)



    

