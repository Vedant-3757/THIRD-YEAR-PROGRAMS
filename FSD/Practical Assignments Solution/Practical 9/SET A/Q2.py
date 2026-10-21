from flask import Flask,request,render_template
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
    cur.execute('''CREATE TABLE IF NOT EXISTS 
                    employee(id serial primary key,
                    name varchar(100),
                    department varchar(100));''')
    conn.commit()
    cur.close()
    conn.close()
    return "TABLE CREATED"
@app.route('/addemployee',methods=['GET','POST'])
def addemployee():
    conn=dbconnect()
    cur=conn.cursor()
    if request.method=='POST':
        
        name=request.form.get('name')
        department=request.form.get('department')
        cur.execute("INSERT INTO employee(name,department) VALUES(%s,%s)",(name,department))       
        conn.commit()
    cur.execute("SELECT * FROM employee ORDER BY id")
    employee=cur.fetchall()
    cur.close()
    conn.close()
    return render_template('index2.html',employee=employee)
app.run(debug=True)