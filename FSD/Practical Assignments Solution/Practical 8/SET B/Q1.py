from flask import Flask,render_template
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
@app.route('/getdetails')
def getdetails():
    conn=dbconnect()
    cur=conn.cursor()
    cur.execute("SELECT id , name , age FROM student;")
    student=cur.fetchall()
    cur.close()
    conn.close()
    stlist=""
    for st in student:
        stlist+=f"ID: {st[0]},NAME: {st[1]},AGE: {st[2]}<br>"
    return stlist
app.run(debug=True)