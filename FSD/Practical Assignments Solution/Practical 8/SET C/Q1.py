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
@app.route('/getbyid/<int:id>')
def getbyid(id):
    conn=dbconnect()
    cur=conn.cursor()
    cur.execute("SELECT id,name,age FROM student where id=(%s);",(id,))
    st=cur.fetchall()
    cur.close()
    conn.close()
    student=""
    for s in st:
        student+=f"ID:{s[0]},<br>NAME:{s[1]},<br>AGE:{s[2]}"
    return student
app.run(debug=True)
