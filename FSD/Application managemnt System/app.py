from flask import Flask,request,render_template,redirect,session 
import psycopg2
app=Flask(__name__)
app.secret_key='mykey'
def dbconnect():
    return psycopg2.connect(
        dbname='application',
        user='postgres',
        password='vedz',
        host='localhost',
        port=5432
    )
def createtablelogindetails():
    conn=dbconnect()
    cur=conn.cursor()
    cur.execute("""
                create table if not exists login(id int,name varchar(100),email varchar(100),class varchar(100),password varchar(100));
                """)
    conn.commit()
    cur.close()
    conn.close()
@app.route('/',methods=['GET','POST','PUT','DELETE'])
def register():
    msg=""
    if request.method=='POST':
        i=request.form['id'].strip()
        n=request.form['name'].strip()
        e=request.form['email'].strip()
        c=request.form['class'].strip()
        p=request.form['password'].strip()
        if i=="" or n=="" or e=="" or c=="" or p=="":
            msg="Please Fill all Fields"
        else:
            conn=dbconnect()
            cur=conn.cursor()
            cur.execute("insert into login(id,name,email,class,password) values(%s,%s,%s,%s,%s);",(i,n,e,c,p),) 
            conn.commit()
            cur.close()
            conn.close()
            return redirect('/home')
    return render_template('register.html',msg=msg)
@app.route('/login',methods=['GET','POST','PUT','DELETE'])
def login():
    msg=""
    if request.method=='POST':
        n=request.form['name'].strip()
        p=request.form['password'].strip()
        if n=="" or p=="":
            msg="Fill all login details !!"
        else:
            conn=dbconnect()
            cur=conn.cursor()
            cur.execute("select * from login where name=%s and password=%s",(n,p))
            user=cur.fetchone()
            if user:
                cur.close()
                conn.close()
                session['id']=user[0]
                return redirect('/home')
            else:
                msg="You are not Registered User"
                return redirect('/')
    return render_template('Login.html',msg=msg)
@app.route('/profile',methods=['GET','POST','PUT','DELETE'])
def profile():
    if 'id' in session:
        conn=dbconnect()
        cur=conn.cursor()
        cur.execute("select name,email,class from login where id=%s",(session['id'],))
        user=cur.fetchone()
        cur.close()
        conn.close()
    else:
        return redirect('/login')
    return render_template('profile.html',user=user)
@app.route('/home',methods=['GET','POST','PUT','DELETE'])
def home():
    return render_template('home.html')
def createdatatable():
    conn=dbconnect()
    cur=conn.cursor()
    cur.execute("create table if not exists data(id serial primary key,date date,whom varchar(100),subject varchar(100),description varchar(1000),greetings varchar(100));")
    conn.commit()
    cur.close()
    conn.close()
@app.route('/newapplication',methods=['GET','POST','PUT','DELETE'])
def newapplication():
    msg=""
    if request.method=='POST':
        d=request.form['date'].strip()
        t=request.form['whom'].strip()
        s=request.form['subject'].strip()
        desc=request.form['desc'].strip()
        g=request.form['greetings'].strip()
        if d=="" or t=="" or s=="" or desc=="" or g=="":
            msg="Fill everything to Submit Application"
        else:
            conn=dbconnect()
            cur=conn.cursor()
            cur.execute("insert into data(date,whom,subject,description,greetings) values(%s,%s,%s,%s,%s)",(d,t,s,desc,g),)
            conn.commit()
            cur.close()
            conn.close()
            return redirect('/home')
    return render_template('submit.html',msg=msg)
@app.route('/see',methods=['GET','POST','PUT','DELETE'])
def getallsubmitted():
    conn=dbconnect()
    cur=conn.cursor()
    cur.execute("select id,date,whom,subject,description,greetings from data;")
    applications=cur.fetchall()
    cur.close()
    conn.close()
    return render_template('see.html',applications=applications)
@app.route('/admin',methods=['GET','POST','PUT','DELETE'])
def admin():
    return render_template('admin.html')
@app.route('/adminauth',methods=['GET','POST','PUT','DELETE'])
def adminauth():
    msg=""
    if request.method=='POST':
        n=request.form['name'].strip()
        p=request.form['pass'].strip()
        if n=="" or p=="":
            msg="FILL THE DETAILS PROPERLY!!"
        else:
            if n=='admin' and p=='admin123@':
                return redirect('/admin')
            else:
                msg="WRONG CREDENTIALS!!"
    return render_template('adminauth.html',msg=msg)
if __name__=='__main__':
    createtablelogindetails()
    createdatatable()
    app.run(debug=True)


    
