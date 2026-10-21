from flask import Flask,render_template,request
app=Flask(__name__)
@app.route('/rating',methods=['GET','POST'])
def rating():
    if request.method=='POST':
        n=request.form.get('name')
        r=request.form.get('rating')
        c=request.form.get('cmt')
        return f"Thank you {n} for {r} rating and {c}"
    return render_template('index2.html')
app.run(debug=True)