from flask import Flask,render_template,request
app=Flask(__name__)
@app.route('/validate',methods=['GET','POST'])
def validate():
    if request.method=='POST':
        n=request.form.get('name')
        n=n.lower()
        if n=='vedant':
            return f"Welcome {n} to Application"
        else:
            return f"Username Not Matched"
    return render_template('index.html')
app.run(debug=True)