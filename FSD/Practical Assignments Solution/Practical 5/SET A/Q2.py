from flask import Flask,render_template,request
app=Flask(__name__)
@app.route('/add', methods=['GET','POST'])
def home():
    if request.method=='POST':
        a=int(request.form.get('a'))
        b=int(request.form.get('b'))
        c=a+b
        return f"{a} + {b} is {c}"
    return render_template('indexQ2.html')
app.run(debug=True)
